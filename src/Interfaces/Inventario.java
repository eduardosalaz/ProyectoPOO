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
    public JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Inventario window = new Inventario();
                    window.frame.setVisible(true);
                    
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
    	frame = new JFrame();
		frame.setBounds(100, 100, 960, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(960,640);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(72,81,84));

        JLabel lbl_inventario = new JLabel("Inventario");
        lbl_inventario.setForeground(Color.WHITE);
        lbl_inventario.setFont(new Font("Arial", Font.BOLD, 40));
        lbl_inventario.setBounds(376, 11, 191, 88);
        frame.getContentPane().add(lbl_inventario);

        btn_volver = new JButton("Volver");
        btn_volver.setForeground(Color.WHITE);
        btn_volver.setFont(new Font("Arial", Font.PLAIN, 20));
        btn_volver.setFocusPainted(false);
        btn_volver.setBorderPainted(false);
        btn_volver.setBackground(new Color(171, 0, 51));
        btn_volver.setBounds(10, 562, 139, 31);
		frame.getContentPane().add(btn_volver);
		btn_volver.addActionListener(this);

        table = new JTable();
        table.setBounds(10, 110, 924, 425);
        frame.getContentPane().add(table);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_volver){
            Informe informe = new Informe();
            informe.frame.setVisible(true);
            frame.dispose();
        }
    }
}

