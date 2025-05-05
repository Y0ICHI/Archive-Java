public class Rivista extends Pubblicazione {
    private int numero;
    private String mese;

    public Rivista(String titolo, float prezzo, int numero, String mese) {
        super(titolo, prezzo);
        this.numero = numero;
        this.mese = mese;
    }

    @Override
    public void stampaDettagli() {
        System.out.println("---- Dettagli della Rivista ----");
        System.out.println("Titolo: " + titolo);
        System.out.println("Prezzo: " + prezzo + "€");
        System.out.println("Numero: " + numero);
        System.out.println("Mese: " + mese);
    }
}