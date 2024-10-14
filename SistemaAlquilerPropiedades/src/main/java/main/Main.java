package main;

/**
 *
 * @author MiguelReyes
 */
public class Main {

    public static void main(String[] args) {
        //Incializamos la agencia
        AgenciaInmobiliaria agenciaApartamentos = new AgenciaInmobiliaria();
        AgenciaInmobiliaria agenciaCasas = new AgenciaInmobiliaria();
        
        //Creamos un cliente
        Cliente cliente1 = new Cliente("20397144", "Miguel", "988776655");
        Cliente cliente2 = new Cliente("20397133", "Marco", "911223344");
        Cliente cliente3 = new Cliente("20397122", "Maria", "988776633");
        Cliente cliente4 = new Cliente("20397111", "Mario", "911556655");
        Cliente cliente5 = new Cliente("20333144", "Martin", "988773311");
        Cliente cliente6 = new Cliente("20360123", "Margarita", "988775577");
        
        //Inicializamos las propiedades
        Apartamento apartamento1 = new Apartamento("San Carlos 212", 300000, 35, 10);
        Apartamento apartamento2 = new Apartamento("San Martin 23", 340000, 40, 12);
        Apartamento apartamento3 = new Apartamento("Arturo Prat 1312", 400000, 50, 14);
        Casa casa1 = new Casa("Arturo Prat 1201", 500000, 100, 100);
        Casa casa2 = new Casa("Irarrazabal 1212", 450000, 90, 90);
        Casa casa3 = new Casa("San Antonio 301", 550000, 120, 120);
        
        //Les agregamos ascensor a los apartamenos que querramos
        apartamento1.setTieneAscensor(true);
        apartamento3.setTieneAscensor(true);
        
        //Instanciamos un contrato
        ContratoAlquiler contrato1 = new ContratoAlquiler("CA001", cliente1, apartamento1, 12);
        ContratoAlquiler contrato2 = new ContratoAlquiler("CA002", cliente2, apartamento2, 6);
        ContratoAlquiler contrato3 = new ContratoAlquiler("CA003", cliente3, apartamento3, 12);
        ContratoAlquiler contrato4 = new ContratoAlquiler("CA004", cliente4, casa1, 6);
        ContratoAlquiler contrato5 = new ContratoAlquiler("CA005", cliente5, casa2, 6);
        ContratoAlquiler contrato6 = new ContratoAlquiler("CA006", cliente6, casa3, 12);
        
        //Agregamos las propiedades, clientes y contratos a su respectiva lista en agenciaApartamentos
        agenciaApartamentos.agregarPropiedad(apartamento1);
        agenciaApartamentos.agregarCliente(cliente1);
        agenciaApartamentos.agregarContrato(contrato1);
        
        agenciaApartamentos.agregarPropiedad(apartamento2);
        agenciaApartamentos.agregarCliente(cliente2);
        agenciaApartamentos.agregarContrato(contrato2);
        
        agenciaApartamentos.agregarPropiedad(apartamento3);
        agenciaApartamentos.agregarCliente(cliente3);
        agenciaApartamentos.agregarContrato(contrato3);
        
        agenciaCasas.agregarPropiedad(casa1);
        agenciaCasas.agregarCliente(cliente4);
        agenciaCasas.agregarContrato(contrato4);
        
        agenciaCasas.agregarPropiedad(casa2);
        agenciaCasas.agregarCliente(cliente5);
        agenciaCasas.agregarContrato(contrato5);
        
        agenciaCasas.agregarPropiedad(casa3);
        agenciaCasas.agregarCliente(cliente6);
        agenciaCasas.agregarContrato(contrato6);
        
        System.out.println("---Inmobiliaria de Apartamentos---\n");
        agenciaApartamentos.mostrarPropiedades();
        agenciaApartamentos.mostrarClientes();
        agenciaApartamentos.mostrarContratos();
        
        
        System.out.println("---Inmobiliaria de Casas---\n");
        agenciaCasas.mostrarPropiedades();
        agenciaCasas.mostrarClientes();
        agenciaCasas.mostrarContratos();
        
        
        
    }
}
