package departamento_ventas;

/**
 *
 * @author Miguel Reyes
 */
class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;
    
    public EmpleadoPorHoras(String nombre, int id, double salarioBase, double tarifaPorHora) {
        super(nombre, id, salarioBase);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = 0;
    }
    
    public void registrarHoras(double horas) {
        this.horasTrabajadas += horas;
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase + (horasTrabajadas * tarifaPorHora);
    }
    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo: Por Horas, Horas Trabajadas: " + horasTrabajadas + ", Tarifa por Hora: $" + calcularSalario());
    }
}
