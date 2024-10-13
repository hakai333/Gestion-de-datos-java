package inventariobodega1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, int cantidad, float precio) {
        productos.add(new Producto(nombre, cantidad, precio));
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto; // Retorna el producto encontrado
            }
        }
        return null; // Retorna null si no se encuentra el producto
    }

    public void guardarInventario(String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Producto producto : productos) {
                writer.write(producto.getNombre() + "," + producto.getCantidad() + "," + producto.getPrecio());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo para guardar el inventario: " + e.getMessage());
        }
    }

    public void cargarInventario(String archivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                int cantidad = Integer.parseInt(datos[1]);
                float precio = Float.parseFloat(datos[2]);
                agregarProducto(nombre, cantidad, precio);
            }
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo para cargar el inventario: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error en el formato de los datos: " + e.getMessage());
        }
    }
}

