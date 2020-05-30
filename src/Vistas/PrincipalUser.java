package Vistas;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class PrincipalUser extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PrincipalUser frame = new PrincipalUser();
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
    public PrincipalUser() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 640);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(72,81,84));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbl_titulo = new JLabel("Seleccione el punto de venta a abrir\r\n");
        lbl_titulo.setBackground(Color.CYAN);
        lbl_titulo.setForeground(Color.WHITE);
        lbl_titulo.setFont(new Font("Arial Black", Font.BOLD, 40));
        lbl_titulo.setBounds(36, 119, 872, 130);
        contentPane.add(lbl_titulo);

        JLabel lbl_bienvenida = new JLabel("\u00A1Bienvenido {USER} !");
        lbl_bienvenida.setForeground(Color.WHITE);
        lbl_bienvenida.setFont(new Font("Arial Black", Font.BOLD, 40));
        lbl_bienvenida.setBackground(Color.CYAN);
        lbl_bienvenida.setBounds(224, 11, 496, 130);
        contentPane.add(lbl_bienvenida);

        JButton btn_dulceria = new JButton("Dulcer\u00EDa");
        btn_dulceria.setForeground(Color.WHITE);
        btn_dulceria.setFont(new Font("Arial", Font.PLAIN, 30));
        btn_dulceria.setBounds(549, 260, 359, 130);
        btn_dulceria.setBackground(new Color(171, 0, 51));
        contentPane.add(btn_dulceria);

        JButton btn_taquilla = new JButton("Taquilla de Boletos");
        btn_taquilla.setForeground(Color.WHITE);
        btn_taquilla.setFont(new Font("Arial", Font.PLAIN, 30));
        btn_taquilla.setBounds(36, 260, 359, 130);
        btn_taquilla.setBackground(new Color(171, 0, 51));
        contentPane.add(btn_taquilla);
    }
}