package Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DebugGraphics;
import java.awt.Cursor;

public class registrarNuevoProducto implements ActionListener{
	JButton btnVolver,btnRegistrar;
	public JFrame frame;
	private JTextField textPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrarNuevoProducto window = new registrarNuevoProducto();
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
	public registrarNuevoProducto() {
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
		
		
		
		JLabel lblRegistrar = new JLabel("Registrar nuevo producto");
		lblRegistrar.setForeground(Color.WHITE);
		lblRegistrar.setFont(new Font("Arial", Font.BOLD, 40));
		lblRegistrar.setBounds(231, 53, 511, 72);
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

		
		JLabel lblTipo = new JLabel("Tipo de producto:");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTipo.setBounds(90, 135, 170, 24);
		frame.getContentPane().add(lblTipo);
		
		
		
		JLabel lblTamano = new JLabel("Tama\u00F1o:");
		lblTamano.setForeground(Color.WHITE);
		lblTamano.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTamano.setBounds(585, 137, 149, 16);
		frame.getContentPane().add(lblTamano);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 17));
		btnRegistrar.setBackground(new Color(171, 0, 51));
		btnRegistrar.setBounds(409, 359, 149, 39);
		frame.getContentPane().add(btnRegistrar);
		btnRegistrar.addActionListener(this);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setForeground(Color.WHITE);
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Palomitas", "Refresco", "Helado"}));
		comboBoxTipo.setBounds(252, 140, 149, 21);
		comboBoxTipo.setBackground(new Color(34,31,32));
		frame.getContentPane().add(comboBoxTipo);
		
		JComboBox comboBoxTamano = new JComboBox();
		comboBoxTamano.setBounds(666, 138, 189, 21);
		comboBoxTamano.setBackground(new Color(34,31,32));
		comboBoxTamano.setForeground(Color.WHITE);
		frame.getContentPane().add(comboBoxTamano);
		
		JComboBox comboBoxSabor = new JComboBox();
		comboBoxSabor.setBounds(652, 240, 203, 21);
		comboBoxSabor.setBackground(new Color(34,31,32));
		comboBoxSabor.setForeground(Color.WHITE);
		frame.getContentPane().add(comboBoxSabor);
		
		JLabel lblSabor = new JLabel("Sabor:");
		lblSabor.setForeground(Color.WHITE);
		lblSabor.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSabor.setBounds(585, 239, 149, 16);
		frame.getContentPane().add(lblSabor);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPrecio.setBounds(90, 237, 170, 24);
		frame.getContentPane().add(lblPrecio);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(164, 241, 237, 19);
		frame.getContentPane().add(textPrecio);
		textPrecio.setColumns(10);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		menuInventario menuInventario = new menuInventario();
		if(e.getSource()==btnVolver) {
			
			menuInventario.frame.setVisible(true);
			
			frame.setVisible(false);
		}
		else if(e.getSource()==btnRegistrar) {
			
			int opcion = JOptionPane.showConfirmDialog(null, "Se ha registrado exitosamente el producto!, desdea agregar otro producto?","Registrado",JOptionPane.YES_NO_OPTION);
			
			if(opcion==JOptionPane.YES_OPTION) {
				textPrecio.setText("");
			}
			else {
				menuInventario.frame.setVisible(true);
				frame.dispose();
			}
			
		}
		
	}
	
	
}
