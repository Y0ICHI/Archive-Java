import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int dim = 3;
        int[] V1 = new int[dim];
        int[] V2 = new int[dim];
        
        System.out.println("V1");
        for(int i = 0; i<V1.length; i++){
            V1[i] = in.nextInt();
        }
        
        System.out.println("V1:");
        Stampa(V1);
        
        Copia(V1, V2);
        System.out.println("V2:");
        Stampa(V2);
        
        System.out.println("V2 (ordinato):");
        SelectionSortInverso(V2);
        Stampa(V2);
    }
    
    public static void Copia(int[] V1, int[] V2){
        for(int i = 0;i<V1.length; i++){
            V2[i] = V1[i];
        }
    }
    
    public static void Stampa(int[] V){
        for(int i = 0; i<V.length; i++){
            System.out.println(i+1 + ": " + V[i]);
        }
    }
    
    public static void SelectionSort(int[] V){
        for(int i = 0; i < V.length-1; i++) {
        int minimo = i;
        for(int j = i+1; j < V.length; j++) {
            if(V[minimo] > V[j]) {
                minimo = j;
            }
        }
        if(minimo != i) { 
            int k = V[minimo];
            V[minimo] = V[i];
            V[i] = k;
        }
    }
    }
    
    public static void SelectionSortInverso(int[] V) {
    for (int i = 0; i < V.length - 1; i++) {
        int massimo = i;
        for (int j = i + 1; j < V.length; j++) {
            if (V[j] > V[massimo]) {
                massimo = j;
            }
        }
        if (massimo != i) {
            int k = V[massimo];
            V[massimo] = V[i];
            V[i] = k;
        }
    }
}


}
