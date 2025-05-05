
/**
 * Aggiungi qui una descrizione della classe HelloWorld
 * 
 * @author Antonio d'Agostino 
 * @version 10/01/2025
 */
public class HelloWorld {
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private String hello;

    /**
     * Costruttore degli oggetti di classe  HelloWorld
     */
    public HelloWorld()
    {
        // inizializza le variabili d'istanza
        hello = "Hello World!";
    }

    /**
     * Un esempio di metodo - aggiungi i tuoi commenti
     * 
     * @param  y   un parametro d'esempio per un metodo
     * @return     la somma di x e y
     */
    
    public void sayHello()
    {
        System.out.println(hello);
        return;
    }
//ci sono degli argomenti, quindi si usa args[]
    public static void main (String args[]) {
        HelloWorld hw = new HelloWorld();
        hw.sayHello();
}
}