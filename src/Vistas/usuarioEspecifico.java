package Interfaces;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class usuarioEspecifico implements ActionListener{
	
	private JButton btnVolver, btnBuscar;
	private JFrame frame;
	private JTextField textIdUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuarioEspecifico window = new usuarioEspecifico();
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
	public usuarioEspecifico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 960, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(960,640);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuarioEspecifico = new JLabel("Usuario en especifico");
		lblUsuarioEspecifico.setForeground(Color.WHITE);
		lblUsuarioEspecifico.setFont(new Font("Arial", Font.BOLD, 40));
		lblUsuarioEspecifico.setBounds(255, 50, 423, 72);

		frame.getContentPane().add(lblUsuarioEspecifico);
		frame.getContentPane().setBackground(new Color(72,81,84));
		
		JLabel lblIdUsuario = new JLabel("ID Usuario:");
		lblIdUsuario.setForeground(Color.WHITE);
		lblIdUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
		lblIdUsuario.setBounds(58, 193, 149, 16);
		frame.getContentPane().add(lblIdUsuario);
		
		JLabel lblRango = new JLabel("Rango de d\u00EDas:");
		lblRango.setForeground(Color.WHITE);
		lblRango.setFont(new Font("Arial", Font.PLAIN, 20));
		lblRango.setBounds(529, 194, 149, 16);
		frame.getContentPane().add(lblRango);
		
		JList list = new JList();
		list.setBounds(153, 445, 96, -77);
		frame.getContentPane().add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 334, 831, 167);
		frame.getContentPane().add(scrollPane);
		
		textIdUsuario = new JTextField();
		textIdUsuario.setBounds(163, 195, 96, 19);
		frame.getContentPane().add(textIdUsuario);
		textIdUsuario.setColumns(10);
		
		btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(171, 0, 51));
		btnVolver.setBounds(10, 562, 139, 31);
		frame.getContentPane().add(btnVolver);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBuscar.setFocusPainted(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBackground(new Color(171, 0, 51));
		btnBuscar.setBounds(367, 279, 139, 31);
		frame.getContentPane().add(btnBuscar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnBuscar) {
			
		}
		else {
			
		}
		
		
	}
	   
}
