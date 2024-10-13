package sistemagestionmateriales;
import java.util.ArrayList;

public class Revista extends Material{
    private String editorial;
    private int numeroEdicion;
    private ArrayList<String> articulosDestacados;
    
    public Revista() {
        super();
    }

    public Revista(String idMaterial, String titulo, String editorial, int numeroEdicion) {
        super(idMaterial, titulo);
        this.editorial = editorial;
        this.numeroEdicion = numeroEdicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public String toString() {
        return "Revista{" + "editorial=" + editorial + ", numeroEdicion=" + numeroEdicion + '}';
    }
    
    public void agregarArticulosDestacados(String articulo) {
        articulosDestacados.add(articulo);
    }
    
    
    public ArrayList<String> verArticulosDestacados() {
        return articulosDestacados;
    }
    
}
