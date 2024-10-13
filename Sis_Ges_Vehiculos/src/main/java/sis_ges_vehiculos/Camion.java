package sis_ges_vehiculos;

public class Camion extends Vehiculo{
  
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public double mantenimiento(){
        return 50000;
    }
}
