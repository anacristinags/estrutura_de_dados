/*
3. Escreva um programa que carregue dois vetores inteiros com 5 posições, sendo um com números pares e o outro
com números ímpares. O usuário pode digitar os números em qualquer sequência e o programa deverá armazená-los
no vetor correto na ordem em que foram informados pelo usuário
 */

import java.util.Arrays;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int numero = 0;
        int par = 0;
        int impar = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite 10 números, 5 pares e 5 ímpares");
        for (int i = 0; i<10; i++){
            numero = scn.nextInt();
            if(numero % 2 == 0){
                vetor1[par] = numero;
                par+=1;
            } else{
                vetor2[impar] = numero;
                impar += 1;
            }
        }
        System.out.println("Vetor par:"+ Arrays.toString(vetor1));
        System.out.println("Vetor ímpar:"+ Arrays.toString(vetor2));
    }
}
