import java.util.Scanner;
public class equals{
    private String s1, s2;
    public boolean s3;

    public boolean ugualiIntero(){
        s1 = "Ciao Utente!";
        s2 = "Utente!";
        s3 = s1.equals(s2);
        return s3;
    }
    
    public boolean ugualiPreciso(){
    s1 = "Ciao Utente!";
    s2 = "Utente!";
    s3 = s2.equals(s1.substring(5));
    return s3;
    }
}
