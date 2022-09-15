public class ListaDuplamenteEncadeada {
    Nodo header;
    Nodo trailer;
    Nodo inicio;
    Nodo fim;
    int quantidade;

    public ListaDuplamenteEncadeada(){
        this.header = new Nodo(null);
        this.trailer = new Nodo(null);
        this.header.proximo = this.trailer;
        this.header.anterior = null;
        this.trailer.anterior = this.header;
        this.trailer.proximo = null;
        this.quantidade = 0;

    }


    public void adicionar(String item) {
        this.quantidade++;
        Nodo aux = new Nodo(item);
        if(this.trailer.anterior == null){
            this.trailer.anterior = aux;
            aux.proximo = this.trailer.anterior;
            this.header.proximo = aux;
            return;
        }
        Nodo antigo = this.trailer.anterior;
        antigo.proximo = aux;
        aux.proximo = this.trailer;
        aux.anterior = antigo;
        this.trailer.anterior = aux;
        return;
    }
    public String ler(int posicao) {
        //retorna item pela posicao
        
    }

    // // public void adicionar(int posicao, String item) {
    // //     //implementar
    // // }

    public void remover() {
        Nodo aux = this.trailer.anterior;
        aux.anterior = trailer;
        trailer.anterior = aux.anterior;
        this.quantidade--;
        return;
    }

    public void removerPelaPosicao(int posicao) {
    }

    // public boolean vazia() {
    //     //implementar
    // }

    public int tamanho() {
        return this.quantidade;
    }

    // public boolean contem(String item) {
    //     //implementar
    // }

    public int retornarPosicao(String item) {
    }
    @Override
    public String toString() {
        
        return super.toString();
    }
}