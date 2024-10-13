package sis_ges_vehiculos;

public class Auto extends Vehiculo{

    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public double mantenimiento(){
        return 30000.0;
    }
}
