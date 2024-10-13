package sistemareservadetransporte;

/**
 *
 * @author MiguelReyes
 */
public class Avion extends Transporte{
    private String numeroVuelo;
    
    public Avion() {
        super();
        this.numeroVuelo = "";
    }
    
    public Avion(String idTransporte, int capacidad, String numeroVuelo) {
        super(idTransporte, capacidad);
        this.numeroVuelo = numeroVuelo;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    @Override
    public String toString() {
        return "Avion{" + "numeroVuelo=" + numeroVuelo + '}';
    }
    
    @Override
    public void detallesViajes() {
        super.detallesViajes();
        System.out.println("Numerio de vuelo: " + numeroVuelo + "\n");
    }
}
