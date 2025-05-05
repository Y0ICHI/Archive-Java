public class Camion extends Veicolo
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private int capacità_di_carico, numero_di_assi;
    private float lunghezza;

    public Camion()
    {

    }
    
    public void getCarico(int capacità){
        this.capacità_di_carico = capacità;
    }
    
    public void getAssi(int assi){
        this.numero_di_assi = assi;
    }
    
    public void lunghezza(float lunghezza){
        this.lunghezza = lunghezza;
    }
    
    @Override
    public void Visualizza()
    {
        System.out.println("Tipo veicolo: " + TipoVeicolo(Categoria)
        + "\nTarga: " + Targa 
        + "\nCapacità di carico: " + capacità_di_carico
        + "\nNumero di assi: " + numero_di_assi
        + "\nLunghezza: " + lunghezza);
    }
}
