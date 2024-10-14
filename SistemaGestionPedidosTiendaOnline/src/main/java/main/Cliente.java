package main;

/**
 *
 * @author MiguelReyes
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private String direccion;
    
    public Cliente() {}
    
    public Cliente(String idCliente, String nombre, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    public void mostrarInformacion(Producto producto){
        producto.mostrarInformacion();
        System.out.println("idCliente: " + idCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
    }
}
