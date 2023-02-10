public class Scatola {
    private String idMatita;
    private String categoria;

    private Matita matite[];

    public Scatola(String idMatita, String categoria) {
        this.idMatita = idMatita;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void addMatita(Matita matita) {

    }

    public void removeMatita(String idMatita) {

    }
}
