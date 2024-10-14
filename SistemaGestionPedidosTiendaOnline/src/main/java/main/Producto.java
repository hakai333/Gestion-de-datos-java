package main;

/**
 *
 * @author MiguelReyes
 */
public abstract class Producto {
    private String codigoProducto;
    private String nombre;
    private double precio;
    //Impuesto de 10%
    private final double impuesto = 0.1;
    
    public Producto() {}
    
    public Producto(String codigoProducto, String nombre, double precio) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nidProducto=" + codigoProducto + " nombre=" + nombre + " precio=" + precio ;
    }
    
    public double calcularImpuesto() {
        return precio * impuesto;
    }
    
    public void mostrarInformacion() {
        System.out.println("Codigo producto: " + codigoProducto);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }
    
    abstract double calcularCostoTotal();
}
