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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBuscar.setFocusPainted(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBackground(new Color(171, 0, 51));
		btnBuscar.setBounds(411, 277, 139, 31);
		frame.getContentPane().add(btnBuscar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(828, 189, 61, 19);
		frame.getContentPane().add(textField);
		
		JLabel lblAaaa = new JLabel("/ AAAA");
		lblAaaa.setForeground(Color.WHITE);
		lblAaaa.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAaaa.setBounds(758, 185, 68, 24);
		frame.getContentPane().add(lblAaaa);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(687, 189, 61, 19);
		frame.getContentPane().add(textField_1);
		
		JLabel lblMm = new JLabel("/ MM");
		lblMm.setForeground(Color.WHITE);
		lblMm.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMm.setBounds(636, 185, 68, 24);
		frame.getContentPane().add(lblMm);
		
		JLabel lblDd = new JLabel("DD");
		lblDd.setForeground(Color.WHITE);
		lblDd.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDd.setBounds(531, 185, 68, 24);
		frame.getContentPane().add(lblDd);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(565, 189, 61, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(828, 247, 61, 19);
		frame.getContentPane().add(textField_3);
		
		JLabel lblAaaa_1 = new JLabel("/ AAAA");
		lblAaaa_1.setForeground(Color.WHITE);
		lblAaaa_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAaaa_1.setBounds(758, 243, 68, 24);
		frame.getContentPane().add(lblAaaa_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(687, 247, 61, 19);
		frame.getContentPane().add(textField_4);
		
		JLabel lblMm_1 = new JLabel("/ MM");
		lblMm_1.setForeground(Color.WHITE);
		lblMm_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMm_1.setBounds(636, 243, 68, 24);
		frame.getContentPane().add(lblMm_1);
		
		JLabel lblDd_1 = new JLabel("DD");
		lblDd_1.setForeground(Color.WHITE);
		lblDd_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDd_1.setBounds(531, 243, 68, 24);
		frame.getContentPane().add(lblDd_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(565, 247, 61, 19);
		frame.getContentPane().add(textField_5);
		
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
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnBuscar) {
			
		}
		else {
			
		}
		
		
	}
	   
}
