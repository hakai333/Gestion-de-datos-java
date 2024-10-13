package departamento_ventas;

/**
 *
 * @author Miguel Reyes
 */
 class EmpleadoComision extends Empleado implements Bonificable{
    private double ventas;
    private double tasaComision;
    private double bonificacion;
     
    public EmpleadoComision(String nombre, int id, double salarioBase, double tasaComision) {
        super(nombre, id, salarioBase);
        this.tasaComision = tasaComision;
        this.ventas = 0.0;
        this.bonificacion = 0.0;
    }
    
    public void registrarVenta(double monto) {
        this.ventas += monto;
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase + (ventas * tasaComision) + bonificacion;
    }
    
    
    @Override 
    public void agregarBonificacion(double monto) {
        this.bonificacion += monto;
    }
    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo: Comision, Ventas: $" + ventas + ", Tasa de Comision: $" + (tasaComision * 100) + "%, Bonificacion: $" + bonificacion + ", Salario Total: $" + calcularSalario());
    }
}   
