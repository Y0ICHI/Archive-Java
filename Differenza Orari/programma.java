
public class programma {
    public static void main(String[] args) {
        ore or1 = new ore();
        ore or2 = new ore();
        System.out.println("Inserire il primo orario: ");
        or1.acquisisci();
        System.out.println("Inserire il secondo orario: ");
        or2.acquisisci();
        int dif = or2.minuti()-or1.minuti();
        System.out.print("Tra le ore ");
        or1.visualizza();
        System.out.print(" e le ore ");
        or2.visualizza();
        System.out.printf(" sono trascorsi %d minuti \n", dif);
    }
}
