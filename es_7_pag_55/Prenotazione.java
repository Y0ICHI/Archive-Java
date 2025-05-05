import java.util.Scanner;

public class Prenotazione {
    public static void main(String[] args) {
        Campo campo = new Campo();
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Aggiungi prenotazione");
        System.out.println("2. Rimuovi prenotazione");
        System.out.println("3. Calcola utilizzo");
        int scelta = input.nextInt();
        
        switch(scelta) {
            case 1:
                System.out.println("Inserisci inizio, fine e nome:");
                boolean aggiunta = campo.addPren(input.nextInt(), input.nextInt(), input.next());
                System.out.println("Prenotazione aggiunta: " + aggiunta);
                break;
                
            case 2:
                System.out.println("Inserisci inizio, fine e nome da cancellare:");
                boolean rimozione = campo.removePren(input.nextInt(), input.nextInt(), input.next());
                System.out.println("Prenotazione rimossa: " + rimozione);
                break;
                
            case 3:
                System.out.println("Utilizzo campo: " + campo.utilizzo() + "%");
                break;
        }
    }
}