package com.project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import com.project.model.Medico;

public class RegistroMedico extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldId_Medico;
	private JTextField textFiellId_Especialidad;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidoP;
	private JTextField textFieldApellidoM;
	private JLabel lblId_Medico;
	private JTable tableMedic;
	private JTextField textFieldCmp;


	private ArrayList<Medico> list_M;
	private JTextField textFieldEspecialidad;

	public void Limpiar() {

		textFieldId.setText("");
		textFieldId_Medico.setText("");
		textFiellId_Especialidad.setText("");
		textFieldNombre.setText("");
		textFieldApellidoP.setText("");
		textFieldApellidoM.setText("");
		textFieldCmp.setText("");
		textFieldEspecialidad.setText("");

	}

	public void Ver_Datos() {

		String Mat[][] = new String[list_M.size()][8];
		Medico medic;

		for (int i = 0; i < Mat.length; i++) {

			medic = list_M.get(i);
			Mat[i][0] = Integer.toString(medic.getId());
			Mat[i][1] = Integer.toString(medic.getId_Medico());
			Mat[i][2] = Integer.toString(medic.getId_Especialidad());
			Mat[i][3] = medic.getNombre();
			Mat[i][4] = medic.getApellido_paterno();
			Mat[i][5] = medic.getApellido_materno();
			Mat[i][6] = medic.getCmp();
			Mat[i][7] = medic.getNombre_Especialidad();

		}

		tableMedic.setModel(new DefaultTableModel(Mat, new String[] { "Id", "Id_Medico", "Id_Especialidad", "Nombre",
				"Apellido_Paterno", "Apellido_Materno", "Cmp", "Especialidad" }));
	}

	/**
	 * Create the frame.
	 */
	public RegistroMedico() {

		list_M = new ArrayList<Medico>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tableMedic = new JTable();
		tableMedic.setBackground(SystemColor.activeCaption);
		tableMedic.setModel(new DefaultTableModel(new Object[][] {
				{ "Id", "Id_Medico", "Id_Especialidad", "Nombre", "Apellido_Paterno", "Apellido_Materno", "Cmp",
						"Especialidad" },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, },
				new String[] { "Dni", "Id_Medico", "Id_Especialidad", "Nombre", "Apellido_P", "Apellido_M", "Cmp",
						"Especialidad" }));
		tableMedic.getColumnModel().getColumn(0).setPreferredWidth(92);
		tableMedic.getColumnModel().getColumn(1).setPreferredWidth(88);
		tableMedic.getColumnModel().getColumn(2).setPreferredWidth(87);
		tableMedic.getColumnModel().getColumn(3).setPreferredWidth(88);
		tableMedic.getColumnModel().getColumn(4).setPreferredWidth(94);
		tableMedic.getColumnModel().getColumn(5).setPreferredWidth(95);
		tableMedic.getColumnModel().getColumn(6).setPreferredWidth(108);
		tableMedic.getColumnModel().getColumn(7).setPreferredWidth(95);

		textFieldEspecialidad = new JTextField();
		textFieldEspecialidad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFieldEspecialidad.setBounds(590, 240, 125, 20);
		contentPane.add(textFieldEspecialidad);
		textFieldEspecialidad.setColumns(10);

		textFieldCmp = new JTextField();
		textFieldCmp.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFieldCmp.setColumns(10);
		textFieldCmp.setBounds(267, 238, 148, 22);
		contentPane.add(textFieldCmp);

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre, apellidoM, apellidoP, especialidad, cmp;
				Integer id, id_Medico, id_Especialidad;

				try {

					id = Integer.parseInt(textFieldId.getText());
					nombre = textFieldNombre.getText();
					apellidoP = textFieldApellidoP.getText();
					apellidoM = textFieldApellidoM.getText();
					id_Medico = Integer.parseInt(textFieldId_Medico.getText());
					cmp = textFieldCmp.getText();
					id_Especialidad = Integer.parseInt(textFiellId_Especialidad.getText());
					especialidad = textFieldEspecialidad.getText();

					list_M.add(new Medico(id, nombre, apellidoP, apellidoM, id_Medico, cmp, id_Especialidad,
							especialidad));

				} catch (Exception e2) {

					JOptionPane.showMessageDialog(null, "Inserte de forma correcta la informacion.....");

				}

				Limpiar();
				Ver_Datos();
			}

		});
		btnAgregar.setBackground(SystemColor.inactiveCaption);
		btnAgregar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\message-rounded-add-solid-24.png"));
		btnAgregar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnAgregar.setBounds(37, 390, 117, 47);
		contentPane.add(btnAgregar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Medico medic;
				MedicoImpl medicImpl = new MedicoImpl();

				int eliminar_fila;

				try {

					eliminar_fila = tableMedic.getSelectedRow();
					list_M.remove(eliminar_fila);

				} catch (Exception e2) {
					// TODO: handle exception

					JOptionPane.showMessageDialog(null, "Elija la fila para eliminar.....");
				}

				Ver_Datos();

			}
		});
		btnEliminar.setBackground(SystemColor.inactiveCaption);
		btnEliminar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\message-rounded-minus-solid-24.png"));
		btnEliminar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnEliminar.setBounds(37, 586, 117, 47);
		contentPane.add(btnEliminar);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBackground(SystemColor.inactiveCaption);
		btnModificar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\pencil-solid-24.png"));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Medico medico;
				int fila_determinada;
				String nombre, apellidoM, apellidoP, especialidad, cmp;
				Integer id, id_Medico, id_Especialidad;

				try {

					fila_determinada = tableMedic.getSelectedRow();
					medico = list_M.get(fila_determinada);

					String determinada = JOptionPane.showInputDialog(
							"Columna de modificacion..?  \n-Nombre \nApellido Paterno \n-Apellido Materno \n-Id \n-Id Medico \n-Id Especialidad  \n-Cmp \n-Especialidad");

					switch (determinada.toLowerCase()) {

					case "nombre":
						nombre = JOptionPane.showInputDialog("Nuevo nombre: ");
						medico.setNombre(nombre);
						break;

					case "apellido paterno":
						apellidoP = JOptionPane.showInputDialog("Nuevo apellido paterno");
						medico.setApellido_paterno(apellidoP);
						break;

					case "apellido materno":
						apellidoM = JOptionPane.showInputDialog("Nuevo apellido materno");
						medico.setApellido_materno(apellidoM);
						break;

					case "id":
						id = Integer.parseInt(JOptionPane.showInputDialog("Nuevo dni"));
						medico.setId(id);
						break;

					case "id medico":
						id_Medico = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Id_Medico"));
						medico.setId_Medico(id_Medico);
						break;

					case "id especialidad":
						id_Especialidad = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Id_Especialidad"));
						medico.setId_Especialidad(id_Especialidad);
						break;

					case "cmp":
						cmp = JOptionPane.showInputDialog("Nuevo Colegio Medico del Peru");
						medico.setCmp(cmp);
						break;

					case "especialidad":
						especialidad = JOptionPane.showInputDialog("Nueva Especialidad");
						medico.setNombre_Especialidad(especialidad);
						break;

					default:
						JOptionPane.showMessageDialog(null, "No se encuentra la modificacion seleccionada");
						break;
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Elija fila determinada para modificar....");
				}

				Ver_Datos();
			}
		});
		btnModificar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnModificar.setBounds(37, 489, 117, 47);
		contentPane.add(btnModificar);

		tableMedic.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		tableMedic.setBounds(353, 297, 708, 416);
		contentPane.add(tableMedic);

		JLabel lblTitul = new JLabel("Registro de Medico");
		lblTitul.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitul.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 70));
		lblTitul.setBounds(114, 11, 908, 74);
		contentPane.add(lblTitul);

		JLabel lblId = new JLabel("Dni");
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblId.setBounds(70, 120, 84, 24);
		contentPane.add(lblId);

		lblId_Medico = new JLabel("Id_Medico");
		lblId_Medico.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblId_Medico.setBounds(382, 120, 84, 24);
		contentPane.add(lblId_Medico);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNombre.setBounds(70, 185, 84, 24);
		contentPane.add(lblNombre);

		JLabel lblApellidoP = new JLabel("Apellido_Paterno");
		lblApellidoP.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblApellidoP.setBounds(341, 185, 120, 24);
		contentPane.add(lblApellidoP);

		JLabel lblApellidoM = new JLabel("Apellid_Materno");
		lblApellidoM.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblApellidoM.setBounds(673, 185, 125, 24);
		contentPane.add(lblApellidoM);

		JLabel lblCmp = new JLabel("Colegio Medico del Peru");
		lblCmp.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblCmp.setBounds(92, 238, 165, 24);
		contentPane.add(lblCmp);

		textFieldId = new JTextField();
		textFieldId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFieldId.setBounds(164, 120, 148, 25);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);

		textFieldId_Medico = new JTextField();
		textFieldId_Medico.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFieldId_Medico.setColumns(10);
		textFieldId_Medico.setBounds(476, 120, 148, 24);
		contentPane.add(textFieldId_Medico);

		textFiellId_Especialidad = new JTextField();
		textFiellId_Especialidad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFiellId_Especialidad.setColumns(10);
		textFiellId_Especialidad.setBounds(808, 120, 148, 24);
		contentPane.add(textFiellId_Especialidad);

		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(164, 187, 148, 22);
		contentPane.add(textFieldNombre);

		textFieldApellidoP = new JTextField();
		textFieldApellidoP.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFieldApellidoP.setColumns(10);
		textFieldApellidoP.setBounds(476, 188, 148, 20);
		contentPane.add(textFieldApellidoP);

		textFieldApellidoM = new JTextField();
		textFieldApellidoM.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		textFieldApellidoM.setColumns(10);
		textFieldApellidoM.setBounds(808, 188, 148, 20);
		contentPane.add(textFieldApellidoM);

		JLabel lblId_Especialdad = new JLabel("Id_Especialidad");
		lblId_Especialdad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblId_Especialdad.setBounds(662, 120, 136, 24);
		contentPane.add(lblId_Especialdad);

		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspecialidad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblEspecialidad.setBounds(444, 238, 136, 24);
		contentPane.add(lblEspecialidad);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\6726.jpg"));
		lblFondo.setBounds(-12, 0, 1132, 772);
		contentPane.add(lblFondo);
	}
}

