import java.util.Arrays;
/*
1) Escreva um programa que leia dois vetores inteiros com dez posições cada. A partir desses vetores,
carregue um terceiro vetor onde o valor de cada elemento será a média dos elementos de mesmo índice
nos dois vetores anteriores.
*/
public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor1 = {1,2,3,4,5,6,7,8,9,10};
        int[] vetor2 = {11,10,9,8,7,6,5,4,3,2};
        int[] vetor3 = new int[10];
        for (int i=0; i<vetor3.length; i++){
            vetor3[i] = (vetor1[i] + vetor2[i])/2;
        }
        System.out.println(Arrays.toString(vetor3));
    }
}