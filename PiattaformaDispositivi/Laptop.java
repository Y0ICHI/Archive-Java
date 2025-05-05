import java.util.Scanner;

class Laptop extends DispositivoElettronico {
    private int ram;         
    private int batteria;    // stato della batteria in percentuale
    private String cpu;
    private String gpu;
    private double peso;     // Peso in grammi

    public Laptop(String nome, double prezzo, int ram, int batteria, String cpu, String gpu, double peso) {
        super(nome, prezzo);
        this.ram = ram;
        this.batteria = batteria;
        this.cpu = cpu;
        this.gpu = gpu;
        this.peso = peso;
    }

    @Override
    public void DettagliTecnici() {
        System.out.println("Dettagli Tecnici del Laptop:");
        System.out.println("Nome: " + nome);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Stato Batteria: " + batteria + "%");
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
        System.out.println("Peso: " + peso + " grammi");
    }

    public void aggiornaRAM() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("RAM attuale: " + ram + "GB");
        System.out.print("Quanta RAM vuoi aggiungere? ");
        int aggiunta = scanner.nextInt();
        ram += aggiunta;
        System.out.println("RAM dopo aggiornamento: " + ram + "GB");
    }

    boolean avvio;
    public void avviaProgramma(String programma) {
        System.out.println("Avvio del programma \"" + programma + "\" in corso...");
         try {
            Thread.sleep(3000);
            avvio = true;
        } catch (Exception e) {
            System.out.println("Errore.");
        }
        System.out.println("Avvio del programma \"" + programma + "\" completato!");
    }

    public void verificaStatoBatteria() {
        System.out.println("Verifica dello stato della batteria: " + batteria + "%");
    }
}