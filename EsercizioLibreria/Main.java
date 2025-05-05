import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner per acquisire input utente

        // Inserimento dati per un libro
        System.out.println("Inserisci i dati del libro:");
        System.out.print("Titolo: ");
        String titoloLibro = scanner.nextLine();
        System.out.print("Prezzo: ");
        float prezzoLibro = scanner.nextFloat();
        scanner.nextLine(); // Consuma l'andata a capo lasciata da nextDouble()
        System.out.print("Autore: ");
        String autore = scanner.nextLine();
        System.out.print("Genere: ");
        String genere = scanner.nextLine();

        // Creazione istanza Libro
        Pubblicazione libro1 = new Libro(titoloLibro, prezzoLibro, autore, genere);

        // Inserimento dati per una rivista
        System.out.println("\nInserisci i dati della rivista:");
        System.out.print("Titolo: ");
        String titoloRivista = scanner.nextLine();
        System.out.print("Prezzo: ");
        float prezzoRivista = scanner.nextFloat();
        System.out.print("Numero: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consuma l'andata a capo lasciata da nextInt()
        System.out.print("Mese di pubblicazione: ");
        String mese = scanner.nextLine();

        // Creazione istanza Rivista
        Pubblicazione rivista1 = new Rivista(titoloRivista, prezzoRivista, numero, mese);

        // Stampa dettagli delle pubblicazioni
        System.out.println("\n--- Pubblicazioni Inserite ---");
        libro1.stampaDettagli();
        System.out.println();
        rivista1.stampaDettagli();

        // Stampa descrizioni generali
        System.out.println("\n--- Descrizioni Generali ---");
        System.out.println(libro1.descrizione());
        System.out.println(rivista1.descrizione());

        scanner.close(); // Chiudiamo lo scanner per evitare spreco di risorse
    }
}