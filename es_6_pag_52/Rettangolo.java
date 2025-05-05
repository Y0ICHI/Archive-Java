import java.util.Scanner;

public class Rettangolo
{
    private double Base, Altezza;
    Scanner in;

    public Rettangolo(){
    }

    public void Lettura()
    {
        in = new Scanner(System.in);
        Base = in.nextFloat();
        Altezza = in.nextFloat();
    }
    
    public double Area(){
        return Base*Altezza;
    }
    
    public double Perimetro(){
        return 2 * (Base + Altezza);
    }
}
