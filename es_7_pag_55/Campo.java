public class Campo {
    private PrenotazioneSingola prenotazione;
    
    public boolean addPren(int inizio, int fine, String nome) {
        if(prenotazione == null && inizio < fine && inizio >= 0 && fine <= 24) {
            prenotazione = new PrenotazioneSingola(nome, inizio, fine);
            return true;
        }
        return false;
    }
    
    public boolean removePren(int inizio, int fine, String nome) {
        if(prenotazione != null && 
           prenotazione.inizio == inizio && 
           prenotazione.fine == fine && 
           prenotazione.nome.equals(nome)) {
            prenotazione = null;
            return true;
        }
        return false;
    }
    
    public double utilizzo() {
        if(prenotazione != null) {
            return ((prenotazione.fine - prenotazione.inizio) / 24.0) * 100;
        }
        return 0.0;
    }
}

// PrenotazioneSingola.java
class PrenotazioneSingola {
    String nome;
    int inizio;
    int fine;
    
    PrenotazioneSingola(String n, int i, int f) {
        nome = n;
        inizio = i;
        fine = f;
    }
}