package Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;

public class Inventario extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTable table;
    private JButton btn_volver;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Inventario frame = new Inventario();
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
    public Inventario() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 460);
        setSize(960, 640);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().setBackground(new Color(72,81,84));
        getContentPane().setLayout(null);

        JLabel lbl_inventario = new JLabel("Inventario");
        lbl_inventario.setForeground(Color.WHITE);
        lbl_inventario.setFont(new Font("Arial", Font.BOLD, 40));
        lbl_inventario.setBounds(376, 11, 191, 88);
        getContentPane().add(lbl_inventario);

        btn_volver = new JButton("Volver");
        btn_volver.setForeground(Color.WHITE);
        btn_volver.setFont(new Font("Arial", Font.PLAIN, 20));
        btn_volver.setBackground(new Color(171, 0, 51));
        btn_volver.setBounds(10, 546, 127, 44);
        btn_volver.addActionListener(this);
        getContentPane().add(btn_volver);

        table = new JTable();
        table.setBounds(10, 110, 924, 425);
        getContentPane().add(table);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_volver){
            Informe informe = new Informe();
            informe.setVisible(true);
            dispose();
        }
    }
}
