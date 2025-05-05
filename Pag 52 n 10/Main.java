import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Autostrada autostrada = new Autostrada();

        System.out.println("Inserisci la targa del veicolo:");
        String targa = in.nextLine();

        System.out.println("Seleziona la categoria del veicolo (1: Classe A, 2: Classe B, 3: Classe 3, 4: Classe 4, 5: Classe 5):");
        int categoria = in.nextInt();

        System.out.println("È un giorno festivo? (true/false):");
        boolean festivo = in.nextBoolean();

        
        switch (categoria) {
            case 1:
                Auto macchina = new Auto();
                System.out.println("Inserisci numero di passegieri:");
                int passegieri = in.nextInt();
                System.out.println("Inserisci potenza del veicolo:");
                int potenza = in.nextInt();
                macchina.getTarga(targa);
                macchina.getCategoria(categoria);
                macchina.getPassegieri(passegieri);
                macchina.getPotenza(potenza);
                macchina.Visualizza();
                break;
            case 2:
                Camion camion = new Camion();
                System.out.println("Inserisci capacità:");
                int capacità = in.nextInt();
                System.out.println("Inserisci assi:");
                int assi = in.nextInt();
                System.out.println("Inserisci lunghezza:");
                float lunghezza = in.nextFloat();
                camion.getTarga(targa);
                camion.getCategoria(categoria);
                camion.getCarico(capacità);
                camion.getAssi(assi);
                camion.lunghezza(lunghezza);
                camion.Visualizza();
                break;
            case 3:
                //veicolo = new Moto();
                break;
            default:
                System.out.println("Categoria non valida.");
                return;
        }

        //veicolo.getTarga(targa);
        //veicolo.getCategoria(categoria);
        
        //veicolo.Visualizza();
        
        
        int km;
        System.out.println("Inserire km percorsi: ");
        km = in.nextInt();
        double costoPedaggio = autostrada.Pedaggio(categoria, festivo, km);
        System.out.printf("Il costo del pedaggio è: %.5f€%n", costoPedaggio);
    }
}
