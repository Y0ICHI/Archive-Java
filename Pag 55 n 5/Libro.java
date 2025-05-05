import java.util.Scanner;
public class Libro
{
    private String NomeLibro, CasaEditrice;
    private float prezzo;
    private int nScaffale, nPagine;
    Scanner in;

    public Libro()
    {
        in = new Scanner(System.in);
        NomeLibro = "...";
        CasaEditrice = "PlaceHolder";
        prezzo = -1;
        nScaffale = -1;
        nPagine = -1;
    }
    
    public void inizializza(){
        System.out.println("Libro");
        NomeLibro = in.nextLine();
        System.out.println("Prezzo");
        while (in.hasNextFloat()==false){
            System.out.println("Errore.");
            in.nextFloat();
        }
        prezzo = in.nextFloat();
        System.out.println("Scaffale");
        while (in.hasNextInt()==false){
            System.out.println("Errore.");
            in.nextInt();
        }
        nScaffale = in.nextInt();
        System.out.println("Pagine");
        while (in.hasNextInt()==false){
            System.out.println("Errore.");
            in.nextInt();
        }
        nPagine = in.nextInt();
        System.out.println("Casa editrice");
        CasaEditrice = in.nextLine();
    }
    
    public void stampa(){
        System.out.println("Nome: " + NomeLibro);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Numero scaffale: " + nScaffale);
        System.out.println("Numero pagine: " + nPagine);
        System.out.println("Casa editrice: " + CasaEditrice);
    }
    
    public float applicaSconto(int x){
        float scontodaApplicare;
        scontodaApplicare = prezzo * (x / 100);
        float PrezzoFinale = prezzo - scontodaApplicare;
        return PrezzoFinale;
    }
    
    public void chiudiScanner() {
        if (in != null) {
            in.close();
        }
    }
}
