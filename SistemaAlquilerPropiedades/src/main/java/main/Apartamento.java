package main;

/**
 *
 * @author MiguelReyes
 */
public class Apartamento extends Propiedad{
    private int numeroPiso;
    private boolean tieneAscensor;

    public Apartamento() {
        super();
    }
    
    public Apartamento(String direccion, double precioAlquiler, double tamanio, int numeroPiso) {
        super(direccion, precioAlquiler, tamanio);
        this.numeroPiso = numeroPiso;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public boolean isTieneAscensor() {
        return tieneAscensor;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public void setTieneAscensor(boolean tieneAscensor) {
        this.tieneAscensor = tieneAscensor;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Apartamento: ");
        super.mostrarInformacion();
        System.out.println("Numero piso: " + numeroPiso);
        //Esto es para: true=SI --- false=NO
        System.out.println("Tiene ascensor: " + (tieneAscensor ? "SI" : "NO") + "\n");
    }
    
    
    
    
}
