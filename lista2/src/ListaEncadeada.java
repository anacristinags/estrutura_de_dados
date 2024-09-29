/*  Lista 02
    1. Implemente a classe ListaEncadeada utilizando um arranjo de inteiros para
    armazenar os elementos da lista.
    2. Crie um método para criar uma lista vazia.
    3. Crie um método responsável por inserir um elemento no início da lista.
    4. Crie um método responsável por inserir um elemento no fim da lista.
    5. Crie um método responsável por inserir um elemento em uma posição específica
    da lista.
    6. Crie um método responsável por remover um elemento no início da lista.
    7. Crie um método responsável por remover um elemento no fim da lista.
    8. Crie um método responsável por remover um elemento em uma posição
    específica da lista.
    9. Crie um método responsável por remover um elemento específico da lista.
    10. Crie um método para exibir o conteúdo de uma lista.
    11. Crie um método para pesquisar por um elemento específico em uma lista e
    informar, caso o elemento exista, a posição na qual ele está armazenado.
    12. Crie um método que retorne o número de elementos existentes na lista.
*/

import java.util.Arrays;

public class ListaEncadeada {
    private int[] elementos; // armazena os elementos do vetor
    private int tamanho; // controla o número de elementos na lista

    // construtor que cria inicialmente lista vazia e recebe como parametro a sua capacidade (quantidade de elementos)
    public ListaEncadeada(int capacidade){
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    // 2. Crie um método para criar uma lista vazia
    public void criarListaVazia(int capacidade) {
        this.elementos = new int[capacidade]; // Cria um novo array com a capacidade informada
        this.tamanho = 0; // Define o tamanho da lista como zero
    }

    // 3. Crie um método responsável por inserir um elemento no início da lista.
    public void inserirInicio(int elemento){

        // verifica se há espaço no vetor
        if (tamanho < elementos.length){

            // percorre o tamanho do vetor, vai rodar até chegar na posição 1
            for(int i = tamanho; i > 0; i--){
                elementos[i] = elementos[i - 1]; // passa os elementos para uma posição a frente
            }
            elementos[0] = elemento; // agr que o index 0 está livre, add o elemento
            tamanho++; // incrementa +1 no tamanho do vetor
        }

    }

    // 4. Crie um método responsável por inserir um elemento no fim da lista.
    public void inserirFim (int elemento){

        // verifica se o vetor está cheio (quantas posições foram ocupadas)
        if (tamanho < elementos.length){
            elementos[tamanho] = elemento; // adiciona o elemento na ultima posição na ocupada
            tamanho ++; // incrementa +1 no tamanho do vetor
        } else {
            System.out.println("Vetor está cheio, não é possivel adicionar mais elementos");
        }
    }

    // 5. Crie um método responsável por inserir um elemento em uma posição específica da lista.
    public void inserirEspecifico(int elemento, int posicao){

        // verifica se a posição é valida
        if(posicao < 0 || posicao > tamanho){
            System.out.println("Posição escolhida é inválida");
            return;
        }
        // verifica se o vetor está cheio (quantas posições foram ocupadas)
        if (tamanho < elementos.length) {

            // percorre o vetor do final até a posição
            for (int i = tamanho; i > posicao; i--) {
                elementos[i] = elementos[i - 1]; // realoca os elementos do vetor para uma posição a frente
            }
            elementos[posicao] = elemento; // depois de "liberar" o indez, adiciona o elemento na posição
            tamanho++; // incrementa +1 no tamanho do vetor

        } else {
            System.out.println("O vetor está cheio");
        }
    }

    //6. Crie um método responsável por remover um elemento no início da lista.
    public void removerInicio(){

        // verifica se a lista está vazia
        if(tamanho>=1){

            // percorre o vetor até o ultimo elemento
            for (int i = 0; i < (tamanho - 1); i++){
                elementos[i] = elementos[i + 1]; // passa os valores para uma posição anterior
            }
            tamanho--; // diminui o tamanho do vetor

        } else {
            System.out.println("A lista já está vazia");
        }
    }

    // 7. Crie um método responsável por remover um elemento no fim da lista.
    public void removerFim(){

        // verifica se o vetor está vazio
        if (tamanho >= 1){
            elementos[tamanho - 1] = 0; // limpa o ultimo elemento
            tamanho--; // reduz o tamanho da lista

        } else {
            System.out.println("Lista já está vazia");
        }
    }

    // 8. Crie um método responsável por remover um elemento em uma posição específica da lista.
    public void removerPosicao(int posicao){

        // verifica se a posição é válida
        if(tamanho > posicao && posicao >= 0){

            // percorre o vetor da posição que será removida até o final
            for(int i = posicao; i < (tamanho - 1); i++){
                elementos[i] = elementos[i+1]; //desloca os elementos para trás, sobrescrevendo a posição que será removida
            }
            elementos[tamanho - 1] = 0; // zera o último elemento da lista
            tamanho--; // reduz o tamanho da lista

        } else {
            System.out.println("Posição para remoção indisponivel");
        }
    }

    // 9. Crie um método responsável por remover um elemento específico da lista.
    public void removerEspecifico(int elemento){

        // percorre o vetor até o ultimo elemento
        for (int i = 0; i < tamanho; i++){

            // se encontar o elemento na lista
            if (elementos[i] == elemento){

                // vai da posição do elemento até o final da lista
                for(int j = i; j < (tamanho - 1); j++){
                    elementos[j] = elementos[j+1]; // sobrecarrega os elementos para a esquerda
                }
                elementos[tamanho - 1] = 0; // zera o último elemento da lista
                tamanho--; // reduz o tamanho da lista
                return; // sai do metodo
            }
        }
        System.out.println("Elemento " +elemento+ " não está na lista");
    }


    // 10. Crie um método para exibir o conteúdo de uma lista.
    public void exibir() {
        for (int i = 0; i < (tamanho); i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    //  11. Crie um método para pesquisar por um elemento específico em uma lista e informar,
    //  caso o elemento exista, a posição na qual ele está armazenado.
    public void pesquisar(int elemento){

        // percorre o vetor até o tamanho
        for(int i = 0; i < tamanho; i++){
            // verifica se o elemento está na lista
            if(elementos[i] == elemento){
                System.out.println("O elemento foi encontrato! Ele está na posição: " + i+" da lista");
                return; // sai do metodo
            }
        }
        System.out.println("Elemento " +elemento+ " não encontrado");
    }


    // 12. Crie um método que retorne o número de elementos existentes na lista.
    public void numeroElementos(){
        System.out.println("A lista contém "+tamanho+" elementos");
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada(10); // cria uma lista com a capacidade de 10 (ainda está vazia)
        lista.inserirInicio(3);
        lista.exibir();
        lista.numeroElementos();

        lista.criarListaVazia(10); // Cria a lista novamente, agora vazia
        lista.exibir(); // exibe a lista vazia (nada)
        lista.numeroElementos();

        lista.inserirFim(4);
        lista.exibir();
        lista.inserirEspecifico(7, 1);
        lista.exibir();
        lista.inserirInicio(1);
        lista.exibir();
        lista.inserirEspecifico(8, 1);
        lista.exibir();
        lista.numeroElementos();
        lista.removerFim();
        lista.exibir();
        lista.removerInicio();
        lista.exibir();
        lista.removerPosicao(0);
        lista.removerEspecifico(10);
        lista.exibir();
        lista.numeroElementos();

    }

}