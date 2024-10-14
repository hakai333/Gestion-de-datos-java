package main;
import java.util.ArrayList;

/**
 *
 * @author MiguelReyes
 */
public class Tienda {
    ArrayList<Cliente> clientes;
    ArrayList<Pedido> pedidos;
    
    public Tienda(){
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    public void mostrarPedido() {
        System.out.println("\n--Todos los pedidos ingresados--");
        for(Pedido p : pedidos)  {
            System.out.println("idPedido: " + p.getIdPedido());
            System.out.println("Cliente: " + p.getCliente().getNombre());
            System.out.println("Productos: " + p.getProductos());
            System.out.println("Costo total: $" + p.calcularTotal());
        }
    }
    
    
}
