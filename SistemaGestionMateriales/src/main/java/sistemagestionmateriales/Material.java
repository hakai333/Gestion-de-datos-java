package sistemagestionmateriales;

public class Material {
    private String idMaterial;
    private String titulo;
    private boolean disponibilidad;
    
    public Material() {
        this.disponibilidad = true;
    }

    public Material(String idMaterial, String titulo) {
        this.idMaterial = idMaterial;
        this.titulo = titulo;
    }

    public String getIdMaterial() {
        return idMaterial;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setIdMaterial(String idMaterial) {
        this.idMaterial = idMaterial;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    

    
    
    @Override
    public String toString() {
        return "Material{" + "idMaterial=" + idMaterial + ", titulo=" + titulo + '}';
    }
    
    
}
