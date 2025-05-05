public class slotParcheggio {
    private boolean occupato, coperto;
    private String tipoVeicolo;
    private float OrarioArrivo;
    
    public slotParcheggio(boolean coperto) {
        this.coperto = coperto;
        occupato = false;
        tipoVeicolo = "...";
        OrarioArrivo = -1;
    }
    
    public boolean setOccupato(String Veicolo, float orario){
        if(!occupato){ // Restituisce vero se ha potuto corettamente impostare che è occupato in caso è stato già occupato restituisce false
            occupato = true;
            this.OrarioArrivo = orario;
            this.tipoVeicolo = Veicolo;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean setLiberaParcheggio(){
        if(occupato){
            this.occupato = false;
            this.OrarioArrivo = 0;
            this.tipoVeicolo = "...";
            return true; 
        } else {
            return false;
        }
    }
    
    public void Visualizza(){
            if(occupato){
            System.out.println("Coperto: " + coperto);
            System.out.println("Tipo veicolo: " + tipoVeicolo);
            System.out.println("Orario di arrivo: " + OrarioArrivo);
            } else {
            System.out.println("Il posto non contiene al suo interno nessuno veicolo");
        }
    }
    
    public boolean getCoperto(){
        return coperto;
    }
    
    public String getTipoVeicolo(){
        return tipoVeicolo;
    }
    
    public void setTipoVeicolo(String Nome){
        this.tipoVeicolo = Nome;
    }
    
    public float getOrarioArrivo(){
        return OrarioArrivo;
    }
    
    public void setOrarioArrivo(float Arrivo){
        this.OrarioArrivo = Arrivo;
    }
    
    public boolean getOccupato(){
        return occupato;
    }
    
    public void getOccupato(boolean occupato){
        this.occupato = occupato;
    }
    
}