    public class Libro extends Pubblicazione {
    private String autore;
    private String genere;

    public Libro(String titolo, float prezzo, String autore, String genere) {
        super(titolo, prezzo);
        this.autore = autore;
        this.genere = genere;
    }

    @Override
    public void stampaDettagli() {
        System.out.println("---- Dettagli del Libro ----");
        System.out.println("Titolo: " + titolo);
        System.out.println("Prezzo: " + prezzo + "€");
        System.out.println("Autore: " + autore);
        System.out.println("Genere: " + genere);
    }
}