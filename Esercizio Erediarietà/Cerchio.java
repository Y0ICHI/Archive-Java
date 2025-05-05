import java.util.Scanner;

public class Cerchio {
    protected float raggio;             
    public static final double PI = 3.14;
    protected Scanner in;
    
    public Cerchio() {
        in = new Scanner(System.in);
    }

    public void inserisciDati() {
        raggio = in.nextFloat();
    }
    
    public double calcolaArea() {
        return PI * raggio * raggio;
    }
    
    public void chiudiScanner() {
        if (in != null) {
            in.close();
        }
    }
}
