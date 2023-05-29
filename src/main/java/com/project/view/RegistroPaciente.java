package com.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.project.Impl.MedicoImpl;
import com.project.Impl.PacienteImpl;
import com.project.model.Paciente;
import com.project.model.Persona;

public class RegistroPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField textFId;
	private JTextField textFId_Paciente;
	private JTextField textFNombre;
	private JTextField textFApelldoP;
	private JTextField textFApellidoM;
	private JTextField textFEdad;
	private JTextField textFTelefono;
	private JTextField textFCorreo;
	private JTextField textFDireccion;
	private JTable tablePaciente;
	private JTextField textFieldGenero;

	private ArrayList<Paciente> list_P;

	PacienteImpl paciImpl = new PacienteImpl();

	public void Limpiar() {

		textFApelldoP.setText("");
		textFApellidoM.setText("");
		textFCorreo.setText("");
		textFDireccion.setText("");
		textFEdad.setText("");
		textFId.setText("");
		textFId_Paciente.setText("");
		textFNombre.setText("");
		textFTelefono.setText("");
		textFieldGenero.setText("");

	}

	public void Ver_Datos() {

		String Mat[][] = new String[list_P.size()][10];
		Paciente paciente;

		for (int i = 0; i < Mat.length; i++) {
			paciente = list_P.get(i);
			Mat[i][0] = Integer.toString(paciente.getId());
			Mat[i][1] = Integer.toString(paciente.getId_Paciente());
			Mat[i][2] = paciente.getNombre();
			Mat[i][3] = paciente.getApellido_paterno();
			Mat[i][4] = paciente.getApellido_materno();
			Mat[i][5] = paciente.getGenero();
			Mat[i][6] = Integer.toString(paciente.getEdad());
			Mat[i][7] = paciente.getCorreo();
			Mat[i][8] = paciente.getDireccion();
			Mat[i][9] = Integer.toString(paciente.getTelefono());

		}

		tablePaciente.setModel(new DefaultTableModel(Mat, new String[] { "Id", "Id_Paciente", "Nombre", "Apellido_P",
				"Apellido_M", "Genero", "Edad", "Correo", "Direccion", "Telefono" }));

	}

	public RegistroPaciente() {

		list_P = new ArrayList<Paciente>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFieldGenero = new JTextField();
		textFieldGenero.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFieldGenero.setColumns(10);
		textFieldGenero.setBounds(797, 199, 168, 24);
		contentPane.add(textFieldGenero);

		JLabel lblTitul = new JLabel("Registro de Paciente");
		lblTitul.setForeground(Color.BLACK);
		lblTitul.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitul.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 70));
		lblTitul.setBounds(175, 11, 790, 82);
		contentPane.add(lblTitul);

		JLabel lblId = new JLabel("Dni");
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblId.setForeground(Color.BLACK);
		lblId.setBounds(47, 129, 84, 28);
		contentPane.add(lblId);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setBounds(703, 129, 84, 28);
		contentPane.add(lblNombre);

		JLabel lblApellido_P = new JLabel("Apellido Paterno");
		lblApellido_P.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblApellido_P.setForeground(Color.BLACK);
		lblApellido_P.setBounds(33, 196, 98, 28);
		contentPane.add(lblApellido_P);

		JLabel lblApellido_M = new JLabel("Apellido Materno");
		lblApellido_M.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblApellido_M.setForeground(Color.BLACK);
		lblApellido_M.setBounds(347, 196, 110, 28);
		contentPane.add(lblApellido_M);

		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblGenero.setForeground(Color.BLACK);
		lblGenero.setBounds(703, 196, 84, 28);
		contentPane.add(lblGenero);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblEdad.setForeground(Color.BLACK);
		lblEdad.setBounds(47, 252, 84, 28);
		contentPane.add(lblEdad);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblTelefono.setForeground(Color.BLACK);
		lblTelefono.setBounds(373, 252, 84, 28);
		contentPane.add(lblTelefono);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblCorreo.setForeground(Color.BLACK);
		lblCorreo.setBounds(703, 252, 84, 28);
		contentPane.add(lblCorreo);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblDireccion.setForeground(Color.BLACK);
		lblDireccion.setBounds(47, 313, 84, 28);
		contentPane.add(lblDireccion);

		JLabel lblId_Paciente = new JLabel("Id_Paciente");
		lblId_Paciente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblId_Paciente.setForeground(Color.BLACK);
		lblId_Paciente.setBounds(373, 129, 84, 28);
		contentPane.add(lblId_Paciente);

		textFId = new JTextField();
		textFId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFId.setBounds(141, 130, 168, 28);
		contentPane.add(textFId);
		textFId.setColumns(10);

		textFId_Paciente = new JTextField();
		textFId_Paciente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFId_Paciente.setColumns(10);
		textFId_Paciente.setBounds(467, 132, 168, 24);
		contentPane.add(textFId_Paciente);

		textFNombre = new JTextField();
		textFNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFNombre.setColumns(10);
		textFNombre.setBounds(797, 132, 168, 24);
		contentPane.add(textFNombre);

		textFApelldoP = new JTextField();
		textFApelldoP.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFApelldoP.setColumns(10);
		textFApelldoP.setBounds(141, 200, 168, 24);
		contentPane.add(textFApelldoP);

		textFApellidoM = new JTextField();
		textFApellidoM.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFApellidoM.setColumns(10);
		textFApellidoM.setBounds(467, 200, 168, 24);
		contentPane.add(textFApellidoM);

		textFEdad = new JTextField();
		textFEdad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFEdad.setColumns(10);
		textFEdad.setBounds(141, 256, 168, 24);
		contentPane.add(textFEdad);

		textFTelefono = new JTextField();
		textFTelefono.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFTelefono.setColumns(10);
		textFTelefono.setBounds(467, 256, 168, 24);
		contentPane.add(textFTelefono);

		textFCorreo = new JTextField();
		textFCorreo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFCorreo.setColumns(10);
		textFCorreo.setBounds(797, 258, 168, 22);
		contentPane.add(textFCorreo);

		textFDireccion = new JTextField();
		textFDireccion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFDireccion.setColumns(10);
		textFDireccion.setBounds(141, 317, 168, 24);
		contentPane.add(textFDireccion);

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnAgregar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\add-to-queue-solid-24.png"));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nombre, apellidoP, genero, direccion, email, apellidoM;
				Integer id_paciente, id, edad, telefono;
				try {

					id = Integer.parseInt(textFId.getText());
					id_paciente = Integer.parseInt(textFId_Paciente.getText());
					nombre = textFNombre.getText();
					apellidoP = textFApelldoP.getText();
					apellidoM = textFApellidoM.getText();
					genero = textFieldGenero.getText();
					direccion = textFDireccion.getText();
					email = textFCorreo.getText();
					edad = Integer.parseInt(textFEdad.getText());
					telefono = Integer.parseInt(textFTelefono.getText());

					list_P.add(new Paciente(id, nombre, apellidoP, apellidoM, id_paciente, email, telefono, direccion,
							genero, edad));

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Verifique los datos...");

				}

				paciImpl.insertar(textFId);
				Limpiar();
				Ver_Datos();

			}
		});
		btnAgregar.setBounds(47, 407, 117, 47);
		contentPane.add(btnAgregar);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\edit-solid-24.png"));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Paciente patient;
				int fila_determinada;
				String nombre, apellidoP, genero, direccion, email, apellidoM, determinado = "";
				Integer id_paciente, id, edad, telefono, str;

				try {

					fila_determinada = tablePaciente.getSelectedRow();
					patient = list_P.get(fila_determinada);

					determinado = JOptionPane.showInputDialog(
							"Columna de moficacion?.... \nDni \nId_Paciente \nNombre \nApellido_Paterno \nApellido_Materno \nEmail \nDireccion \nTelefono \nGenero \nEdad");

					switch (determinado.toLowerCase()) {
					case "dni":

						id = Integer.parseInt(JOptionPane.showInputDialog("Nuevo dni"));
						patient.setId(id);
						paciImpl.modificando(determinado, id);
						break;
					case "id_paciente":
						id_paciente = Integer.parseInt(JOptionPane.showInputDialog("Nuevo id Paciente"));
						patient.setId_Paciente(id_paciente);
						paciImpl.modificando(determinado, id_paciente);
						break;
					case "nombre":
						nombre = JOptionPane.showInputDialog("Nuevo nombre");
						patient.setNombre(nombre);
						paciImpl.modificando(nombre, determinado);
						break;
					case "apellido_paterno":
						apellidoP = JOptionPane.showInputDialog("Nuevo apellido Paterno");
						patient.setApellido_paterno(apellidoP);
						paciImpl.modificando(apellidoP, determinado);
						break;
					case "apellido_materno":
						apellidoM = JOptionPane.showInputDialog("Nuevo apellido Materno");
						patient.setApellido_materno(apellidoM);
						paciImpl.modificando(apellidoM, determinado);
						break;
					case "email":
						email = JOptionPane.showInputDialog("Nuevo correo");
						patient.setCorreo(email);
						paciImpl.modificando(email, determinado);
						break;
					case "direccion":
						direccion = JOptionPane.showInputDialog("Nueva direccion");
						patient.setDireccion(direccion);
						paciImpl.modificando(direccion, determinado);
						break;
					case "telefono":
						telefono = Integer.parseInt(JOptionPane.showInputDialog("Nuevo telefono"));
						patient.setTelefono(telefono);
						paciImpl.modificando(telefono, determinado);
						break;
					case "genero":
						genero = JOptionPane.showInputDialog("Nuevo genero");
						patient.setGenero(genero);
						paciImpl.modificando(genero, determinado);
						break;
					case "edad":
						edad = Integer.parseInt(JOptionPane.showInputDialog("Nueva Edad"));
						patient.setEdad(edad);
						paciImpl.modificando(edad, determinado);
						break;

					default:
						JOptionPane.showMessageDialog(null, "No se encuentra la columna de modificacion...");
						break;

					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Elija fila para modificar...");
				}

				Ver_Datos();

			}
		});
		btnModificar.setBounds(47, 497, 117, 47);
		contentPane.add(btnModificar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\message-x-solid-24.png"));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int eliminar_fila;

				try {

					eliminar_fila = tablePaciente.getSelectedRow();
					list_P.remove(eliminar_fila);

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Seleccione fila para ser eliminada...");
				}

				Ver_Datos();

			}
		});
		btnEliminar.setBounds(47, 578, 117, 47);
		contentPane.add(btnEliminar);

		tablePaciente = new JTable();
		tablePaciente.setBackground(SystemColor.activeCaption);
		tablePaciente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		tablePaciente.setModel(new DefaultTableModel(
				new Object[][] {
						{ "Id", "Id_Paciente", "Nombre", "Apellido_P", "Apellido_M", "Genero", "Edad", "Correo",
								"Direccion", "Telefono" },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "Id", "Id_Paciente", "Nombre", "Apellido_P", "Apellido_M", "Genero", "Edad", "Correo",
						"Direccion", "Telefono" }));
		tablePaciente.getColumnModel().getColumn(0).setPreferredWidth(39);
		tablePaciente.getColumnModel().getColumn(7).setPreferredWidth(89);
		tablePaciente.getColumnModel().getColumn(8).setPreferredWidth(87);
		tablePaciente.setBounds(347, 321, 748, 388);
		contentPane.add(tablePaciente);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\56882.jpg"));
		lblFondo.setBounds(0, 0, 1120, 761);
		contentPane.add(lblFondo);
	}
}
