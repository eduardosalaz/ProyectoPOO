package Vistas;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionarPelicula extends JFrame implements ActionListener {

    private JButton btn_1, btn_2, btn_3;
    private JPanel panel1, panel2, panel3;
    private static final long serialVersionUID = 1L;
    public JLayeredPane layeredPane;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SeleccionarPelicula frame = new SeleccionarPelicula();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public SeleccionarPelicula() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 640);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(72,81,84));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(51, 71, 842, 476);
        layeredPane.setBackground(new Color(46, 48, 48));
        contentPane.add(layeredPane);
        layeredPane.setLayout(new CardLayout(0, 0));

        panel1 = new JPanel();
        layeredPane.add(panel1, "name_16688486857900");
        panel1.setBackground(new Color(46, 48, 48));
        panel1.setLayout(null);

        panel2 = new JPanel();
        layeredPane.add(panel2, "name_19247193436600");
        panel2.setBackground(new Color(46, 48, 48));
        panel2.setLayout(null);

        panel3 = new JPanel();
        layeredPane.add(panel3, "name_16691971147000");
        panel3.setBackground(new Color(46, 48, 48));
        panel3.setLayout(null);

        JLabel lbl_titulo = new JLabel("Funciones disponibles:");
        lbl_titulo.setForeground(Color.WHITE);
        lbl_titulo.setFont(new Font("Arial Black", Font.BOLD, 40));
        lbl_titulo.setBounds(194, 11, 555, 57);
        contentPane.add(lbl_titulo);

        JButton btnNewButton_6_1 = new JButton("Cambiar a Dulcer\u00EDa");
        btnNewButton_6_1.setFont(new Font("Arial Black", Font.BOLD, 12));
        btnNewButton_6_1.setBackground(new Color(171, 0 ,51));
        btnNewButton_6_1.setBounds(10, 558, 175, 32);
        contentPane.add(btnNewButton_6_1);

        JButton btnNewButton_6_1_1 = new JButton("Corte de Boleto");
        btnNewButton_6_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
        btnNewButton_6_1_1.setBackground(new Color(171, 0, 51));
        btnNewButton_6_1_1.setBounds(759, 558, 175, 32);
        contentPane.add(btnNewButton_6_1_1);

        btn_1 = new JButton("Página 1");
        btn_1.setBounds(329, 560, 90, 20);
        btn_1.setBackground(new Color(255,255,255));
        btn_1.addActionListener(this);
        contentPane.add(btn_1);

        btn_2 = new JButton("P\u00E1gina 2");
        btn_2.setBackground(new Color(255,255,255));
        btn_2.setBounds(429, 560, 90, 20);
        btn_2.addActionListener(this);
        contentPane.add(btn_2);

        btn_3 = new JButton("P\u00E1gina 3");
        btn_3.setBackground(new Color(255, 255, 255));
        btn_3.setBounds(529, 560, 90, 20);
        btn_3.addActionListener(this);
        contentPane.add(btn_3);


        //Contenidos Panel1

        JLabel lbl_peli1_img = new JLabel("Imagen Pel\u00EDcula 1");
        lbl_peli1_img.setForeground(Color.BLACK);
        lbl_peli1_img.setBackground(Color.YELLOW);
        lbl_peli1_img.setBounds(10, 11, 100, 100);
        panel1.add(lbl_peli1_img);

        JLabel lbl_peli1_nombre = new JLabel("Nombre Pel\u00EDcula 1");
        lbl_peli1_nombre.setForeground(Color.WHITE);
        lbl_peli1_nombre.setFont(new Font("Arial", Font.BOLD, 22));
        lbl_peli1_nombre.setBounds(120, 11, 212, 32);
        panel1.add(lbl_peli1_nombre);

        JButton btn_peli1_hora1 = new JButton("Horario 1");
        btn_peli1_hora1.setBackground(new Color(171, 0,51));
        btn_peli1_hora1.setBounds(230, 45, 161, 66);
        panel1.add(btn_peli1_hora1);

        JButton btn_peli1_hora2 = new JButton("Horario 2");
        btn_peli1_hora2.setBackground(new Color(171, 50, 51));
        btn_peli1_hora2.setBounds(390, 45, 161, 66);
        panel1.add(btn_peli1_hora2);

        JButton btn_peli1_hora3 = new JButton("Horario 3");
        btn_peli1_hora3.setBackground(new Color(171, 0,51));
        btn_peli1_hora3.setBounds(550, 45, 152, 66);
        panel1.add(btn_peli1_hora3);

        JLabel lbl_peli1_horarios = new JLabel("Horarios:");
        lbl_peli1_horarios.setForeground(new Color(171, 50, 51));
        lbl_peli1_horarios.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_peli1_horarios.setBounds(120, 64, 101, 23);
        panel1.add(lbl_peli1_horarios);

        JLabel lbl_peli2_img = new JLabel("Imagen Pel\u00EDcula 2");
        lbl_peli2_img.setForeground(Color.BLACK);
        lbl_peli2_img.setBackground(Color.YELLOW);
        lbl_peli2_img.setBounds(10, 137, 100, 100);
        panel1.add(lbl_peli2_img);

        JLabel lbl_peli2_nombre = new JLabel("Nombre Pel\u00EDcula 2");
        lbl_peli2_nombre.setForeground(Color.WHITE);
        lbl_peli2_nombre.setFont(new Font("Arial", Font.BOLD, 22));
        lbl_peli2_nombre.setBounds(120, 137, 212, 32);
        panel1.add(lbl_peli2_nombre);

        JButton btn_peli2_hora1 = new JButton("Horario 1");
        btn_peli2_hora1.setBackground(new Color(171, 0,51));
        btn_peli2_hora1.setBounds(230, 171, 161, 66);
        panel1.add(btn_peli2_hora1);

        JButton btn_peli2_hora2 = new JButton("Horario 2");
        btn_peli2_hora2.setBackground(new Color(171, 50, 51));
        btn_peli2_hora2.setBounds(390, 171, 161, 66);
        panel1.add(btn_peli2_hora2);

        JButton btn_peli2_hora3 = new JButton("Horario 3");
        btn_peli2_hora3.setBackground(new Color(171, 0,51));
        btn_peli2_hora3.setBounds(550, 171, 152, 66);
        panel1.add(btn_peli2_hora3);

        JLabel lbl_peli2_horarios = new JLabel("Horarios:");
        lbl_peli2_horarios.setForeground(new Color(171, 50, 51));
        lbl_peli2_horarios.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_peli2_horarios.setBounds(120, 190, 101, 23);
        panel1.add(lbl_peli2_horarios);

        JLabel lbl_peli3_img = new JLabel("Imagen Pel\u00EDcula 3");
        lbl_peli3_img.setForeground(Color.BLACK);
        lbl_peli3_img.setBackground(Color.YELLOW);
        lbl_peli3_img.setBounds(10, 266, 100, 100);
        panel1.add(lbl_peli3_img);

        JLabel lbl_peli3_nombre = new JLabel("Nombre Pel\u00EDcula 3");
        lbl_peli3_nombre.setForeground(Color.WHITE);
        lbl_peli3_nombre.setFont(new Font("Arial", Font.BOLD, 22));
        lbl_peli3_nombre.setBounds(120, 266, 212, 32);
        panel1.add(lbl_peli3_nombre);

        JButton btn_peli3_hora1 = new JButton("Horario 1");
        btn_peli3_hora1.setBackground(new Color(171, 0,51));
        btn_peli3_hora1.setBounds(230, 300, 161, 66);
        panel1.add(btn_peli3_hora1);

        JButton btn_peli3_hora2 = new JButton("Horario 2");
        btn_peli3_hora2.setBackground(new Color(171, 50, 51));
        btn_peli3_hora2.setBounds(390, 300, 161, 66);
        panel1.add(btn_peli3_hora2);

        JButton btn_peli3_hora3 = new JButton("Horario 3");
        btn_peli3_hora3.setBackground(new Color(171, 0,51));
        btn_peli3_hora3.setBounds(550, 300, 152, 66);
        panel1.add(btn_peli3_hora3);

        JLabel lbl_peli3_horarios = new JLabel("Horarios:");
        lbl_peli3_horarios.setForeground(new Color(171, 50, 51));
        lbl_peli3_horarios.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_peli3_horarios.setBounds(120, 319, 101, 23);
        panel1.add(lbl_peli3_horarios);

        //Contenidos Panel2

        JLabel lbl_peli4_img = new JLabel("Imagen Pel\u00EDcula 4");
        lbl_peli4_img.setForeground(Color.BLACK);
        lbl_peli4_img.setBackground(Color.YELLOW);
        lbl_peli4_img.setBounds(10, 11, 100, 100);
        panel2.add(lbl_peli4_img);

        JLabel lbl_peli4_nombre = new JLabel("Nombre Pel\u00EDcula 4");
        lbl_peli4_nombre.setForeground(Color.WHITE);
        lbl_peli4_nombre.setFont(new Font("Arial", Font.BOLD, 22));
        lbl_peli4_nombre.setBounds(120, 11, 212, 32);
        panel2.add(lbl_peli4_nombre);

        JButton btn_peli4_hora1 = new JButton("Horario 1");
        btn_peli4_hora1.setBackground(new Color(171, 0,51));
        btn_peli4_hora1.setBounds(230, 45, 161, 66);
        panel2.add(btn_peli4_hora1);

        JButton btn_peli4_hora2 = new JButton("Horario 2");
        btn_peli4_hora2.setBackground(new Color(171, 50, 51));
        btn_peli4_hora2.setBounds(390, 45, 161, 66);
        panel2.add(btn_peli4_hora2);

        JButton btn_peli4_hora3 = new JButton("Horario 3");
        btn_peli4_hora3.setBackground(new Color(171, 0,51));
        btn_peli4_hora3.setBounds(550, 45, 152, 66);
        panel2.add(btn_peli4_hora3);

        JLabel lbl_peli4_horarios = new JLabel("Horarios:");
        lbl_peli4_horarios.setForeground(new Color(171, 50, 51));
        lbl_peli4_horarios.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_peli4_horarios.setBounds(120, 64, 101, 23);
        panel2.add(lbl_peli4_horarios);

        JLabel lbl_peli5_img = new JLabel("Imagen Pel\u00EDcula 5");
        lbl_peli5_img.setForeground(Color.BLACK);
        lbl_peli5_img.setBackground(Color.YELLOW);
        lbl_peli5_img.setBounds(10, 137, 100, 100);
        panel2.add(lbl_peli5_img);

        JLabel lbl_peli5_nombre = new JLabel("Nombre Pel\u00EDcula 5");
        lbl_peli5_nombre.setForeground(Color.WHITE);
        lbl_peli5_nombre.setFont(new Font("Arial", Font.BOLD, 22));
        lbl_peli5_nombre.setBounds(120, 137, 212, 32);
        panel2.add(lbl_peli5_nombre);

        JButton btn_peli5_hora1 = new JButton("Horario 1");
        btn_peli5_hora1.setBackground(new Color(171, 0,51));
        btn_peli5_hora1.setBounds(230, 171, 161, 66);
        panel2.add(btn_peli5_hora1);

        JButton btn_peli5_hora2 = new JButton("Horario 2");
        btn_peli5_hora2.setBackground(new Color(171, 50, 51));
        btn_peli5_hora2.setBounds(390, 171, 161, 66);
        panel2.add(btn_peli5_hora2);

        JButton btn_peli5_hora3 = new JButton("Horario 3");
        btn_peli5_hora3.setBackground(new Color(171, 0,51));
        btn_peli5_hora3.setBounds(550, 171, 152, 66);
        panel2.add(btn_peli5_hora3);

        JLabel lbl_peli5_horarios = new JLabel("Horarios:");
        lbl_peli5_horarios.setForeground(new Color(171, 50, 51));
        lbl_peli5_horarios.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_peli5_horarios.setBounds(120, 190, 101, 23);
        panel2.add(lbl_peli5_horarios);

        JLabel lbl_peli6_img = new JLabel("Imagen Pel\u00EDcula 6");
        lbl_peli6_img.setForeground(Color.BLACK);
        lbl_peli6_img.setBackground(Color.YELLOW);
        lbl_peli6_img.setBounds(10, 266, 100, 100);
        panel2.add(lbl_peli6_img);

        JLabel lbl_peli6_nombre = new JLabel("Nombre Pel\u00EDcula 6");
        lbl_peli6_nombre.setForeground(Color.WHITE);
        lbl_peli6_nombre.setFont(new Font("Arial", Font.BOLD, 22));
        lbl_peli6_nombre.setBounds(120, 266, 212, 32);
        panel2.add(lbl_peli6_nombre);

        JButton btn_peli6_hora1 = new JButton("Horario 1");
        btn_peli6_hora1.setBackground(new Color(171, 0,51));
        btn_peli6_hora1.setBounds(230, 300, 161, 66);
        panel2.add(btn_peli6_hora1);

        JButton btn_peli6_hora2 = new JButton("Horario 2");
        btn_peli6_hora2.setBackground(new Color(171, 50, 51));
        btn_peli6_hora2.setBounds(390, 300, 161, 66);
        panel2.add(btn_peli6_hora2);

        JButton btn_peli6_hora3 = new JButton("Horario 3");
        btn_peli6_hora3.setBackground(new Color(171, 0,51));
        btn_peli6_hora3.setBounds(550, 300, 152, 66);
        panel2.add(btn_peli6_hora3);

        JLabel lbl_peli6_horarios = new JLabel("Horarios:");
        lbl_peli6_horarios.setForeground(new Color(171, 50, 51));
        lbl_peli6_horarios.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_peli6_horarios.setBounds(120, 319, 101, 23);
        panel2.add(lbl_peli6_horarios);

        //Contenido Panel 3

        JLabel lbl_peli7_img = new JLabel("Imagen Pel\u00EDcula 7");
        lbl_peli7_img.setForeground(Color.BLACK);
        lbl_peli7_img.setBackground(Color.YELLOW);
        lbl_peli7_img.setBounds(10, 11, 100, 100);
        panel3.add(lbl_peli7_img);

        JLabel lbl_peli7_nombre = new JLabel("Nombre Pel\u00EDcula 7");
        lbl_peli7_nombre.setForeground(Color.WHITE);
        lbl_peli7_nombre.setFont(new Font("Arial", Font.BOLD, 22));
        lbl_peli7_nombre.setBounds(120, 11, 212, 32);
        panel3.add(lbl_peli7_nombre);

        JButton btn_peli7_hora1 = new JButton("Horario 1");
        btn_peli7_hora1.setBackground(new Color(171, 0,51));
        btn_peli7_hora1.setBounds(230, 45, 161, 66);
        panel3.add(btn_peli7_hora1);

        JButton btn_peli7_hora2 = new JButton("Horario 2");
        btn_peli7_hora2.setBackground(new Color(171, 50, 51));
        btn_peli7_hora2.setBounds(390, 45, 161, 66);
        panel3.add(btn_peli7_hora2);

        JButton btn_peli7_hora3 = new JButton("Horario 3");
        btn_peli7_hora3.setBackground(new Color(171, 0,51));
        btn_peli7_hora3.setBounds(550, 45, 152, 66);
        panel3.add(btn_peli7_hora3);

        JLabel lbl_peli7_horarios = new JLabel("Horarios:");
        lbl_peli7_horarios.setForeground(new Color(171, 50, 51));
        lbl_peli7_horarios.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_peli7_horarios.setBounds(120, 64, 101, 23);
        panel3.add(lbl_peli7_horarios);

        JLabel lbl_peli8_img = new JLabel("Imagen Pel\u00EDcula 8");
        lbl_peli8_img.setForeground(Color.BLACK);
        lbl_peli8_img.setBackground(Color.YELLOW);
        lbl_peli8_img.setBounds(10, 137, 100, 100);
        panel3.add(lbl_peli8_img);

        JLabel lbl_peli8_nombre = new JLabel("Nombre Pel\u00EDcula 8");
        lbl_peli8_nombre.setForeground(Color.WHITE);
        lbl_peli8_nombre.setFont(new Font("Arial", Font.BOLD, 22));
        lbl_peli8_nombre.setBounds(120, 137, 212, 32);
        panel3.add(lbl_peli8_nombre);

        JButton btn_peli8_hora1= new JButton("Horario 1");
        btn_peli8_hora1.setBackground(new Color(171, 0,51));
        btn_peli8_hora1.setBounds(230, 171, 161, 66);
        panel3.add(btn_peli8_hora1);

        JButton btn_peli8_hora2 = new JButton("Horario 2");
        btn_peli8_hora2.setBackground(new Color(171, 50, 51));
        btn_peli8_hora2.setBounds(390, 171, 161, 66);
        panel3.add(btn_peli8_hora2);

        JButton btn_peli8_hora3 = new JButton("Horario 3");
        btn_peli8_hora3.setBackground(new Color(171, 0,51));
        btn_peli8_hora3.setBounds(550, 171, 152, 66);
        panel3.add(btn_peli8_hora3);

        JLabel lbl_peli8_horarios = new JLabel("Horarios:");
        lbl_peli8_horarios.setForeground(new Color(171, 50, 51));
        lbl_peli8_horarios.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_peli8_horarios.setBounds(120, 190, 101, 23);
        panel3.add(lbl_peli8_horarios);

        JLabel lbl_peli9_img = new JLabel("Imagen Pel\u00EDcula 9");
        lbl_peli9_img.setForeground(Color.BLACK);
        lbl_peli9_img.setBackground(Color.YELLOW);
        lbl_peli9_img.setBounds(10, 266, 100, 100);
        panel3.add(lbl_peli9_img);

        JLabel lbl_peli9_nombre = new JLabel("Nombre Pel\u00EDcula 9");
        lbl_peli9_nombre.setForeground(Color.WHITE);
        lbl_peli9_nombre.setFont(new Font("Arial", Font.BOLD, 22));
        lbl_peli9_nombre.setBounds(120, 266, 212, 32);
        panel3.add(lbl_peli9_nombre);

        JButton btn_peli9_hora1 = new JButton("Horario 1");
        btn_peli9_hora1.setBackground(new Color(171, 0,51));
        btn_peli9_hora1.setBounds(230, 300, 161, 66);
        panel3.add(btn_peli9_hora1);

        JButton btn_peli9_hora2 = new JButton("Horario 2");
        btn_peli9_hora2.setBackground(new Color(171, 50, 51));
        btn_peli9_hora2.setBounds(390, 300, 161, 66);
        panel3.add(btn_peli9_hora2);

        JButton btn_peli9_hora3 = new JButton("Horario 3");
        btn_peli9_hora3.setBackground(new Color(171, 0,51));
        btn_peli9_hora3.setBounds(550, 300, 152, 66);
        panel3.add(btn_peli9_hora3);

        JLabel lbl_peli9_horarios = new JLabel("Horarios:");
        lbl_peli9_horarios.setForeground(new Color(171, 50, 51));
        lbl_peli9_horarios.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_peli9_horarios.setBounds(120, 319, 101, 23);
        panel3.add(lbl_peli9_horarios);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_1){
            System.out.println("very gud");
            switchPane(panel1);
        }else if(e.getSource() == btn_2){
            switchPane(panel2);
            System.out.println("amazing");
        }else if(e.getSource() == btn_3){
            switchPane(panel3);
            System.out.println("good nice i see");
        }
    }

    public void switchPane(JPanel panel){
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }
}