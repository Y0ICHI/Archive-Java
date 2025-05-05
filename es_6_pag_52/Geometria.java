
public class Geometria {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo();
        Rettangolo rettangolo = new Rettangolo();
        Quadrato quadrato = new Quadrato();
        
        System.out.println("Inserire la base, altezza e il lato del triangolo: ");
        triangolo.Lettura();
        
        System.out.println("Inserire la base e l'altezza del rettangolo: ");
        rettangolo.Lettura();
        
        System.out.println("Inserire il lato del quadrato: ");
        quadrato.Lettura();
        
        double AT = triangolo.Area();
        double PT = triangolo.Perimetro();
        System.out.println("L'area del triangolo è " + AT);
        System.out.println("Il perimetro del triangolo è " + PT);
        
        
        double AR = rettangolo.Area();
        double PR = rettangolo.Perimetro();
        System.out.println("L'area del rettangolo è " + AR);
        System.out.println("Il perimetro del rettangolo è " + PT);
        
        double AQ = quadrato.Area();
        double PQ = quadrato.Perimetro();
        System.out.println("L'area del quadrato è " + AQ);
        System.out.println("Il perimetro del quadrato è " + PQ);
        
        
    }
}
