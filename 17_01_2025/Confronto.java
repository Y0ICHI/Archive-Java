import java.util.Scanner;
public class Confronto
{
    private String s1,s2,s3, s4;
    Scanner in;
    
    public void lettura(){
        in = new Scanner(System.in);
        s1 = in.nextLine();
        s2 = "Antonio";
        s3 = "Mingzhe";
        s4 = "Giovanni";
    }
    
    
    public void comparazione()
    {
        System.out.println("Differenza tra " + s1 + " e " + s2);
        System.out.println(s1.compareTo(s2));
        System.out.println("Differenza tra " + s1 + " e " + s3);
        System.out.println(s1.compareTo(s3));
        System.out.println("Differenza tra " + s1 + " e " + s4);
        System.out.println(s1.compareTo(s4));
        System.out.println("Differenza tra " + s2 + " e " + s3);
        System.out.println(s2.compareTo(s3));
        System.out.println("Differenza tra " + s2 + " e " + s4);
        System.out.println(s2.compareTo(s4));
    }
}
