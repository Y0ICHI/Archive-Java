import java.util.Scanner;
/**
 * Aggiungi qui una descrizione della classe Main
 * 
 * @author (Antonio d'Agostino) 
 * @version (14/02/2024)
 */
public class Main
{
    public static void main(String[] args){
        Gatto micio = new Gatto();
        System.out.print("Inserire il nome del gatto: ");
        micio.InserisciNome();
        System.out.print("Inserire la razza del gatto: ");
        micio.InserisciRazza();
        System.out.println("Inserire l'età del gatto (se l'età è minore di 1 anno puoi anche scrivere 0.1 per un mese: ");
        micio.InserisciEta();
        System.out.println("Informazioni gatto: \n" + "Nome: " + micio.Nome + "\nRazza: " + micio.Razza + "\nAnni: " + micio.anni);
        System.out.println("Il gatto stà miagolando!");
        micio.Suono();
        micio.chiudiScanner();
        
        Cane cucciolo = new Cane();
        System.out.print("Inserire il nome del cane: ");
        cucciolo.InserisciNome();
        System.out.print("Inserire la razza del cane: ");
        cucciolo.InserisciRazza();
        System.out.println("Inserire l'età del cane (se l'età è minore di 1 anno puoi anche scrivere 0.1 per un mese: ");
        cucciolo.InserisciEta();
        System.out.println("Informazioni cane: \n Nome: " + cucciolo.Nome + "\n Razza: " + cucciolo.Razza + "\n Anni: " + cucciolo.anni);
        System.out.println("Il cane stà abbaiando!");
        cucciolo.Suono();
        cucciolo.chiudiScanner();
    }
}
