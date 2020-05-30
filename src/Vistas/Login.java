package Vistas;
import javax.swing.*;
import java.awt.*;

public class Login {

    private static final long serialVersionUID = 1L;
    private JFrame frameLog;
    private JTextField txt_user;
    private JPasswordField pass_password;

    public static void main(String[] args) {

        Login login = new Login();
        login.crearGUI();
    /*Initialize the contents of the frame.
     *GRIS: 72, 81, 84
     * ROJO:171, 0, 51
                */
    }
    public void crearGUI(){
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

        JButton btn_ingresar = new JButton("Ingresar");
        btn_ingresar.setForeground(new Color(255, 255, 255));
        btn_ingresar.setFont(new Font("Arial", Font.BOLD, 16));
        btn_ingresar.setBackground(new Color(171, 0, 51));
        btn_ingresar.setBounds(166, 433, 131, 56);
        frameLog.getContentPane().add(btn_ingresar);

        Image img = new ImageIcon(Login.class.getResource("img/logoRED.png")).getImage();

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
    @Override
    public void actionPerformed(ActionEvent e) {
            //TODO: Agregar la Query a la BD para poder acceder a las credenciales
            //TODO: Si es exitosa, pasar al siguiente frame y sacar un messageDialog que lo confirme
            //TODO: Si no, sacar otro messageDialog que informe que no se encontró y restar uno a la cantidad de intentos
            //TODO: Una vez que se agoten los intentos, ponerle sleep al hilo por 2 minutos.
            //https://stackoverflow.com/questions/3797941/how-to-make-a-thread-sleep-for-specific-amount-of-time-in-java
    }
}