import java.util.Arrays;
import java.util.Scanner;

/*
6. Escreva um programa que crie um vetor de números inteiros, receba 10 valores informados pelo usuário,
imprima todos os valores pares e depois todos os valores ímpares.
 */
public class ex6 {
    public static void main(String[] args) {
        int numero;
        int contPar = 0;
        int contImpar = 0;
        int[] vetor = new int[10];
        int[] par;
        int[] impar;
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            numero = scn.nextInt();
            if(numero % 2 == 0){
                vetor[i] = numero;
                contPar +=1;
            } else {
                vetor[i] = numero;
                contImpar +=1;
            }
        }
        par = new int[contPar];
        impar = new int[contImpar];

        int x=0, y=0;
        for (int i = 0; i<vetor.length; i++){
            if (vetor[i] % 2 == 0){
                par[x] = vetor[i];
                x +=1;
            } else{
                impar[y] = vetor[i];
                y += 1;
            }
        }
        System.out.printf("Números pares:"+ Arrays.toString(par));
        System.out.printf("Números ímpares:"+ Arrays.toString(impar));
    }
}
