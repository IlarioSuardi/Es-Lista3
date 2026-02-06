public class Lista {
    private Nodo head;

    public Lista() {
        this.head = null;
    }

    public void aggiungi(Tecnica tecnica) {
        Nodo nuovoNodo = new Nodo(tecnica);
        if (head == null || head.tecnica.getDifficolta() >= tecnica.getDifficolta()) {
            nuovoNodo.next = head;
            head = nuovoNodo;
            return;
        }

        Nodo current = head;
        while (current.next != null && current.next.tecnica.getDifficolta() < tecnica.getDifficolta()) {
            current = current.next;
        }
        nuovoNodo.next = current.next;
        current.next = nuovoNodo;
    }

    public void rimuoviElemento(String tecnica) {
        if (head == null) return;
        if (head.tecnica.getNome().equals(tecnica)) {
            head = head.next;
            return;
        }
        Nodo current = head;
        while (current.next != null) {
            if (current.next.tecnica.getNome().equals(tecnica)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public Iteratore getIteratore() {
        return new Iteratore(head);
    }

    public void stampaLista() {
        Nodo c = head; while (c != null) {
            System.out.println("Tecnica: " + c.tecnica.getNome() + ", Difficoltà: " + c.tecnica.getDifficolta() + ", Categoria: " + c.tecnica.getCategoria());
            c = c.next;
        }
    }
}