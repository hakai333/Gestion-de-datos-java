package sistemagestionhospital;

/**
 *
 * @author Miguel Reyes
 */
public class Paciente {
    private String idPaciente;
    private String nombre;
    private int edad;
    
    public Paciente() {
    
    }

    public Paciente(String idPaciente, String nombre, int edad) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Paciente: \n" + "idPaciente: " + idPaciente + " \nNombre=" + nombre + " \nEdad=" + edad;
    }
    
    public void mostrarInformacion() {
        System.out.println("idPaciente: " + idPaciente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    

    
}
