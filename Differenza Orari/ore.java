import java.util.Scanner;
 
public class ore {
    private int ora, min;
    Scanner in;

    public ore() {
    }
    
    public void acquisisci(){
        in = new Scanner(System.in);
        ora = in.nextInt();
        min = in.nextInt();
    }
    
    public void visualizza() {
        System.out.print(ora);
        System.out.print(":");
        System.out.print(min);
    }
    
    public int minuti(){

    return ora*60+min;

    }
    
    public void finalize(){
    in.close();
    }
}