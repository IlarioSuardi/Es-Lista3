public class Iteratore {
    private Nodo current = null;

    public Iteratore(Nodo head) {
        this.current = head;
    }

    public boolean hasNext() {
        return current != null;
    }

    public Tecnica next() {
        Tecnica tecnica = current.tecnica;
        current = current.next;
        return tecnica;
    }
}