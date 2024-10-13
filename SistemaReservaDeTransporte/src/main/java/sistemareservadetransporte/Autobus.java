package sistemareservadetransporte;

/**
 *
 * @author MiguelReyes
 */
public class Autobus extends Transporte{
    private int numeroRutas;
    
    public Autobus() {
        super();
        this.numeroRutas = 0;
    }
    
    public Autobus(String idTransporte, int capacidad, int numeroRutas) {
        super(idTransporte, capacidad);
        this.numeroRutas = numeroRutas;
    }

    public int getNumeroRutas() {
        return numeroRutas;
    }

    public void setNumeroRutas(int numeroRutas) {
        this.numeroRutas = numeroRutas;
    }

    @Override
    public String toString() {
        return "Autobus{" + "numeroRutas=" + numeroRutas + '}';
    }
    
    @Override
    public void detallesViajes() {
        super.detallesViajes();
        System.out.println("Numero de Rutas: " + numeroRutas + "\n");
    }
    
}
