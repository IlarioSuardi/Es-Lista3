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



    public void stampaLista() {
        Nodo c = head; while (c != null) {
            System.out.println("Tecnica: " + c.tecnica.getNome() + ", Difficoltà: " + c.tecnica.getDifficolta() + ", Categoria: " + c.tecnica.getCategoria());
            c = c.next;
        }
    }
}