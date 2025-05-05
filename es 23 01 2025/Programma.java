import java.util.Scanner;
  

class Programma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Conto cc = new Conto(); // Creazione di un oggetto Conto
        int scelta;
        float deposito, tasso, importo;

        while (true) {
            System.out.println("1) Acquisisci deposito");
            System.out.println("2) Acquisisci tasso");
            System.out.println("3) Visualizza deposito");
            System.out.println("4) Visualizza tasso");
            System.out.println("5) Versamento");
            System.out.println("6) Prelievo");
            System.out.println("7) Aggiornamento");
            System.out.println("8) Esci");
            System.out.print("SCELTA? ");
            scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Deposito? ");
                    deposito = in.nextFloat();
                    cc.setDeposito(deposito);
                    break;
                case 2:
                    System.out.print("Tasso? ");
                    tasso = in.nextFloat();
                    cc.setTasso(tasso);
                    break;
                case 3:
                    System.out.printf("Deposito = %.2f\n", cc.getDeposito());
                    break;
                case 4:
                    System.out.printf("Tasso = %.2f\n", cc.getTasso());
                    break;
                case 5:
                    System.out.print("Importo da versare? ");
                    importo = in.nextFloat();
                    cc.versamento(importo);
                    break;
                case 6:
                    System.out.print("Importo da prelevare? ");
                    importo = in.nextFloat();
                    if (!cc.prelievo(importo)) {
                        System.out.println("Importo non disponibile sul conto!");
                    }
                    break;
                case 7:
                    cc.aggiorna();
                    System.out.println("Deposito aggiornato.");
                    break;
                case 8:
                    System.out.println("Programma terminato.");
                    System.exit(0);
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}
