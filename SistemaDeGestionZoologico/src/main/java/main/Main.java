package main;
import java.util.ArrayList;

/**
 *
 * @author MiguelReyes
 */
public class Main {

    public static void main(String[] args) {
        Zoologico zoologico1 = new Zoologico();
        
        Mamifero mamifero1 = new Mamifero("Gaston", 2, "Can", 10);
        Ave ave1 = new Ave("Lucas", 3, "Paloma", "Vuelo alto");
        
        zoologico1.agregarAnimal(mamifero1);
        zoologico1.agregarAnimal(ave1);
        
        zoologico1.mostrarAnimales();
        
        
    }
}
