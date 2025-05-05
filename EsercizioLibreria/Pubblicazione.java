public abstract class Pubblicazione {
    protected String titolo;
    protected float prezzo;

    public Pubblicazione(String titolo, float prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public abstract void stampaDettagli();

    public String descrizione() {
        return "Titolo: " + titolo + ", Prezzo: " + prezzo + "€";
    }
}