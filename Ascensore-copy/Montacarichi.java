public class Montacarichi {
    protected float pesoMassimo;
    protected int numPiani;
    protected int Corrente;

    public Montacarichi(int numPiani, float pesoMassimo) {
        this.numPiani = numPiani;
        this.pesoMassimo = pesoMassimo;
        this.Corrente = 0; // Inizializza l'ascensore al piano 0
    }
}