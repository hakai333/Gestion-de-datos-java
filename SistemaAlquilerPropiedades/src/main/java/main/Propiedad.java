package main;

/**
 *
 * @author MiguelReyes
 */
public class Propiedad {
    private String direccion;
    private double precioAlquiler;//CLP
    private double tamanio;//Metros cuadrados
    
    public Propiedad() {
        
    }
    
    public Propiedad(String direccion, double precioAlquiler, double tamanio) {
        this.direccion = direccion;
        this.precioAlquiler = precioAlquiler;
        this.tamanio = tamanio;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Direccion = " + direccion + ", precioAlquiler = " + precioAlquiler + ", tamanio(m^2) = " + tamanio;
    }
    
    public void mostrarInformacion() {
        System.out.println("---Detalles Propiedad---");
        System.out.println("Direccion: " + direccion);
        System.out.println("Precio de Alquiler: " + precioAlquiler);
        System.out.println("Tamanio propiedad (M^2): " + tamanio);
    }
}
