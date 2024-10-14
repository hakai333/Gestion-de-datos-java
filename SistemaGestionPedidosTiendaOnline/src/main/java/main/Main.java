package main;
import java.util.ArrayList;

/**
 *
 * @author MiguelReyes
 */
public class Main {

    public static void main(String[] args) {        
        //Creamos una tienda
        Tienda tienda1 = new Tienda();
        //Ingresamos cliente
        Cliente cliente1 = new Cliente("LS001", "Miguel", "San Francisco");
        //Asignamos cliente1 a tienda1
        tienda1.agregarCliente(cliente1);
        
        //Ingresamos los productos
        ProductoElectronico producto1 = new ProductoElectronico("001", "PC", 150000, 12);
        ProductoRopa producto2 = new ProductoRopa("002", "Poleron", 10000, "L");
        ProductoRopa producto3 = new ProductoRopa("003", "Chaqueton Fierucci", 12000, "L");
        ProductoRopa producto4 = new ProductoRopa("004", "Chalas", 5000, "42");
        ProductoRopa producto5 = new ProductoRopa("005", "Zapatos", 30000, "42");
        ProductoRopa producto6 = new ProductoRopa("006", "Zapatillas", 50000, "42");
        
        
        
        
        //Creamos un pedido ingresando creando su id
        Pedido pedido1 = new Pedido("P003", cliente1);
        
        
        //Agregamos los productos al pedido que los recibe en un ArrayList
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        pedido1.agregarProducto(producto3);
        pedido1.agregarProducto(producto4);
        pedido1.agregarProducto(producto5);
        pedido1.agregarProducto(producto6);

        
        //Le asiganamos pedido1 a tienda1
        tienda1.agregarPedido(pedido1);
        
        
        //Mostramos todos los pedidos del cliente ingresado
        tienda1.mostrarPedido();
        
        
        
        
        
        
        
        
        
    }
}
