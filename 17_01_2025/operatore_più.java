import java.util.Scanner;
public class operatore_più {
    private String s1, s2, s3, s4, s5;
    Scanner in;
    
    public void Lettura() {
    in = new Scanner(System.in);
    s3 = in.nextLine();
    s1 = "Hai scritto";
    s2 = "vero?";
    }
    
    public void Scrittura() {
        s4 = s1.concat(s3 + s2);
        s5 = s1 + " " + s3 + " " + s2;
        System.out.println(s4);
        System.out.println(s5);
    }
}
