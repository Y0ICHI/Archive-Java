import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Cerchio c = new Cerchio();
        System.out.print("Inserire il raggio del cerchio: ");
        c.inserisciDati();
        System.out.println("Area del cerchio: " + c.calcolaArea());
        c.chiudiScanner();
        
        Cilindro cil = new Cilindro();
        System.out.print("Inserire prima l'area e dopo l'altezza del cilindro: ");
        cil.inserisciDati();
        System.out.println("Volume del cilindro: " + cil.calcolaVolume());
        cil.chiudiScanner();
    }
}
