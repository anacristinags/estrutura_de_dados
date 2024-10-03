/*  LISTA DUPLAMENTE ENCADEADA
    Lista de exercícios 04 – Estruturas de Dados
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

    private int tamanho;
    private Nodo primeiro;
    private Nodo ultimo;

    // 2. Crie um método para criar uma lista vazia.
    public void criarListaVazia(){
        primeiro = null;
        ultimo = null;
        tamanho = 0;
        System.out.println("A lista foi inicializada como vazia");
    }

    // 3. Crie um método responsável por inserir um elemento no início da lista.
    public void inserirInicio(int valor){
        Nodo novo = new Nodo(valor);
        if(tamanho == 0){       // se a lista estiver vazia
            primeiro = novo;    // o novo elemento será o 1º e o ultimo
            ultimo = novo;
        } else {
            primeiro.setAnterior(novo);     // anterior do 1º aponta pro novo
            novo.setProximo(primeiro);      // novo nó .prox aponta para o "primeiro"
            primeiro = novo;                // primeiro passa a ser o novo nó
        }
        tamanho++;      // incrementa o tamanho da lista
    }

    // 4. Crie um método responsável por inserir um elemento no fim da lista.
    public void inserirFim(int valor){
        Nodo novo = new Nodo(valor);
        if(tamanho == 0){       // se a lista estiver vazia
            primeiro = novo;    // o novo elemento será o 1º e o ultimo
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);        // ultimo .prox aponta p/ novo
            novo.setAnterior(ultimo);       // novo .ant aponta p/ ultimo
            ultimo = novo;              // ultimo passa a ser o novo nó
        }
        tamanho++;       // incrementa o tamanho da lista
    }

    // 5. Crie um método responsável por inserir um elemento em uma posição específica da lista.
    public void inserirPosicao(int valor, int posicao){
        if (!(posicao <= tamanho && posicao >= 0)){
            System.out.println("Posição Inválida");
            return;
        }
        Nodo novo = new Nodo(valor);
        if (posicao == 0){          // se for a primeira posição
            if(tamanho == 0){       // verifica se a lista está vazia
                primeiro = novo;    // o novo elemento será o 1º e o ultimo
                ultimo = novo;
            } else {
                primeiro.setAnterior(novo);
                novo.setProximo(primeiro);
                primeiro = novo;
            }
        } else if (posicao == tamanho){     // verifica se é a ultima posição
            ultimo.setProximo(novo);        // ultimo .prox aponta p/ novo
            novo.setAnterior(ultimo);       // novo .ant aponta p/ ultimo
            ultimo = novo;              // ultimo passa a ser o novo nó
        } else {
            Nodo aux = primeiro;        // nó aux para percorrer lista
            for(int i = 0; i < posicao; i++){
                aux = aux.getProximo();     // percorre até a posição
            }
            novo.setProximo(aux);       // novo .prox aponta pro aux
            novo.setAnterior(aux.getAnterior()); // novo .ant aponta para o anterior do aux
            aux.getAnterior().setProximo(novo); // anterior do aux aponta para novo
            aux.setAnterior(novo); // anterior do aux aponta para novo
        }
        tamanho++;       // incrementa o tamanho da lista
    }


    // 6. Crie um método responsável por remover um elemento no início da lista.
    public void removerInicio(){
        if(tamanho == 0){       // se a lista estiver vazia
            System.out.println("Lista Vazia");
            return;
        }
        if(tamanho == 1){       // verifica se só tem um elemento
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.getProximo();   // primeiro passa a ser o prox
            primeiro.setAnterior(null);         // set(null) o anterior
        }
        tamanho--; // decrementa o tamanho da lista
    }

    //  7. Crie um método responsável por remover um elemento no fim da lista.
    public void removerFim(){
        if(tamanho == 0){       // se a lista estiver vazia
            System.out.println("Lista Vazia");
            return;
        }
        if(tamanho == 1){       // verifica se só tem um elemento
            primeiro = null;
            ultimo = null;
        } else {
            ultimo = ultimo.getAnterior();  // ultimo passar a ser o penultimo
            ultimo.setProximo(null);        // set(null) o .prox do ultimo elemento
        }
        tamanho--; // decrementa o tamanho da lista
    }

    // 8. Crie um método responsável por remover um elemento em uma posição específica da lista.
    public void removerPosicao(int posicao){
        if(!(posicao <= tamanho && posicao >= 0)){  // verifica a posição
            System.out.println("Posição Inválida");
            return;
        }
        if(posicao == 0){   // caso a posição seja a primeira
            if(tamanho == 1){   // caso tenha apenas um elemento na lista
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = primeiro.getProximo();   // primeiro passa a ser o prox
                primeiro.setAnterior(null);         // set(null) o anterior
            }
        } else if (posicao == tamanho - 1) {
            ultimo = ultimo.getAnterior();  // ultimo passar a ser o penultimo
            ultimo.setProximo(null);        // set(null) o .prox do ultimo elemento
        } else{
            Nodo aux = primeiro;    // nó aux para percorrer lista
            for (int i = 0; i < posicao; i++){
                aux = aux.getProximo(); // aux vai percorrer até chegar na posição a ser removida
            }
            aux.getAnterior().setProximo(aux.getProximo()); // anterior do aux aponta p/ o .prox do aux
            aux.getProximo().setAnterior(aux.getAnterior()); // proximo do aux aponta p/ o .ant do aux
            aux.setAnterior(null);      // set(null) os ponteiros
            aux.setProximo(null);
        }
        tamanho--; // decrementa o tamanho da lista
    }

    // 9. Crie um método responsável por remover um elemento específico da lista.
    public void removerElemento(int valor){
        if(tamanho == 0){       // se a lista está vazia
            System.out.println("Lista Vazia");
            return;
        }

        if (primeiro.getValor() == valor){  // verifica se o valor é o primeiro
            if(tamanho == 1){       // verifica se só tem um elemento
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = primeiro.getProximo();   // primeiro passa a ser o prox
                primeiro.setAnterior(null);         // set(null) o anterior
            }
            tamanho--; // decrementa o tamanho da lista
            return;
        }
        if (ultimo.getValor() == valor) {       // verifica se é o ultimo
            ultimo = ultimo.getAnterior();  // ultimo passar a ser o penultimo
            ultimo.setProximo(null);        // set(null) o .prox do ultimo elemento
            tamanho--; // decrementa o tamanho da lista
            return;
        }

        Nodo aux = primeiro; // percorre a lista até achar (ou nao)
        while (aux.getProximo() != null){   // percorre até o fim
            if(aux.getValor() == valor){
                aux.getAnterior().setProximo(aux.getProximo()); // anterior do aux aponta p/ o .prox do aux
                aux.getProximo().setAnterior(aux.getAnterior()); // proximo do aux aponta p/ o .ant do aux
                aux.setAnterior(null);      // set(null) os ponteiros
                aux.setProximo(null);
                tamanho--; // decrementa o tamanho da lista
                return;
            }

            aux = aux.getProximo(); // aux passa a ser o prox nó
        }

        System.out.println("Elemento não encontrado");
    }

    // 10. Crie um método para exibir o conteúdo de uma lista.
    public void exibir(){
        if (tamanho == 0) {  // verifica se a lista está vazia
            System.out.println("A lista está vazia.");
            return;
        }

        Nodo aux = primeiro;  // Inicia o aux no primeiro nodo
        System.out.print("Conteúdo da lista: ");

        while (aux != null) {  // Percorre até o final da lista
            System.out.print(aux.getValor() + " ");  // Exibe o valor do nodo
            aux = aux.getProximo();  // Avança para o próximo nodo
        }

        System.out.println();  // Para garantir a quebra de linha no final

    }

    // 11. Crie um método para pesquisar por um elemento específico em uma lista e
    // informar, caso o elemento exista, a posição na qual ele está armazenado.
    public void pesquisar(int valor){
        if (tamanho == 0) {  // verifica se a lista está vazia
            System.out.println("A lista está vazia.");
            return;
        }
        Nodo aux = primeiro; // vai percorrer a lista
        int posicao = 0;      // armazenar a posição

        while (aux != null){    // percorre até o fim
            if(aux.getValor() == valor){
                System.out.println("Elemento "+valor+" encontrado! Na posição "+ posicao);
                return;
            }
            aux = aux.getProximo();     // passa a ser o prox nó
            posicao++; // incrementa a posição
        }
        System.out.println("Elemento "+valor+" não encontrado!");
    }



    // 12. Crie um método que retorne o número de elementos existentes na lista.
    public void numeroElementos(){
        System.out.println("O número de elementos da lista é: "+tamanho);
    }


    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // criar lista vazia
        lista.criarListaVazia();

        lista.exibir();     // lista vazia
        lista.numeroElementos();    // num elementos: 0

        // inserindo elementos na lista
        lista.inserirInicio(4);   // 4
        lista.inserirFim(7);     // 4 , 7
        lista.inserirPosicao(1, 1); // 4, 1, 7
        lista.inserirInicio(0);  // 0, 4, 1, 7
        lista.inserirFim(9); // 0, 4, 1, 7, 9
        lista.inserirPosicao(6, 2); // 0, 4, 6, 1, 7, 9

        lista.exibir();  // 0, 4, 6, 1, 7, 9
        lista.numeroElementos(); // = 6

        // remoção de elementos
        lista.removerInicio(); //4, 6, 1, 7, 9
        lista.removerFim(); // 4, 6, 1, 7
        lista.removerPosicao(1); // 4, 1, 7
        lista.removerElemento(1); // 4, 7

        lista.exibir();  // 4, 7
        lista.numeroElementos(); // = 2

    }
}