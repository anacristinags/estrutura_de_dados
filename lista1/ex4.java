/*
Escreva um programa que ordene um vetor de tamanho arbitrário preenchido com números aleatórios e
execute a pesquisa por um valor passado como parâmetro utilizando o algoritmo da busca binária.
 */

import java.util.Arrays;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[10];
        // randonizando elementos do vetor
        for(int i =0; i < vetor.length; i++){
            vetor[i] = random.nextInt(1001);
        }
        // printando vetor
        System.out.println("Vetor: ");
        System.out.println(Arrays.toString(vetor));

        // ordenando vetor
        int aux;
        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length; j++){
                if (vetor[i] < vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        // printando vetor ordenado
        System.out.println("Vetor ordenado: ");
        System.out.println(Arrays.toString(vetor));

        // busca binaria
        int buscando = vetor[8];
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length -1;
        int meio;
        while (inicio <= fim){
            meio = (int) ((inicio + fim)/2);
            if (vetor[meio] == buscando){
                achou = true;
                break;
            } else if (vetor[meio] < buscando){
                inicio = meio + 1;
            } else {
                fim = meio -1;
            }
        }

        if (achou == true){
            System.out.println("Achou o número: "+ buscando);
        } else {
            System.out.println("Não achou o número");
        }

    }
}
