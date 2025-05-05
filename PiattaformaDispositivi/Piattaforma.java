import java.util.Scanner;

public class Piattaforma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creazione Smartphone");
        System.out.print("Inserisci il nome dello smartphone: ");
        String nomeSmartphone = scanner.nextLine();
        System.out.print("Inserisci il prezzo dello smartphone: ");
        double prezzoSmartphone = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Inserisci il sistema operativo: ");
        String os = scanner.nextLine();
        System.out.print("Inserisci lo spazio massima (in unità) dello smartphone: ");
        float spazioSmartphone = scanner.nextFloat();
        scanner.nextLine();

        Smartphone smartphone = new Smartphone(nomeSmartphone, prezzoSmartphone, os, spazioSmartphone);

        System.out.println("\nCreazione Laptop");
        System.out.print("Inserisci il nome del laptop: ");
        String nomeLaptop = scanner.nextLine();
        System.out.print("Inserisci il prezzo del laptop: ");
        double prezzoLaptop = scanner.nextDouble();
        System.out.print("Inserisci la quantità di RAM (in GB): ");
        int ram = scanner.nextInt();
        System.out.print("Inserisci lo stato della batteria (in %): ");
        int batteria = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Inserisci il tipo di CPU: ");
        String cpu = scanner.nextLine();
        System.out.print("Inserisci il tipo di GPU: ");
        String gpu = scanner.nextLine();
        System.out.print("Inserisci il peso (in grammi): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        Laptop laptop = new Laptop(nomeLaptop, prezzoLaptop, ram, batteria, cpu, gpu, peso);

        System.out.println("\nCreazione Tablet");
        System.out.print("Inserisci il nome del tablet: ");
        String nomeTablet = scanner.nextLine();
        System.out.print("Inserisci il prezzo del tablet: ");
        double prezzoTablet = scanner.nextDouble();
        System.out.print("Inserisci lo spazio massima (in unità) del tablet: ");
        float spazioTablet = scanner.nextFloat();
        scanner.nextLine();

        Tablet tablet = new Tablet(nomeTablet, prezzoTablet, spazioTablet);

        int scelta;
        boolean exit = false;
        do {
            System.out.println("\n--- Menu Piattaforma ---");
            System.out.println("1. Visualizza dettagli dispositivi");
            System.out.println("2. Aggiorna Smartphone");
            System.out.println("3. Sincronizza Smartphone");
            System.out.println("4. Aggiornamento Laptop (RAM)");
            System.out.println("5. Avvia programma sul Laptop");
            System.out.println("6. Verifica batteria del Laptop");
            System.out.println("7. Modalità Lettura Tablet");
            System.out.println("8. Aggiorna sistema operativo Tablet");
            System.out.println("9. Gestione archiviazione (Smartphone e Tablet)");
            System.out.println("0. Esci");
            System.out.print("Inserisci la tua scelta: ");
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("\n--- Dettagli Tecnici ---");
                    System.out.println("Smartphone:");
                    smartphone.DettagliTecnici();
                    System.out.println("\nLaptop:");
                    laptop.DettagliTecnici();
                    System.out.println("\nTablet:");
                    tablet.DettagliTecnici();
                    break;

                case 2:
                    System.out.println("\n--- Aggiornamento Smartphone ---");
                    smartphone.aggiornamento();
                    break;

                case 3:
                    System.out.println("\n--- Sincronizzazione Smartphone ---");
                    smartphone.sicronizzazione();
                    break;

                case 4:
                    System.out.println("\n--- Aggiornamento RAM Laptop ---");
                    laptop.aggiornaRAM();
                    break;

                case 5:
                    System.out.println("\n--- Avvio programma sul Laptop ---");
                    System.out.print("Inserisci il nome del programma: ");
                    String programma = scanner.nextLine();
                    laptop.avviaProgramma(programma);
                    break;

                case 6:
                    System.out.println("\n--- Stato Batteria Laptop ---");
                    laptop.verificaStatoBatteria();
                    break;

                case 7:
                    System.out.println("\n--- Modalità Lettura Tablet ---");
                    tablet.ModalitàLettura();
                    break;

                case 8:
                    System.out.println("\n--- Aggiornamento Tablet ---");
                    tablet.aggiornamento();
                    break;

                case 9:
                    System.out.println("\n--- Gestione Archiviazione ---");
                    System.out.println("Scegliere dispositivo:");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Tablet");
                    System.out.print("Inserisci scelta: ");
                    int dispChoice = scanner.nextInt();
                    scanner.nextLine(); // Consuma newline

                    System.out.println("1. Utilizza spazio (incrementa archiviazione usata)");
                    System.out.println("2. Libera spazio (decrementa archiviazione usata)");
                    System.out.print("Inserisci scelta: ");
                    int archChoice = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Inserisci quantità di spazio (in unità): ");
                    float spazio = scanner.nextFloat();
                    scanner.nextLine();

                    if (dispChoice == 1) {
                        if (archChoice == 1) {
                            int result = smartphone.setArchiviazioneUsata(spazio);
                            if (result == -1) {
                                System.out.println("Errore: spazio insufficiente disponibile sullo smartphone.");
                            } else {
                                System.out.println("Operazione effettuata. Spazio libero: " + smartphone.getArchiviazione());
                            }
                        } else if (archChoice == 2) {
                            smartphone.setArchiviazioneLiberata(spazio);
                            System.out.println("Operazione effettuata. Spazio libero: " + smartphone.getArchiviazione());
                        }
                    } else if (dispChoice == 2) {
                        if (archChoice == 1) {
                            int result = tablet.setArchiviazioneUsata(spazio);
                            if (result == -1) {
                                System.out.println("Errore: spazio insufficiente disponibile sul tablet.");
                            } else {
                                System.out.println("Operazione effettuata. Spazio libero: " + tablet.getArchiviazione());
                            }
                        } else if (archChoice == 2) {
                            tablet.setArchiviazioneLiberata(spazio);
                            System.out.println("Operazione effettuata. Spazio libero: " + tablet.getArchiviazione());
                        }
                    } else {
                        System.out.println("Scelta dispositivo non valida.");
                    }
                    break;

                case 0:
                    System.out.println("Uscita dalla piattaforma...");
                    exit = true;
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        } while (!exit);

        scanner.close();
    }
}
