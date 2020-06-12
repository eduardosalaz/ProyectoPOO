package Interfaces;

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

public class registrarNuevaFuncion implements ActionListener{
	private JButton btnVolver,btnRegistrar;
	public JFrame frame;
	private JTextField textIdPelicula, textDd, textMm, textAaaa, textHh, textHoraMm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrarNuevaFuncion window = new registrarNuevaFuncion();
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
	public registrarNuevaFuncion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFocusable(false);
		frame.setBounds(100, 100, 960, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(960,640);
		frame.getContentPane().setLayout(null);
		
	
		frame.getContentPane().setBackground(new Color(72,81,84));
		
		
		
		JLabel lblRegistrar = new JLabel("Registrar nueva funcion");
		lblRegistrar.setForeground(Color.WHITE);
		lblRegistrar.setFont(new Font("Arial", Font.BOLD, 40));
		lblRegistrar.setBounds(268, 53, 468, 72);
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
		btnRegistrar.setBounds(424, 419, 149, 39);
		frame.getContentPane().add(btnRegistrar);
		btnRegistrar.addActionListener(this);
		
		JLabel lblNumero = new JLabel("Numero de sala:");
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNumero.setBounds(36, 185, 170, 24);
		frame.getContentPane().add(lblNumero);
		
		textIdPelicula = new JTextField();
		textIdPelicula.setColumns(10);
		textIdPelicula.setBounds(680, 191, 226, 19);
		frame.getContentPane().add(textIdPelicula);
		
		JLabel lblIdPelicula = new JLabel("ID Pelicula:");
		lblIdPelicula.setForeground(Color.WHITE);
		lblIdPelicula.setFont(new Font("Arial", Font.PLAIN, 20));
		lblIdPelicula.setBounds(573, 185, 109, 24);
		frame.getContentPane().add(lblIdPelicula);
		
		JComboBox comboBoxNumero = new JComboBox();
		comboBoxNumero.setForeground(Color.WHITE);
		comboBoxNumero.setBackground(new Color(34, 31, 32));
		comboBoxNumero.setBounds(182, 190, 287, 21);
		frame.getContentPane().add(comboBoxNumero);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFecha.setBounds(36, 268, 68, 24);
		frame.getContentPane().add(lblFecha);
		
		JComboBox comboBoxEspecial = new JComboBox();
		comboBoxEspecial.setForeground(Color.WHITE);
		comboBoxEspecial.setBackground(new Color(34, 31, 32));
		comboBoxEspecial.setBounds(670, 271, 239, 21);
		frame.getContentPane().add(comboBoxEspecial);
		
		JLabel lblEspecial = new JLabel("Especial:");
		lblEspecial.setForeground(Color.WHITE);
		lblEspecial.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEspecial.setBounds(573, 268, 170, 24);
		frame.getContentPane().add(lblEspecial);
		
		JLabel lblDd = new JLabel("DD");
		lblDd.setForeground(Color.WHITE);
		lblDd.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDd.setBounds(111, 268, 68, 24);
		frame.getContentPane().add(lblDd);
		
		textDd = new JTextField();
		textDd.setColumns(10);
		textDd.setBounds(145, 272, 61, 19);
		frame.getContentPane().add(textDd);
		
		textMm = new JTextField();
		textMm.setColumns(10);
		textMm.setBounds(267, 272, 61, 19);
		frame.getContentPane().add(textMm);
		
		JLabel lblMm = new JLabel("/ MM");
		lblMm.setForeground(Color.WHITE);
		lblMm.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMm.setBounds(216, 268, 68, 24);
		frame.getContentPane().add(lblMm);
		
		textAaaa = new JTextField();
		textAaaa.setColumns(10);
		textAaaa.setBounds(408, 272, 61, 19);
		frame.getContentPane().add(textAaaa);
		
		JLabel lblAaaa = new JLabel("/ AAAA");
		lblAaaa.setForeground(Color.WHITE);
		lblAaaa.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAaaa.setBounds(338, 268, 68, 24);
		frame.getContentPane().add(lblAaaa);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Arial", Font.PLAIN, 20));
		lblHora.setBounds(36, 350, 68, 24);
		frame.getContentPane().add(lblHora);
		
		JLabel lblHh = new JLabel("HH");
		lblHh.setForeground(Color.WHITE);
		lblHh.setFont(new Font("Arial", Font.PLAIN, 20));
		lblHh.setBounds(89, 350, 68, 24);
		frame.getContentPane().add(lblHh);
		
		textHh = new JTextField();
		textHh.setColumns(10);
		textHh.setBounds(118, 353, 61, 19);
		frame.getContentPane().add(textHh);
		
		JLabel lblHoraMm = new JLabel(": MM");
		lblHoraMm.setForeground(Color.WHITE);
		lblHoraMm.setFont(new Font("Arial", Font.PLAIN, 20));
		lblHoraMm.setBounds(182, 350, 68, 24);
		frame.getContentPane().add(lblHoraMm);
		
		textHoraMm = new JTextField();
		textHoraMm.setColumns(10);
		textHoraMm.setBounds(233, 353, 61, 19);
		frame.getContentPane().add(textHoraMm);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		menuFunciones menuFunciones = new menuFunciones();
		
		if(e.getSource()==btnRegistrar) {
			int opcion = JOptionPane.showConfirmDialog(null, "Se ha registrado correctamente la funcion!. \n\n�Quiere registrar otra funcion?\n","Registrado",JOptionPane.YES_NO_OPTION);
			
			if(opcion==JOptionPane.YES_OPTION) {
				textIdPelicula.setText("");
				textDd.setText("");
				textMm.setText("");
				textAaaa.setText("");
				textHh.setText("");
				textHoraMm.setText("");
			}
			else {
				menuFunciones.frame.setVisible(true);
				frame.dispose();
			}
		}
		else {
			menuFunciones.frame.setVisible(true);
			frame.dispose();
		}
	}
}
