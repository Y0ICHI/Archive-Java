import java.util.Scanner;
public class main
{
    private static int Coperti = 20;
    private static int PostiMassimi = 50;
    public static void main(String[] args){
        gestore Gestore = new gestore();
        slotParcheggio[] Parcheggio = new slotParcheggio[PostiMassimi];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<Parcheggio.length; i++){
            if(i<20){
                Parcheggio[i] = new slotParcheggio(true);
            } else {
                Parcheggio[i] = new slotParcheggio(false);
            }
        }
        
        boolean stop = false;
        while(!stop){
            System.out.println("Che cosa vuoi fare? (A/P)\nA = Arrivo\nP = Partenza");
            String input = in.nextLine();
            int SceltaN;
            System.out.println("Per quanti veicoli?");
            SceltaN = in.nextInt();
            while(SceltaN <=0 || SceltaN >50){
                System.out.println("Errore.");
                SceltaN = in.nextInt();
            }
            if (input.length() > 0) {
                char Scelta = input.charAt(0);
                if (Scelta == 'A' || Scelta == 'a') {
                    System.out.println("Scelta Arrivo.");
                    in.next();
                    
                    boolean uscita = false;
                    for(int i = 0; i<SceltaN && !uscita; i++){
                    if(Gestore.controlloAlmenoUnoLibero(Parcheggio)){
                       System.out.println("Non è possibile procedere, ci sono il massimo dei veicoli nel parcheggio.");
                       uscita = true;
                    } else {
                        System.out.println("Quale posto vuoi Occupare?");
                        int Posto = in.nextInt();
                        if(!Parcheggio[Posto].setLiberaParcheggio()){
                           System.out.println("Posto già occupato!");     
                        } else {
                            System.out.println("Che tipo di veicolo deve entrare?");
                            char SceltaV = input.charAt(0);
                            while(SceltaV!='A' || Scelta!='M'){
                                System.out.println("Errore");
                                SceltaV = input.charAt(0);
                            }
                            String tipoVeicolo;
                            if(SceltaV=='A'){
                                tipoVeicolo="Automobile";
                            } else {
                                tipoVeicolo="Moto";
                            }
                            
                            float OraEntrata;
                            System.out.println("A che ora è entrato?");
                            OraEntrata = in.nextFloat();
                            Parcheggio[Posto].setOccupato(tipoVeicolo, OraEntrata);
                        }
                    }
                }
                } else if (Scelta == 'P' || Scelta == 'p') {
                    System.out.println("Scelta Partenza.");
                    boolean uscita = false;
                    for(int i = 0; i<SceltaN && !uscita; i++){
                    if(Gestore.controlloAlmenoUnoOccupato(Parcheggio)){
                       System.out.println("Non è possibile procedere, non ci sono veicoli nel parcheggio.");
                       uscita = true;
                    } else {
                        System.out.println("Quale posto vuoi liberare?");
                        int Posto = in.nextInt();
                        if(!Parcheggio[Posto].setLiberaParcheggio()){
                           System.out.println("Posto già libero!");
                        } else {
                            float OrarioUscita;
                            System.out.println("A che ora è uscito?");
                            OrarioUscita = in.nextFloat();
                            Gestore.costoTotale(Parcheggio[Posto].getCoperto(), Parcheggio[Posto].getTipoVeicolo(), Parcheggio[Posto].getOrarioArrivo(), OrarioUscita);
                        }
                    }
                }
                } else {
                    System.out.println("Scelta non valida. Riprova.");
                }
            } else {
                System.out.println("Nessun input fornito. Riprova.");
            }
        }
            
            
        }
        
        // Visualizza i parcheggi, debug
        /*for(int i = 0; i<Parcheggio.length; i++){
            Parcheggio[i].Visualizza();
        }*/
}
