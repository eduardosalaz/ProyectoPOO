package Interfaces;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class usuarioEspecifico implements ActionListener{
	int contDe30 = 1;
	int contDe31 = 1;
	int contA30 = 1;
	int contA31 = 1;
	private JComboBox comboBoxDeMm,comboBoxDeAaaa,comboBoxAAaaa,comboBoxAMm,comboBoxDeDd,comboBoxADd;
	private JButton btnVolver, btnBuscar;
	public JFrame frame;
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
		
		JLabel lblRango = new JLabel("Rango de d\u00EDas");
		lblRango.setForeground(Color.WHITE);
		lblRango.setFont(new Font("Arial", Font.BOLD, 20));
		lblRango.setBounds(636, 132, 149, 31);
		frame.getContentPane().add(lblRango);
		
		JList list = new JList();
		list.setBounds(153, 445, 96, -77);
		frame.getContentPane().add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 334, 831, 167);
		frame.getContentPane().add(scrollPane);
		
		textIdUsuario = new JTextField();
		textIdUsuario.setBounds(163, 195, 229, 19);
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
		btnVolver.addActionListener(this);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBuscar.setFocusPainted(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBackground(new Color(171, 0, 51));
		btnBuscar.setBounds(411, 277, 139, 31);
		frame.getContentPane().add(btnBuscar);
		btnBuscar.addActionListener(this);
		
		JLabel lblDeAaaa = new JLabel("/ AAAA");
		lblDeAaaa.setForeground(Color.WHITE);
		lblDeAaaa.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDeAaaa.setBounds(758, 185, 68, 24);
		frame.getContentPane().add(lblDeAaaa);
		
		JLabel lblDeDd = new JLabel("/ DD");
		lblDeDd.setForeground(Color.WHITE);
		lblDeDd.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDeDd.setBounds(636, 185, 68, 24);
		frame.getContentPane().add(lblDeDd);
		
		JLabel lblDeMm = new JLabel("MM");
		lblDeMm.setForeground(Color.WHITE);
		lblDeMm.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDeMm.setBounds(531, 185, 68, 24);
		frame.getContentPane().add(lblDeMm);
		
		JLabel lblAAaaa = new JLabel("/ AAAA");
		lblAAaaa.setForeground(Color.WHITE);
		lblAAaaa.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAAaaa.setBounds(758, 243, 68, 24);
		frame.getContentPane().add(lblAAaaa);
		
		JLabel lblADd = new JLabel("/ DD");
		lblADd.setForeground(Color.WHITE);
		lblADd.setFont(new Font("Arial", Font.PLAIN, 20));
		lblADd.setBounds(636, 243, 68, 24);
		frame.getContentPane().add(lblADd);
		
		JLabel lblAMm = new JLabel("MM");
		lblAMm.setForeground(Color.WHITE);
		lblAMm.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAMm.setBounds(531, 243, 68, 24);
		frame.getContentPane().add(lblAMm);
		
		JLabel lblDe = new JLabel("De:");
		lblDe.setForeground(Color.WHITE);
		lblDe.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDe.setBounds(496, 180, 42, 31);
		frame.getContentPane().add(lblDe);
		
		JLabel lblA = new JLabel("A:");
		lblA.setForeground(Color.WHITE);
		lblA.setFont(new Font("Arial", Font.PLAIN, 20));
		lblA.setBounds(496, 238, 42, 31);
		frame.getContentPane().add(lblA);
		

		comboBoxDeMm = new JComboBox();
		comboBoxDeMm.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBoxDeMm.setForeground(Color.WHITE);
		comboBoxDeMm.setBackground(new Color(34, 31, 32));
		comboBoxDeMm.setBounds(566, 188, 60, 21);
		frame.getContentPane().add(comboBoxDeMm);
		comboBoxDeMm.addActionListener(this);
		
		comboBoxDeDd = new JComboBox();
		comboBoxDeDd.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDeDd.setForeground(Color.WHITE);
		comboBoxDeDd.setBackground(new Color(34, 31, 32));
		comboBoxDeDd.setBounds(688, 188, 60, 21);
		frame.getContentPane().add(comboBoxDeDd);

		
		comboBoxDeAaaa = new JComboBox();
		comboBoxDeAaaa.setModel(new DefaultComboBoxModel(new String[] {"2020"}));
		comboBoxDeAaaa.setForeground(Color.WHITE);
		comboBoxDeAaaa.setBackground(new Color(34, 31, 32));
		comboBoxDeAaaa.setBounds(829, 188, 60, 21);
		frame.getContentPane().add(comboBoxDeAaaa);
		
		comboBoxAMm = new JComboBox();
		comboBoxAMm.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBoxAMm.setForeground(Color.WHITE);
		comboBoxAMm.setBackground(new Color(34, 31, 32));
		comboBoxAMm.setBounds(566, 243, 60, 21);
		frame.getContentPane().add(comboBoxAMm);
		comboBoxAMm.addActionListener(this);
		
		comboBoxADd = new JComboBox();
		comboBoxADd.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxADd.setForeground(Color.WHITE);
		comboBoxADd.setBackground(new Color(34, 31, 32));
		comboBoxADd.setBounds(688, 243, 60, 21);
		frame.getContentPane().add(comboBoxADd);

		comboBoxAAaaa = new JComboBox();
		comboBoxAAaaa.setModel(new DefaultComboBoxModel(new String[] {"2020"}));
		comboBoxAAaaa.setForeground(Color.WHITE);
		comboBoxAAaaa.setBackground(new Color(34, 31, 32));
		comboBoxAAaaa.setBounds(829, 243, 60, 21);
		frame.getContentPane().add(comboBoxAAaaa);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==comboBoxDeMm) {
			
			String deMm = (String) comboBoxDeMm.getSelectedItem();
			
			if(deMm == "02") {
				if(contDe31==1 && contDe30==1) {
					comboBoxDeDd.removeItem("30");
					comboBoxDeDd.removeItem("31");
					contDe30=0;
					contDe31=0;
				}
				else if(contDe31==0 && contDe30==1) {
					comboBoxDeDd.removeItem("30");
					contDe30=0;
				}	
			}	
			else if(deMm=="01" || deMm=="03" || deMm=="05" || deMm=="07" || deMm=="08" || deMm=="10" || deMm=="12") {
				
				if(contDe30==0 && contDe31==0) {
					comboBoxDeDd.addItem("30");
					comboBoxDeDd.addItem("31");
					contDe30=1;
					contDe31=1;
				}
				else if(contDe30==1 && contDe31==0) {
					comboBoxDeDd.addItem("31");
					contDe31=1;
				}
			}
			else if(deMm=="04" || deMm=="06" || deMm=="09" || deMm=="11") {
				
				if(contDe30==0 && contDe31==0) {
					comboBoxDeDd.addItem("30");
					contDe30=1;
				}
				else if(contDe30==1 && contDe31==1) {
					comboBoxDeDd.removeItem("31");
					contDe31=0;
				}
			}
		}
		else if(e.getSource()==comboBoxAMm) {
			
			String aMm = (String) comboBoxAMm.getSelectedItem();
			
			if(aMm == "02") {
				
				if(contA31==1 && contA30==1) {
					comboBoxADd.removeItem("30");
					comboBoxADd.removeItem("31");
					contA30=0;
					contA31=0;
				}
				else if(contA31==0 && contA30==1) {
					comboBoxADd.removeItem("30");
					contA30=0;
				}	
			}	
			else if(aMm=="01" || aMm=="03" || aMm=="05" || aMm=="07" || aMm=="08" || aMm=="10" || aMm=="12") {
				
				if(contA30==0 && contA31==0) {
					comboBoxADd.addItem("30");
					comboBoxADd.addItem("31");
					contA30=1;
					contA31=1;
				}
				else if(contA30==1 && contA31==0) {
					comboBoxADd.addItem("31");
					contA31=1;
				}
			}
			else if(aMm=="04" || aMm=="06" || aMm=="09" || aMm=="11") {
				
				if(contA30==0 && contA31==0) {
					comboBoxADd.addItem("30");
					contA30=1;
				}
				else if(contA30==1 && contA31==1) {
					comboBoxADd.removeItem("31");
					contA31=0;
				}
			}
		}
		else if(e.getSource()==btnVolver) {
			Informe informe = new Informe();
			informe.frame.setVisible(true);
			frame.dispose();
		}
	}
}

