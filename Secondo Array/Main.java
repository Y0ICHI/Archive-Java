import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] Array1 = new int[10];
        Caricamento(Array1);
        Stampa(Array1);
        int[] Array2 = new int[ContaMaggioriUguali0(Array1)];
        CopiaMaggioriUguali0(Array1, Array2);
        Inverti(Array2);
        Stampa(Array2);
    }
    
    public static void Caricamento(int[] V){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<V.length; i++){
            V[i] = in.nextInt();
        }
    }
    
    public static void Stampa(int[] V){
        for(int i = 0; i<V.length; i++){
            System.out.println(i+1 + ": " + V[i]);
        }
    }
    
    public static int ContaMaggioriUguali0(int[] V){
        int totale = 0;
        for(int i = 0; i<V.length; i++){
            if(V[i]>=0){
                totale++;
            }
        }
        //System.out.println("Totale: " + totale);
        return totale;
    }
    
    public static void CopiaMaggioriUguali0(int[] V, int[] V2){
        int j = 0;
        for(int i = 0; i<V.length; i++){
            if(V[i]>=0){
                V2[j++] = V[i];
            }
        }
    }
    
    public static void Inverti(int[] V){
        int[] VT = new int[ContaMaggioriUguali0(V)];
        int j = 0;
        for(int i = V.length-1; i>=0; i--){
            VT[j++] = V[i];
        }
        for(int i = 0; i<V.length; i++){
            V[i] = VT[i];
        }
        
    }
}
