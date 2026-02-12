public class Main {
    public static void main(String[] args) {
        Lista listaTecniche = new Lista();

        listaTecniche.aggiungi(new Tecnica("RNC", 2, Tecnica.Categoria.SOTTOMISSIONE));
        listaTecniche.aggiungi(new Tecnica("Leva al braccio", 1, Tecnica.Categoria.SOTTOMISSIONE));
        listaTecniche.aggiungi(new Tecnica("Triangolo", 3, Tecnica.Categoria.PROIEZIONE));

        System.out.println("\nLista delle tecniche iniziale:");
        listaTecniche.stampaLista();

        listaTecniche.aggiungi(new Tecnica("Americana", 4, Tecnica.Categoria.SOTTOMISSIONE));
        listaTecniche.rimuoviElemento("RNC");

        System.out.println("\n" +
                "Lista delle tecniche aggiornata:");
        listaTecniche.stampaLista();

        System.out.println("\nStampa usando l'iteratore:");
        Iteratore it = listaTecniche.getIteratore();
        while (it.hasNext()) {
            Tecnica t = it.next();
            System.out.println(t);
        }
    }
}