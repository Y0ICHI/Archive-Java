import java.util.Scanner;

public class Main {
    private static final int POSTI_MASSIMI = 50;

    public static void main(String[] args) {
        Gestore gestore = new Gestore();
        SlotParcheggio[] parcheggio = new SlotParcheggio[POSTI_MASSIMI];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < parcheggio.length; i++) {
            parcheggio[i] = new SlotParcheggio(i < 20);
        }

        boolean stop = false;
        while (!stop) {
            System.out.println("\nCosa vuoi fare? (A/P/Q)\nA = Arrivo\nP = Partenza\nQ = Uscita");
            String input = in.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Nessun input fornito. Riprova.");
                continue;
            }

            char scelta = input.charAt(0);
            if (scelta == 'Q' || scelta == 'q') {
                stop = true;
                continue;
            }

            if (scelta != 'A' && scelta != 'a' && scelta != 'P' && scelta != 'p') {
                System.out.println("Scelta non valida. Riprova.");
                continue;
            }

            System.out.println("Per quanti veicoli?");
            int sceltaN;
            while (true) {
                try {
                    sceltaN = Integer.parseInt(in.nextLine());
                    if (sceltaN > 0 && sceltaN <= 50) break;
                    System.out.println("Errore. Inserisci un numero tra 1 e 50.");
                } catch (NumberFormatException e) {
                    System.out.println("Input non valido. Inserisci un numero.");
                }
            }

            if (scelta == 'A' || scelta == 'a') {
                System.out.println("Scelta Arrivo.");
                for (int i = 0; i < sceltaN; i++) {
                    if (gestore.controlloTuttiOccupati(parcheggio)) {
                        System.out.println("Parcheggio pieno!");
                        break;
                    }

                    int posto;
                    while (true) {
                        System.out.println("Quale posto vuoi occupare? (0-" + (POSTI_MASSIMI - 1) + ")");
                        try {
                            posto = Integer.parseInt(in.nextLine());
                            if (posto >= 0 && posto < POSTI_MASSIMI) break;
                            System.out.println("Posto non valido!");
                        } catch (NumberFormatException e) {
                            System.out.println("Input non valido. Inserisci un numero.");
                        }
                    }

                    if (parcheggio[posto].getOccupato()) {
                        System.out.println("Posto già occupato!");
                        i--; // Retry same iteration
                        continue;
                    }

                    char sceltaV;
                    while (true) {
                        System.out.println("Tipo veicolo (A/M):");
                        String veicoloInput = in.nextLine().toUpperCase();
                        if (veicoloInput.length() > 0 && (veicoloInput.charAt(0) == 'A' || veicoloInput.charAt(0) == 'M')) {
                            sceltaV = veicoloInput.charAt(0);
                            break;
                        }
                        System.out.println("Errore. Inserisci A o M.");
                    }

                    String tipoVeicolo = sceltaV == 'A' ? "Automobile" : "Moto";

                    float oraEntrata;
                    while (true) {
                        System.out.println("Ora entrata (es. 8.5 per 8:30):");
                        try {
                            oraEntrata = Float.parseFloat(in.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Ora non valida!");
                        }
                    }

                    parcheggio[posto].setOccupato(tipoVeicolo, oraEntrata);
                    System.out.println("Posto " + posto + " occupato.");
                }
            } else {
                System.out.println("Scelta Partenza.");
                for (int i = 0; i < sceltaN; i++) {
                    if (gestore.controlloTuttiLiberi(parcheggio)) {
                        System.out.println("Parcheggio vuoto!");
                        break;
                    }

                    int posto;
                    while (true) {
                        System.out.println("Quale posto vuoi liberare? (0-" + (POSTI_MASSIMI - 1) + ")");
                        try {
                            posto = Integer.parseInt(in.nextLine());
                            if (posto >= 0 && posto < POSTI_MASSIMI) break;
                            System.out.println("Posto non valido!");
                        } catch (NumberFormatException e) {
                            System.out.println("Input non valido. Inserisci un numero.");
                        }
                    }

                    if (!parcheggio[posto].getOccupato()) {
                        System.out.println("Posto già libero!");
                        i--; // Retry same iteration
                        continue;
                    }

                    float oraUscita;
                    while (true) {
                        System.out.println("Ora uscita (es. 10.5 per 10:30):");
                        try {
                            oraUscita = Float.parseFloat(in.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Ora non valida!");
                        }
                    }

                    float oraEntrata = parcheggio[posto].getOrarioArrivo();
                    float oreTotali = oraUscita - oraEntrata;
                    if (oreTotali < 0) oreTotali += 24; // Handle overnight

                    double costo = gestore.calcolaCosto(
                            parcheggio[posto].getCoperto(),
                            parcheggio[posto].getTipoVeicolo(),
                            oreTotali
                    );
                    gestore.aggiornaCassa(costo);

                    parcheggio[posto].liberaPosto();
                    System.out.printf("Posto %d liberato. Costo: %.2f€\n", posto, costo);
                }
            }
        }

        System.out.printf("\nTotale incassato: %.2f€\n", gestore.getCassa());
    }
}