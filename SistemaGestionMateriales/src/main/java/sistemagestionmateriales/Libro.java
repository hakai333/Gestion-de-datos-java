package sistemagestionmateriales;


public class Libro extends Material{
    private String autor;
    private String genero;
    
    public Libro() {
        super();
    }

    public Libro(String autor, String genero) {
        this.autor = autor;
        this.genero = genero;
    }

    public Libro(String autor, String genero, String idMaterial, String titulo) {
        super(idMaterial, titulo);
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", genero=" + genero + '}';
    }

    public String obtenerResumen() {
        return "Este libro es de: " + autor + ", y pertenece al genero: "+ genero;
    }
    
}
