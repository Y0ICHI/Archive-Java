
public class Persona {
    protected String CodiceFiscale, Nome, Cognome;
    
    public Persona() {
        CodiceFiscale = "...";
        Nome = "...";
        Cognome = "...";
    }

    public void InserisciCodice(String codiceFiscale) {
        this.CodiceFiscale = codiceFiscale;
        return;
    }
    
    public void InserisciNome(String nome) {
        this.Nome = nome;
        return;
    }
    
    public void InserisciCognome(String cognome) {
        this.Cognome = cognome;
        return;
    }
    
    public String OttieniCodice() {
        return CodiceFiscale;
    }
    
    public String OttieniNome() {
        return Nome;
    }
    
    public String OttieniCognome() {
        return Cognome;
    }
    
    public String toString() {
        return "Persona [CodiceFiscale=" + CodiceFiscale 
            + ", Nome=" + Nome 
            + ", Cognome=" + Cognome + "]";
    }
}
