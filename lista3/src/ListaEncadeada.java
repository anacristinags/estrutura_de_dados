/*
    Lista de exercícios 03 – Estruturas de Dados
    1. Implemente a classe ListaEncadeada para armazenar valores inteiros referências
    para ligar os elementos da lista.
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

public class ListaEncadeada {

    private int tamanho = 0;
    private Nodo primeiro;  // ponteiro para primeira posição
    private Nodo ultimo;    // ponteiro para última posição

    // 2. Crie um método para criar uma lista vazia.
    public void criarListaVazia() {
        primeiro = null;  // Define o primeiro elemento como null
        ultimo = null;    // Define o último elemento como null
        tamanho = 0;      // Define o tamanho da lista como 0
        System.out.println("A lista foi inicializada como vazia.");
    }

    // 3. Crie um método responsável por inserir um elemento no início da lista.
    public void inserirInicio(int valor){
        Nodo novo = new Nodo(valor); // criando o novo nó
        if (tamanho == 0){      // verifica se a lista está vazia
            primeiro = novo;    // P aponta para o novo (lista vazia)
            ultimo = novo;      // U aponta para o novo (lista vazia)
        } else {
            novo.setProximo(primeiro); // a proxima posição do novo nó aponta para o antigo primeiro
            primeiro = novo;
        }
        tamanho++; // incrementa o tamanho da lista
    }

    // 4. Crie um método responsável por inserir um elemento no fim da lista.
    public void inserirFim(int valor){
        Nodo novo = new Nodo(valor); // criando o novo nó
        if (tamanho == 0){      // verifica se a lista está vazia
            primeiro = novo;    // P aponta para o novo (lista vazia)
            ultimo = novo;      // U aponta para o novo (lista vazia)
        } else {
            ultimo.setProximo(novo);    // o último aponta para o novo nó
            ultimo = novo;              // o último agora é o novo nó
        }
        tamanho++; // incrementa o tamanho da lista
    }

    // 5. Crie um método responsável por inserir um elemento em uma posição específica da lista.
    public void inserirEspecifico(int valor, int posicao){
        if(posicao > tamanho || posicao < 0){ // verifica se tem a posição na lista ou se é menor que 0
            System.out.println("Posição não disponível na lista");
            return;
        }

        Nodo novo = new Nodo(valor); // criando novo nó

        if(posicao == 0){   // verifica se é a primeira posição
            if (tamanho == 0) {     // se a lista está vazia
                primeiro = novo;
                ultimo = novo;
            } else {
                novo.setProximo(primeiro); // novo nó aponta para o antigo primeiro
                primeiro = novo;           // novo nó se torna o primeiro
            }
        } else if(posicao == tamanho){  // verifica se é a última posição
            ultimo.setProximo(novo);    // último nó atual aponta para o novo nó
            ultimo = novo;              // o novo nó passa a ser o último
        } else {
            Nodo aux = primeiro;    // cria um nó auxiliar para percorrer a lista
            for (int i = 0; i < (posicao - 1); i++){  // percorre o nó até o nó anterior à posição
                aux = aux.getProximo();     // nó auxiliar recebe a posição posterior
            }
            novo.setProximo(aux.getProximo()); //novo nó aponta para o nó na posição desejada (vai tormar a posição dps)
            aux.setProximo(novo);     // nó anterior à posição desejada aponta para novo nó
        }
        tamanho++; // incrementa o tamanho da lista
    }

    //6. Crie um método responsável por remover um elemento no início da lista.
    public void removerInicio(){
        if(tamanho == 0){   // verifica se a lista está vazia
            System.out.println("A lista está vazia");
            return;
        }
        if(tamanho == 1){   //se tiver apenas um elemento na lista (zera a lista)
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.getProximo(); // primeiro passa a ser o segundo nó
        }
        tamanho--; // decrementa o tamanho da lista

    }

    // 7. Crie um método responsável por remover um elemento no fim da lista.
    public void removerFim(){
        if(tamanho == 0){   // verifica se a lista está vazia
            System.out.println("A lista está vazia");
            return;
        }
        if (tamanho == 1) {   //se tiver apenas um elemento na lista (zera a lista)
            primeiro = null;
            ultimo = null;
        } else {
            Nodo aux = primeiro; // criando um nó auxiliar
            for (int i = 0; i < (tamanho - 2); i++){ // percorre a lista até o penuntimo
                aux = aux.getProximo(); // aux passa a ser o proximo nó
            }
            ultimo = aux; // o penúltimo nó agora é o último
            ultimo.setProximo(null); // o último nó não aponta para nada (null)
        }
        tamanho--; // decrementa o tamanho da lista

    }

    // 8. Crie um método responsável por remover um elemento em uma posição específica da lista.
    public void removerPosicao(int posicao){
        if(posicao >= tamanho || posicao < 0){ // verifica se a posição está na lista
            System.out.println("A posição não está disponível");
            return;
        }
        if (posicao == 0){ // verifica se é a primeira posição
            if(tamanho == 1){ // verifica se a lista tem apenas 1 posição (zera a lista)
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = primeiro.getProximo(); // primeiro passa a ser o proximo nó
            }
        } else if (posicao == tamanho - 1) { // verifica se é a último elemento
            Nodo aux = primeiro; // criando um nó auxiliar
            for (int i = 0; i < (tamanho - 2); i++){ // percorre a lista até o penuntimo
                aux = aux.getProximo(); // aux passa a ser o proximo nó
            }
            ultimo = aux; // o penúltimo nó agora é o último
            ultimo.setProximo(null); // o último nó não aponta para nada (null)
        } else {
            Nodo aux = primeiro; // criando um nó auxiliar
            for (int i = 0; i < (posicao - 1); i++){    // percorre até o nó anterior ao quero remover
                aux = aux.getProximo(); // aux passa a ser o proximo nó
            }
            aux.setProximo(aux.getProximo().getProximo()); //nó anterior (aux) aponta para o próximo do nó que será removido
        }
        tamanho--; // decrementa o tamanho da lista
    }

    // 9. Crie um método responsável por remover um elemento específico da lista.
    public void removerElemento(int valor){
        if(tamanho == 0){ // se a lista estiver vazia
            System.out.println("A lista está vazia");
            return;
        }
        if (primeiro.getValor() == valor) { // caso o valor seja o primeiro item da lista
            if (tamanho == 1) { // se a lista tiver 1 elemento
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = primeiro.getProximo(); // o segundo nó passa a ser o primeiro
            }
            tamanho--;  // decrementa o tamanho da lista
            return;
        }

        Nodo aux = primeiro; // criando um auxiliar para percorrer a lista
        Nodo anterior = null; // vai armazenar o nó anterior

        while (aux != null){ // percorre a lista
            if (aux.getValor() == valor){
                if (aux == ultimo){ // se for o ultimo elemento
                    ultimo = anterior; // o penultimo passa a ser o ultimo
                }
                if (anterior != null) {     // ajusta o ponteiro do elemento anterior ao que será removido
                    anterior.setProximo(aux.getProximo()); // o anterior apontá para o prox.prox elemento
                }
                tamanho--;  // decrementa o tamanho da lista
                return;
            }
            anterior = aux;     // guarda o nó anterior
            aux = aux.getProximo();  // aux passa a ser o proximo nó
        }

        System.out.println("Elemento não encontrado na lista.");

    }

    // 10. Crie um método para exibir o conteúdo de uma lista.
    public void exibirLista() {
        if (tamanho == 0) {  // verifica se a lista está vazia
            System.out.println("A lista está vazia.");
            return;
        }

        Nodo aux = primeiro;  // nó auxiliar para percorrer lista
        while (aux != null) {  // percorre a lista toda
            System.out.print(aux.getValor() + " -> ");  // print o nó atual
            aux = aux.getProximo();  // avança pro próximo nó
        }
        System.out.println("null");  // indica o fim da lista
    }

    //  11. Crie um método para pesquisar por um elemento específico em uma lista e
    //  informar, caso o elemento exista, a posição na qual ele está armazenado.
    public void pesquisar(int valor){
        if (tamanho == 0) {  // verifica se a lista está vazia
            System.out.println("A lista está vazia.");
            return;
        }
        Nodo aux = primeiro; // aux para percorrer lista
        int posicao = 0; // armazena a posição
        while (aux != null) {  // percorre a lista toda
            if (aux.getValor() == valor){
                System.out.println("Elemento "+valor+" encontrado, na posição: "+posicao);
                return;
            }
            posicao++;  // incrementa na posição
            aux = aux.getProximo(); // passa para o proximo nó
        }
        System.out.println("Elemento " + valor + " não encontrado na lista.");
    }

    // 12. Crie um método que retorne o número de elementos existentes na lista.
    public int tamanhoLista(){
        System.out.println("O número de elementos da lista é: " + tamanho);
        return tamanho;
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // criar lista vazia
        lista.criarListaVazia();

        lista.exibirLista();
        lista.tamanhoLista();

        // inserindo elementos na lista
        lista.inserirInicio(4);  // 4
        lista.inserirFim(7);    // 4 , 7
        lista.inserirEspecifico(1, 1); // 4, 1, 7
        lista.inserirInicio(0);  // 0, 4, 1, 7
        lista.inserirFim(9); // 0, 4, 1, 7, 9
        lista.inserirEspecifico(6, 2); // 0, 4, 6, 1, 7, 9

        lista.exibirLista();  // 0, 4, 6, 1, 7, 9
        lista.tamanhoLista(); // = 6

        // remoção de elementos
        lista.removerInicio(); //4, 6, 1, 7, 9
        lista.removerFim(); // 4, 6, 1, 7
        lista.removerPosicao(1); // 4, 1, 7
        lista.removerElemento(1); // 4, 7

        lista.exibirLista();  // 4, 7
        lista.tamanhoLista(); // = 2

    }
}