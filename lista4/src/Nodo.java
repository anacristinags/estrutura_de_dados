public class Nodo {
    private int valor;
    private Nodo proximo;
    private Nodo anterior;

    // construtor p/ criar o novo nó
    public Nodo (int valor){
        this.valor = valor;
        this.proximo = null;    // ponteiros inicialmente "zerados"
        this.anterior = null;
    }

    // getters e setters para os atributos
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
