/*
Escreva um programa que receba um número inteiro 2 ≤ 𝑁 ≤ 5, crie uma
matriz quadrada 𝑁 × 𝑁, preencha a matriz com valores de 1 até 𝑁2, calcule o
quadrado da matriz criada e exiba o resultado na tela.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Escreva um número entre 2 e 5");
        int num = scn.nextInt();
        int [][] matriz = new int[num][num];
        int cont = 1;

        // limitando num entre 2 e 5 e criando matriz
        if (num >= 2 && num <= 5){
            for(int i = 0; i<num; i++){
                for (int j = 0; j<num; j++){
                    matriz[i][j] = cont;
                    cont ++;
                }
            }
            System.out.println("Matriz Original: ");
            imprimirMatriz(matriz, num);
            System.out.println("Resultado da matriz quadrada: ");
            multiplica(matriz, matriz, num);

        } else {
            System.out.println("O número digitado não se enquadra nos parâmetros");
        }
    }

    // multiplicando matriz
    public static int[][] multiplica(int[][] matriz1, int[][] matriz2, int n){
        int[][] resultado = new int [n][n];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                for (int k = 0; k<n; k++){
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        imprimirMatriz(resultado, n);
        return resultado;
    }

    // imprime a matriz
    public static void imprimirMatriz(int[][] matriz1, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
