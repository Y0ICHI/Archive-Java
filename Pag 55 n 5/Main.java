import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crea un'istanza di Libro
        Libro libro = new Libro();
        
        // Inizializza il libro con i dati dell'utente
        libro.inizializza();
        
        // Stampa le informazioni del libro
        libro.stampa();
        
        // Chiedi la percentuale di sconto da applicare
        System.out.print("Inserisci la percentuale di sconto: ");
        int percentualeSconto = scanner.nextInt();
        
        // Calcola e stampa il prezzo finale dopo lo sconto
        float prezzoFinale = libro.applicaSconto(percentualeSconto);
        System.out.printf("Il prezzo finale dopo uno sconto del %d%% è: %.2f euro%n", percentualeSconto, prezzoFinale);
        
        // Chiudi gli scanner
        libro.chiudiScanner();
        scanner.close();
    }
}
