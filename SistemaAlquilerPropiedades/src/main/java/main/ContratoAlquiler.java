package main;

/**
 *
 * @author MiguelReyes
 */
public class ContratoAlquiler {
    private String idContrato;
    private Cliente cliente;
    private Propiedad propiedad;
    private int duracionMeses;
    
    public ContratoAlquiler() {
        
    }
    
    public ContratoAlquiler(String idContrato, Cliente cliente, Propiedad propiedad, int duracionMeses) {
        this.idContrato = idContrato;
        this.cliente = cliente;
        this.propiedad = propiedad;
        this.duracionMeses = duracionMeses;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    @Override
    public String toString() {
        return "ContratoAlquiler{" + "idContrato=" + idContrato + ", cliente=" + cliente + ", propiedad=" + propiedad + ", duracionMeses=" + duracionMeses + '}';
    }
    
    public double calcularCostoTotal() {
        return propiedad.getPrecioAlquiler() * duracionMeses;
    }
    
    public void mostrarInformacion() {
        //cliente.mostrarInformacion();
        System.out.println("idContrato: " + idContrato);
        System.out.println("Cliente: \n" + "Id: " + cliente.getIdCliente() + " Nombre: " + cliente.getNombre());
        System.out.println("Duracion contrato (meses): " + duracionMeses);
        System.out.println("Costo total: $" + calcularCostoTotal() + "\n");
    }

   
    
    
}
