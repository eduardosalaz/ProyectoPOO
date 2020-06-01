package Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class funciones implements ActionListener{
	
	private JButton btnVolver, btnRegistrar, btnEditar, btnEliminar;
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					funciones window = new funciones();
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
	public funciones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 960, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(960,640);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(72,81,84));
		
		JLabel lblfunciones = new JLabel("Funciones");
		lblfunciones.setForeground(Color.WHITE);
		lblfunciones.setFont(new Font("Arial", Font.BOLD, 40));
		lblfunciones.setBounds(384, 52, 200, 72);
		frame.getContentPane().add(lblfunciones);
		
		btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(171, 0, 51));
		btnVolver.setBounds(10, 562, 139, 31);
		frame.getContentPane().add(btnVolver);
		btnVolver.addActionListener(this);
		
		btnRegistrar = new JButton("Registrar nueva funcion");
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBackground(new Color(171, 0, 51));
		btnRegistrar.setBounds(307, 158, 339, 85);
		frame.getContentPane().add(btnRegistrar);
		btnRegistrar.addActionListener(this);
		
		btnEditar = new JButton("Editar funcion");
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnEditar.setFocusPainted(false);
		btnEditar.setBorderPainted(false);
		btnEditar.setBackground(new Color(171, 0, 51));
		btnEditar.setBounds(307, 270, 339, 85);
		frame.getContentPane().add(btnEditar);
		btnEditar.addActionListener(this);
		
		btnEliminar = new JButton("Eliminar funcion");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnEliminar.setFocusPainted(false);
		btnEliminar.setBorderPainted(false);
		btnEliminar.setBackground(new Color(171, 0, 51));
		btnEliminar.setBounds(307, 382, 339, 85);
		frame.getContentPane().add(btnEliminar);
		btnEliminar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnRegistrar) {
			registrarNuevaFuncion registrar = new registrarNuevaFuncion();
			registrar.frame.setVisible(true);
		}
		else if(e.getSource()==btnEditar) {
			//editarFuncion editar = new editarFuncion();
			//editar.frame.setVisible(true);
		}
		else if(e.getSource()==btnEliminar) {
			eliminarFuncion eliminar = new eliminarFuncion();
			eliminar.frame.setVisible(true);
		}
		else {
			menuFunciones menuI = new menuFunciones();
			menuI.frame.setVisible(true);
		}
		
		frame.dispose();
	}
}
