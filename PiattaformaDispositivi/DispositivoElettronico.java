public abstract class DispositivoElettronico
{
    protected String nome;
    protected double prezzo;
    
    public DispositivoElettronico(String nome, double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }
    
    public abstract void DettagliTecnici();
    
    public void dettagli(){
        System.out.println("Nome: " + nome);
        System.out.println("Prezzo: " + prezzo + "€");
    }
}
