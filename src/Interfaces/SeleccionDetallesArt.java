package Interfaces;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class SeleccionDetallesArt extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JComboBox combo_tam_refrescos, combo_tam_palomitas, combo_tam_helados, combo_sabor_refrescos, combo_sabor_palomitas, combo_sabor_helados;
    private JButton btnVolver, btnCancelarCompra, btnPagar;
    private JLabel lbl_precio1, lbl_precio2, lbl_precio3;
    private String tam[] = {"Chico", "Mediano", "Grande"};
    //TODO: ARRAYS DE LOS DEMAS.

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SeleccionDetallesArt frame = new SeleccionDetallesArt();
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
    public SeleccionDetallesArt() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 640);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(72, 81, 84));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbl_seleccion = new JLabel("Seleccion de detalles de los artículos");
        lbl_seleccion.setForeground(Color.WHITE);
        lbl_seleccion.setFont(new Font("Arial", Font.BOLD, 40));
        lbl_seleccion.setBounds(122, 11, 699, 40);
        getContentPane().add(lbl_seleccion);

        JLabel lbl_refrescos = new JLabel("Refrescos:   >");
        lbl_refrescos.setForeground(Color.WHITE);
        lbl_refrescos.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_refrescos.setBackground(Color.DARK_GRAY);
        lbl_refrescos.setBounds(10, 90, 204, 48);
        contentPane.add(lbl_refrescos);

        JLabel lbl_palomitas = new JLabel("Palomitas:    >");
        lbl_palomitas.setForeground(Color.WHITE);
        lbl_palomitas.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_palomitas.setBackground(Color.DARK_GRAY);
        lbl_palomitas.setBounds(10, 156, 204, 61);
        contentPane.add(lbl_palomitas);

        JLabel lbl_helados = new JLabel("Helados:       >");
        lbl_helados.setForeground(Color.WHITE);
        lbl_helados.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_helados.setBackground(Color.DARK_GRAY);
        lbl_helados.setBounds(10, 228, 204, 61);
        contentPane.add(lbl_helados);

        JLabel lbl_tamano= new JLabel("Tama\u00F1o:");
        lbl_tamano.setForeground(Color.WHITE);
        lbl_tamano.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_tamano.setBackground(Color.DARK_GRAY);
        lbl_tamano.setBounds(224, 84, 124, 61);
        contentPane.add(lbl_tamano);

        combo_tam_refrescos = new JComboBox(tam);
        combo_tam_refrescos.setBounds(358, 101, 157, 26);
        combo_tam_refrescos.addActionListener(this);
        contentPane.add(combo_tam_refrescos);

        JLabel lbl_tamano2 = new JLabel("Tama\u00F1o:");
        lbl_tamano2.setForeground(Color.WHITE);
        lbl_tamano2.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_tamano2.setBackground(Color.DARK_GRAY);
        lbl_tamano2.setBounds(224, 156, 124, 61);
        contentPane.add(lbl_tamano2);

        combo_tam_palomitas = new JComboBox(tam);
        combo_tam_palomitas.setBounds(358, 173, 157, 26);
        combo_tam_palomitas.addActionListener(this);
        contentPane.add(combo_tam_palomitas);

        JLabel lbl_tamano3 = new JLabel("Tama\u00F1o:");
        lbl_tamano3.setForeground(Color.WHITE);
        lbl_tamano3.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_tamano3.setBackground(Color.DARK_GRAY);
        lbl_tamano3.setBounds(224, 228, 124, 61);
        contentPane.add(lbl_tamano3);

        combo_tam_helados = new JComboBox(tam);
        combo_tam_helados.setBounds(358, 245, 157, 26);
        combo_tam_helados.addActionListener(this);
        contentPane.add(combo_tam_helados);

        JLabel lbl_sabor = new JLabel("Sabor:");
        lbl_sabor.setForeground(Color.WHITE);
        lbl_sabor.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_sabor.setBackground(Color.DARK_GRAY);
        lbl_sabor.setBounds(525, 84, 95, 61);
        contentPane.add(lbl_sabor);

        combo_sabor_refrescos = new JComboBox();
        combo_sabor_refrescos.setBounds(630, 101, 157, 26);
        combo_sabor_refrescos.addActionListener(this);
        contentPane.add(combo_sabor_refrescos);

        JLabel lbl_sabor2 = new JLabel("Sabor:");
        lbl_sabor2.setForeground(Color.WHITE);
        lbl_sabor2.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_sabor2.setBackground(Color.DARK_GRAY);
        lbl_sabor2.setBounds(525, 156, 95, 61);
        contentPane.add(lbl_sabor2);

        combo_sabor_palomitas = new JComboBox();
        combo_sabor_palomitas.setBounds(630, 173, 157, 26);
        combo_sabor_palomitas.addActionListener(this);
        contentPane.add(combo_sabor_palomitas);

        JLabel lbl_sabor3 = new JLabel("Sabor:");
        lbl_sabor3.setForeground(Color.WHITE);
        lbl_sabor3.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_sabor3.setBackground(Color.DARK_GRAY);
        lbl_sabor3.setBounds(525, 228, 95, 61);
        contentPane.add(lbl_sabor3);

        combo_sabor_helados = new JComboBox();
        combo_sabor_helados.setBounds(630, 245, 157, 26);
        combo_sabor_helados.addActionListener(this);
        contentPane.add(combo_sabor_helados);

        lbl_precio1 = new JLabel("$$$$");
        lbl_precio1.setForeground(Color.WHITE);
        lbl_precio1.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_precio1.setBounds(860, 98, 74, 32);
        contentPane.add(lbl_precio1);

        lbl_precio2 = new JLabel("$$$$");
        lbl_precio2.setForeground(Color.WHITE);
        lbl_precio2.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_precio2.setBounds(860, 167, 74, 32);
        contentPane.add(lbl_precio2);

        lbl_precio3 = new JLabel("$$$$");
        lbl_precio3.setForeground(Color.WHITE);
        lbl_precio3.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_precio3.setBounds(860, 239, 74, 32);
        contentPane.add(lbl_precio3);

        btnVolver = new JButton("Volver");
        btnVolver.setForeground(Color.WHITE);
        btnVolver.setFont(new Font("Arial", Font.PLAIN, 20));
        btnVolver.setBackground(new Color(171, 0, 51));
        btnVolver.setBounds(10, 518, 199, 72);
        btnVolver.addActionListener(this);
        contentPane.add(btnVolver);

        btnCancelarCompra = new JButton("Cancelar Compra");
        btnCancelarCompra.setForeground(Color.WHITE);
        btnCancelarCompra.setFont(new Font("Arial", Font.PLAIN, 25));
        btnCancelarCompra.setBackground(new Color(171, 0, 51));
        btnCancelarCompra.setBounds(213, 364, 238, 50);
        btnCancelarCompra.addActionListener(this);
        contentPane.add(btnCancelarCompra);

        btnPagar = new JButton("Pagar");
        btnPagar.setForeground(Color.WHITE);
        btnPagar.setFont(new Font("Arial", Font.PLAIN, 25));
        btnPagar.setBackground(new Color(171, 0, 51));
        btnPagar.setBounds(503, 364, 238, 50);
        btnPagar.addActionListener(this);
        contentPane.add(btnPagar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCancelarCompra) {
            VentaDulceria ventaDulceria = new VentaDulceria();
            ventaDulceria.setVisible(true);
            dispose();

        } else if (e.getSource() == btnVolver) {
            VentaDulceria ventaDulceria = new VentaDulceria();
            ventaDulceria.setVisible(true);
            dispose();

        } else if (e.getSource() == btnPagar) {
            DetallesVentaDulceria detallesVentaDulceria = new DetallesVentaDulceria();
            detallesVentaDulceria.setVisible(true);
        }else if(e.getSource() == combo_tam_helados){

        }else if(e.getSource() == combo_tam_palomitas){

        }else if(e.getSource() == combo_tam_refrescos){

        }else if(e.getSource() == combo_sabor_helados){

        }else if(e.getSource() == combo_sabor_palomitas){

        }else if (e.getSource() == combo_sabor_refrescos){

        }
    }
}