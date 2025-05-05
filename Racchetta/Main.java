import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true)
		{
		    try
		    {
		        System.out.println("Inserire il peso della racchetta da tennis: ");
		        float peso = in.nextFloat();
		        System.out.println("Inserire il prezzo della racchetta da tennis: ");
		        float prezzo = in.nextFloat();
		        System.out.println("Inserire il colore della racchetta da tennis: ");
		        String colore = in.nextLine();
		        System.out.println("Inserire la marca della racchetta da tennis: ");
		        String marca = in.nextLine();
		        System.out.println("Inserire il modello della racchetta da tennis: ");
		        String modello = in.nextLine();
		        System.out.println("Inserire la tipologia di corde della racchetta da tennis: ");
		        String tipoCorde = in.nextLine();
		    }
		    catch(Exception e)
		    {
		        System.out.println("tipo di dato non valido. Reinserire");
		        in.next();
		    }
		}
		RacchettaTennis RT1 = new RacchettaTennis(peso, prezzo, colore, marca, modello, tipoCorde);
		RT1.ApplicaSconto();
	}
}