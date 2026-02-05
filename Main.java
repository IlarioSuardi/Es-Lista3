public class Main {
    public static void main(String[] args) {
        Lista listaTecniche = new Lista();

        listaTecniche.aggiungiTecnica(new Tecnica("RNC", 2, "sottomissione"));
        listaTecniche.aggiungiTecnica(new Tecnica("kuzushi", 3, "proiezione"));
        listaTecniche.aggiungiTecnica(new Tecnica("leva al braccio", 3, "sottomissione"));


        System.out.println("Lista delle tecniche: ");
        listaTecniche.stampaLista();
    }
}
