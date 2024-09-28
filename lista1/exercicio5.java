/* 5. Implemente dois algoritmos que ordenem os elementos de um vetor em ordem crescente e compare o número de trocas que eles efetuam
    durante a ordenação de:
    a) um vetor criado com os números de 1 até 100 aleatoriamente distribuídos.
    b) um vetor criado com os números de 1 até 100 ordenados em ordem decrescente. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class exercicio5 {
    public static void main(String[] args) {
        int[] vetorAleatorio = new int[100];
        int[] vetorDecrescente = new int[100];
        int x = 100;
        boolean controleA, controleD;
        int contA = 0, contD =0;

        //criando uma lista aleatoria
        ArrayList<Integer> listaAleatoria = new ArrayList<>();
        for (int i =1; i<=100; i++){
            listaAleatoria.add(i);
        }
        // embaralhando lista
        Collections.shuffle(listaAleatoria);

        // convertendo lista para o vetor
        for (int i = 0; i < listaAleatoria.size(); i++){
            vetorAleatorio[i] = listaAleatoria.get(i);
        }

        // criando o vetor decrescente
        for(int i = 0; i<vetorDecrescente.length; i++){
            vetorDecrescente[i] = x;
            x -= 1;
        }

        // imprimindo vetor aleatorio
        System.out.println("Vetor aleatório antes da ordenação:");
        System.out.println(Arrays.toString(vetorAleatorio));

        // imprimindo o vetor decrescente
        System.out.println("\nVetor Decrescente antes da ordenação:");
        for (int i = 0; i < vetorDecrescente.length; i++) {
            System.out.print(vetorDecrescente[i] + ", ");
        }

        // Adiciona uma quebra de linha para separar as saídas
        System.out.println();

        // organizando o vetor aleatorio para crescente:
        for (int i = 0; i < vetorAleatorio.length; i++){
            controleA = true;
            for (int j = 0; j < (vetorAleatorio.length - 1); j++){
                if (vetorAleatorio[j] > vetorAleatorio[j + 1]) {
                    int aux = vetorAleatorio[j];
                    vetorAleatorio[j] = vetorAleatorio[j+1];
                    vetorAleatorio[j+1] = aux;
                    controleA = false;
                    contA++;
                }
            }
            if (controleA){
                break;
            }
        }

        // organizando o vetor decrescente para crescente:
        for (int i = 0; i < vetorDecrescente.length; i++){
            controleD = true;
            for (int j = 0; j < (vetorDecrescente.length - 1); j++){
                if (vetorDecrescente[j] > vetorDecrescente[j + 1]) {
                    int aux = vetorDecrescente[j];
                    vetorDecrescente[j] = vetorDecrescente[j+1];
                    vetorDecrescente[j+1] = aux;
                    controleD = false;
                    contD++;
                }
            }
            if (controleD){
                break;
            }
        }

        // imprimindo o vetor aleatorio organizado em forma crescente
        System.out.println("\nVetor aleatorio depois da ordenação:");
        System.out.println("Número de vezes que foi feito a troca: "+contA);
        System.out.println(Arrays.toString(vetorAleatorio));

        // imprimindo o vetor decrescente organizado em forma crescente
        System.out.println("\nVetor decrescente depois da ordenação:");
        System.out.println("Número de vezes que foi feito a troca: "+contD);
        for (int i = 0; i < vetorDecrescente.length; i++) {
            System.out.print(vetorDecrescente[i] + ", ");
        }

    }
}
