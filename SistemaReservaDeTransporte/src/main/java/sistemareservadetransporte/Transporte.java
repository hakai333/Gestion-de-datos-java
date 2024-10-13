package sistemareservadetransporte;

/**
 *
 * @author MiguelReyes
 */
public class Transporte {
    private String idTransporte;
    private int capacidad;
    private boolean disponibilidad;
    
    public Transporte() {
        this.disponibilidad = false;
    }
    
    public Transporte(String idTransporte, int capacidad) {
        this.idTransporte = idTransporte;
        this.capacidad = capacidad;
        this.disponibilidad = true;
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setIdTransporte(String idTransporte) {
        this.idTransporte = idTransporte;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    
    @Override
    public String toString() {
        return "Transporte{" + "idTransporte=" + idTransporte + ", capacidad=" + capacidad + '}';
    }
    
    public boolean verificarDisponibilidad() {
        if(disponibilidad) {
            System.out.println("\nidTransporte: " + idTransporte);
            System.out.println("Disponible\n");
            return true;
        } 
        return false;
    }
    
    public void detallesViajes() {
        System.out.println("\nidTransporte: " + idTransporte);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Disponibilidad: " + (disponibilidad ? "Disponible" : "No disponible"));       
    }
}
