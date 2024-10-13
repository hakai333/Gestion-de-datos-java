package sis_ges_vehiculos;
import java.util.ArrayList;

public class GestionDeVehiculos {
    private ArrayList<Vehiculo> vehiculos;
    
    public GestionDeVehiculos() {
        vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
    
    public double calcularCostoTotalMantenimiento() {
        double costoTotal = 0;
        for(Vehiculo v : vehiculos) {
            costoTotal += v.mantenimiento();
        }
        return costoTotal;
    }
    
    public void mostrarVehiculosIngresados() {
        for(Vehiculo v : vehiculos){
            System.out.println("Marca: " + v.getMarca() + ", Modelo: " + v.getModelo());
        }
    }
    
}
