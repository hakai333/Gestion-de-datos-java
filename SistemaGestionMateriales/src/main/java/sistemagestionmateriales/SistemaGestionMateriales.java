package sistemagestionmateriales;
import java.util.Date;
import java.util.ArrayList;

public class SistemaGestionMateriales {

    public static void main(String[] args) {
        //Date date = new Date();
        //System.out.println(date);
        ArrayList<Material> materiales = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        
        Libro libro1 = new Libro("001", "Papelucho", "Gabriela Mistral","Fabula");
        Revista revista1 = new Revista("002", "Times", "normal", 1000);
        Usuario usuario1 = new Usuario("20397144","Miguel");
        
        Prestamo prestamo1 = new Prestamo();
        Prestamo prestamo2 = new Prestamo();
        
        prestamo1.setMaterial(libro1);
        prestamo2.setMaterial(revista1);
        
        materiales.add(libro1);
        materiales.add(revista1);
        usuarios.add(usuario1);
        
        prestamos.add(prestamo1);
        prestamos.add(prestamo2);
       
        usuario1.agregarPrestamo(prestamo1);
        usuario1.agregarPrestamo(prestamo2);
        
        for(Usuario u : usuarios) {
            System.out.println(u);
        }
        
        
        
    }
}
