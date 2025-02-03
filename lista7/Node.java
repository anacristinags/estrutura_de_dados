public class Node {
    // elementos do nó
    int valor;
    Node proximo;

    // construtor
    public Node(int valor){
        this.valor = valor;
        this.proximo = null;
    }

    // getters e setters para os atributos
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}