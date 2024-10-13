package departamento_ventas;

/**
 *
 * @author Miguel Reyes
 */
abstract class Empleado {
    private String nombre;
    private int id;
    protected double salarioBase;
    
    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getId() {
        return id;
    }
    
    //Metodo abstracto para calcular el salario
    public abstract double calcularSalario();
    
    //Metodo para mostrar detalles del empleado
    public void mostrarDetalles() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Salario Base: $" + salarioBase);
    }
}
