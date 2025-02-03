/*  IMPLEMENTAÇÃO VETOR
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

public class FilaVetor {
    int[] fila;
    int tamanho = 0;

    // a) criar uma fila vazia
    public void criarFilaVazia(int capacidade){
        this.fila = new int[capacidade];
        this.tamanho = 0;
    }

    // b) inserir um elemento na fila
    public void inserirElemento(int elemento){
        if (tamanho >= fila.length){
            System.out.println("Fila está cheia");
        } else{
            fila[tamanho] = elemento;
            tamanho++;
        }
    }

    // c) remover um elemento da fila
    public void removerElemento(){
        if(tamanho == 0){
            System.out.println("A fila já está vazia");
        } else {
            // deslocando elementos para a esquerda
            for (int i = 0; i < tamanho - 1; i++) {
                fila[i] = fila[i + 1];
            }
            fila[tamanho - 1] = 0; // limpando o último elemento
            tamanho--;
        }
    }

    // d) Verificar o tamanho da fila
    public int verificarTamanho() {
        return tamanho;
    }

    // e) Verificar se a fila está vazia
    public boolean verificarVazia() {
        return tamanho == 0;
    }

    // f) Verificar (sem remover) o elemento armazenado na primeira posição da fila
    public int verificarPrimeiroElemento() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia");
            return -1;
        }
        return fila[0];
    }
}
