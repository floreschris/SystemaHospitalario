package com.project.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.SystemColor;

public class ConsultMedicine extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroTomas;
	private JTextField txtDescipcion;
	private JRadioButton rdbtnSi;
	private JTextField txtPrecioTotal;
	private JTextField txtPreciouno;
	private JTextField txtDescuento;
	private JTextField txtCopiaNombre;
	private JTextField txtInformacion;
	private JTextField txtnumeromedicmaento;
	private JTextField txtCantidad;
	private JTextField txtPagoFinal;

	public ConsultMedicine() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFCantidad_1_1 = new JLabel("");
		lblFCantidad_1_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-documento-100.png"));
		lblFCantidad_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFCantidad_1_1.setBounds(584, 657, 89, 93);
		contentPane.add(lblFCantidad_1_1);

		JLabel lblFCantidad_2 = new JLabel("");
		lblFCantidad_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-contador-100.png"));
		lblFCantidad_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFCantidad_2.setBounds(345, 378, 86, 51);
		contentPane.add(lblFCantidad_2);

		JLabel lblFCantidad_1 = new JLabel("");
		lblFCantidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFCantidad_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-pharmacy-shop-48.png"));
		lblFCantidad_1.setBounds(348, 554, 71, 51);
		contentPane.add(lblFCantidad_1);

		JLabel lblFCantidad = new JLabel("");
		lblFCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFCantidad.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-promedio-64.png"));
		lblFCantidad.setBounds(353, 437, 71, 51);
		contentPane.add(lblFCantidad);

		JLabel lblSoles = new JLabel("Soles");
		lblSoles.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoles.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\badge-dollar-solid-24.png"));
		lblSoles.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblSoles.setBounds(338, 500, 97, 43);
		contentPane.add(lblSoles);

		txtnumeromedicmaento = new JTextField();
		txtnumeromedicmaento.setBackground(SystemColor.scrollbar);
		txtnumeromedicmaento.setBounds(338, 159, 86, 20);
		contentPane.add(txtnumeromedicmaento);
		txtnumeromedicmaento.setColumns(10);

		JLabel lblnromedicamento = new JLabel("Nro° Medicamento");
		lblnromedicamento.setHorizontalAlignment(SwingConstants.LEFT);
		lblnromedicamento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblnromedicamento.setBounds(23, 149, 255, 39);
		contentPane.add(lblnromedicamento);

		JLabel lblinformedicamento = new JLabel("Informacion del medicamento");
		lblinformedicamento.setHorizontalAlignment(SwingConstants.LEFT);
		lblinformedicamento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblinformedicamento.setBounds(23, 238, 255, 39);
		contentPane.add(lblinformedicamento);

		txtInformacion = new JTextField();
		txtInformacion.setBackground(SystemColor.scrollbar);
		txtInformacion.setBorder(null);
		txtInformacion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtInformacion.setHorizontalAlignment(SwingConstants.LEFT);
		txtInformacion.setBounds(23, 301, 601, 66);
		contentPane.add(txtInformacion);
		txtInformacion.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Datos Medicamento");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-información-del-sistema-64.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(133, 96, 302, 52);
		contentPane.add(lblNewLabel_2);

		txtCopiaNombre = new JTextField();
		txtCopiaNombre.setBackground(SystemColor.scrollbar);
		txtCopiaNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtCopiaNombre.setBounds(338, 228, 255, 37);
		contentPane.add(txtCopiaNombre);
		txtCopiaNombre.setColumns(10);

		JLabel lblNewLabel = new JLabel("Consultorio Medicamentos");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel.setBounds(0, 11, 1120, 74);
		contentPane.add(lblNewLabel);

		JLabel lblNombreMedicamento = new JLabel("Nombre del medicamento");
		lblNombreMedicamento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNombreMedicamento.setBounds(23, 192, 269, 43);
		contentPane.add(lblNombreMedicamento);

		JLabel lblNumeroDeTomas = new JLabel("Pastillas al dia");
		lblNumeroDeTomas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNumeroDeTomas.setBounds(23, 554, 206, 43);
		contentPane.add(lblNumeroDeTomas);

		JLabel lblDuracion = new JLabel("Horarios");
		lblDuracion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDuracion.setBounds(23, 608, 145, 43);
		contentPane.add(lblDuracion);

		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDescripcion.setBounds(23, 686, 124, 45);
		contentPane.add(lblDescripcion);

		txtNumeroTomas = new JTextField();
		txtNumeroTomas.setBackground(SystemColor.scrollbar);
		txtNumeroTomas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtNumeroTomas.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumeroTomas.setToolTipText("");
		txtNumeroTomas.setColumns(10);
		txtNumeroTomas.setBounds(239, 555, 89, 45);
		contentPane.add(txtNumeroTomas);

		txtDescipcion = new JTextField();
		txtDescipcion.setBackground(SystemColor.scrollbar);
		txtDescipcion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtDescipcion.setHorizontalAlignment(SwingConstants.LEFT);
		txtDescipcion.setToolTipText("");
		txtDescipcion.setColumns(10);
		txtDescipcion.setBounds(203, 685, 308, 51);
		contentPane.add(txtDescipcion);

		JComboBox cbxMedicamentos = new JComboBox();
		cbxMedicamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String pastilla = cbxMedicamentos.getSelectedItem().toString();
				txtCopiaNombre.setText(pastilla);
				String informacion;

				try {

					if (pastilla.equalsIgnoreCase("Amitriptilina clorhidrato")) {
						// nro += 1;
						informacion = "Medicamento para tratar los síntomas de la depresión";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Amlodipino")) {
						// nro += 1;

						informacion = "Medicamento para reducir la presión arterial";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Amoxicilina")) {
						// nro += 1;

						informacion = "Medicamento para tratar ciertas " + "infecciones causadas por bacterias";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Amoxicilina + acido clavulénico")) {
						// nro += 1;
						informacion = "Medicamento para tratar infecciones causadas por bacterias";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Atorvastatina")) {
						// nro += 1;
						informacion = "Medicamento para disminuir la cantidad de colesterol en la sangre";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Azitromicina")) {
						// nro += 1;
						informacion = "Medicamento para tratar ciertas infecciones bacterianas, como la bronquitis, neumonía";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Beclometasona dipropionato")) {
						// nro += 1;
						informacion = "Medicamento para evitar la dificultad para respirar, opresión en el pecho";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Captopril")) {
						// nro += 1;
						informacion = "Medicamento para controla los síntomas de la hipertensión y de la insuficiencia cardíaca";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Carbamazepina")) {
						// nro += 1;
						informacion = "Medicamento para controlar ciertos tipos de convulsiones en personas con epilepsia";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Cefalexina")) {
						// nro += 1;
						informacion = "Medicamento para tratar algunas infecciones provocadas por bacterias como neumonía y otras infecciones del tracto respiratorio";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Clindamicina")) {
						// nro += 1;
						informacion = "Medicamento para tratar ciertos tipos de infecciones bacterianas, incluyendo infecciones de los pulmones";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Clorfenamina maleato")) {
						// nro += 1;
						informacion = "Medicamento para aliviar el enrojecimiento, la picazón y el lagrimeo de ojos; los estornudos";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Enalapril maleato")) {
						// nro += 1;
						informacion = "Medicamento para tratar la presión arterial alta";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Fenitoina sédica")) {
						// nro += 1;
						informacion = "Medicamento para prevenir las convulsiones que pueden empezar durante o después de la cirugía de cerebro o del sistema nervioso";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Fluoxetina")) {
						// nro += 1;
						informacion = "Medicamento para tratar los Antidepresivos";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Glibenclamida")) {
						// nro += 1;
						informacion = "Medicamento para tratar diabetes en los que no existe una secreción normal de insulina";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Ibuprofeno")) {
						// nro += 1;
						informacion = "Medicamento para reducir la fiebre y aliviar los dolores";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Loratadina")) {
						// nro += 1;
						informacion = "Medicamento para bloquear la acción de la histamina, una sustancia en el cuerpo que causa los síntomas de la alergia";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Losartan potasico")) {
						// nro += 1;
						informacion = "Medicamento para tratar la presión arterial alta";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Naproxeno")) {
						// nro += 1;
						informacion = "Medicamento para reducir la fiebre y aliviar los dolores leves";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Omeprazol")) {
						// nro += 1;
						informacion = "Medicamento para tratar la acidez estomacal frecuente";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					} else if (pastilla.equalsIgnoreCase("Paracetamol")) {
						// nro += 1;
						informacion = "Medicamento para tratar síntomas del dolor leve a moderado y la fiebre.";
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));

					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "No se encuentra su pastilla");
				}

			}
		});
		cbxMedicamentos.setBackground(SystemColor.scrollbar);
		cbxMedicamentos.setModel(new DefaultComboBoxModel(new String[] { "", "Amitriptilina clorhidrato", "Amlodipino",
				"Amoxicilina + acido clavulénico", "Atorvastatina", "Azitromicina", "Beclometasona dipropionato",
				"Captopril", "Carbamazepina", "Cefalexina", "Clindamicina", "Clorfenamina maleato", "Enalapril maleato",
				"Fenitoina sédica", "Fluoxetina", "Glibenclamida", "Ibuprofeno", "Loratadina", "Losartan potasico",
				"Naproxeno", "Omeprazol", "Paracetamol" }));
		cbxMedicamentos.setBounds(338, 190, 255, 27);
		contentPane.add(cbxMedicamentos);

		JLabel lblAlergivoAlgunMeducamento = new JLabel("Alergivo algun medicamento");
		lblAlergivoAlgunMeducamento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblAlergivoAlgunMeducamento.setBounds(23, 645, 244, 43);
		contentPane.add(lblAlergivoAlgunMeducamento);

		rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setToolTipText("");
		rdbtnSi.setForeground(new Color(0, 0, 0));
		rdbtnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String descipcion;
				descipcion = JOptionPane.showInputDialog("Ingrese Descripcion de la alergia del medicamento");
				txtDescipcion.setText(descipcion);

			}
		});
		rdbtnSi.setBackground(SystemColor.controlShadow);
		rdbtnSi.setBounds(306, 657, 109, 23);
		contentPane.add(rdbtnSi);

		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String descipcion = "Ninguna alergia";
				txtDescipcion.setText(descipcion);
			}
		});
		rdbtnNo.setBackground(SystemColor.controlShadow);
		rdbtnNo.setBounds(449, 657, 109, 23);
		contentPane.add(rdbtnNo);

		JButton btnCalculo = new JButton("Importe");
		btnCalculo.setBackground(SystemColor.controlShadow);
		btnCalculo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\dollar-circle-solid-24.png"));
		btnCalculo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					double cantidad, preciototal, precio;
					int numeroTomas, acumulacionPastillas;

					precio = Double.parseDouble(txtPreciouno.getText());
					cantidad = Integer.parseInt(txtCantidad.getText());
					numeroTomas = Integer.parseInt(txtNumeroTomas.getText());

					preciototal = cantidad * precio;
					acumulacionPastillas = (int) cantidad * numeroTomas;

					txtPrecioTotal.setText(String.valueOf((int) preciototal));

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Datos incompletos para hallar....");
				}
			}
		});
		btnCalculo.setBounds(684, 192, 178, 43);
		contentPane.add(btnCalculo);

		JRadioButton rdbtnMaana = new JRadioButton("Mañana");
		rdbtnMaana.setBackground(SystemColor.controlShadow);
		rdbtnMaana.setBounds(203, 620, 109, 23);
		contentPane.add(rdbtnMaana);

		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		rdbtnTarde.setBackground(SystemColor.controlShadow);
		rdbtnTarde.setBounds(338, 620, 109, 23);
		contentPane.add(rdbtnTarde);

		JRadioButton rdbtnNoche = new JRadioButton("Noche");
		rdbtnNoche.setBackground(SystemColor.controlShadow);
		rdbtnNoche.setBounds(484, 620, 109, 23);
		contentPane.add(rdbtnNoche);

		JLabel lblPrecio = new JLabel("Precio c/u");
		lblPrecio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPrecio.setBounds(23, 500, 145, 43);
		contentPane.add(lblPrecio);

		JLabel lblPrecioTotal = new JLabel("Importe");
		lblPrecioTotal.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-venta-tienda-financiamiento-finanzas-pago-de-dinero-compras-10-100.png"));
		lblPrecioTotal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPrecioTotal.setBounds(634, 302, 200, 102);
		contentPane.add(lblPrecioTotal);

		txtPrecioTotal = new JTextField();
		txtPrecioTotal.setBackground(Color.LIGHT_GRAY);
		txtPrecioTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrecioTotal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtPrecioTotal.setToolTipText("");
		txtPrecioTotal.setColumns(10);
		txtPrecioTotal.setBounds(833, 332, 255, 43);
		contentPane.add(txtPrecioTotal);

		txtPreciouno = new JTextField();
		txtPreciouno.setBackground(SystemColor.scrollbar);
		txtPreciouno.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtPreciouno.setHorizontalAlignment(SwingConstants.CENTER);
		txtPreciouno.setColumns(10);
		txtPreciouno.setBounds(239, 501, 89, 43);
		contentPane.add(txtPreciouno);

		JLabel lblCantidadAComprar = new JLabel("Cantidad");
		lblCantidadAComprar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblCantidadAComprar.setBounds(23, 445, 145, 43);
		contentPane.add(lblCantidadAComprar);

		JButton btnDescuento = new JButton("Descuento");
		btnDescuento.setBackground(SystemColor.controlShadow);
		btnDescuento.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\discount-solid-24.png"));
		btnDescuento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnDescuento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					int cantidad;
					double preciototal, precio, descuento, DescuentoPagar;

					cantidad = Integer.parseInt(txtCantidad.getText());
					precio = Double.parseDouble(txtPreciouno.getText());

					preciototal = cantidad * precio;

					if (cantidad >= 2 && cantidad <= 4) {

						// 5%
						descuento = preciototal * 0.05;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));
						txtDescuento.setText(String.valueOf((int) DescuentoPagar));

					} else if (cantidad >= 5 && cantidad <= 8) {

						descuento = preciototal * 0.1;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));

					} else if (cantidad >= 9 && cantidad <= 12) {

						descuento = preciototal * 0.2;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));

					} else if (cantidad >= 13 && cantidad <= 15) {

						descuento = preciototal * 0.25;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));

					} else if (cantidad >= 16 && cantidad <= 20) {
						descuento = preciototal * 0.3;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));
					} else if (cantidad >= 21 && cantidad <= 30) {
						descuento = preciototal * 0.4;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));
					} else if (cantidad >= 31 && cantidad <= 100) {
						descuento = preciototal * 0.5;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));
					}
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Datos incompletos...");
				}

			}
		});
		btnDescuento.setBounds(890, 192, 178, 43);
		contentPane.add(btnDescuento);

		JLabel lblDescuento = new JLabel("Descuento");
		lblDescuento.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-lowest-price-100.png"));
		lblDescuento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDescuento.setBounds(623, 415, 211, 102);
		contentPane.add(lblDescuento);

		txtDescuento = new JTextField();
		txtDescuento.setHorizontalAlignment(SwingConstants.CENTER);
		txtDescuento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtDescuento.setBackground(Color.LIGHT_GRAY);
		txtDescuento.setToolTipText("");
		txtDescuento.setColumns(10);
		txtDescuento.setBounds(844, 558, 255, 43);
		contentPane.add(txtDescuento);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setToolTipText("");
		dateChooser.setBackground(SystemColor.controlShadow);
		dateChooser.setDateFormatString("yyyy/MM/dd HH:mm:ss");
		dateChooser.setBounds(767, 696, 301, 35);
		dateChooser.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(dateChooser);

		JSpinner spnCantidad = new JSpinner();
		spnCantidad.setBackground(SystemColor.scrollbar);
		spnCantidad.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spnCantidad.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				txtCantidad.setText(spnCantidad.getValue().toString());

			}
		});
		spnCantidad.setBounds(239, 392, 86, 45);
		contentPane.add(spnCantidad);

		JLabel lblNewLabel_2_1 = new JLabel("Fecha");
		lblNewLabel_2_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-horas-extras-48.png"));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2_1.setBounds(794, 643, 244, 42);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Datos de Pago");
		lblNewLabel_2_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-información-del-sistema-64 (1).png"));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2_2.setBounds(735, 96, 291, 52);
		contentPane.add(lblNewLabel_2_2);

		txtCantidad = new JTextField();
		txtCantidad.setBackground(SystemColor.scrollbar);
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(239, 447, 89, 43);
		contentPane.add(txtCantidad);

		JLabel lblElijaElValor = new JLabel("Elija el valor");
		lblElijaElValor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblElijaElValor.setBounds(23, 391, 145, 43);
		contentPane.add(lblElijaElValor);

		JLabel lblPagoFinal = new JLabel("Pago final");
		lblPagoFinal.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-historial-de-pagos-100.png"));
		lblPagoFinal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPagoFinal.setBounds(635, 530, 199, 90);
		contentPane.add(lblPagoFinal);

		txtPagoFinal = new JTextField();
		txtPagoFinal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtPagoFinal.setHorizontalAlignment(SwingConstants.CENTER);
		txtPagoFinal.setBackground(Color.LIGHT_GRAY);
		txtPagoFinal.setToolTipText("");
		txtPagoFinal.setColumns(10);
		txtPagoFinal.setBounds(844, 445, 255, 43);
		contentPane.add(txtPagoFinal);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\top-view-capsule-pills-on-pink-background-prescription-drugs-blue-capsule-pills-pharmaceutical-industry-medicament-and-pharmacology-drug-development-and-new-drug-r.jpg"));
		lblFondo.setBounds(0, 0, 1120, 761);
		contentPane.add(lblFondo);

	}
}
