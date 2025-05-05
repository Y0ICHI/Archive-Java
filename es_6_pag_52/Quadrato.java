
import java.util.Scanner;
public class Quadrato
{
    private double Lato;
    Scanner in;

    public Quadrato(){
   }

    public void Lettura()
    {
        in = new Scanner(System.in);
        Lato = in.nextFloat();
    }
    
    public double Area(){
        return Lato*Lato;
    }
    
    public double Perimetro(){
        return 4 * Lato;
    }
}
