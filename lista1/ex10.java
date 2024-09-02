/*
10. Faça um programa que leia um valor e apresente o número de Fibonacci
correspondente a este valor lido. Lembre-se que os 2 primeiros elementos da
série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a
ele. Todos os valores de Fibonacci calculados neste problema devem caber em
um inteiro de 64 bits sem sinal.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] vetor = new int[60];

        System.out.println("Qual posição da série de Fibonnaci você quer?");
        int posicao = scn.nextInt();
        for (int i = 2; i < vetor.length; i++){
            vetor[0] = 0;
            vetor[1] = 1;
            vetor[i] = (vetor[i-1]) + (vetor[i-2]);
        }
        System.out.println("Sequência de Fibonacci:");
        System.out.println(Arrays.toString(vetor));
        System.out.println("Número correspondente ao index digitado");
        for(int i : vetor){
            if(vetor[posicao]>0){
                System.out.println(vetor[posicao]);
                return;
            } else {
                System.out.println("Essa posição do index é correspondente à um valor negativo :/");
            }
        }
    }
}
