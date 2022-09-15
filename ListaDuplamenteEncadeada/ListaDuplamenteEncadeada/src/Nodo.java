public class Nodo {

    String item;
    Nodo proximo;
    Nodo anterior;

    public Nodo(String item) {
        this.item = item;
        this.proximo = null;
        this.anterior = null;
    }
    public String getItem() {
        return item;
    }
}
