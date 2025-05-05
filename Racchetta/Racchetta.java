import java.util.Scanner;
public class Racchetta
{
    protected float peso, prezzo;
    protected String colore, marca, modello;
    
    public Racchetta(float peso, float prezzo, String colore, String marca, String modello)
    {
        this.peso = peso;
        this.prezzo = prezzo;
        this.colore = colore;
        this.marca = marca;
        this.modello = modello;
    }
    
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
        this.prezzo -= (this.prezzo/100) * sconto;
    }
}