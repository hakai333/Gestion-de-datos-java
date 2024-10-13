package inventariobodega2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventarioGUI {
    private Inventario inventario;
    private JTextArea areaTexto;
    private JTextField nombreField, cantidadField, precioField;

    public InventarioGUI() {
        inventario = new Inventario();
        inventario.cargarInventario("inventario.txt"); // Cargar inventario al inicio

        JFrame frame = new JFrame("Inventario de Bodega");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        frame.add(new JScrollPane(areaTexto), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        panel.add(nombreField);

        panel.add(new JLabel("Cantidad:"));
        cantidadField = new JTextField();
        panel.add(cantidadField);

        panel.add(new JLabel("Precio:"));
        precioField = new JTextField();
        panel.add(precioField);

        JButton agregarButton = new JButton("Agregar Producto");
        panel.add(agregarButton);
        JButton mostrarButton = new JButton("Mostrar Productos");
        panel.add(mostrarButton);

        frame.add(panel, BorderLayout.SOUTH);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                int cantidad = Integer.parseInt(cantidadField.getText());
                float precio = Float.parseFloat(precioField.getText());
                inventario.agregarProducto(nombre, cantidad, precio);
                areaTexto.append("Producto agregado: " + nombre + "\n");
                nombreField.setText("");
                cantidadField.setText("");
                precioField.setText("");
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.setText(""); // Limpiar el área de texto
                inventario.mostrarProductos(areaTexto);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new InventarioGUI();
    }
}

