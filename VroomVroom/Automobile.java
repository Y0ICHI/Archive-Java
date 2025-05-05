public class Automobile implements Veicolo, Motorizzato
{
    public void temporichiesto(double distanza, double velocità){
        double tempo = (distanza/velocità);
        System.out.println("La distanza percorsa richiederà " + tempo + "ora/e");
    }
    
    public void accelerazione(){
        System.out.println("Sto accelerando...");
        try{
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Errore.");
        }
        guidando();
    }
    
    public void rallentamento(){
        System.out.println("Sto rallentando...");
        try{
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Errore.");
        }
        fermo();
    }
    
    public void frenodicolpo(){
        System.out.println("Ahhhh! Freno di colpo!");
        try{
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Errore.");
        }
        fermo();
    }
    
    public void guidando(){
        System.out.println("Sto guidando...");
    }
    
    public void fermo(){
        System.out.println("Sono fermo.");
    }
    
    public void riempiBenzina(){
        System.out.println("Sto riempiendo la benzina...");
        try{
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Errore.");
        }
        System.out.println("Finito di riempire!");
    }
    
    public void accensioneMotore(){
        System.out.println("Accensione...");
        try{
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Errore.");
        }
        System.out.println("Finito l'accensione!");
    }
    
    public void spegnimentoMotore(){
        System.out.println("Spegnimento...");
        System.out.println("Spento");
    }
}
