package sistemagestionhospital;
import java.util.Date;

/**
 *
 * @author MiguelReyes
 */
public class PacienteAmbulatorio extends Paciente{
    private Date fechaCita;
    
    public PacienteAmbulatorio() {
        super();
        this.fechaCita = null;
    }
    
    public PacienteAmbulatorio(String idPaciente, String nombre, int edad, Date fechaCita) {
        super(idPaciente, nombre, edad);
        this.fechaCita = fechaCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        consultarFecha();
    }
    
    public void consultarFecha() {
        System.out.println("Fecha Cita: " + fechaCita);
    }
    
}
