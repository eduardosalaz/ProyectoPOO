package Interfaces;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Informe extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton btn_actDia, btn_inventario, btn_usuarioEsp, btn_volver;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Informe frame = new Informe();
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
    public Informe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 460);
        setSize(960, 640);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().setBackground(new Color(72,81,84));
        getContentPane().setLayout(null);

        JLabel lbl_informe = new JLabel("Informe");
        lbl_informe.setForeground(Color.WHITE);
        lbl_informe.setFont(new Font("Arial", Font.BOLD, 40));
        lbl_informe.setBounds(396, 11, 151, 88);
        getContentPane().add(lbl_informe);

        btn_actDia = new JButton("Actividades del d\u00EDa");
        btn_actDia.setForeground(Color.WHITE);
        btn_actDia.setBackground(new Color(171, 0, 51));
        btn_actDia.setFont(new Font("Arial", Font.PLAIN, 20));
        btn_actDia.setBounds(330, 94, 284, 70);
        btn_actDia.addActionListener(this);
        getContentPane().add(btn_actDia);

        btn_inventario = new JButton("Inventario");
        btn_inventario.setForeground(Color.WHITE);
        btn_inventario.setFont(new Font("Arial", Font.PLAIN, 20));
        btn_inventario.setBackground(new Color(171, 0, 51));
        btn_inventario.setBounds(330, 264, 284, 70);
        btn_inventario.addActionListener(this);
        getContentPane().add(btn_inventario);

        btn_usuarioEsp = new JButton("Usuario en espec\u00EDfico");
        btn_usuarioEsp.setForeground(Color.WHITE);
        btn_usuarioEsp.setFont(new Font("Arial", Font.PLAIN, 20));
        btn_usuarioEsp.setBackground(new Color(171, 0, 51));
        btn_usuarioEsp.setBounds(330, 434, 284, 73);
        btn_usuarioEsp.addActionListener(this);
        getContentPane().add(btn_usuarioEsp);

        btn_volver = new JButton("Volver");
        btn_volver.setFont(new Font("Arial", Font.PLAIN, 20));
        btn_volver.setForeground(Color.WHITE);
        btn_volver.setBackground(new Color(171, 0, 51));
        btn_volver.setBounds(10, 546, 127, 44);
        btn_volver.addActionListener(this);
        getContentPane().add(btn_volver);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_actDia){
            actividadesDia actividadesDia = new actividadesDia();
            actividadesDia.frame.setVisible(true);
            dispose();
        }else if(e.getSource() == btn_inventario){
            Inventario inventario = new Inventario();
            inventario.setVisible(true);
            dispose();
        }else if(e.getSource() == btn_usuarioEsp){
            usuarioEspecifico usuarioEspecifico = new usuarioEspecifico();
            usuarioEspecifico.setVisible(true);
            dispose();
        }else if(e.getSource() == btn_volver){
            menuAdmin menuAdmin = new menuAdmin();
            menuAdmin.frame.setVisible(true);
            dispose();
        }


    }
}
