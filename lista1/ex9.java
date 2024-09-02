/*
9. Leia um valor X. Coloque este valor na primeira posição de um vetor N de 100
posições. Em cada posição subsequente de N (1 até 99), coloque a metade do
valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o
vetor N
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        float[] vetor = new float[100];
        Scanner scn = new Scanner(System.in);
        float numero = scn.nextFloat();
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = numero;
            numero /= 2;
        }

        System.out.println(Arrays.toString(vetor));

    }
}
