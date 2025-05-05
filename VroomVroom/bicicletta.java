public class bicicletta implements Veicolo 
{
    public void temporichiesto(double distanza, double velocità){
        double tempo = (distanza/velocità);
        System.out.println("La distanza percorsa richiederà " + tempo + "ora/e");
    }
    
    public void accelerazione(){
        System.out.println("Sto accelerando...");
    }
    
    public void rallentamento(){
        System.out.println("Sto rallentando ragazz*...");
        try{
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Errore.");
        }
        fermo();
    }
    
    public void frenodicolpo(){
        System.out.println("Ho frenato di colpo!");
        fermo();
    }
    
    public void guidando(){
        System.out.println("Sto guidando");
    }
    
    public void fermo(){
        System.out.println("Sto fermo :(");
    }
}
