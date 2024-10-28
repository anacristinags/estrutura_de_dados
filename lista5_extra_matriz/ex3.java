/*
    3)
    Escreva um programa que verifique se uma matriz é a matriz identidade, ou seja,
    uma matriz quadrada onde todos os elementos da diagonal principal são 1 e os demais são 0.
    Desafio adicional: Implemente um algoritmo que calcule a matriz inversa, caso exista,
    utilizando o método de Gauss-Jordan.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    static int[][] matriz;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Qual o tamanho da matriz identidade?");
        int n = scn.nextInt();

        matriz = new int[n][n];
        int a = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == i){
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("Matriz Identidade " + n + "x" + n);
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }

}
