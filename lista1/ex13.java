/*
13) Escreva um programa que calcule a multiplicação entre duas matrizes quaisquer.
Seu programa deve determinar se é possível executar a multiplicação, e mostrar o
resultado do cálculo para os casos possíveis. Quando não for possível efetuar a operação,
uma mensagem deve ser exibida na tela
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o número de linhas da primeira matriz");
        int n1 = scn.nextInt();
        System.out.println("Digite o número de colunas da primeira matriz");
        int n2 = scn.nextInt();
        System.out.println("Digite o número de linhas da segunda matriz");
        int m1 = scn.nextInt();
        System.out.println("Digite o número de colunas da segunda matriz");
        int m2 = scn.nextInt();

        if(n2 == m1){
            // criação das matrizes
            int[][] matriz1 = new int[n1][n2];
            int[][] matriz2 = new int[m1][m2];
            int[][] resultado = new int[n1][m2];

            System.out.println("Digite a primeira matriz:");
            for (int i = 0; i<n1; i++){
                for (int j = 0; j<n2; j++){
                    matriz1[i][j] = scn.nextInt();
                }
            }
            System.out.println("Digite a segunda matriz:");
            for (int i = 0; i<m1; i++){
                for (int j = 0; j<m2; j++){
                    matriz2[i][j] = scn.nextInt();
                }
            }
            System.out.println("O resultado da multiplicação das matrizes:");
            for (int i = 0; i < n1; i++){
                for (int j = 0; j < m2; j++){
                    for (int k = 0; k < n2; k++){
                        resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
            for (int[] i: resultado){
                System.out.println(Arrays.toString(i));
            }
        } else {
            System.out.println("Não é possivel realizar a multiplicação das matrizes. \nO número de linhas da primeira" +
                    " matriz é diferente do número de colunas da segunda matriz :/");
        }
    }
}
