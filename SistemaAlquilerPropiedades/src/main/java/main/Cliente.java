package main;

/**
 *
 * @author MiguelReyes
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private String telefono;
    private Propiedad propiedad;
    
    public Cliente() {
        
    }
    
    public Cliente(String idCliente, String nombre, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", telefono=" + telefono + ", propiedad=" + propiedad + '}';
    }
    
    public void mostrarInformacion() {
        System.out.println("---Informacion cliente---");
        System.out.println("idCliente: " + idCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono + "\n");
    }
}
