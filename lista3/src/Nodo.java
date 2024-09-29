public class Nodo {
    private int valor;
    private Nodo proximo;

    // construtor para inicio do Node
    public Nodo(int valor) {
        this.valor = valor;
        this.proximo = null;  // Inicialmente, não temos um próximo Node
    }

    // getters e setters para os atributos
    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public Nodo getProximo(){
        return proximo;
    }

    public void setProximo(Nodo proximo){
        this.proximo = proximo;
    }

}
