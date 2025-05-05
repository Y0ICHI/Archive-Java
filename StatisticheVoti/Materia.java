import java.util.Scanner;

public class Materia
{
    private String nome;
    float[] Orali, Scritti, Fusione;
    float ScrittiM, OraliM, MediaTOT;
    Scanner in;

    public Materia(){
        ScrittiM = 0; OraliM = 0; MediaTOT = 0;
    }
    
    public void setMateria(String x){
        this.nome = x;
    }
    
    public String getMateria(){
        return this.nome;
    }
    
    public void setOraliDim(int dim){
        this.Orali = new float[dim];
    }
    
    public void setOrali(){
        in = new Scanner(System.in);
        for(int i = 0; i<Orali.length; i++){
            this.Orali[i] = in.nextInt();
        }
    }
    
    public boolean setOrale(float voto, int i){
        if(i<=0 || i>Orali.length+1){
            return false;
        } else {
            i--;
            this.Orali[i] = voto;
            return true;
        }
    }
    
    public void MediaOrali(){
        for(int i = 0; i<Orali.length; i++){
            OraliM+=Orali[i];
        }
        OraliM/=Orali.length;
    }
    
    public float getMediaOrali(){
        return this.OraliM;
    }
    
    public void setScrittiDim(int dim){
        Scritti = new float[dim];
    }
    
    public void setScritti(){
        in = new Scanner(System.in);
        for(int i = 0; i<Scritti.length; i++){
            this.Scritti[i] = in.nextInt();
        }
    }
    
    public boolean setScritto(float voto, int i){
        if(i<=0 || i>Scritti.length+1){
            return false;
        } else {
            i--;
            this.Scritti[i] = voto;
            return true;
        }
    }
    
    public void MediaScritti(){
        for(int i = 0; i<Scritti.length; i++){
            ScrittiM+=Scritti[i];
        }
        ScrittiM/=Scritti.length;
    }
    
    public float getMediaScritti(){
        return this.ScrittiM;
    }
    
    public void Fusione(){
        int i;
        int dim = (Orali.length+1)+(Scritti.length+1);
        Fusione = new float[dim];
        for(i = 0; i<Orali.length; i++){
            Fusione[i] = Orali[i];
        }
        for(int j = 0; j<Scritti.length; j++){
            Fusione[i++] = Scritti[j];
        }
    }
    
    public void MediaTotali(){
        for(int i = 0; i<Fusione.length; i++){
            MediaTOT+=Fusione[i];
        }
        MediaTOT/=(Orali.length+Scritti.length);
    }
    
    public float getMediaTotali(){
        return this.MediaTOT;
    }
    
    public void StampaArray(float[] x){
        for(int i = 0; i<x.length; i++){
            System.out.println(i+1 + " - " + x[i]);
        }
    }
    
}
