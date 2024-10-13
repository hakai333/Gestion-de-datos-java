package sistemagestionmateriales;
import java.util.ArrayList;

public class Usuario {
    private String idUsuario;
    private String nombre;
    private ArrayList<Prestamo> prestamos;
    private Material material;

    public Usuario() {
        
    }
    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    
    //Aca es la unica parte del codigo que trabajo con setDisponibilidad
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
        //Si no comento la siguiente linea el programa no correo
        //material.setDisponibilidad(false);
        /*
        Entonces mi pregunta es cuando tengo que cambiar la disponibilidad
        del Material para que este cuando lo quiera cambiar, material no sea nulo
        */
        
    }
    
    public void prestamosRealizados() {
        for(Prestamo p : prestamos) {
            System.out.println(p);
        }
    }
    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", prestamos=" + prestamos + '}';
    }
    
}
