package inventariobodega1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        String archivoInventario = "inventario.txt"; // Archivo donde se guarda el inventario
        inventario.cargarInventario(archivoInventario); // Cargar inventario al inicio

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Mostrar Productos");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1: {
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Precio: ");
                    float precio = scanner.nextFloat();
                    inventario.agregarProducto(nombre, cantidad, precio);
                    System.out.println("Producto agregado.");
                    break;
                }
                case 2:
                    inventario.mostrarProductos();
                    break;
                case 3: {
                    System.out.print("Nombre del producto a buscar: ");
                    String nombre = scanner.nextLine();
                    Producto producto = inventario.buscarProducto(nombre);
                    if (producto != null) {
                        System.out.println("Producto encontrado: " + producto);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                }
                case 4:
                    inventario.guardarInventario(archivoInventario); // Guardar inventario al salir
                    System.out.println("Inventario guardado. Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}

