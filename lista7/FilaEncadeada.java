/*  IMPLEMENTAÇÃO USANDO REFERÊNCIAS
    Faça duas implementações da estrutura abstrata de dados Fila. Na primeira implementação,
    utilize um vetor para armazenar os elementos. Na segunda versão, você deverá utilizar
    referências para ligar os elementos guardados na Fila. Para cada uma das versões,
    implemente os métodos para:
    a) criar uma fila vazia
    b) inserir um elemento na fila
    c) remover um elemento da fila
    d) verificar o tamanho da fila
    e) verificar se a fila está vazia
    f) verificar (sem remover) o elemento armazenado na primeira posição da fila
 */

public class FilaEncadeada {
    Node primeiro;
    Node ultimo;
    int tamanho = 0;

    // a) criar uma fila vazia
    public void criarFilaVazia(){
        primeiro = null;
        ultimo = null;
        tamanho = 0;
        System.out.println("A lista foi inicializada como vazia");
    }

    // b) inserir um elemento na fila
    public void inserirElemento(int elemento){
        Node novoNo = new Node(elemento);
        if(tamanho == 0){
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }
        tamanho++;
    }

    // c) remover um elemento da fila
    public void removerElemento(){
        if (tamanho == 0 ){
            System.out.println("A lista já está vazia");
        } else {
            primeiro = primeiro.getProximo();
            tamanho--;

            if (tamanho == 0) {
                ultimo = null; // se a fila ficou vazia, atualiza "ultimo" também para null
            }
        }
    }

    // d) verificar o tamanho da fila
    public int verificarTamanho(){
        return tamanho;
    }

    // e) verificar se a fila está vazia
    public boolean verificarVazia() {
        return tamanho == 0;
    }

    // f) verificar (sem remover) o elemento armazenado na primeira posição da fila
    public void verificarPrimeiroElemento(){
        if (tamanho == 0){
            System.out.println("Fila vazia, não existe primeiro elemento");
        } else {
            System.out.println("Primeiro elemento da Fila: " + primeiro.getValor());
        }
    }
}