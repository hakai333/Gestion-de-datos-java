package main;

import java.util.ArrayList;

/**
 *
 * @author MiguelReyes  
 */
public class Zoologico {
    private ArrayList<Animal> animales;
    
    public Zoologico() {
        this.animales = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return "Zoologico{" + "animales=" + animales + '}';
    }
    
    public void agregarAnimal(Animal animal){
        animales.add(animal);
    }
    
    public void mostrarAnimales(){
        for(Animal a : animales) {
            a.emitirSonido();
        }
    }
    
   
    
}
