/*
7. Escreva um programa que leia 10 valores inteiros, informados pelo usuário e armazene-os em um vetor.
Após isso, lendo o vetor uma única vez e sem criar outros vetores, mostre na tela a média dos valores
armazenados no vetor ponderados pelos índices nos quais estão armazenados.
 */

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        float media = 0;
        Scanner scn = new Scanner(System.in);
        int numero = 0, div = 0;
        System.out.println("Digite 10 números inteiros");
        for(int i = 0; i<vetor.length; i++){
            numero = scn.nextInt();
            media += numero * i;
            div += i;
        }
        float resultado = media/div;
        System.out.println("Média ponderada do vetor: "+ resultado);
    }
}
