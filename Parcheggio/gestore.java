public class gestore
{
    private double costoAutovetture = 2; // In euro
    private double costoMoto = 1.50; // In euro
    private double costoConCoperto = 20; //In percentuale
    
    private double cassa = 0;
    
    public void aggiornaCassa(double importo){
        cassa+=importo;
    }

    public void costoTotale(boolean coperto, String Veicolo, float OrarioArrivo, float OrarioPartenza){
        double costoTotale;
        float OreTotali = OrarioPartenza - OrarioArrivo;
        if(Veicolo == "Automobile"){
            costoTotale = (costoAutovetture * OreTotali);
        } else {
            costoTotale = (costoMoto * OreTotali);
        }
        
        if(coperto){
            costoTotale+=(costoTotale*costoConCoperto/100);
        }
    }
    
    public boolean controlloAlmenoUnoOccupato(slotParcheggio[] slot){
        boolean tuttiLiberi = true;
        for(int i = 0; i<slot.length && tuttiLiberi; i++){
            if(slot[i].getOccupato()){
                tuttiLiberi = false;
            }
        }
        return tuttiLiberi;
    }
    
    public boolean controlloAlmenoUnoLibero(slotParcheggio[] slot){
        boolean tuttiOccupati = true;
        for(int i = 0; i<slot.length && tuttiOccupati; i++){
            if(!slot[i].getOccupato()){
                tuttiOccupati = false;
            }
        }
        return tuttiOccupati;
    }
}
