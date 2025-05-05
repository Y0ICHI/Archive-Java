public class Moto extends Veicolo
{
    private int numero_di_posti;
    private int cilindrata;

    public Moto()
    {
        
    }
    
    public void getPosti(int posti){
        this.numero_di_posti = posti;
    }
    
    public void getCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }
    
    @Override
    public void Visualizza()
    {
        System.out.println("Tipo veicolo: " + TipoVeicolo(Categoria)
        + "\nTarga: " + Targa 
        + "\nPosti: " + numero_di_posti
        + "\nCilindrata: " + cilindrata);
    }
}
