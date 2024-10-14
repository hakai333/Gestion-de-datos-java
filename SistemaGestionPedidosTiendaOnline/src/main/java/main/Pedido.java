package main;
import java.util.ArrayList;

/**
 *
 * @author MiguelReyes
 */
public class Pedido {
    private String idPedido;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    
    public Pedido() {
        this.productos = new ArrayList<>();
    }
    public Pedido(String idPedido) {
        this.idPedido = idPedido;
        this.productos = new ArrayList<>();
    }
    
    public Pedido(String idPedido, Cliente cliente) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public String getIdPedido() {
        return idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido = " + idPedido + ", cliente = " + cliente + ", productos = " + productos + "\n";
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public double calcularTotal() {
        double total = 0;
        for(Producto p : productos) {
            total += p.calcularCostoTotal();
        }
        return total;
    }
    
    
}
