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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class editarFuncion implements ActionListener{
	private int cont30 = 1,cont31 = 1;
	private JButton btnVolver,btnActualizar;
	public JFrame frame;
	private JTextField textIdPelicula;
	private JComboBox comboBoxMm,comboBoxDd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editarFuncion window = new editarFuncion();
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
	public editarFuncion() {
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
		
		
		
		JLabel lblEditar = new JLabel("Editar funcion");
		lblEditar.setForeground(Color.WHITE);
		lblEditar.setFont(new Font("Arial", Font.BOLD, 40));
		lblEditar.setBounds(370, 58, 269, 72);
		frame.getContentPane().add(lblEditar);
		
		
		btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(171, 0, 51));
		btnVolver.setBounds(10, 562, 139, 31);
		frame.getContentPane().add(btnVolver);
		btnVolver.addActionListener(this);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBorderPainted(false);
		btnActualizar.setFocusPainted(false);
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFont(new Font("Arial", Font.PLAIN, 17));
		btnActualizar.setBackground(new Color(171, 0, 51));
		btnActualizar.setBounds(424, 419, 149, 39);
		frame.getContentPane().add(btnActualizar);
		btnActualizar.addActionListener(this);
		
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
		comboBoxNumero.setBounds(196, 190, 287, 21);
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
		
		JLabel lblMm = new JLabel("MM");
		lblMm.setForeground(Color.WHITE);
		lblMm.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMm.setBounds(102, 268, 47, 24);
		frame.getContentPane().add(lblMm);
		
		JLabel lblDd = new JLabel("/ DD");
		lblDd.setForeground(Color.WHITE);
		lblDd.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDd.setBounds(216, 268, 68, 24);
		frame.getContentPane().add(lblDd);
		
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
		
		JLabel lblHoraMm = new JLabel(": MM");
		lblHoraMm.setForeground(Color.WHITE);
		lblHoraMm.setFont(new Font("Arial", Font.PLAIN, 20));
		lblHoraMm.setBounds(185, 350, 68, 24);
		frame.getContentPane().add(lblHoraMm);
		
		comboBoxMm = new JComboBox();
		comboBoxMm.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBoxMm.setForeground(Color.WHITE);
		comboBoxMm.setBackground(new Color(34, 31, 32));
		comboBoxMm.setBounds(143, 270, 63, 21);
		frame.getContentPane().add(comboBoxMm);
		comboBoxMm.addActionListener(this);
		
		comboBoxDd = new JComboBox();
		comboBoxDd.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDd.setForeground(Color.WHITE);
		comboBoxDd.setBackground(new Color(34, 31, 32));
		comboBoxDd.setBounds(265, 268, 63, 21);
		frame.getContentPane().add(comboBoxDd);
		
		JComboBox comboBoxAaaa = new JComboBox();
		comboBoxAaaa.setModel(new DefaultComboBoxModel(new String[] {"2020"}));
		comboBoxAaaa.setForeground(Color.WHITE);
		comboBoxAaaa.setBackground(new Color(34, 31, 32));
		comboBoxAaaa.setBounds(406, 268, 63, 21);
		frame.getContentPane().add(comboBoxAaaa);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 24, 1));
		spinner.setBounds(124, 354, 51, 20);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		spinner_1.setBounds(238, 354, 51, 20);
		frame.getContentPane().add(spinner_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		funciones funcion = new funciones();
		
		
		if(e.getSource()==comboBoxMm) {
			
			String deMm = (String) comboBoxMm.getSelectedItem();
			if(deMm == "02") {
				if(cont31==1 && cont30==1) {
					comboBoxDd.removeItem("30");
					comboBoxDd.removeItem("31");
					cont30=0;
					cont31=0;
				}
				else if(cont31==0 && cont30==1) {
					comboBoxDd.removeItem("30");
					cont30=0;
				}	
			}	
			else if(deMm=="01" || deMm=="03" || deMm=="05" || deMm=="07" || deMm=="08" || deMm=="10" || deMm=="12") {
				
				if(cont30==0 && cont31==0) {
					comboBoxDd.addItem("30");
					comboBoxDd.addItem("31");
					cont30=1;
					cont31=1;
				}
				else if(cont30==1 && cont31==0) {
					comboBoxDd.addItem("31");
					cont31=1;
				}
			}
			else if(deMm=="04" || deMm=="06" || deMm=="09" || deMm=="11") {
				
				if(cont30==0 && cont31==0) {
					comboBoxDd.addItem("30");
					cont30=1;
				}
				else if(cont30==1 && cont31==1) {
					comboBoxDd.removeItem("31");
					cont31=0;
				}
			}
		}
		else if(e.getSource()==btnVolver) {
			funcion.frame.setVisible(true);
			frame.dispose();
		}
		else if(e.getSource()==btnActualizar) {
			int opcion = JOptionPane.showConfirmDialog(null, "Se ha actualizado exitosamente!. \n\n¿Quiere actualizar otra funcion?\n", "Actualizado",JOptionPane.YES_NO_OPTION);
			
			if(opcion==JOptionPane.YES_OPTION) {
				textIdPelicula.setText("");
		
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
