package main;

/**
 *
 * @author MiguelReyes
 */
public class Casa extends Propiedad{
    private double tamanioTerreno;//Metros cuadrados
    
    public Casa() {
        super();
    }
    
    public Casa(String direccion, double precioAlquiler, double tamanio, double tamanioTerreno) {
        super(direccion, precioAlquiler, tamanio);
        this.tamanioTerreno = tamanioTerreno;
    }

    public double getTamanioTerreno() {
        return tamanioTerreno;
    }

    public void setTamanioTerreno(double tamanioTerreno) {
        this.tamanioTerreno = tamanioTerreno;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Casa: ");
        super.mostrarInformacion();
        System.out.println("Tamanio terrero: " + tamanioTerreno + "\n");
    }
}
