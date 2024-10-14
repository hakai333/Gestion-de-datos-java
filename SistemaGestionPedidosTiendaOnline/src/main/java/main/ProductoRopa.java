package main;

/**
 *
 * @author MiguelReyes
 */
public class ProductoRopa extends Producto{
    private String talla;
    
    public ProductoRopa() {
        super();
        this.talla = "";
    }
    
    public ProductoRopa(String codigoProducto, String nombre, double precio, String talla) {
        super(codigoProducto, nombre, precio);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return  "\ntipoRopa: " + super.toString() + " Talla = " + talla;
    }
    
    @Override
    public double calcularCostoTotal() {
        return getPrecio();
    }
}
