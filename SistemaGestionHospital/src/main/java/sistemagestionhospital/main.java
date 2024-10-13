package sistemagestionhospital;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Miguel Reyes
 */
public class main {

    public static void main(String[] args) {
        
        
        Paciente paciente1 = new Paciente("001", "Miguel", 24);
        PacienteHospitalizado pacienteHospitalizado1 = new PacienteHospitalizado("012", "Carlos", 20, 101, 6);
        
        System.out.println("Informacion paciente 1: ");
        paciente1.mostrarInformacion();
        
        System.out.println("\nInformacion paciente hospitalizado 1: ");
        pacienteHospitalizado1.mostrarInformacion();
        
        //creamos un paciente ambulatorio
        //usamos calendar para definir la fecha de la cita
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.OCTOBER, 13);
        Date fechaCita = calendar.getTime();
        
        PacienteAmbulatorio pacienteAmbulatorio1 = new PacienteAmbulatorio("003", "Marcelo", 25, fechaCita);
        
        //Mostramos la informacion
        System.out.println("\nInformacion paciente ambulatorio: ");
        pacienteAmbulatorio1.mostrarInformacion();
        
    }
}
