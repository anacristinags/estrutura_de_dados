/*
    2)
    Dada uma matriz quadrada nxn escreva um programa para rotacioná-la 90 graus no sentido horário.
    Desafio adicional: Modifique o programa para suportar rotações de 180,
    270 graus, e rotações no sentido anti-horário.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    static int[][] matriz;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Qual o tamanho da matriz quadrada?");
        int n = scn.nextInt();

        matriz = new int[n][n];
        int a = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = a;
                a++;
            }
        }
        System.out.println("Matriz Original");
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }

        gira90(n);
        gira180(n);
        gira270(n);
        giraAntiHorario(n);
    }

    // gira 90 graus
    public static void gira90(int n){
        int[][] matriz90 = new int[n][n];
        n = n - 1;  // para não dar erro quando for percorrer a matriz (poisição = tamanho - 1)
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz90[i][j] = matriz[n - j][i];
            }
        }
        System.out.println("\nMatriz 90 graus:");
        for (int[] linha : matriz90) {
            System.out.println(Arrays.toString(linha));
        }
    }

    // gira 180 graus
    public static void gira180(int n){
        int[][] matriz180 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz180[i][j] = matriz[n - 1 - i][n - 1 - j];
            }
        }

        // essa subtração de "-1" dentro do for pode ser resolvida fazendo o esquema de n = n-1

        System.out.println("\nMatriz 180 graus:");
        for (int[] linha : matriz180) {
            System.out.println(Arrays.toString(linha));
        }
    }

    // gira 270 graus
    public static void gira270(int n){
        int[][] matriz270 = new int[n][n];
        n = n-1;   // para não dar erro quando for percorrer a matriz (poisição = tamanho - 1)
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                matriz270[i][j] = matriz[j][n - i];
            }
        }
        System.out.println("\nMatriz 270 graus:");
        for (int[] linha : matriz270) {
            System.out.println(Arrays.toString(linha));
        }
    }

    // ANTI-HORÁRIO
    public static void giraAntiHorario(int n){
        int[][] matrizAntiHorario = new int[n][n];
        n = n - 1;  // para não dar erro quando for percorrer a matriz (poisição = tamanho - 1)
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                matrizAntiHorario[i][j] = matriz[j][n - i];
            }
        }
        System.out.println("\nMatriz Anti-Horário");
        for (int[] linha : matrizAntiHorario) {
            System.out.println(Arrays.toString(linha));
        }
    }

}
