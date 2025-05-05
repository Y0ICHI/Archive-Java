import java.util.Scanner;
public class RacchettaTennis extends Racchetta
{
    private String tipoCorde;
    
    public RacchettaTennis(float peso, float prezzo, String colore, String marca, String modello, String tipoCorde)
    {
        super(peso, prezzo, colore, marca, modello);
        this.tipoCorde = tipoCorde;
    }
    
    @Override
    public void ApplicaSconto()
    {
        Scanner in = new Scanner(System.in);
        float sconto = 0;
        while(true)
        {
            try {
                sconto = in.nextFloat();
                if(sconto < 0 && sconto > 100)
                {
                    System.out.println("sconto non compreso nel range!!");
                }
                else{
                    break;
                }
            } catch(Exception e) {
                System.out.println("valore inserito non valido. Reinserire!");
                in.next();
            }
        }
        this.prezzo -= (this.prezzo/100) * sconto - 5;
    }
}