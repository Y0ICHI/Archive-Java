public class Ascensore extends Montacarichi {
    private int Ppartenza, Parrivo, numPersoneMAX;
    private int[] Pprenotati;
    protected int Corrente;

    public Ascensore(int numPersoneMAX, int numPiani, float pesoMassimo) {
        super(numPiani, pesoMassimo);
        this.numPersoneMAX = numPersoneMAX;
        this.Pprenotati = new int[numPiani];
        for (int i = 0; i < Pprenotati.length; i++) {
            Pprenotati[i] = -1; // Inizializza le prenotazioni come non prenotate
        }
    }

    public int get_Ppartenza() {
        return Ppartenza;
    }

    public int get_Parrivo() {
        return Parrivo;
    }

    public int[] get_Pprenotati() {
        return Pprenotati;
    }

    public void StampaPrenotati() {
        for (int i = 0; i < Pprenotati.length; i++) {
            if (Pprenotati[i] != -1) {
                System.out.println("Piano numero: " + Pprenotati[i] + " prenotato.");
            }
        }
    }

    public void set_Ppartenza(int Ppartenza) {
        this.Ppartenza = Ppartenza;
    }

    public void set_Parrivo(int Parrivo) {
        this.Parrivo = Parrivo;
    }

    public void set_prenotazionePrecisa(int PrenotazionePiano, int pos) {
        if (PrenotazionePiano >= 0 && PrenotazionePiano < numPiani) {
            this.Pprenotati[pos] = PrenotazionePiano;
        } else {
            System.out.println("Piano non valido per la prenotazione.");
        }
    }

    public void Sali() {
        if (Corrente < numPiani - 1) {
            Corrente++;
            System.out.println("Sono salito al piano " + Corrente);
        } else {
            System.out.println("Sei già al piano massimo.");
        }
    }

    public void Scendi() {
        if (Corrente > 0) {
            Corrente--;
            System.out.println("Sono sceso al piano " + Corrente);
        } else {
            System.out.println("Sei già al piano terra.");
        }
    }

    public void StampaStato() {
        System.out.println("Ascensore attualmente al piano: " + Corrente);
        StampaPrenotati();
    }
}