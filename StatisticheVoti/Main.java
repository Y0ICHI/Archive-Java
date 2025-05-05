import java.util.Scanner;

public class Main
{
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int dim;
       Materia[] materia;
       System.out.println("Dim");
       while(!in.hasNextInt()){
           System.out.println("no.");
           in.next();
       }
       dim = in.nextInt();
       System.out.println("DEBUG dimensione dim: " + dim);
       materia = new Materia[dim];
       // Istanzia ogni oggetto Materia
       for (int i = 0; i < dim; i++) {
        materia[i] = new Materia();
        }
       boolean stop = false;
       for(int i = 0; i<dim; i++){
           boolean stop2;
           char scelta;
           System.out.println("Materia");
           String NomeMateria;
           NomeMateria = in.nextLine();
           materia[i].setMateria(NomeMateria);
           
           System.out.println("N Orali");
           int dimO = in.nextInt();
           materia[i].setOraliDim(dimO);
           
           System.out.println("N Scritti");
           int dimS = in.nextInt();
           materia[i].setScrittiDim(dimS);
           
           System.out.println("Inserimento tutti voti Orale");
           materia[i].setOrali();
           
           System.out.println("Inserimento tutti voti Scritti");
           materia[i].setScritti();
           
           System.out.println("DEBUG: svolgimento media orali");
           materia[i].MediaOrali();
           System.out.println("DEBUG: Il risultato è" + materia[i].getMediaOrali());
           
           System.out.println("DEBUG: svolgimento media scritti");
           materia[i].MediaScritti();
           System.out.println("DEBUG: Il risultato è " + materia[i].getMediaScritti());
           
           System.out.println("DEBUG: sto unendo tutti i voti degli orali e scritti.");
           materia[i].Fusione();
           System.out.println("DEBUG: Sto facendo la media dei voti");
           materia[i].MediaTotali();
           System.out.println("DEBUG: Il risultato è " + materia[i].getMediaTotali());
       }
       
       Calcolatore calcolatore = new Calcolatore();
       
       System.out.println(calcolatore.MediaComplessiva(materia));
       
       /*while(!stop){
           
       }*/
        
       
        
       
       //Ho dedotto che Kira è omofobo -L Lawliet
       //blahblahblah blahblah blah tututuututututututututututututu
   }
}
