import java.util.Scanner;
public class Triangolo
{
    private double Base, Altezza, Lato;
    Scanner in;

    public Triangolo() {
    }

    public void Lettura()
    {
        in = new Scanner(System.in);
        Base = in.nextFloat();
        Altezza = in.nextFloat();
        Lato = in.nextFloat();
    }
    
    public double Area(){
        return (Base*Altezza)/2;
    }
    
    public double Perimetro(){
        return 2 * Lato + Base;
    }
}
