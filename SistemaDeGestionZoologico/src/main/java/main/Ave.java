/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author MiguelReyes
 */
public class Ave extends Animal{
    private String tipoVuelo;
    
    public Ave() {
        super();
        this.tipoVuelo = "";
    }
    
    public Ave(String nombre, int edad, String especie, String tipoVuelo) {
        super(nombre, edad, especie);
        this.tipoVuelo = tipoVuelo;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    @Override
    public String toString() {
        return "Ave{" + "tipoVuelo=" + tipoVuelo + '}';
    }
    
    @Override 
    public void emitirSonido() {
        super.emitirSonido();
        System.out.println("\nAve");
        System.out.println("Tipo de vuelo: " + tipoVuelo);
        System.out.println("Sonido: KOKOROKOOO");
    }
    
    
}
