package com.project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Cal_Habitaciones extends JFrame {

	private JPanel rdbtnT;
	private JTextField txtCantidad;
	private JTextField txtTipo;
	private JTextField txtRemuneracion;
	private JTextField txtPiso;
	private JTextField txtHabitaciones;
	private JTextField txtCantidadPacientes;

	ButtonGroup grupo = new ButtonGroup();
	private JTextField txtImportePersonal;

	public void LimpiarDatos() {

		txtCantidad.setText("");
		txtImportePersonal.setText("");
		txtRemuneracion.setText("");
		txtTipo.setText("");
		txtCantidadPacientes.setText("");
		txtHabitaciones.setText("");
		txtPiso.setText("");
	}

	public Cal_Habitaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 800);
		rdbtnT = new JPanel();
		rdbtnT.setBackground(SystemColor.activeCaption);
		rdbtnT.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(rdbtnT);
		rdbtnT.setLayout(null);

		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Sistema_Venta\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-cama-de-hospital-64.png"));
		lblNewLabel_4_1.setBounds(330, 685, 71, 65);
		rdbtnT.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Sistema_Venta\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-cama-de-hospital-100.png"));
		lblNewLabel_4_2.setBounds(658, 533, 137, 95);
		rdbtnT.add(lblNewLabel_4_2);

		JLabel lblNewLabel_4_4 = new JLabel("");
		lblNewLabel_4_4.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Sistema_Venta\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-hospital-96 (1).png"));
		lblNewLabel_4_4.setBounds(624, 113, 109, 98);
		rdbtnT.add(lblNewLabel_4_4);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(210, 685, 109, 65);
		rdbtnT.add(lblNewLabel_4);

		JLabel lblNewLabel = new JLabel("INFORME DE HABITACIONES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 67));
		lblNewLabel.setBounds(10, 0, 1110, 72);
		rdbtnT.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Sistema Hospitalario Dedalus ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(87, 79, 517, 56);
		rdbtnT.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Personal");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Sistema_Venta\\System_Hospital\\src\\main\\java\\com\\project\\img\\hand-right-solid-24.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(134, 139, 305, 56);
		rdbtnT.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Habitaciones");
		lblNewLabel_2_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Sistema_Venta\\System_Hospital\\src\\main\\java\\com\\project\\img\\hand-right-solid-24.png"));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_1.setBounds(743, 139, 305, 56);
		rdbtnT.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Cantidad");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_2_2.setBounds(92, 466, 137, 56);
		rdbtnT.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_2_1 = new JLabel("Tipo");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_2_2_1.setBounds(92, 283, 137, 56);
		rdbtnT.add(lblNewLabel_2_2_1);

		JComboBox comboBoxPersonal = new JComboBox();
		comboBoxPersonal.setBackground(SystemColor.activeCaptionBorder);
		comboBoxPersonal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		comboBoxPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int remuneracion, cantidad;
				String limpieza, enfermeros, seguridad;
				String tipo = comboBoxPersonal.getSelectedItem().toString();
				txtTipo.setText(tipo);

				if (tipo.equalsIgnoreCase("Limpieza")) {

					remuneracion = 930;
					txtRemuneracion.setText(String.valueOf(remuneracion));

				} else if (tipo.equalsIgnoreCase("Enfermeros(a)")) {

					remuneracion = 1200;
					txtRemuneracion.setText(String.valueOf(remuneracion));

				} else if (tipo.equalsIgnoreCase("Seguridad")) {

					remuneracion = 1500;
					txtRemuneracion.setText(String.valueOf(remuneracion));

				}

			}
		});
		comboBoxPersonal
				.setModel(new DefaultComboBoxModel(new String[] { "", "Limpieza", "Enfermeros(a)", "Seguridad" }));
		comboBoxPersonal.setBounds(338, 222, 172, 56);
		rdbtnT.add(comboBoxPersonal);

		txtCantidad = new JTextField();
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setBackground(SystemColor.activeCaptionBorder);
		txtCantidad.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtCantidad.setBounds(338, 466, 172, 56);
		rdbtnT.add(txtCantidad);
		txtCantidad.setColumns(10);

		JLabel lblNewLabel_2_2_1_1 = new JLabel("Seleccion");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_2_2_1_1.setBounds(92, 218, 137, 56);
		rdbtnT.add(lblNewLabel_2_2_1_1);

		txtTipo = new JTextField();
		txtTipo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTipo.setBackground(SystemColor.activeCaptionBorder);
		txtTipo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtTipo.setColumns(10);
		txtTipo.setBounds(338, 289, 172, 56);
		rdbtnT.add(txtTipo);

		JLabel lblNewLabel_2_2_2 = new JLabel("Remuneracion");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_2_2_2.setBounds(89, 356, 209, 56);
		rdbtnT.add(lblNewLabel_2_2_2);

		txtRemuneracion = new JTextField();
		txtRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		txtRemuneracion.setBackground(SystemColor.activeCaptionBorder);
		txtRemuneracion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtRemuneracion.setColumns(10);
		txtRemuneracion.setBounds(338, 356, 172, 56);
		rdbtnT.add(txtRemuneracion);

		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Numero");
		lblNewLabel_2_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_2_2_1_1_1.setBounds(682, 244, 137, 56);
		rdbtnT.add(lblNewLabel_2_2_1_1_1);

		JComboBox comboxHabitaciones = new JComboBox();
		comboxHabitaciones.setBackground(SystemColor.activeCaptionBorder);
		comboxHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int piso = Integer.parseInt(comboxHabitaciones.getSelectedItem().toString());
				int numeroHabitaciones;
				if (piso == 1) {

					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 8;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 2) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 10;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));
				} else if (piso == 3) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 12;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 14) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 16;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 5) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 18;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 6) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 20;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 7) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 22;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 8) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 24;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 9) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 26;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 10) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 28;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 11) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 30;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 12) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 32;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 13) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 30;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 14) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 24;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 15) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 20;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 16) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 40;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 17) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 16;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 18) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 18;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 19) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 10;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				} else if (piso == 20) {
					txtPiso.setText(String.valueOf(piso));
					numeroHabitaciones = 12;
					txtHabitaciones.setText(String.valueOf(numeroHabitaciones));
					txtCantidadPacientes.setText(String.valueOf(numeroHabitaciones * 2));

				}

			}
		});
		comboxHabitaciones.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
		comboxHabitaciones.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		comboxHabitaciones.setBounds(866, 244, 172, 56);
		rdbtnT.add(comboxHabitaciones);

		JLabel lblNewLabel_2_2_1_2 = new JLabel("Piso");
		lblNewLabel_2_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_2_2_1_2.setBounds(682, 322, 137, 56);
		rdbtnT.add(lblNewLabel_2_2_1_2);

		txtPiso = new JTextField();
		txtPiso.setHorizontalAlignment(SwingConstants.CENTER);
		txtPiso.setBackground(SystemColor.activeCaptionBorder);
		txtPiso.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtPiso.setColumns(10);
		txtPiso.setBounds(866, 311, 172, 56);
		rdbtnT.add(txtPiso);

		JLabel lblNewLabel_2_2_2_1 = new JLabel("Habitaciones");
		lblNewLabel_2_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_2_2_2_1.setBounds(670, 389, 184, 56);
		rdbtnT.add(lblNewLabel_2_2_2_1);

		txtHabitaciones = new JTextField();
		txtHabitaciones.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitaciones.setBackground(SystemColor.activeCaptionBorder);
		txtHabitaciones.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtHabitaciones.setColumns(10);
		txtHabitaciones.setBounds(866, 389, 172, 56);
		rdbtnT.add(txtHabitaciones);

		JLabel lblNewLabel_2_2_3 = new JLabel("Cantidad de pacientes");
		lblNewLabel_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_2_2_3.setBounds(532, 456, 326, 56);
		rdbtnT.add(lblNewLabel_2_2_3);

		txtCantidadPacientes = new JTextField();
		txtCantidadPacientes.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidadPacientes.setBackground(SystemColor.activeCaptionBorder);
		txtCantidadPacientes.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtCantidadPacientes.setColumns(10);
		txtCantidadPacientes.setBounds(866, 456, 172, 56);
		rdbtnT.add(txtCantidadPacientes);

		JRadioButton rdbtnM = new JRadioButton("Mañana");
		rdbtnM.setBackground(SystemColor.activeCaption);
		rdbtnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecion = txtTipo.getText();
				if (selecion.equalsIgnoreCase("Limpieza")) {
					int cantidad = 20;
					txtCantidad.setText(String.valueOf(cantidad));
				} else if (selecion.equalsIgnoreCase("Enfermeros(a)")) {
					int cantidad = 50;
					txtCantidad.setText(String.valueOf(cantidad));
				} else if (selecion.equalsIgnoreCase("Seguridad")) {
					int cantidad = 10;
					txtCantidad.setText(String.valueOf(cantidad));
				}

			}
		});
		rdbtnM.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		rdbtnM.setBounds(102, 436, 109, 23);
		rdbtnT.add(rdbtnM);

		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		rdbtnTarde.setBackground(SystemColor.activeCaption);
		rdbtnTarde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecion = txtTipo.getText();
				if (selecion.equalsIgnoreCase("Limpieza")) {
					int cantidad = 30;
					txtCantidad.setText(String.valueOf(cantidad));
				} else if (selecion.equalsIgnoreCase("Enfermeros(a)")) {
					int cantidad = 80;
					txtCantidad.setText(String.valueOf(cantidad));
				} else if (selecion.equalsIgnoreCase("Seguridad")) {
					int cantidad = 15;
					txtCantidad.setText(String.valueOf(cantidad));
				}
			}
		});
		rdbtnTarde.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		rdbtnTarde.setBounds(221, 436, 109, 23);
		rdbtnT.add(rdbtnTarde);

		JRadioButton rdbtnN = new JRadioButton("Noche");
		rdbtnN.setBackground(SystemColor.activeCaption);
		rdbtnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecion = txtTipo.getText();
				if (selecion.equalsIgnoreCase("Limpieza")) {
					int cantidad = 10;
					txtCantidad.setText(String.valueOf(cantidad));
				} else if (selecion.equalsIgnoreCase("Enfermeros(a)")) {
					int cantidad = 60;
					txtCantidad.setText(String.valueOf(cantidad));
				} else if (selecion.equalsIgnoreCase("Seguridad")) {
					int cantidad = 20;
					txtCantidad.setText(String.valueOf(cantidad));
				}
			}
		});
		rdbtnN.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		rdbtnN.setBounds(343, 436, 109, 23);
		rdbtnT.add(rdbtnN);

		grupo.add(rdbtnN);
		grupo.add(rdbtnTarde);
		grupo.add(rdbtnM);

		JButton btnNewButton = new JButton("Importe");
		btnNewButton.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Sistema_Venta\\System_Hospital\\src\\main\\java\\com\\project\\img\\git-merge-regular-24.png"));
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int cantidad, renumeracion, importe;
				try {
					cantidad = Integer.parseInt(txtCantidad.getText());
					renumeracion = Integer.parseInt(txtRemuneracion.getText());
					importe = cantidad * renumeracion;
					txtImportePersonal.setText(String.valueOf(" Importe del hospital mensual: " + importe));

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Se necesita datos.....");
				}

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		btnNewButton.setBounds(505, 655, 219, 56);
		rdbtnT.add(btnNewButton);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Sistema_Venta\\System_Hospital\\src\\main\\java\\com\\project\\img\\pencil-solid-24.png"));
		btnLimpiar.setBackground(SystemColor.activeCaptionBorder);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				LimpiarDatos();

			}
		});
		btnLimpiar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		btnLimpiar.setBounds(765, 655, 230, 56);
		rdbtnT.add(btnLimpiar);

		JLabel lblNewLabel_2_2_4 = new JLabel("Importe del personal total");
		lblNewLabel_2_2_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_2_2_4.setBounds(101, 547, 373, 56);
		rdbtnT.add(lblNewLabel_2_2_4);

		txtImportePersonal = new JTextField();
		txtImportePersonal.setHorizontalAlignment(SwingConstants.CENTER);
		txtImportePersonal.setBackground(SystemColor.activeCaptionBorder);
		txtImportePersonal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtImportePersonal.setBounds(95, 614, 344, 53);
		rdbtnT.add(txtImportePersonal);
		txtImportePersonal.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBackground(SystemColor.activeCaptionBorder);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Sistema_Venta\\System_Hospital\\src\\main\\java\\com\\project\\img\\depositphotos_72083543-stock-photo-mri-scanner.jpg"));
		lblNewLabel_3.setBounds(87, 79, 983, 682);
		rdbtnT.add(lblNewLabel_3);

		JLabel lblNewLabel_4_3 = new JLabel("");
		lblNewLabel_4_3.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Sistema_Venta\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-hospital-96 (1).png"));
		lblNewLabel_4_3.setBounds(-12, 636, 109, 114);
		rdbtnT.add(lblNewLabel_4_3);

		JLabel lblNewLabel_4_5 = new JLabel("");
		lblNewLabel_4_5.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Sistema_Venta\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-hospital-6.png"));
		lblNewLabel_4_5.setBounds(0, 0, 97, 86);
		rdbtnT.add(lblNewLabel_4_5);

	}
}
