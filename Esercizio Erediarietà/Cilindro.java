public class Cilindro extends Cerchio {
    private float altezza;
    
    public Cilindro() {
        super();
    }
    
    public void inserisciDati() {
        super.inserisciDati();
        altezza = in.nextFloat();
    }
    
    public double calcolaVolume() {
        return calcolaArea() * altezza;
    }
}
