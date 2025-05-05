
public class Auto extends Veicolo
{
    private int numero_di_passeggeri;
    private float potenza;
    
    public Auto()
    {
        
    }
    
    public void getPassegieri(int passegieri){
        this.numero_di_passeggeri = passegieri;
    }
    
    public void getPotenza(float potenza){
        this.potenza = potenza;
    }
    
    @Override
    public void Visualizza()
    {
        System.out.println("Tipo veicolo: " + TipoVeicolo(Categoria)
        + "\nTarga: " + Targa 
        + "\nNumero passegieri: " + numero_di_passeggeri
        + "Potenza (Kilowatt): " + potenza);
    }
}
