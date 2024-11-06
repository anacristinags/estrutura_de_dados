/*  IMPLEMENTAÇÃO USANDO REFERÊNCIAS
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

public class PilhaEncadeada {
    // atributos
    Node topo;
    int tamanho;

    // a) cria uma pilha vazia
    public void criaPilhaVazia() {
        topo = null;
        tamanho = 0;
    }

    // b) insere um elemento na pilha
    public void inserirElemento(int elemento){
        Node novoNo = new Node(elemento); // cria um novo nó
        if(tamanho == 0){ // caso não tenha elemento na pilha
            topo = novoNo; // topo é o primeiro elemento
            tamanho++; // incrementa tamanho da pilha
        } else {
            novoNo.proximo = topo;
            topo = novoNo;
            tamanho ++;
        }
    }

   // c) remove um elemento da pilha
    public void removerElemento(){
        if (tamanho == 0){
            System.out.println("Pilha está vazia");
        } else {
            topo = topo.proximo;
            tamanho --;
        }
    }

    // d) verifica o tamanho da pilha
    public void verificarTamanho(){
        System.out.println("O tamanho da pilha é: "+ tamanho);
    }

    // e) verifica se a pilha está vazia
    public void verificaVazia(){
        if (topo == null)
            System.out.println("A lista está vazia");
        else
            System.out.println("A lista não está vazia ");
    }

    // f) verifica (sem remover) o elemento armazenado no topo da pilha
    public void topoPilha(){
        if (tamanho == 0)
            System.out.println("A lista está vazia");
        else
            System.out.println("O elemento no topo da lista é: "+ topo.valor);
    }
}
