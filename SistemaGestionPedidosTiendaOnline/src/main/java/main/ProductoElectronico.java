package main;

/**
 *
 * @author MiguelReyes
 */
public class ProductoElectronico extends Producto{
    private int garantia; //anios
    
    public ProductoElectronico() {
        super();
        this.garantia = 0;
    }
    
    public ProductoElectronico(String codigoProducto, String nombre, double precio, int garantia) {
        super(codigoProducto, nombre, precio);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return  "\ntipoElectronico" + super.toString() + " Garantia = " + garantia + " meses";
    }
    
    
    @Override
    public double calcularCostoTotal() {
        return getPrecio() + calcularImpuesto();
        
    }
}
