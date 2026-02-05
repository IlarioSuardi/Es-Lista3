public class Tecnica {
    private String nome;
    private int difficolta;
    private String categoria;

    public Tecnica(String nome, int difficolta, String categoria) {
        this.nome = nome;
        this.difficolta = difficolta;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getDifficolta() {
        return difficolta;
    }

    public String getCategoria() {
        return categoria;
    }

    private boolean categoriaValida(String categoria) {
        if (categoria == null) {
            return false;
        }
        if (categoria.equals("proiezione")) return true;
        if (categoria.equals("sottomissione")) return true;
        return false;
    }

    public String toString() {
        return nome + " (" + categoria + ", difficoltà: " + difficolta + ")";
    }
}
