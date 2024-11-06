/*  IMPLEMENTAÇÃO EM VETOR
    Faça duas implementações da estrutura abstrata de dados Pilha. Na primeira implementação,
    utilize um vetor para armazenar os elementos. Na segunda versão, você deverá utilizar
    referências para ligar os elementos guardados na Pilha. Para cada uma das versões,
    implemente os métodos para:

    a) criar uma pilha vazia
    b) inserir um elemento na pilha
    c) remover um elemento da pilha
    d) verificar o tamanho da pilha
    e) verificar se a pilha está vazia
    f) verificar (sem remover) o elemento armazenado no topo da pilha
 */


import java.util.Arrays;

public class PilhaVetor {

    int[] pilha;
    int tamanho = 0;

    // construtor
    /*
    public Main(int capacidade){
        pilha = new int[capacidade];
        tamanho = 0;
    }
     */

    // a) cria uma pilha vazia
    public void criarPilhaVazia (int capacidade){
        this.pilha = new int[capacidade];
        this.tamanho = 0;
    }

    // b) insere um elemento na pilha
    public void inserirElemento (int elemento){
        // verifica se a pilha está cheia
        if (tamanho >= pilha.length){
            System.out.println("A pilha já está cheia");
        } else {
            pilha[tamanho] = elemento; // add elemento no topo da pilha
            tamanho ++; // incrementa o tamanho da pilha
        }
    }

    // c) remove um elemento da pilha
    public void removerElemento(){
        if (tamanho == 0){
            System.out.println("A lista já está vazia");
        } else {
            tamanho --; // reduz o tamanho da pilha
            pilha[tamanho] = 0; // limpa o ultimo elemento

        }
    }

    // d) verifica o tamanho da pilha
    public void verificarTamanho(){
        System.out.println("O tamanho da pilha é: "+ tamanho);
    }

    // e) verifica se a pilha está vazia
    public void verificaVazia(){
        if (tamanho == 0)
            System.out.println("A lista está vazia");
        else
            System.out.println("A lista não está vazia ");
    }

    // f) verifica (sem remover) o elemento armazenado no topo da pilha
    public void topoPilha(){
        if (tamanho == 0)
            System.out.println("A lista está vazia");
        else
            System.out.println("O elemento no topo da lista é: "+ pilha[tamanho - 1]);
    }

    public void printarPilha(){
        System.out.println(Arrays.toString(pilha));
    }

}