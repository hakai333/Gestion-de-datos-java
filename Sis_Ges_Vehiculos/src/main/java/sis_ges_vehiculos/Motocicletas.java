package sis_ges_vehiculos;

public class Motocicletas extends Vehiculo{
   
    public Motocicletas(String marca, String modelo) {
        super(marca, modelo); 
    }
    
    @Override
    public double mantenimiento(){
        return 15000;
    }
}
