public class Lista {
    private Nodo head;
    private Nodo nodo;

    public Lista() {
        this.head = null;
        this.nodo = null;
    }

    public void aggiungiTecnica(Tecnica tecnica) {
        Nodo nuovoNodo = new Nodo(tecnica);
        if (head == null) {
            head = nuovoNodo;
        } else {
            Nodo current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nuovoNodo;
        }
    }


    public void stampaLista() {
        Nodo c = head;
        while (c != null) {
            System.out.println("Tecnica: " + c.tecnica.getNome() + ", Difficoltà: " + c.tecnica.getDifficolta() + ", Categoria: " + c.tecnica.getCategoria());
            c = c.next;
        }
    }
}