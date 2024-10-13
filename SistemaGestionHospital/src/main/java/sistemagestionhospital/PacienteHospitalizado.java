package sistemagestionhospital;

/**
 *
 * @author Miguel Reyes
 */
public class PacienteHospitalizado extends Paciente{
    private int numeroHabitacion;
    private int diasHospitalizado;
    private final int costoDiario = 10000;
    
    public PacienteHospitalizado() {
        super();
        this.numeroHabitacion = 0;
        this.diasHospitalizado = 0;
    }
    
    public PacienteHospitalizado(String idPaciente, String nombre, int edad, int numeroHabitacion, int diasHospitalizado) {
        super(idPaciente, nombre, edad);
        this.numeroHabitacion = numeroHabitacion;
        this.diasHospitalizado = diasHospitalizado;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public int getDiasHospitalizado() {
        return diasHospitalizado;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setDiasHospitalizado(int diasHospitalizado) {
        this.diasHospitalizado = diasHospitalizado;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de habitacion: " + numeroHabitacion);
        System.out.println("Dias hospitalizado: " + diasHospitalizado);
        System.out.println("Costo total: " + calcularCostoHospilizacion());
        
    }
    
    public int calcularCostoHospilizacion() {
        return diasHospitalizado * costoDiario;
    }
}
