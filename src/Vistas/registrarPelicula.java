package Vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class registrarPelicula implements ActionListener{
	private JButton btnVolver,btnRegistrar;
	public JFrame frame;
	private JTextField textNombre;
	private JTextField textDuracion;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrarPelicula window = new registrarPelicula();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registrarPelicula() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFocusable(false);
		frame.setBounds(100, 100, 960, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(960,640);
		frame.getContentPane().setLayout(null);
		
	
		frame.getContentPane().setBackground(new Color(72,81,84));
		
		
		
		JLabel lblRegistrar = new JLabel("Registrar pelicula");
		lblRegistrar.setForeground(Color.WHITE);
		lblRegistrar.setFont(new Font("Arial", Font.BOLD, 40));
		lblRegistrar.setBounds(303, 53, 337, 72);
		frame.getContentPane().add(lblRegistrar);
		
		
		btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(171, 0, 51));
		btnVolver.setBounds(10, 562, 139, 31);
		frame.getContentPane().add(btnVolver);
		btnVolver.addActionListener(this);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 17));
		btnRegistrar.setBackground(new Color(171, 0, 51));
		btnRegistrar.setBounds(418, 376, 149, 39);
		frame.getContentPane().add(btnRegistrar);
		btnRegistrar.addActionListener(this);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNombre.setBounds(69, 185, 170, 24);
		frame.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(151, 191, 270, 19);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		textDuracion = new JTextField();
		textDuracion.setColumns(10);
		textDuracion.setBounds(641, 191, 226, 19);
		frame.getContentPane().add(textDuracion);
		
		JLabel lblDuracion = new JLabel("Duracion:");
		lblDuracion.setForeground(Color.WHITE);
		lblDuracion.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDuracion.setBounds(551, 185, 170, 24);
		frame.getContentPane().add(lblDuracion);
		
		JComboBox comboBoxClasificacion = new JComboBox();
		comboBoxClasificacion.setForeground(Color.WHITE);
		comboBoxClasificacion.setBackground(new Color(34, 31, 32));
		comboBoxClasificacion.setBounds(189, 273, 232, 21);
		frame.getContentPane().add(comboBoxClasificacion);
		
		JLabel lblClasificacion = new JLabel("Clasificacion:");
		lblClasificacion.setForeground(Color.WHITE);
		lblClasificacion.setFont(new Font("Arial", Font.PLAIN, 20));
		lblClasificacion.setBounds(69, 268, 170, 24);
		frame.getContentPane().add(lblClasificacion);
		
		JComboBox comboBoxVersion = new JComboBox();
		comboBoxVersion.setForeground(Color.WHITE);
		comboBoxVersion.setBackground(new Color(34, 31, 32));
		comboBoxVersion.setBounds(628, 271, 239, 21);
		frame.getContentPane().add(comboBoxVersion);
		
		JLabel lblVersion = new JLabel("Version:");
		lblVersion.setForeground(Color.WHITE);
		lblVersion.setFont(new Font("Arial", Font.PLAIN, 20));
		lblVersion.setBounds(551, 266, 170, 24);
		frame.getContentPane().add(lblVersion);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		menuFunciones menu = new menuFunciones();
		if(e.getSource()==btnRegistrar) {
			int opcion = JOptionPane.showConfirmDialog(null, "Se ha registrado exitosamente!. \n\n¿Quiere registrar otro?\n","Registrado",JOptionPane.YES_NO_OPTION);
			
			if(opcion==JOptionPane.YES_OPTION) {
				textNombre.setText("");
				textDuracion.setText("");
			}
			else {
				menu.frame.setVisible(true);
				frame.dispose();
			}
		}
		else {
			menu.frame.setVisible(true);
			frame.dispose();
		}
	}
}
