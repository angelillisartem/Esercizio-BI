public class Matita {
    private String id;
    private String marca;
    private String modello;
    private String colore;
    private String lunghezza;
    private float prezzoAcquisto;
    private String dataAcquisto;
    private String valore;
    private String descrizione;

    public Matita(String id, String marca, String modello, String colore, String lunghezza, float prezzoAcquisto, String dataAcquisto, String valore, String descrizione) {
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.lunghezza = lunghezza;
        this.prezzoAcquisto = prezzoAcquisto;
        this.dataAcquisto = dataAcquisto;
        this.valore = valore;
        this.descrizione = descrizione;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setLunghezza(String lunghezza) {
        this.lunghezza = lunghezza;
    }

    public void setPrezzoAcquisto(float prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public void setDataAcquisto(String dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getColore() {
        return colore;
    }

    public String getLunghezza() {
        return lunghezza;
    }

    public float getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public String getDataAcquisto() {
        return dataAcquisto;
    }

    public String getValore() {
        return valore;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
