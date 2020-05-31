package Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class menuFunciones implements ActionListener{
	
	private JButton btnVolver, btnRegistrar, btnEditar, btnEliminar;
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuFunciones window = new menuFunciones();
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
    public menuFunciones() {
        initialize();
    }
	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 960, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(960,640);
		frame.getContentPane().setLayout(null);
		
	
		frame.getContentPane().setBackground(new Color(72,81,84));
		
		
		
		JLabel lblMenuInventario = new JLabel("Men\u00FA Inventario");
		lblMenuInventario.setForeground(Color.WHITE);
		lblMenuInventario.setFont(new Font("Arial", Font.BOLD, 40));
		lblMenuInventario.setBounds(337, 53, 309, 72);
		frame.getContentPane().add(lblMenuInventario);
		
		btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(171, 0, 51));
		btnVolver.setBounds(10, 562, 139, 31);
		frame.getContentPane().add(btnVolver);
		btnVolver.addActionListener(this);
		
		btnRegistrar = new JButton("Registrar nueva pelicula");
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBackground(new Color(171, 0, 51));
		btnRegistrar.setBounds(307, 158, 339, 85);
		frame.getContentPane().add(btnRegistrar);
		btnRegistrar.addActionListener(this);
		
		btnEditar = new JButton("Editar funciones");
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnEditar.setFocusPainted(false);
		btnEditar.setBorderPainted(false);
		btnEditar.setBackground(new Color(171, 0, 51));
		btnEditar.setBounds(307, 270, 339, 85);
		frame.getContentPane().add(btnEditar);
		btnEditar.addActionListener(this);
		
		btnEliminar = new JButton("Eliminar pelicula");
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
			registrarPelicula registrar = new registrarPelicula();
			registrar.frame.setVisible(true);
		}
		else if(e.getSource()==btnEditar) {
			funciones funciones = new funciones();
			funciones.frame.setVisible(true);
		}
		else if(e.getSource()==btnEliminar) {
			eliminarPelicula eliminar = new eliminarPelicula();
			eliminar.frame.setVisible(true);
		}
		else {
			menuAdmin menu = new menuAdmin();
			menu.frame.setVisible(true);
		}
		
		frame.dispose();
	}
}
