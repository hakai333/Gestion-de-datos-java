package departamento_ventas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel Reyes
 */
class Departamento {
    private String nombre;
    private List<Empleado> empleados;
    
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    public void calcularSalarios() {
        System.out.println("=== Salarios del Departamento: " + nombre + " ===");
        for(Empleado e : empleados) {
            e.mostrarDetalles();
        }
    }
    
}
