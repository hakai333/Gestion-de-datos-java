package sistemareservadetransporte;

/**
 *
 * @author MiguelReyes
 */
public class Tren extends Transporte{
    private String claseTren;
    
    public Tren() {
        super();
        this.claseTren = "";
    }
    
    public Tren(String idTransporte, int capacidad, String claseTren) {
        super(idTransporte, capacidad);
        this.claseTren = claseTren;
    }

    public String getClaseTren() {
        return claseTren;
    }

    public void setClaseTren(String claseTren) {
        this.claseTren = claseTren;
    }

    @Override
    public String toString() {
        return "Tren{" + "claseTren=" + claseTren + '}';
    }
    
    @Override
    public void detallesViajes() {
        super.detallesViajes();
        System.out.println("Clase de tren: " + claseTren + "\n");
    }
}
