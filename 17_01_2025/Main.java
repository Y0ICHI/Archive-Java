    import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        operatore_più Conc = new operatore_più();
        System.out.println("Concatenazione stringhe");
        Conc.Lettura();
        Conc.Scrittura();
        
        System.out.println("Confronto stringhe: compareTo");
        Confronto conf = new Confronto();
        conf.lettura();
        conf.comparazione();
        
        System.out.println("Confronto stringhe: equals");
        equals Equi = new equals();
        System.out.println("Confronto delle frasi s1 = 'Ciao!' e s2 = 'Ciao utente!'");
        System.out.println(Equi.ugualiIntero());
        System.out.println("Confronto delle frasi s1 ='Ciao!' e s2 = 'Ciao utente!', ma precisando 'utente!'");
        System.out.println(Equi.ugualiPreciso());
        
        System.out.println("Lunghezza stringa");
        lunghezza lungo = new lunghezza();
        lungo.lungo();
    }
}
