package sis_ges_vehiculos;

/**
 *
 * @author Miguel Reyes
 */
public class Sis_Ges_Vehiculos {

    public static void main(String[] args) {
        GestionDeVehiculos gestionDeVehiculos = new GestionDeVehiculos();
        
        Vehiculo auto1 = new Auto("Toyota", "Corolla");
        Vehiculo moto1 = new Motocicletas("Honda","CBR");
        Vehiculo camion1 = new Camion("Cargo", "Tolva");
        
        gestionDeVehiculos.agregarVehiculo(auto1);
        gestionDeVehiculos.agregarVehiculo(moto1);
        gestionDeVehiculos.agregarVehiculo(camion1);
        
        gestionDeVehiculos.mostrarVehiculosIngresados();
        
        double costoTotal = gestionDeVehiculos.calcularCostoTotalMantenimiento();
        System.out.println("Costo total de mantenimiento: " + costoTotal);
        
        
    }
}
