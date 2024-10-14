/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author MiguelReyes
 */
public class Mamifero extends Animal{
    public int periodoGestacion; //meses
    
    public Mamifero() {
        super();
        this.periodoGestacion = 0;
    }
    
    public Mamifero(String nombre, int edad, String especie, int periodoGestacion) {
        super(nombre, edad, especie);
        this.periodoGestacion = periodoGestacion;
    }

    public int getPeriodoGestacion() {
        return periodoGestacion;
    }

    public void setPeriodoGestacion(int periodoGestacion) {
        this.periodoGestacion = periodoGestacion;
    }
    
    @Override
    public void emitirSonido(){
        super.emitirSonido();
        System.out.println("\nMamifero");
        System.out.println("Periodo de gestacion (meses): " + periodoGestacion + "\n");
        System.out.println("Sonido: GUAAA");
    }
    
    
}
