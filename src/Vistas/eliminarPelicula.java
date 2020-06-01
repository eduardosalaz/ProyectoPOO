package Vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class eliminarPelicula implements ActionListener{
	
	private JButton btnVolver,btnEliminar;
	public JFrame frame;
	private JTextField textNombre;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarPelicula window = new eliminarPelicula();
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
	public eliminarPelicula() {
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
		
		
		
		JLabel lblEliminar = new JLabel("Eliminar pelicula");
		lblEliminar.setForeground(Color.WHITE);
		lblEliminar.setFont(new Font("Arial", Font.BOLD, 40));
		lblEliminar.setBounds(321, 52, 323, 72);
		frame.getContentPane().add(lblEliminar);
		
		
		btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(171, 0, 51));
		btnVolver.setBounds(10, 562, 139, 31);
		frame.getContentPane().add(btnVolver);
		btnVolver.addActionListener(this);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBorderPainted(false);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Arial", Font.PLAIN, 17));
		btnEliminar.setBackground(new Color(171, 0, 51));
		btnEliminar.setBounds(389, 284, 149, 39);
		frame.getContentPane().add(btnEliminar);
		btnEliminar.addActionListener(this);
		
		JLabel lblNombre = new JLabel("Nombre de la pelicula:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNombre.setBounds(231, 185, 243, 24);
		frame.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(438, 191, 283, 19);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		menuFunciones menu = new menuFunciones();
		if(e.getSource()==btnEliminar) {
			int opcion = JOptionPane.showConfirmDialog(null, "Se ha eliminado exitosamente!. \n\n¿Quiere eliminar otra pelicula?\n","Eliminado",JOptionPane.YES_NO_OPTION);
			
			if(opcion==JOptionPane.YES_OPTION) {
				textNombre.setText("");
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
