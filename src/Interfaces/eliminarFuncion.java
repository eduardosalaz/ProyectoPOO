package Interfaces;

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

public class eliminarFuncion implements ActionListener{
	private JButton btnVolver,btnEliminar;
	public JFrame frame;
	private JTextField textNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarFuncion window = new eliminarFuncion();
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
	public eliminarFuncion() {
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
		
		
		
		JLabel lblEliminar = new JLabel("Eliminar funcion");
		lblEliminar.setForeground(Color.WHITE);
		lblEliminar.setFont(new Font("Arial", Font.BOLD, 40));
		lblEliminar.setBounds(299, 45, 342, 72);
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
		btnEliminar.setBounds(389, 278, 149, 39);
		frame.getContentPane().add(btnEliminar);
		btnEliminar.addActionListener(this);
		
		JLabel lblNumero = new JLabel("Numero de sala:");
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNumero.setBounds(335, 184, 170, 24);
		frame.getContentPane().add(lblNumero);
		
		textNumero = new JTextField();
		textNumero.setBounds(491, 190, 96, 19);
		frame.getContentPane().add(textNumero);
		textNumero.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		funciones funcion = new funciones();
		
		if(e.getSource()==btnEliminar) {
			int opcion = JOptionPane.showConfirmDialog(null, "Se ha eliminado exitosamente la funcion!. \n\n¿Quiere eliminar otra funcion?\n", "Eliminado", JOptionPane.YES_NO_OPTION);
			
			if(opcion==JOptionPane.YES_OPTION) {
				textNumero.setText("");
			}
			else {
				funcion.frame.setVisible(true);
				frame.dispose();
			}
		}
		else {
			funcion.frame.setVisible(true);
			frame.dispose();
		}
	}
}
