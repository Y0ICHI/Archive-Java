import java.util.Scanner;

public class Main
{   
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("AAAAAAAAAAH");
        int dim;
        /*
        boolean valido = false;
        do{
            if(!in.hasNextInt()){
            System.out.println("no.");
            in.next();
        } else if (in.nextInt() <= 0){
            System.out.println("no.");
            in.next();
        }
        } while(!valido);*/
        
        while(!in.hasNextInt()){
            System.out.println("no.");
            in.next();
        }
        
        dim = in.nextInt();
        int[] AI = new int[dim];
        Caricamento(AI);
        Stampa(AI);
        System.out.println("Il risultato è: " + Somma(AI));
        System.out.println("Valore massimo: " + valoreMassimo(AI));
        
        float[] AF = new float[dim];
        Caricamento(AF);
        Stampa(AF);
        System.out.println("Media: " + media(AF));
        
    }
    
    public static void Caricamento(int[] x){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<x.length; i++){
        /*boolean valido = false;
        do{
            if(!in.hasNextInt()){
            System.out.println("no.");
            //in.next();
        } else if (in.nextInt() <= 0){
            System.out.println("no.");
        } else {
            valido = true;
        }
        in.next();
        } while(!valido);*/
        
        while(!in.hasNextInt()){
            System.out.println("no.");
            in.next();
        }
            x[i] = in.nextInt();
        }
    }
    
    public static void Caricamento(float[] x){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<x.length; i++){
        /*boolean valido = false;
        do{
            if(!in.hasNextInt()){
            System.out.println("no.");
            in.next();
        } else if (in.nextInt() <= 0){
            System.out.println("no.");
            in.next();
        }
        } while(!valido);*/
        
        while(!in.hasNextFloat()){
            System.out.println("no.");
            in.next();
        }
            x[i] = in.nextFloat();
        }
    }
    
    public static void Stampa(int[] x){
        for(int i = 0; i<x.length; i++){
            System.out.println(i+1 + ": " + x[i]);
        }
    }
    
    public static void Stampa(float[] x){
        for(int i = 0; i<x.length; i++){
            System.out.println(i+1 + ": " + x[i]);
        }
    }
    
    public static int Somma(int[] x){
        int risultato = 0;
        for(int i = 0; i< x.length; i++){
            risultato+=x[i];
        }
        return risultato;
    }
    
    public static float Somma(float[] x){
        float risultato = 0;
        for(int i = 0; i< x.length; i++){
            risultato+=x[i];
        }
        return risultato;
    }
    
    public static int valoreMassimo(int[] x){
        int MAX = 0;
        for(int i = 0; i< x.length; i++){
            if(x[i] > MAX)
            MAX = x[i];
        }
        return MAX;
    }
    
    public static float media(float[] x){
        
        float risultato = Somma(x);
        risultato/= x.length;
        
        return risultato;
    }
}





