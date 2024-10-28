/*
    1)
    Crie um programa que leia uma matriz de dimensões mxn e que gere a matriz transposta T.
    A transposta é obtida invertendo as linhas e colunas da matriz original.
    Desafio adicional: Escreva uma função para verificar se uma matriz é simétrica, ou seja,
    se a matriz é igual à sua transposta.
 */

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Qual o número de linhas da matriz?");
        int m = scn.nextInt();
        System.out.println("Qual o número de colunas da matriz?");
        int n = scn.nextInt();
        int[][] matriz1 = new int[m][n];

        System.out.println("Insira os números da sua matriz");
        // lendo a matriz
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matriz1[i][j] = scn.nextInt();
            }
        }

        // imprimindo a matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        // transposição da matriz
        int[][] matriz2 = new int[n][m]; //  n linhas e m colunas
        for (int i = 0; i < m; i++){    // percorre a matriz original
            for (int j = 0; j < n; j++){
                matriz2[j][i] = matriz1[i][j]; // transposição
            }
        }

        // imprimindo a matriz transposta
        System.out.println("Matriz transposta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        // verificação de simetria
        if(m == n && Simetria(matriz1)){
            System.out.println("A matriz é uma matriz simétrica");
        } else {
            System.out.println("A matriz não é uma matriz simétrica");
        }

    }

    public static boolean Simetria(int[][] matriz){
        int tamanho = matriz.length;    // assumindo que a matriz é quadrada
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if(matriz[i][j] != matriz[j][i]){ // vericando se é diferente
                    return false;   // retorna falso
                }
            }
        }
        return true;
    }

}