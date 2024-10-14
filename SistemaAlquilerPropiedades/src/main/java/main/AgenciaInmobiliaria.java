package main;
import java.util.ArrayList;
/**
 *
 * @author MiguelReyes
 */
public class AgenciaInmobiliaria {
    private ArrayList<Propiedad> propiedades;
    private ArrayList<Cliente> clientes;
    private ArrayList<ContratoAlquiler> contratos;
    
    public AgenciaInmobiliaria() {
        this.propiedades = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.contratos = new ArrayList<>();
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<ContratoAlquiler> getContratos() {
        return contratos;
    }

    public void setPropiedades(ArrayList<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setContratos(ArrayList<ContratoAlquiler> contratos) {
        this.contratos = contratos;
    }
    
    
    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void agregarContrato(ContratoAlquiler contrato) {
        contratos.add(contrato);
    }
    
    public void mostrarPropiedades() {
        for(Propiedad p : propiedades) {
            p.mostrarInformacion();
        }
    }
    
    public void mostrarClientes() {
        for(Cliente c : clientes) {
            c.mostrarInformacion();
        }
    }
    
    public void mostrarContratos() {
        for(ContratoAlquiler c : contratos) {
            c.mostrarInformacion();
        }
    }
   
}
