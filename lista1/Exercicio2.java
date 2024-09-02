import java.util.Arrays;
import java.util.Random;

/*
2) Escreva um programa que carregue um vetor inteiro de cem posições com números aleatórios entre 0 e 100.
Percorrendo o vetor criado apenas uma vez, imprima a posição onde ocorre o menor valor, a soma dos números
armazenados e preencha os valores de um novo vetor com metade do tamanho do vetor original onde a primeira
posição do novo vetor é igual à soma da primeira e da última posição do vetor original. A segunda posição
do novo vetor é a soma da segunda e da penúltima posição do vetor original e assim em diante.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        int[] vetor2 = new int[50];
        Random num = new Random();

        // criando o vetor com 100 posições aleatorias
        for (int i = 0; i< vetor.length; i++){
            vetor[i] = num.nextInt(101);
        }
        System.out.println(Arrays.toString(vetor));

        // percorrendo o vetor para imprimir o menor valor e a soma
        int menor = 100;
        int posicao=0;
        int soma =0;
        for (int i = 0; i<vetor.length; i++){
            if (vetor[i]<menor){
                menor = vetor[i];
                posicao = i;
            }
            soma += vetor[i];
        }
        System.out.println("\nO menor valor da lista é: " + menor+", na posição "+posicao+" do vetor"
        + "\nA soma dos valores do vetor é: "+soma);

        // atribuindo valores no novo vetor
        for (int i = 0; i < vetor2.length; i++){
            vetor2[i] = vetor[i] + vetor[99-i];
        }
        System.out.println(Arrays.toString(vetor2));
        System.out.println(vetor2.length);
    }

}
