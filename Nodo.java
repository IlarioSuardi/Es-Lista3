public class Nodo {
    Tecnica tecnica;
    Nodo next;

    public Nodo(Tecnica tecnica) {
        this.tecnica = tecnica;
        this.next = null;
    }

    public void setTecnica(Tecnica tecnica) {
        this.tecnica = tecnica;
    }

    public Tecnica getTecnica() {
        return tecnica;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getNext() {
        return next;
    }
}