public class Studente extends Persona {
    
    private String Matricola;
    private String Universita;
    
    public Studente()
    {
        super();
        this.Matricola = "...";
        this.Universita = "...";
    }

    public void InserisciMatricola(String matricola) {
        this.Matricola = matricola;
        return;
    }
    
    public void InserisciUniversita(String universita) {
        this.Universita = universita;
        return;
    }
    
    public String OttieniMatricola() {
        return Matricola;
    }
    
    public String OttieniUniversita() {
        return Universita;
    }
    
    @Override
    public String toString() {
        return "Persona [CodiceFiscale=" + CodiceFiscale 
            + ", Nome=" + Nome 
            + ", Cognome=" + Cognome 
            + ", Matricola=" + Matricola 
            + ", Università=" + Universita + "]";
    }
}
