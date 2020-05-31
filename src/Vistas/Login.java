package Vistas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    protected JFrame frameLog;
    protected JTextField txt_user;
    protected JPasswordField pass_password;
    protected JButton btn_ingresar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frameLog.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Login() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     * GRIS: 72,81,84
     * ROJO: 171, 0, 51
     */
    private void initialize() {
        frameLog = new JFrame();
        frameLog.getContentPane().setBackground(new Color(72,81,84));
        frameLog.setBounds(100, 100, 480, 460);
        frameLog.setSize(480, 640);
        frameLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLog.getContentPane().setLayout(null);

        JLabel lbl_login = new JLabel("Login");
        lbl_login.setForeground(Color.WHITE);
        lbl_login.setFont(new Font("Arial", Font.PLAIN, 22));
        lbl_login.setBounds(202, 11, 60, 56);
        frameLog.getContentPane().add(lbl_login);


        JLabel lbl_user = new JLabel("Usuario:");
        lbl_user.setForeground(Color.WHITE);
        lbl_user.setFont(new Font("Arial Black", Font.PLAIN, 18));
        lbl_user.setBounds(186, 127, 91, 56);
        frameLog.getContentPane().add(lbl_user);

        JLabel lbl_pass = new JLabel("Contrase\u00F1a:");
        lbl_pass.setForeground(Color.WHITE);
        lbl_pass.setFont(new Font("Arial Black", Font.PLAIN, 18));
        lbl_pass.setBounds(166, 293, 131, 41);
        frameLog.getContentPane().add(lbl_pass);

        txt_user = new JTextField();
        txt_user.setBounds(124, 181, 215, 28);
        frameLog.getContentPane().add(txt_user);
        txt_user.setColumns(10);

        pass_password = new JPasswordField();
        pass_password.setBounds(124, 336, 215, 28);
        frameLog.getContentPane().add(pass_password);

        btn_ingresar = new JButton("Ingresar");
        btn_ingresar.setForeground(new Color(255, 255, 255));
        btn_ingresar.setFont(new Font("Arial", Font.BOLD, 16));
        btn_ingresar.setBackground(new Color(171, 0, 51));
        btn_ingresar.setBounds(166, 433, 131, 56);
        btn_ingresar.addActionListener(this);
        frameLog.getContentPane().add(btn_ingresar);

        Image img;
        img = new ImageIcon(Login.class.getResource("/IMGS/login.png")).getImage();

        JPanel panel_red = new JPanel();
        panel_red.setBackground(new Color(171, 0, 51));
        panel_red.setBounds(38, 75, 387, 61);
        frameLog.getContentPane().add(panel_red);

        JLabel txt_img = new JLabel("");
        panel_red.add(txt_img);
        txt_img.setIcon(new ImageIcon(img));

        JPanel panel_gris = new JPanel();
        panel_gris.setBackground(new Color(46,48,48));
        panel_gris.setBounds(38, 75, 387, 430);
        frameLog.getContentPane().add(panel_gris);

    }


    /*TODO: Agregar la Query a la BD para poder acceder a las credenciales
     *TODO: Si es exitosa, pasar al siguiente frame y sacar un messageDialog que lo confirme
     *TODO: Si no, sacar otro messageDialog que informe que no se encontró y restar uno a la cantidad de intentos
     *TODO: Una vez que se agoten los intentos, ponerle sleep al hilo por 2 minutos.
     *https://stackoverflow.com/questions/3797941/how-to-make-a-thread-sleep-for-specific-amount-of-time-in-java
     * El siguiente pedazo de código es para pasar al siguiente frame, se tiene que modificar para integrar
     * la conexión a la BD, es TEMPORAL.
     * Cuando hacer dispose a un frame y cuando sólo hacerlo invisible?
     * https://stackoverflow.com/questions/13360430/jframe-dispose-vs-system-exit
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("boton puchado");
        if(e.getSource() == btn_ingresar){
            System.out.println("boton puchado nice");
            frameLog.dispose();
            PrincipalUser principalUser = new PrincipalUser();
            principalUser.setVisible(true);
        }

    }
}