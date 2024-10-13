package departamento_ventas;

/**
 *
 * @author Miguel Reyes
 */
public class Main {

    public static void main(String[] args) {
        //Creamos un departameno
        Departamento ventas = new Departamento("Ventas");
        
        //Creamos empleados
        EmpleadoAsalariado empAsalariado = new EmpleadoAsalariado("Ana Perez", 101, 3000);
        EmpleadoPorHoras empPorHoras = new EmpleadoPorHoras("Luis Gomez", 102, 1500, 20);
        EmpleadoComision empComision = new EmpleadoComision("Maria Lopez", 103, 2000, 0.10);
        
        
        //Agregamos bonificaciones
        empAsalariado.agregarBonificacion(500);
        empComision.agregarBonificacion(300);
        
        //Registrar horas y ventas
        empPorHoras.registrarHoras(160);
        empComision.registrarVenta(5000);
        
        //Agregar empleados al departamento
        ventas.agregarEmpleado(empAsalariado);
        ventas.agregarEmpleado(empPorHoras);
        ventas.agregarEmpleado(empComision);
        
        //Calcular y mostrar salarios
        ventas.calcularSalarios();
    }
}
