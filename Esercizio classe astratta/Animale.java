import java.util.Scanner;

public abstract class Animale
{
    protected String Nome, Razza;
    protected int anni;
    protected Scanner in;

    public Animale()
    {
        in = new Scanner(System.in);
        Razza = "???";
        anni = -1;
    }

    public void InserisciRazza()
    {
        Razza = in.nextLine();
    }
    
    public void InserisciNome()
    {
        Nome = in.nextLine();
    }
    
    public void InserisciEta()
    {
        anni = in.nextInt();
    }
    
    public void chiudiScanner() {
        if (in != null) {
            in.close();
        }
    }
    
    
    public abstract void Suono();
    
}
