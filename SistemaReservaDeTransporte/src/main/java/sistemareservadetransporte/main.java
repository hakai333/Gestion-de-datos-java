package sistemareservadetransporte;

/**
 *
 * @author MiguelReyes
 */
public class main {

    public static void main(String[] args) {
       Autobus autobus1 = new Autobus("001", 20, 3);
       Tren tren1 = new Tren("013", 100, "Electrico");
       Avion avion1 = new Avion("666", 300, "EZE032");
       
       autobus1.verificarDisponibilidad();
       
       autobus1.detallesViajes();
       tren1.detallesViajes();
       avion1.detallesViajes();
       
       
    }
}
