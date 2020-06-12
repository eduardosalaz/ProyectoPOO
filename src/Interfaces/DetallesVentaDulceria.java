package Interfaces;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetallesVentaDulceria extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JLabel lbl_articulos, lbl_tamanos, lbl_sabores, lbl_precios, lbl_preciototal;
    private JButton btn_cancelar, btn_pagar, btn_volver;
    JList list = new JList();
    DefaultListModel lista;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DetallesVentaDulceria frame = new DetallesVentaDulceria();
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
    public DetallesVentaDulceria() {
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 640);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(72, 81, 84));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbl_detalles = new JLabel("Detalles de la venta\r\n");
        lbl_detalles.setForeground(Color.WHITE);
        lbl_detalles.setFont(new Font("Arial Black", Font.BOLD, 40));
        lbl_detalles.setBounds(234, 11, 476, 84);
        contentPane.add(lbl_detalles);

        lista = new DefaultListModel();
		list.setModel(lista);
        list.setBounds(10, 250, 924, 290);
        getContentPane().add(list);
        list.setVisibleRowCount(4);
        lista.addElement("Nombre                                                                                           Tamanio                                Precio                                Sabor                                                         Existencias");
    

        JLabel lbl_art = new JLabel("Art\u00EDculos:");
        lbl_art.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_art.setBounds(10, 11, 203, 33);
        

        lbl_articulos = new JLabel("A1, A2, A3, A4, A5\r\n");
        lbl_articulos.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_articulos.setBounds(263, -6, 203, 70);
        

        lbl_tamanos = new JLabel("A1, A2, A3, A4, A5\r\n");
        lbl_tamanos.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_tamanos.setBounds(263, 77, 203, 70);
       

        JLabel lbl_tam = new JLabel("Tama\u00F1os");
        lbl_tam.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_tam.setBounds(10, 94, 203, 33);
      

        lbl_sabores = new JLabel("A1, A2, A3, A4, A5\r\n");
        lbl_sabores.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_sabores.setBounds(263, 158, 203, 70);
       

        JLabel lbl_sab = new JLabel("Sabores");
        lbl_sab.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_sab.setBounds(10, 175, 203, 33);
       

        lbl_precios = new JLabel("A1, A2, A3, A4, A5\r\n");
        lbl_precios.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_precios.setBounds(263, 239, 203, 70);
        

        JLabel lbl_prec = new JLabel("Precios:");
        lbl_prec.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_prec.setBounds(10, 256, 203, 33);
       

        lbl_preciototal = new JLabel("A1, A2, A3, A4, A5\r\n");
        lbl_preciototal.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_preciototal.setBounds(263, 303, 203, 70);
      

        JLabel lbl_prectot = new JLabel("Precio total:");
        lbl_prectot.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_prectot.setBounds(10, 320, 203, 33);
      


        btn_cancelar = new JButton("Cancelar Compra\r\n");
        btn_cancelar.setBounds(234, 495, 201, 40);
        contentPane.add(btn_cancelar);
        btn_cancelar.setForeground(Color.WHITE);
        btn_cancelar.setFont(new Font("Arial", Font.PLAIN, 20));
        btn_cancelar.setBackground(new Color(171, 0, 51));
        btn_cancelar.addActionListener(this);

        btn_pagar = new JButton("Pagar");
        btn_pagar.setBounds(509, 495, 201, 40);
        contentPane.add(btn_pagar);
        btn_pagar.setForeground(Color.WHITE);
        btn_pagar.setFont(new Font("Arial", Font.PLAIN, 20));
        btn_pagar.setBackground(new Color(171, 0, 51));
        btn_pagar.addActionListener(this);

        btn_volver = new JButton("Volver");
        btn_volver.setForeground(Color.WHITE);
        btn_volver.setFont(new Font("Arial", Font.PLAIN, 30));
        btn_volver.setBackground(new Color(171, 0, 51));
        btn_volver.setBounds(10, 526, 149, 64);
        btn_volver.addActionListener(this);

        contentPane.add(btn_volver);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_cancelar){
            VentaDulceria ventaDulceria = new VentaDulceria();
            ventaDulceria.setVisible(true);
            dispose();

        }else if(e.getSource() == btn_pagar){
            JOptionPane.showMessageDialog(null, "pago aceptado");

        }else if(e.getSource() == btn_volver){
            SeleccionDetallesArt seleccionDetallesArt = new SeleccionDetallesArt();
            seleccionDetallesArt.setVisible(true);

        }

    }
    
    private void inicializacion() {
    	
    }
}
