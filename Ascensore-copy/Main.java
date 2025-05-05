import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creazione di un ascensore con un massimo di 5 persone, 10 piani e un peso massimo di 1000 kg
        System.out.print("Inserisci il numero massimo di persone: ");
        int numPersoneMAX = scanner.nextInt();
        System.out.print("Inserisci il numero di piani: ");
        int numPiani = scanner.nextInt();
        System.out.print("Inserisci il peso massimo (in kg): ");
        float pesoMassimo = scanner.nextFloat();

        Ascensore ascensore = new Ascensore(numPersoneMAX, numPiani, pesoMassimo);

        // Prenotazioni iniziali
        System.out.print("Vuoi effettuare prenotazioni iniziali? (s per sì, n per no): ");
        char prenotazioniIniziali = scanner.next().charAt(0);
        if (prenotazioniIniziali == 's') {
            for (int i = 0; i < numPiani; i++) {
                System.out.print("Prenota il piano " + i + "? (s per sì, n per no): ");
                char sceltaPrenotazione = scanner.next().charAt(0);
                if (sceltaPrenotazione == 's') {
                    ascensore.set_prenotazionePrecisa(i, i); // Prenota il piano i nella posizione i
                }
            }
        }

        // Stampa dello stato iniziale dell'ascensore
        ascensore.StampaStato();

        // Simulazione del movimento dell'ascensore
        boolean continua = true;
        while (continua) {
            System.out.print("Vuoi salire o scendere? (s per salire, d per scendere, q per uscire): ");
            char scelta = scanner.next().charAt(0);

            switch (scelta) {
                case 's':
                    ascensore.Sali();
                    break;
                case 'd':
                    ascensore.Scendi();
                    break;
                case 'q':
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    continue;
            }

            // Controlla se il piano corrente è prenotato
            int pianoCorrente = ascensore.Corrente; // Assumendo che Corrente sia pubblico o accessibile
            if (ascensore.get_Pprenotati()[pianoCorrente] != -1) {
                System.out.println("Attenzione: Sei arrivato al piano " + pianoCorrente + ", che è stato prenotato.");
            }

            // Chiedi se ci sono nuove prenotazioni
            System.out.print("Vuoi effettuare una nuova prenotazione? (s per sì, n per no): ");
            char prenotazioneScelta = scanner.next().charAt(0);
            if (prenotazioneScelta == 's') {
                System.out.print("Inserisci il numero del piano da prenotare: ");
                int pianoPrenotato = scanner.nextInt();
                if (pianoPrenotato >= 0 && pianoPrenotato < numPiani) {
                    // Trova la prima posizione disponibile per la prenotazione
                    for (int i = 0; i < ascensore.get_Pprenotati().length; i++) {
                        if (ascensore.get_Pprenotati()[i] == -1) {
                            ascensore.set_prenotazionePrecisa(pianoPrenotato, i);
                            System.out.println("Prenotazione effettuata per il piano " + pianoPrenotato);
                            break;
                        }
                    }
                } else {
                    System.out.println("Piano non valido per la prenotazione.");
                }
            }

            // Stampa dello stato attuale dell'ascensore
            ascensore.StampaStato();
        }

        // Chiusura dello scanner
        scanner.close();
        System.out.println("Programma terminato.");
    }
}
