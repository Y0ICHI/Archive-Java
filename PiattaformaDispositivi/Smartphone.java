
public class Smartphone extends DispositivoElettronico
{
    private boolean aggiornato;
    private boolean sicronizzato;
    private String OS;
    private float ArchiviazioneUsata, ArchiviazioneMassima;
    
    public Smartphone(String nome, double prezzo, String OS, float spazio){
        super(nome, prezzo);
        this.OS = OS;
        this.ArchiviazioneMassima = spazio;
        this.aggiornato = false;
        this.sicronizzato = false;
        this.ArchiviazioneUsata = 20;
    }
    
    public void aggiornamento(){
        System.out.println("Aggiornamento sistema operativo..");
        if(!aggiornato){
        try {
            Thread.sleep(6000);
            aggiornato = true;
        } catch (Exception e) {
            System.out.println("Errore.");
        }
        System.out.println("Aggiornamento completato!");
    } else {
        System.out.println("Il sistema operativo è già alla sua ultima versione!");
    }
    }
    
    public void sicronizzazione(){
        System.out.println("Sicronizzazione dati in corso...");
        try {
            Thread.sleep(12000);
            sicronizzato = true;
        } catch (Exception e) {
            System.out.println("Errore.");
        }
        System.out.println("Sincronizzazione completata!");
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
    
    
    @Override
    public void DettagliTecnici(){
        System.out.println("Dettagli smartphone");
        System.out.println("Nome: " + nome);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Sistema operativo aggiornato:" + aggiornato);
        System.out.println("Cloud sicronizzato: " + sicronizzato);
        System.out.println("Archiviazione libera: " + getArchiviazione());
    }
}
