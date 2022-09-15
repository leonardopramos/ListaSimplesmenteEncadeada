import java.io.ObjectInputStream.GetField;

public class App {
    
    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada ls1 = new ListaDuplamenteEncadeada();
        ls1.adicionar("Monitor");
        ls1.adicionar("DockStation");
        ls1.adicionar("Notebook");
        System.out.println(ls1.tamanho());
        ls1.remover();
        System.out.println(ls1.tamanho());
    }
}
