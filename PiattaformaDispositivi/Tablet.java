public class Tablet extends DispositivoElettronico
{
    private float ArchiviazioneUsata, ArchiviazioneMassima;
    private boolean Lettura;
    private boolean AggiornamentiOS;
    
    public Tablet(String nome, double prezzo, float ArchiviazioneMassima){
       super(nome, prezzo); 
       this.ArchiviazioneMassima = ArchiviazioneMassima;
       this.Lettura = false;
       this.AggiornamentiOS = false;
    }
    
    public void aggiornamento(){
        System.out.println("Aggiornamento sistema operativo..");
        if(!AggiornamentiOS){
        try {
            Thread.sleep(6000);
            AggiornamentiOS = true;
        } catch (Exception e) {
            System.out.println("Errore.");
        }
        System.out.println("Aggiornamento completato!");
    } else {
        System.out.println("Il sistema operativo è già alla sua ultima versione!");
    }
    }
    
    public int setArchiviazioneUsata(float spazio){
        if((ArchiviazioneUsata+spazio)>ArchiviazioneMassima){
            return -1;   
        } else {
            ArchiviazioneUsata+=spazio;
            return 0;
        }
    }
    
    public void setArchiviazioneLiberata(float spazio){
        if(spazio>ArchiviazioneUsata){
            System.out.println("Ragazz* mio, stai provando a libeare più memoria che esista su questo telefono!");
        } else {
            ArchiviazioneUsata-=spazio;
        }
    }
    
    public double getArchiviazione(){
        return ArchiviazioneMassima-ArchiviazioneUsata;
    }
    
    public void ModalitàLettura(){
        if(!Lettura){
            Lettura = true;
            System.out.println("Modalità lettura attivata");
        } else {
            Lettura = false;
            System.out.println("Modalità lettura dissativata");
        }
    }
    
    @Override
    public void DettagliTecnici(){
        System.out.println("Dettagli tablet");
        System.out.println("Nome: " + nome);
        System.out.println("Prezzo: " + prezzo);
    }
}
