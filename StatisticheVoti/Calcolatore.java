public class Calcolatore
{
    
    public Calcolatore()
    {
        
    }

    
    public float MediaComplessiva(Materia[] x){
        float risultato = 0;
        for(int i = 0; i<x.length; i++){
            risultato += x[i].getMediaTotali();
        }
        return risultato/=x.length;
    }
    
    public boolean Insufficente(Materia x){
        if(x.getMediaTotali()<6){
            return true;
        } else {
            return false;
        }
    }
    
    
}
