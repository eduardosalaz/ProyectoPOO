package Vistas;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class SeleccionarAsiento extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private String[] categorias = new String[] {"Niño", "Adulto", "VIP"};
    JButton btn_agregarAsiento, btn_volver, btn_continuar;
    private SpinnerListModel lista = new SpinnerListModel(categorias);
    private JButton btn_A1, btn_A2, btn_A3, btn_A4, btn_A5, btn_A6, btn_A7, btn_A8, btn_A9, btn_A10;
    private JButton btn_B1, btn_B2, btn_B3, btn_B4, btn_B5, btn_B6, btn_B7, btn_B8, btn_B9, btn_B10;
    private JButton btn_C1, btn_C2, btn_C3, btn_C4, btn_C5, btn_C6, btn_C7, btn_C8, btn_C9, btn_C10;
    private JButton btn_D1, btn_D2, btn_D3, btn_D4, btn_D5, btn_D6, btn_D7, btn_D8, btn_D9, btn_D10;
    private JButton btn_E1, btn_E2, btn_E3, btn_E4, btn_E5, btn_E6, btn_E7, btn_E8, btn_E9, btn_E10;
    private JButton btn_F1, btn_F2, btn_F3, btn_F4, btn_F5, btn_F6, btn_F7, btn_F8, btn_F9, btn_F10;
    private JButton btn_G1, btn_G2, btn_G3, btn_G4, btn_G5, btn_G6, btn_G7, btn_G8, btn_G9, btn_G10;
    private JButton btn_H1, btn_H2, btn_H3, btn_H4, btn_H5, btn_H6, btn_H7, btn_H8, btn_H9, btn_H10;
    private JButton btn_J1, btn_J2, btn_J3, btn_J4, btn_J5, btn_J6, btn_J7, btn_J8, btn_J9, btn_J10;
    private JButton btn_K1, btn_K2, btn_K3, btn_K4, btn_K5, btn_K6, btn_K7, btn_K8, btn_K9, btn_K10;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SeleccionarAsiento frame = new SeleccionarAsiento();
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
    public SeleccionarAsiento() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 640);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(72,81,84));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Tipo de asiento:");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblNewLabel.setBounds(246, 11, 223, 43);
        contentPane.add(lblNewLabel);

        JSpinner spinner = new JSpinner();
        spinner.setForeground(Color.WHITE);
        spinner.setBackground(new Color(171, 0, 51));
        spinner.setModel(lista);
        spinner.setBounds(439, 15, 223, 43);
        JTextField ftf = getTextField(spinner);
        if (ftf != null ) {
            ftf.setColumns(8);
            ftf.setHorizontalAlignment(JTextField.RIGHT);
            ftf.setEditable(false);
            ftf.setBackground(new Color(171, 0, 51));
            ftf.setForeground(new Color(255, 255, 255));
        }

        contentPane.add(spinner);

        JLabel lbl_asiento = new JLabel("Asiento:");
        lbl_asiento.setForeground(new Color(46, 48, 48));
        lbl_asiento.setBackground(new Color(46, 48, 48));
        lbl_asiento.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_asiento.setBounds(10, 60, 76, 43);
        contentPane.add(lbl_asiento);

        JLabel lbl_numAsiento = new JLabel("NumAsiento");
        lbl_numAsiento.setForeground(new Color(46, 48, 48));
        lbl_numAsiento.setBackground(new Color(46, 48, 48));
        lbl_numAsiento.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_numAsiento.setBounds(96, 60, 76, 43);
        contentPane.add(lbl_numAsiento);

        JLabel lbl_precio_txt = new JLabel("Precio:");
        lbl_precio_txt.setForeground(new Color(46, 48, 48));
        lbl_precio_txt.setBackground(new Color(46, 48, 48));
        lbl_precio_txt.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_precio_txt.setBounds(814, 60, 76, 43);
        contentPane.add(lbl_precio_txt);

        JLabel lbl_precio_dinero = new JLabel("$$$");
        lbl_precio_dinero.setForeground(new Color(46, 48, 48));
        lbl_precio_dinero.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_precio_dinero.setBounds(896, 60, 38, 43);
        contentPane.add(lbl_precio_dinero);

        btn_agregarAsiento = new JButton("Agregar Asiento");
        btn_agregarAsiento.setForeground(Color.WHITE);
        btn_agregarAsiento.setFont(new Font("Arial Black", Font.BOLD, 18));
        btn_agregarAsiento.setBackground(new Color(171, 0, 51));
        btn_agregarAsiento.setBounds(368, 73, 207, 35);
        contentPane.add(btn_agregarAsiento);

        btn_volver = new JButton("Volver");
        btn_volver.setForeground(Color.WHITE);
        btn_volver.setFont(new Font("Arial", Font.BOLD, 14));
        btn_volver.setBackground(new Color(171, 0, 51));
        btn_volver.setBounds(10, 567, 120, 23);
        contentPane.add(btn_volver);

        btn_continuar = new JButton("Continuar");
        btn_continuar.setForeground(Color.WHITE);
        btn_continuar.setFont(new Font("Arial", Font.BOLD, 14));
        btn_continuar.setBackground(new Color(171, 0, 51));
        btn_continuar.setBounds(814, 567, 120, 23);
        contentPane.add(btn_continuar);

        JPanel panel = new JPanel();
        panel.setBorder(null);
        panel.setBackground(SystemColor.inactiveCaption);
        panel.setBounds(75, 121, 794, 431);
        contentPane.add(panel);
        panel.setLayout(null);


        JLabel lbl_filaA = new JLabel("A");
        lbl_filaA.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_filaA.setBounds(10, 378, 22, 30);
        panel.add(lbl_filaA);

        JLabel lbl_filaB = new JLabel("B");
        lbl_filaB.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_filaB.setBounds(10, 337, 22, 30);
        panel.add(lbl_filaB);

        JLabel lbl_filaC = new JLabel("C");
        lbl_filaC.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_filaC.setBounds(10, 296, 22, 30);
        panel.add(lbl_filaC);

        JLabel lbl_filaD = new JLabel("D");
        lbl_filaD.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_filaD.setBounds(10, 255, 22, 30);
        panel.add(lbl_filaD);

        JLabel lbl_filaE = new JLabel("E");
        lbl_filaE.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_filaE.setBounds(10, 214, 22, 30);
        panel.add(lbl_filaE);

        JLabel lbl_filaF = new JLabel("F");
        lbl_filaF.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_filaF.setBounds(10, 173, 22, 30);
        panel.add(lbl_filaF);

        JLabel lbl_filaG = new JLabel("G");
        lbl_filaG.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_filaG.setBounds(10, 132, 22, 30);
        panel.add(lbl_filaG);

        JLabel lbl_filaH = new JLabel("H");
        lbl_filaH.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_filaH.setBounds(10, 91, 22, 30);
        panel.add(lbl_filaH);

        JLabel lbl_filaJ = new JLabel("J");
        lbl_filaJ.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_filaJ.setBounds(10, 50, 22, 30);
        panel.add(lbl_filaJ);

        JLabel lbl_filaK = new JLabel("K");
        lbl_filaK.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_filaK.setBounds(10, 11, 22, 30);
        panel.add(lbl_filaK);

        JButton pantalla = new JButton();
        pantalla.setEnabled(false);
        pantalla.setForeground(Color.BLACK);
        pantalla.setBackground(Color.BLACK);
        pantalla.setBounds(137, 421, 500, 9);
        panel.add(pantalla);

        JLabel lbl_col5 = new JLabel("5");
        lbl_col5.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_col5.setBounds(347, 400, 10, 30);
        panel.add(lbl_col5);

        JLabel lbl_col6 = new JLabel("6");
        lbl_col6.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_col6.setBounds(397, 400, 10, 30);
        panel.add(lbl_col6);

        JLabel lbl_col7 = new JLabel("7");
        lbl_col7.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_col7.setBounds(447, 400, 10, 30);
        panel.add(lbl_col7);

        JLabel lbl_col8 = new JLabel("8");
        lbl_col8.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_col8.setBounds(497, 400, 10, 30);
        panel.add(lbl_col8);

        JLabel lbl_col9 = new JLabel("9");
        lbl_col9.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_col9.setBounds(547, 400, 10, 30);
        panel.add(lbl_col9);

        JLabel lbl_col10 = new JLabel("10");
        lbl_col10.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_col10.setBounds(600, 400, 20, 30);
        panel.add(lbl_col10);

        JLabel lbl_col4 = new JLabel("4");
        lbl_col4.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_col4.setBounds(297, 400, 10, 30);
        panel.add(lbl_col4);

        JLabel lbl_col3 = new JLabel("3");
        lbl_col3.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_col3.setBounds(247, 400, 10, 30);
        panel.add(lbl_col3);

        JLabel lbl_col2 = new JLabel("2");
        lbl_col2.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_col2.setBounds(197, 400, 10, 30);
        panel.add(lbl_col2);

        JLabel lbl_col1 = new JLabel("1");
        lbl_col1.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl_col1.setBounds(147, 400, 10, 30);
        panel.add(lbl_col1);

        //FILA A

        btn_A1 = new JButton();
        btn_A1.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_A1.setBounds(137, 385, 20, 23);
        btn_A1.setBorder(BorderFactory.createEmptyBorder());
        panel.add(btn_A1);

        btn_A2 = new JButton();
        btn_A2.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_A2.setBorder(BorderFactory.createEmptyBorder());
        btn_A2.setBounds(187, 383, 20, 23);
        panel.add(btn_A2);

        btn_A3 = new JButton();
        btn_A3.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_A3.setBorder(BorderFactory.createEmptyBorder());
        btn_A3.setBounds(237, 383, 20, 23);
        panel.add(btn_A3);

        btn_A4 = new JButton();
        btn_A4.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_A4.setBorder(BorderFactory.createEmptyBorder());
        btn_A4.setBounds(287, 383, 20, 23);
        panel.add(btn_A4);

        btn_A5 = new JButton();
        btn_A5.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_A5.setBorder(BorderFactory.createEmptyBorder());
        btn_A5.setBounds(337, 383, 20, 23);
        panel.add(btn_A5);

        btn_A6 = new JButton();
        btn_A6.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_A6.setBorder(BorderFactory.createEmptyBorder());
        btn_A6.setBounds(387, 383, 20, 23);
        panel.add(btn_A6);

        btn_A7 = new JButton();
        btn_A7.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_A7.setBorder(BorderFactory.createEmptyBorder());
        btn_A7.setBounds(437, 383, 20, 23);
        panel.add(btn_A7);

        btn_A8 = new JButton();
        btn_A8.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_A8.setBorder(BorderFactory.createEmptyBorder());
        btn_A8.setBounds(487, 383, 20, 23);
        panel.add(btn_A8);

        btn_A9 = new JButton();
        btn_A9.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_A9.setBorder(BorderFactory.createEmptyBorder());
        btn_A9.setBounds(537, 383, 20, 23);
        panel.add(btn_A9);

        btn_A10 = new JButton();
        btn_A10.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_A10.setBorder(BorderFactory.createEmptyBorder());
        btn_A10.setBounds(600, 383, 20, 23);
        panel.add(btn_A10);

        //FILA B

        btn_B1 = new JButton();
        btn_B1.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_B1.setBorder(BorderFactory.createEmptyBorder());
        btn_B1.setBounds(137, 342, 20, 23);
        panel.add(btn_B1);

        btn_B2 = new JButton();
        btn_B2.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_B2.setBorder(BorderFactory.createEmptyBorder());
        btn_B2.setBounds(187, 342, 20, 23);
        panel.add(btn_B2);

        btn_B3 = new JButton();
        btn_B3.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_B3.setBorder(BorderFactory.createEmptyBorder());
        btn_B3.setBounds(237, 342, 20, 23);
        panel.add(btn_B3);

        btn_B4 = new JButton();
        btn_B4.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_B4.setBorder(BorderFactory.createEmptyBorder());
        btn_B4.setBounds(287, 342, 20, 23);
        panel.add(btn_B4);

        btn_B5 = new JButton();
        btn_B5.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_B5.setBorder(BorderFactory.createEmptyBorder());
        btn_B5.setBounds(337, 342, 20, 23);
        panel.add(btn_B5);

        btn_B6 = new JButton();
        btn_B6.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_B6.setBorder(BorderFactory.createEmptyBorder());
        btn_B6.setBounds(387, 342, 20, 23);
        panel.add(btn_B6);

        btn_B7 = new JButton();
        btn_B7.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_B7.setBorder(BorderFactory.createEmptyBorder());
        btn_B7.setBounds(437, 342, 20, 23);
        panel.add(btn_B7);

        btn_B8 = new JButton();
        btn_B8.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_B8.setBorder(BorderFactory.createEmptyBorder());
        btn_B8.setBounds(487, 342, 20, 23);
        panel.add(btn_B8);

        btn_B9 = new JButton();
        btn_B9.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_B9.setBorder(BorderFactory.createEmptyBorder());
        btn_B9.setBounds(537, 342, 20, 23);
        panel.add(btn_B9);

        btn_B10 = new JButton();
        btn_B10.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_B10.setBorder(BorderFactory.createEmptyBorder());
        btn_B10.setBounds(600, 342, 20, 23);
        panel.add(btn_B10);

        //FILA C

        btn_C1 = new JButton();
        btn_C1.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_C1.setBorder(BorderFactory.createEmptyBorder());
        btn_C1.setBounds(137, 301, 20, 23);
        panel.add(btn_C1);

        btn_C2 = new JButton();
        btn_C2.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_C2.setBorder(BorderFactory.createEmptyBorder());
        btn_C2.setBounds(187, 301, 20, 23);
        panel.add(btn_C2);

        btn_C3 = new JButton();
        btn_C3.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_C3.setBorder(BorderFactory.createEmptyBorder());
        btn_C3.setBounds(237, 301, 20, 23);
        panel.add(btn_C3);

        btn_C4 = new JButton();
        btn_C4.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_C4.setBorder(BorderFactory.createEmptyBorder());
        btn_C4.setBounds(287, 301, 20, 23);
        panel.add(btn_C4);

        btn_C5 = new JButton();
        btn_C5.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_C5.setBorder(BorderFactory.createEmptyBorder());
        btn_C5.setBounds(337, 301, 20, 23);
        panel.add(btn_C5);

        btn_C6 = new JButton();
        btn_C6.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_C6.setBorder(BorderFactory.createEmptyBorder());
        btn_C6.setBounds(387, 301, 20, 23);
        panel.add(btn_C6);

        btn_C7 = new JButton();
        btn_C7.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_C7.setBorder(BorderFactory.createEmptyBorder());
        btn_C7.setBounds(437, 301, 20, 23);
        panel.add(btn_C7);

        btn_C8 = new JButton();
        btn_C8.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_C8.setBorder(BorderFactory.createEmptyBorder());
        btn_C8.setBounds(487, 301, 20, 23);
        panel.add(btn_C8);

        btn_C9 = new JButton();
        btn_C9.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_C9.setBorder(BorderFactory.createEmptyBorder());
        btn_C9.setBounds(537, 301, 20, 23);
        panel.add(btn_C9);

        btn_C10 = new JButton();
        btn_C10.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_C10.setBorder(BorderFactory.createEmptyBorder());
        btn_C10.setBounds(600, 301, 20, 23);
        panel.add(btn_C10);

        //FILA D

        btn_D1 = new JButton();
        btn_D1.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_D1.setBorder(BorderFactory.createEmptyBorder());
        btn_D1.setBounds(137, 260, 20, 23);
        panel.add(btn_D1);

        btn_D2 = new JButton();
        btn_D2.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_D2.setBorder(BorderFactory.createEmptyBorder());
        btn_D2.setBounds(187, 260, 20, 23);
        panel.add(btn_D2);

        btn_D3 = new JButton();
        btn_D3.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_D3.setBorder(BorderFactory.createEmptyBorder());
        btn_D3.setBounds(237, 260, 20, 23);
        panel.add(btn_D3);

        btn_D4 = new JButton();
        btn_D4.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_D4.setBorder(BorderFactory.createEmptyBorder());
        btn_D4.setBounds(287, 260, 20, 23);
        panel.add(btn_D4);

        btn_D5 = new JButton();
        btn_D5.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_D5.setBorder(BorderFactory.createEmptyBorder());
        btn_D5.setBounds(337, 260, 20, 23);
        panel.add(btn_D5);

        btn_D6 = new JButton();
        btn_D6.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_D6.setBorder(BorderFactory.createEmptyBorder());
        btn_D6.setBounds(387, 260, 20, 23);
        panel.add(btn_D6);

        btn_D7 = new JButton();
        btn_D7.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_D7.setBorder(BorderFactory.createEmptyBorder());
        btn_D7.setBounds(437, 260, 20, 23);
        panel.add(btn_D7);

        btn_D8 = new JButton();
        btn_D8.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_D8.setBorder(BorderFactory.createEmptyBorder());
        btn_D8.setBounds(487, 260, 20, 23);
        panel.add(btn_D8);

        btn_D9 = new JButton();
        btn_D9.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_D9.setBorder(BorderFactory.createEmptyBorder());
        btn_D9.setBounds(537, 260, 20, 23);
        panel.add(btn_D9);

        btn_D10 = new JButton();
        btn_D10.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_D10.setBorder(BorderFactory.createEmptyBorder());
        btn_D10.setBounds(600, 260, 20, 23);
        panel.add(btn_D10);

        //FILA E

        btn_E1 = new JButton("");
        btn_E1.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_E1.setBorder(BorderFactory.createEmptyBorder());
        btn_E1.setBounds(137, 219, 20, 23);
        panel.add(btn_E1);

        btn_E2 = new JButton("");
        btn_E2.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_E2.setBorder(BorderFactory.createEmptyBorder());
        btn_E2.setBounds(187, 219, 20, 23);
        panel.add(btn_E2);

        btn_E3 = new JButton("");
        btn_E3.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_E3.setBorder(BorderFactory.createEmptyBorder());
        btn_E3.setBounds(237, 219, 20, 23);
        panel.add(btn_E3);

        btn_E4 = new JButton("");
        btn_E4.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_E4.setBorder(BorderFactory.createEmptyBorder());
        btn_E4.setBounds(287, 219, 20, 23);
        panel.add(btn_E4);

        btn_E5 = new JButton("");
        btn_E5.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_E5.setBorder(BorderFactory.createEmptyBorder());
        btn_E5.setBounds(337, 219, 20, 23);
        panel.add(btn_E5);

        btn_E6 = new JButton("");
        btn_E6.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_E6.setBorder(BorderFactory.createEmptyBorder());
        btn_E6.setBounds(387, 219, 20, 23);
        panel.add(btn_E6);

        btn_E7 = new JButton("");
        btn_E7.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_E7.setBorder(BorderFactory.createEmptyBorder());
        btn_E7.setBounds(437, 219, 20, 23);
        panel.add(btn_E7);

        btn_E8 = new JButton("");
        btn_E8.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_E8.setBorder(BorderFactory.createEmptyBorder());
        btn_E8.setBounds(487, 219, 20, 23);
        panel.add(btn_E8);

        btn_E9 = new JButton("");
        btn_E9.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_E9.setBorder(BorderFactory.createEmptyBorder());
        btn_E9.setBounds(537, 219, 20, 23);
        panel.add(btn_E9);

        btn_E10 = new JButton("");
        btn_E10.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_E10.setBorder(BorderFactory.createEmptyBorder());
        btn_E10.setBounds(600, 219, 20, 23);
        panel.add(btn_E10);

        //FILA F

        btn_F1 = new JButton("");
        btn_F1.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_F1.setBorder(BorderFactory.createEmptyBorder());
        btn_F1.setBounds(137, 178, 20, 23);
        panel.add(btn_F1);

        btn_F2 = new JButton("");
        btn_F2.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_F2.setBorder(BorderFactory.createEmptyBorder());
        btn_F2.setBounds(187, 178, 20, 23);
        panel.add(btn_F2);

        btn_F3 = new JButton("");
        btn_F3.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_F3.setBorder(BorderFactory.createEmptyBorder());
        btn_F3.setBounds(237, 178, 20, 23);
        panel.add(btn_F3);

        btn_F4 = new JButton("");
        btn_F4.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_F4.setBorder(BorderFactory.createEmptyBorder());
        btn_F4.setBounds(287, 178, 20, 23);
        panel.add(btn_F4);

        btn_F5 = new JButton("");
        btn_F5.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_F5.setBorder(BorderFactory.createEmptyBorder());
        btn_F5.setBounds(337, 178, 20, 23);
        panel.add(btn_F5);

        btn_F6 = new JButton("");
        btn_F6.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_F6.setBorder(BorderFactory.createEmptyBorder());
        btn_F6.setBounds(387, 178, 20, 23);
        panel.add(btn_F6);

        btn_F7 = new JButton("");
        btn_F7.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_F7.setBorder(BorderFactory.createEmptyBorder());
        btn_F7.setBounds(437, 178, 20, 23);
        panel.add(btn_F7);

        btn_F8 = new JButton("");
        btn_F8.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_F8.setBorder(BorderFactory.createEmptyBorder());
        btn_F8.setBounds(487, 178, 20, 23);
        panel.add(btn_F8);

        btn_F9 = new JButton("");
        btn_F9.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_F9.setBorder(BorderFactory.createEmptyBorder());
        btn_F9.setBounds(537, 178, 20, 23);
        panel.add(btn_F9);

        btn_F10 = new JButton("");
        btn_F10.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_F10.setBorder(BorderFactory.createEmptyBorder());
        btn_F10.setBounds(600, 178, 20, 23);
        panel.add(btn_F10);

        //FILA G

        btn_G1 = new JButton("");
        btn_G1.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_G1.setBorder(BorderFactory.createEmptyBorder());
        btn_G1.setBounds(137, 137, 20, 23);
        panel.add(btn_G1);

        btn_G2 = new JButton("");
        btn_G2.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_G2.setBorder(BorderFactory.createEmptyBorder());
        btn_G2.setBounds(187, 137, 20, 23);
        panel.add(btn_G2);

        btn_G3 = new JButton("");
        btn_G3.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_G3.setBorder(BorderFactory.createEmptyBorder());
        btn_G3.setBounds(237, 137, 20, 23);
        panel.add(btn_G3);

        btn_G4 = new JButton("");
        btn_G4.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_G4.setBorder(BorderFactory.createEmptyBorder());
        btn_G4.setBounds(287, 137, 20, 23);
        panel.add(btn_G4);

        btn_G5 = new JButton("");
        btn_G5.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_G5.setBorder(BorderFactory.createEmptyBorder());
        btn_G5.setBounds(337, 137, 20, 23);
        panel.add(btn_G5);

        btn_G6 = new JButton("");
        btn_G6.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_G6.setBorder(BorderFactory.createEmptyBorder());
        btn_G6.setBounds(387, 137, 20, 23);
        panel.add(btn_G6);

        btn_G7 = new JButton("");
        btn_G7.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_G7.setBorder(BorderFactory.createEmptyBorder());
        btn_G7.setBounds(437, 137, 20, 23);
        panel.add(btn_G7);

        btn_G8 = new JButton("");
        btn_G8.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_G8.setBorder(BorderFactory.createEmptyBorder());
        btn_G8.setBounds(487, 137, 20, 23);
        panel.add(btn_G8);

        btn_G9 = new JButton("");
        btn_G9.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_G9.setBorder(BorderFactory.createEmptyBorder());
        btn_G9.setBounds(537, 137, 20, 23);
        panel.add(btn_G9);

        btn_G10 = new JButton("");
        btn_G10.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_G10.setBorder(BorderFactory.createEmptyBorder());
        btn_G10.setBounds(600, 137, 20, 23);
        panel.add(btn_G10);

        //FILA H

        btn_H1 = new JButton("");
        btn_H1.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_H1.setBorder(BorderFactory.createEmptyBorder());
        btn_H1.setBounds(137, 96, 20, 23);
        panel.add(btn_H1);

        btn_H2 = new JButton("");
        btn_H2.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_H2.setBorder(BorderFactory.createEmptyBorder());
        btn_H2.setBounds(187, 96, 20, 23);
        panel.add(btn_H2);

        btn_H3 = new JButton("");
        btn_H3.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_H3.setBorder(BorderFactory.createEmptyBorder());
        btn_H3.setBounds(237, 96, 20, 23);
        panel.add(btn_H3);

        btn_H4 = new JButton("");
        btn_H4.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_H4.setBorder(BorderFactory.createEmptyBorder());
        btn_H4.setBounds(287, 96, 20, 23);
        panel.add(btn_H4);

        btn_H5 = new JButton("");
        btn_H5.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_H5.setBorder(BorderFactory.createEmptyBorder());
        btn_H5.setBounds(337, 96, 20, 23);
        panel.add(btn_H5);

        btn_H6 = new JButton("");
        btn_H6.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_H6.setBorder(BorderFactory.createEmptyBorder());
        btn_H6.setBounds(387, 96, 20, 23);
        panel.add(btn_H6);

        btn_H7 = new JButton("");
        btn_H7.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_H7.setBorder(BorderFactory.createEmptyBorder());
        btn_H7.setBounds(437, 96, 20, 23);
        panel.add(btn_H7);

        btn_H8 = new JButton("");
        btn_H8.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_H8.setBorder(BorderFactory.createEmptyBorder());
        btn_H8.setBounds(487, 96, 20, 23);
        panel.add(btn_H8);

        btn_H9 = new JButton("");
        btn_H9.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_H9.setBorder(BorderFactory.createEmptyBorder());
        btn_H9.setBounds(537, 96, 20, 23);
        panel.add(btn_H9);

        btn_H10 = new JButton("");
        btn_H10.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_H10.setBorder(BorderFactory.createEmptyBorder());
        btn_H10.setBounds(600, 96, 20, 23);
        panel.add(btn_H10);

        //FILA J

        btn_J1 = new JButton("");
        btn_J1.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_J1.setBorder(BorderFactory.createEmptyBorder());
        btn_J1.setBounds(137, 55, 20, 23);
        panel.add(btn_J1);

        btn_J2 = new JButton("");
        btn_J2.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_J2.setBorder(BorderFactory.createEmptyBorder());
        btn_J2.setBounds(187, 55, 20, 23);
        panel.add(btn_J2);

        btn_J3 = new JButton("");
        btn_J3.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_J3.setBorder(BorderFactory.createEmptyBorder());
        btn_J3.setBounds(237, 55, 20, 23);
        panel.add(btn_J3);

        btn_J4 = new JButton("");
        btn_J4.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_J4.setBorder(BorderFactory.createEmptyBorder());
        btn_J4.setBounds(287, 55, 20, 23);
        panel.add(btn_J4);

        btn_J5 = new JButton("");
        btn_J5.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_J5.setBorder(BorderFactory.createEmptyBorder());
        btn_J5.setBounds(337, 55, 20, 23);
        panel.add(btn_J5);

        btn_J6 = new JButton("");
        btn_J6.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_J6.setBorder(BorderFactory.createEmptyBorder());
        btn_J6.setBounds(387, 55, 20, 23);
        panel.add(btn_J6);

        btn_J7 = new JButton("");
        btn_J7.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_J7.setBorder(BorderFactory.createEmptyBorder());
        btn_J7.setBounds(437, 55, 20, 23);
        panel.add(btn_J7);

        btn_J8 = new JButton("");
        btn_J8.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_J8.setBorder(BorderFactory.createEmptyBorder());
        btn_J8.setBounds(487, 55, 20, 23);
        panel.add(btn_J8);

        btn_J9 = new JButton("");
        btn_J9.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_J9.setBorder(BorderFactory.createEmptyBorder());
        btn_J9.setBounds(537, 55, 20, 23);
        panel.add(btn_J9);

        btn_J10 = new JButton("");
        btn_J10.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_J10.setBorder(BorderFactory.createEmptyBorder());
        btn_J10.setBounds(600, 55, 20, 23);
        panel.add(btn_J10);

        //FILA K

        btn_K1 = new JButton("");
        btn_K1.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_K1.setBorder(BorderFactory.createEmptyBorder());
        btn_K1.setBounds(137, 16, 20, 23);
        panel.add(btn_K1);

        btn_K2 = new JButton("");
        btn_K2.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_K2.setBorder(BorderFactory.createEmptyBorder());
        btn_K2.setBounds(187, 16, 20, 23);
        panel.add(btn_K2);

        btn_K3 = new JButton("");
        btn_K3.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_K3.setBorder(BorderFactory.createEmptyBorder());
        btn_K3.setBounds(237, 16, 20, 23);
        panel.add(btn_K3);

        btn_K4 = new JButton("");
        btn_K4.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_K4.setBorder(BorderFactory.createEmptyBorder());
        btn_K4.setBounds(287, 16, 20, 23);
        panel.add(btn_K4);

        btn_K5 = new JButton("");
        btn_K5.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_K5.setBorder(BorderFactory.createEmptyBorder());
        btn_K5.setBounds(337, 16, 20, 23);
        panel.add(btn_K5);

        btn_K6 = new JButton("");
        btn_K6.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_K6.setBorder(BorderFactory.createEmptyBorder());
        btn_K6.setBounds(387, 16, 20, 23);
        panel.add(btn_K6);

        btn_K7 = new JButton("");
        btn_K7.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_K7.setBorder(BorderFactory.createEmptyBorder());
        btn_K7.setBounds(437, 16, 20, 23);
        panel.add(btn_K7);

        btn_K8 = new JButton("");
        btn_K8.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_K8.setBorder(BorderFactory.createEmptyBorder());
        btn_K8.setBounds(487, 16, 20, 23);
        panel.add(btn_K8);

        btn_K9 = new JButton("");
        btn_K9.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_K9.setBorder(BorderFactory.createEmptyBorder());
        btn_K9.setBounds(537, 16, 20, 23);
        panel.add(btn_K9);

        btn_K10 = new JButton("");
        btn_K10.setIcon(new ImageIcon("C:\\Users\\eduar\\IdeaProjects\\Modulo2\\IMGS\\fondo1.png"));
        btn_K10.setBorder(BorderFactory.createEmptyBorder());
        btn_K10.setBounds(600, 16, 20, 23);
        panel.add(btn_K10);


    }
    public JFormattedTextField getTextField(JSpinner spinner) {
        JComponent editor = spinner.getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            return ((JSpinner.DefaultEditor)editor).getTextField();
        } else {
            System.err.println("Unexpected editor type: "
                    + spinner.getEditor().getClass()
                    + " isn't a descendant of DefaultEditor");
            return null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_agregarAsiento){

        }else if(e.getSource() == btn_volver){

        }else if(e.getSource() == btn_continuar){

        }else if(e.getSource() == btn_A1){

        }else if(e.getSource() == btn_A2){

        }else if(e.getSource() == btn_A3){

        }else if(e.getSource() == btn_A4){

        }else if(e.getSource() == btn_A5){

        }else if(e.getSource() == btn_A6){

        }else if(e.getSource() == btn_A7){

        }else if(e.getSource() == btn_A8){

        }else if(e.getSource() == btn_A9){

        }else if(e.getSource() == btn_A10){

        }else if(e.getSource() == btn_B1){

        }else if(e.getSource() == btn_B2){

        }else if(e.getSource() == btn_B3){

        }else if(e.getSource() == btn_B4){

        }else if(e.getSource() == btn_B5){

        }else if(e.getSource() == btn_B6){

        }else if(e.getSource() == btn_B7){

        }else if(e.getSource() == btn_B8){

        }else if(e.getSource() == btn_B9){

        }else if(e.getSource() == btn_B10){

        }else if(e.getSource() == btn_C1){

        }else if(e.getSource() == btn_C2){

        }else if(e.getSource() == btn_C3){

        }else if(e.getSource() == btn_C4){

        }else if(e.getSource() == btn_C5){

        }else if(e.getSource() == btn_C6){

        }else if(e.getSource() == btn_C7){

        }else if(e.getSource() == btn_C8){

        }else if(e.getSource() == btn_C9){

        }else if(e.getSource() == btn_C10){

        }else if(e.getSource() == btn_D1){

        }else if(e.getSource() == btn_D2){

        }else if(e.getSource() == btn_D3){

        }else if(e.getSource() == btn_D4){

        }else if(e.getSource() == btn_D5){

        }else if(e.getSource() == btn_D6){

        }else if(e.getSource() == btn_D7){

        }else if(e.getSource() == btn_D8){

        }else if(e.getSource() == btn_D9){

        }else if(e.getSource() == btn_D10){

        }else if(e.getSource() == btn_E1){

        }else if(e.getSource() == btn_E2){

        }else if(e.getSource() == btn_E3){

        }else if(e.getSource() == btn_E4){

        }else if(e.getSource() == btn_E5){

        }else if(e.getSource() == btn_E6){

        }else if(e.getSource() == btn_E7){

        }else if(e.getSource() == btn_E8){

        }else if(e.getSource() == btn_E9){

        }else if(e.getSource() == btn_E10){

        }else if(e.getSource() == btn_F1){

        }else if(e.getSource() == btn_F2){

        }else if(e.getSource() == btn_F3){

        }else if(e.getSource() == btn_F4){

        }else if(e.getSource() == btn_F5){

        }else if(e.getSource() == btn_F6){

        }else if(e.getSource() == btn_F7){

        }else if(e.getSource() == btn_F8){

        }else if(e.getSource() == btn_F9){

        }else if(e.getSource() == btn_F10){

        }else if(e.getSource() == btn_G1){

        }else if(e.getSource() == btn_G2){

        }else if(e.getSource() == btn_G3){

        }else if(e.getSource() == btn_G4){

        }else if(e.getSource() == btn_G5){

        }else if(e.getSource() == btn_G6){

        }else if(e.getSource() == btn_G7){

        }else if(e.getSource() == btn_G8){

        }else if(e.getSource() == btn_G9){

        }else if(e.getSource() == btn_G10){

        }else if(e.getSource() == btn_H1){

        }else if(e.getSource() == btn_H2){

        }else if(e.getSource() == btn_H3){

        }else if(e.getSource() == btn_H4){

        }else if(e.getSource() == btn_H5){

        }else if(e.getSource() == btn_H6){

        }else if(e.getSource() == btn_H7){

        }else if(e.getSource() == btn_H8){

        }else if(e.getSource() == btn_H9){

        }else if(e.getSource() == btn_H10){

        }else if(e.getSource() == btn_J1){

        }else if(e.getSource() == btn_J2){

        }else if(e.getSource() == btn_J3){

        }else if(e.getSource() == btn_J4){

        }else if(e.getSource() == btn_J5){

        }else if(e.getSource() == btn_J6){

        }else if(e.getSource() == btn_J7){

        }else if(e.getSource() == btn_J8){

        }else if(e.getSource() == btn_J9){

        }else if(e.getSource() == btn_J10){

        }else if(e.getSource() == btn_K1){

        }else if(e.getSource() == btn_K2){

        }else if(e.getSource() == btn_K3){

        }else if(e.getSource() == btn_K4){

        }else if(e.getSource() == btn_K5){

        }else if(e.getSource() == btn_K6){

        }else if(e.getSource() == btn_K7){

        }else if(e.getSource() == btn_K8){

        }else if(e.getSource() == btn_K9){

        }else if(e.getSource() == btn_K10){

        }
    }
}
