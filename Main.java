public class Main {
    public static void main(String[] args) {
        Lista listaTecniche = new Lista();

        listaTecniche.aggiungi(new Tecnica("RNC", 2, Tecnica.Categoria.SOTTOMISSIONE));
        listaTecniche.aggiungi(new Tecnica("Leva al braccio", 1, Tecnica.Categoria.SOTTOMISSIONE));
        listaTecniche.aggiungi(new Tecnica("Triangolo", 3, Tecnica.Categoria.PROIEZIONE));

        System.out.println("Lista delle tecniche:");
        listaTecniche.stampaLista();

        listaTecniche.aggiungi(new Tecnica("Americana", 4, Tecnica.Categoria.SOTTOMISSIONE));
        listaTecniche.rimuoviElemento("Triangolo");

        System.out.println("Lista delle tecniche aggiornata:");
        listaTecniche.stampaLista();
    }
}
