package main;

/**
 *
 * @author MiguelReyes
 */
public class Animal {
    private String nombre;
    private int edad;
    private String especie;
    
    public Animal(){
        this.nombre = "";
        this.edad = 0;
        this.especie = "";
    }
    
    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + '}';
    }
    
    public void emitirSonido() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: (anhos)" + edad);
        System.out.println("Especie: " + especie);
    }
}
