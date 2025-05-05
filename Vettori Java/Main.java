import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Inserire valore: ");
        while(!in.hasNextInt()){
            System.out.println("Errore.");
            in.next();
        }
        x = in.nextInt();
        int[] V = new int[x];
        
        int r = DimensioneArray(x);
        System.out.print("Inserimento dati: ");
        SetArray(V, x);
        //System.out.println("Debug:\nLa dimensione dell'array r è: " + r);
        
        int[] S = new int[r];
        Somma(V, x, S);
        
        System.out.println("Dati array originale: ");
        StampaArray(V);
        
        System.out.println("Somma: ");
        StampaArray(S);
        
        int[] D = new int[r];
        CopiaDispari(V, D, x);
        System.out.println("Dispari: ");
        StampaArray(D);
        
        int[] I = new int[x];
        Inverti(V, I, x);
        System.out.println("Inverti: ");
        StampaArray(I);
        
        System.out.println("Che cosa vuoi trovare?");
        int cercato;
        cercato = in.nextInt();
        int ricerca = Cerca(V, cercato);
        if(ricerca != -1){
            System.out.println("Trovato! Si trova in posizione " + ricerca);
        } else {
            System.out.println("Non trovato...");
        }
    }
    
    public static int DimensioneArray(int x){
        int t;
        if(x % 2 == 0){
            t = x/2;
        } else {
            t = x/2;
            t = t+1;
        }
        return t;
    }
    
    public static void Somma(int[] V, int x, int[] r){
        int t = DimensioneArray(x);
        System.out.println("t: " + t);
        //int[] r = new int[t];
        int l = 0;
        for(int i = 0; i<x; i = i + 2){
            if(i+1 < x){
                r[l] = V[i] + V[i+1];
                System.out.println("Somma tra: " + V[i] + " e " + V[i+1]);
            } else {
                r[l] = V[i];
            }
            l++;
        }
        return;
    }
    
    public static void SetArray(int[] V, int x){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < x; i++){
            System.out.println(i+1 + " valore: ");
            while(!in.hasNextInt()){
            System.out.println("Errore.");
            in.next();
        }
        V[i] = in.nextInt();
        }
    }
    
    public static void StampaArray(int[] V){
        for(int i = 0; i < V.length; i++){
            System.out.println(i+1 + ": valore  " + V[i]);
        }
    }
    
    public static void CopiaDispari(int[] V, int[] V2, int x){
        int i = 0;
        for(int l = 0; l < x; l = l+2){
            V2[i++] = V[l];
        }
    }
    
    public static void Inverti(int[]V, int[] V2, int x){
        int l = x-1;
        for(int i = 0; i < x; i++){
            V2[i] = V[l--]; 
        }
    }
    
    public static int Cerca(int[] V, int cercato){
        boolean trovato = false;
        int t = 0;
        for(int i = 0; i<V.length && !trovato; i++){
            if(V[i] == cercato){
             trovato = true;
             t = i;
            }
        }
        if(trovato){
            return t;
        } else {
            return -1;
        }
    }
}
