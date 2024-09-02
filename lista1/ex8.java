/*
8. Leia um valor e faça um programa que coloque o valor lido na primeira posição
de um vetor de 10 posições. Em cada posição subsequente, coloque o dobro do
valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor
devem ser 1, 2, 4, 8 e assim sucessivamente. Mostre o vetor em seguida.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();;
        for(int i = 0; i<10; i++){
            vetor[i] = num;
            num = num *2;
        }
        System.out.println(Arrays.toString(vetor));
    }
}
