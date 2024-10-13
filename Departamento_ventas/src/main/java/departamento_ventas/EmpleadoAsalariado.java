package departamento_ventas;

/**
 *
 * @author Miguel Reyes
 */
class EmpleadoAsalariado extends Empleado implements Bonificable{
    
    private double bonificacion;
    
    public EmpleadoAsalariado(String nombre, int id, double salarioBase) {
        super(nombre, id, salarioBase);
        this.bonificacion = 0.0;
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }
    
    @Override
    public void agregarBonificacion(double monto) {
        this.bonificacion += monto;
    }
    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo: Asalariado, Bonificacion: $" + bonificacion + ", Salario Total: $" + calcularSalario());
    }
}
