package Interfaces;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class actividadesDia implements ActionListener {
	private JButton btnAgregar, btnVolver, btnCrear;
	private JFrame frame;
	private JTextField textIdSup;
	private JTextField textClaveProduc;
	private JTextField textCantidad;
	private JTextField textIdVenta;
	private JTextField textPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actividadesDia window = new actividadesDia();
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
	public actividadesDia() {
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
		
	
		frame.getContentPane().setBackground(new Color(72,81,84));
		
		JLabel lblIdSup = new JLabel("ID Supervisor:");
		lblIdSup.setForeground(Color.WHITE);
		lblIdSup.setFont(new Font("Arial", Font.PLAIN, 20));
		lblIdSup.setBounds(84, 141, 149, 16);
		frame.getContentPane().add(lblIdSup);
		
		textIdSup = new JTextField();
		textIdSup.setColumns(10);
		textIdSup.setBounds(215, 143, 158, 19);
		frame.getContentPane().add(textIdSup);
		
		JLabel lblActividadesDelDia = new JLabel("Actividades del dia");
		lblActividadesDelDia.setForeground(Color.WHITE);
		lblActividadesDelDia.setFont(new Font("Arial", Font.BOLD, 40));
		lblActividadesDelDia.setBounds(308, 50, 376, 72);
		frame.getContentPane().add(lblActividadesDelDia);
		
		textClaveProduc = new JTextField();
		textClaveProduc.setColumns(10);
		textClaveProduc.setBounds(256, 191, 117, 19);
		frame.getContentPane().add(textClaveProduc);
		
		JLabel lblClaveProduc = new JLabel("Clave del producto:");
		lblClaveProduc.setForeground(Color.WHITE);
		lblClaveProduc.setFont(new Font("Arial", Font.PLAIN, 20));
		lblClaveProduc.setBounds(84, 189, 173, 16);
		frame.getContentPane().add(lblClaveProduc);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCantidad.setBounds(84, 232, 173, 16);
		frame.getContentPane().add(lblCantidad);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		textCantidad.setBounds(174, 234, 199, 19);
		frame.getContentPane().add(textCantidad);
		
		JLabel lblIdVenta = new JLabel("ID Venta dulceria:");
		lblIdVenta.setForeground(Color.WHITE);
		lblIdVenta.setFont(new Font("Arial", Font.PLAIN, 20));
		lblIdVenta.setBounds(525, 141, 173, 16);
		frame.getContentPane().add(lblIdVenta);
		
		textIdVenta = new JTextField();
		textIdVenta.setColumns(10);
		textIdVenta.setBounds(688, 143, 167, 19);
		frame.getContentPane().add(textIdVenta);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPrecio.setBounds(525, 189, 73, 16);
		frame.getContentPane().add(lblPrecio);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(594, 191, 261, 19);
		frame.getContentPane().add(textPrecio);
		
		JList list = new JList();
		list.setBounds(84, 316, 771, 159);
		frame.getContentPane().add(list);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAgregar.setFocusPainted(false);
		btnAgregar.setBorderPainted(false);
		btnAgregar.setBackground(new Color(171, 0, 51));
		btnAgregar.setBounds(738, 277, 117, 29);
		frame.getContentPane().add(btnAgregar);
		btnAgregar.addActionListener(this);
		
		btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(171, 0, 51));
		btnVolver.setBounds(10, 562, 139, 31);
		frame.getContentPane().add(btnVolver);
		
		btnCrear = new JButton("Crear");
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFont(new Font("Arial", Font.PLAIN, 17));
		btnCrear.setFocusPainted(false);
		btnCrear.setBorderPainted(false);
		btnCrear.setBackground(new Color(171, 0, 51));
		btnCrear.setBounds(738, 547, 117, 29);
		frame.getContentPane().add(btnCrear);
		btnCrear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnAgregar) {
			int opcion = JOptionPane.showConfirmDialog(null, "  Se ha agregado exitosamente!.\n\n ¿Quiere agregar otro producto?\n","Agregado",JOptionPane.YES_NO_OPTION);
			
			if(opcion==JOptionPane.YES_OPTION) {
				textIdSup.setText("");
				textClaveProduc.setText("");
				textCantidad.setText("");
				textIdVenta.setText("");
				textPrecio.setText("");
			}
		}
		
		else if(e.getSource()==btnCrear) {
			
			int opcion = JOptionPane.showConfirmDialog(null, "Se ha creado correctamente. \n\n¿Quiere crear otro?\n","Creado",JOptionPane.YES_NO_OPTION);
			
			if(opcion==JOptionPane.YES_OPTION) {
				textIdSup.setText("");
				textClaveProduc.setText("");
				textCantidad.setText("");
				textIdVenta.setText("");
				textPrecio.setText("");
			}
			else {
				menuAdmin menuAdmin = new menuAdmin();
				menuAdmin.frame.setVisible(true);
				frame.dispose();
			}
		}
		else {
			
		}
		
	}
}
