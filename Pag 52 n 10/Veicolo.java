public class Veicolo
{
    protected int Categoria; // ogni numero rappresenta la categoria del veicolo.
    protected String Targa;
    
    public Veicolo() {
    }
    
    public void getCategoria(int categoria){
        this.Categoria = categoria;
    }
    
    public void getTarga(String targa){
        this.Targa = targa;
    }
    
    public void Visualizza()
    {
        System.out.println("Tipo veicolo: " + TipoVeicolo(Categoria)
        + "\nTarga: " + Targa);
    }
    
    public String TipoVeicolo(int tipo){
        switch(tipo){
            case 1:
                return "Classe A";
            case 2:
                return "Classe B";
            case 3:
                return "Classe 3";
            case 4:
                return "Classe 4";
            case 5:
                return "Classe 5";
        }
        return "...";
    }
}
