package Interfaces;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentaBoleto extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton btn_Pagar, btn_Cancelar, btn_Volver;
    private JLabel lbl_numBoletos, lbl_detallesAsientos, lbl_detallesCategorias, lbl_Precio;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentaBoleto frame = new VentaBoleto();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public VentaBoleto() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 640);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(72, 81, 84));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbl_tituloVenta = new JLabel("Detalles de la venta\r\n");
        lbl_tituloVenta.setForeground(Color.WHITE);
        lbl_tituloVenta.setFont(new Font("Arial Black", Font.BOLD, 40));
        lbl_tituloVenta.setBounds(234, 11, 476, 84);
        contentPane.add(lbl_tituloVenta);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(234, 106, 476, 229);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lbl_cantidadBoletos = new JLabel("Cantidad de Boletos:");
        lbl_cantidadBoletos.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_cantidadBoletos.setBounds(10, 11, 203, 33);
        panel.add(lbl_cantidadBoletos);

        lbl_numBoletos = new JLabel("N\u00FAmero\r\n");
        lbl_numBoletos.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_numBoletos.setBounds(387, 11, 79, 33);
        panel.add(lbl_numBoletos);

        JLabel lbl_cantidadAsientos = new JLabel("Asientos comprados:\r\n");
        lbl_cantidadAsientos.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_cantidadAsientos.setBounds(10, 55, 203, 33);
        panel.add(lbl_cantidadAsientos);

        lbl_detallesAsientos = new JLabel("A1, A2, A3, A4, A5\r\n");
        lbl_detallesAsientos.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_detallesAsientos.setBounds(263, 38, 203, 70);
        panel.add(lbl_detallesAsientos);


        JLabel lbl_categorias = new JLabel("Categor\u00EDas:\r\n");
        lbl_categorias.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_categorias.setBounds(10, 123, 203, 33);
        panel.add(lbl_categorias);

        lbl_detallesCategorias = new JLabel("A1, A2, A3, A4, A5\r\n");
        lbl_detallesCategorias.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_detallesCategorias.setBounds(263, 107, 203, 70);
        panel.add(lbl_detallesCategorias);

        JLabel lbl_precioTotal = new JLabel("Precio Total:");
        lbl_precioTotal.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_precioTotal.setBounds(10, 167, 203, 33);
        panel.add(lbl_precioTotal);

        lbl_Precio = new JLabel("$1000\r\n");
        lbl_Precio.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_Precio.setBounds(402, 167, 64, 33);
        panel.add(lbl_Precio);

        btn_Pagar = new JButton("Pagar");
        btn_Pagar.setFont(new Font("Arial", Font.PLAIN, 20));
        btn_Pagar.setForeground(Color.WHITE);
        btn_Pagar.setBackground(new Color(171, 0, 51));
        btn_Pagar.setBounds(509, 346, 201, 40);
        btn_Pagar.addActionListener(this);
        contentPane.add(btn_Pagar);

        btn_Cancelar = new JButton("Cancelar Compra\r\n");
        btn_Cancelar.setFont(new Font("Arial", Font.PLAIN, 20));
        btn_Cancelar.setForeground(Color.WHITE);
        btn_Cancelar.setBackground(new Color(171, 0, 51));
        btn_Cancelar.setBounds(234, 346, 201, 40);
        btn_Cancelar.addActionListener(this);
        contentPane.add(btn_Cancelar);

        btn_Volver = new JButton("Volver");
        btn_Volver.setFont(new Font("Arial", Font.PLAIN, 30));
        btn_Volver.setForeground(Color.WHITE);
        btn_Volver.setBackground(new Color(171, 0, 51));
        btn_Volver.setBounds(10, 526, 149, 64);
        btn_Volver.addActionListener(this);
        contentPane.add(btn_Volver);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_Volver){
            SeleccionarAsiento seleccionarAsiento = new SeleccionarAsiento();
            seleccionarAsiento.setVisible(true);
        }else if(e.getSource() == btn_Cancelar){
            SeleccionarPelicula seleccionarPelicula = new SeleccionarPelicula();
            seleccionarPelicula.setVisible(true);
            dispose();
        }else if (e.getSource() == btn_Pagar){
            JOptionPane.showMessageDialog(null, "yes");
            SeleccionarPelicula seleccionarPelicula = new SeleccionarPelicula();
            seleccionarPelicula.setVisible(true);
            dispose();
        }
    }
}
