package sistemagestionmateriales;
import java.util.Date;

public class Prestamo {
    private Material material;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
     
    public Prestamo() {
        
    }
    
    //2do Tambien me hizo cambiar esto: 
    /*
    public Prestamo(Material material) {
        this.material = material;
        this.fechaPrestamo = new Date();
        if (material != null) {
            material.setDisponibilidad(false);
        }
    }
    */
    
    public Prestamo(Material material) {
        this.material = material;
        this.fechaPrestamo = new Date();
    }

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Material getMaterial() {
        return material;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    //Primer error: 
    /*
    segun chatGPT debemos asegurarnos de que el objeto material este correctamente
    inicializado antes de llamar al metodo setDisponibilidad
    */
    //y esto es lo que me pidio que cambiara:
    /*
    public void setMaterial(Material material) {
        this.material = material;
        if (material != null) {
            material.setDisponibilidad(false);
        }
    }
    */
    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "material=" + material + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + '}';
    }
    
    public double calcularMulta() {
        //Obtenemos la fecha de hoy cuando se abre el programa
        Date fechaActual = new Date();
        
        //Si la fechaActual es pasada la (fechaDevolucion) es true
        if (fechaActual.after(fechaDevolucion)) {
            //Lo mas dificil: Calculo de la diferencia de tiempo
            /*
              getTime() de Date devuelve el tiempo representado en milisegundos
              desde el 1 de enero de 1970 o "Epoch time"
              Restando los milisegundos de fechaDevolucion con los milisegundos 
              de la fechaActual obtenemos al diferencia en milisegundos de 
              ambas fechas
            
              Si el valor es positivo fechaActual es posterior a fechaDevolucion,
              lo que indica que hay retraso
            */
            long diferenciaMillis = fechaActual.getTime() - fechaDevolucion.getTime();
            //Convertimos de milisegundos a dias
            //Yo lo entendi como tomamos los milis y los pasamos a;
            //milis * 1000 = seg
            //seg * 60 = min
            //min * 60 = hrs
            //hrs * 24 = dias
            long diasRetraso = diferenciaMillis / (1000 * 60 * 60 * 24);
            //Inciamos la multa por $5000 clp como multa diaria
            double multaPorDia = 5000.0;
            //Retornamos los dias de retraso por el costo de la multa diara
            return diasRetraso * multaPorDia;
        }
        return 0.0;
    }
}
