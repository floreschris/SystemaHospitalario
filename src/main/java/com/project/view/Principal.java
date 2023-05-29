package com.project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Color;

public class Principal extends JFrame {

	private JPanel contentPane;

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 800);
		contentPane = new JPanel();
		contentPane.setAlignmentY(5.0f);
		contentPane.setAlignmentX(212.0f);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblImg_5 = new JLabel("");
		lblImg_5.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-hospital-96.png"));
		lblImg_5.setBounds(941, 568, 116, 138);
		contentPane.add(lblImg_5);

		JLabel lblImg_4 = new JLabel("");
		lblImg_4.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-hospital-48.png"));
		lblImg_4.setBounds(635, 352, 64, 102);
		contentPane.add(lblImg_4);

		JLabel lblImg_3 = new JLabel("");
		lblImg_3.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-hospital-3-96.png"));
		lblImg_3.setBounds(994, 265, 116, 138);
		contentPane.add(lblImg_3);

		JLabel lblImg_2 = new JLabel("");
		lblImg_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-hospital-3-96 (1).png"));
		lblImg_2.setBounds(766, 471, 116, 138);
		contentPane.add(lblImg_2);

		JLabel lblImg_6 = new JLabel("");
		lblImg_6.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-bombas-de-infusión-80.png"));
		lblImg_6.setBounds(70, 227, 86, 138);
		contentPane.add(lblImg_6);

		JLabel lblImg_7 = new JLabel("");
		lblImg_7.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\feliz-dia-del-medico-icegif-1.gif"));
		lblImg_7.setBounds(442, 508, 220, 166);
		contentPane.add(lblImg_7);

		JLabel lblImg_8 = new JLabel("");
		lblImg_8.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-clínica-96.png"));
		lblImg_8.setBounds(395, 265, 111, 149);
		contentPane.add(lblImg_8);

		JLabel lblTitul = new JLabel("Bienvenido al Sistema Hospitalario Dedalus");
		lblTitul.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitul.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 56));
		lblTitul.setBounds(10, 116, 1084, 138);
		contentPane.add(lblTitul);

		JLabel lblImg_9 = new JLabel("");
		lblImg_9.setBounds(148, 334, 100, 149);
		contentPane.add(lblImg_9);
		lblImg_9.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-doctor-en-medicina-100.png"));

		JLabel lblImg = new JLabel("");
		lblImg.setBounds(293, 471, 64, 102);
		contentPane.add(lblImg);
		lblImg.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-hospital-64 (1).png"));

		JLabel lblGif = new JLabel("");
		lblGif.setBounds(0, 532, 213, 229);
		contentPane.add(lblGif);
		lblGif.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\200w.gif"));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.controlShadow);
		menuBar.setBounds(0, 0, 1120, 105);
		contentPane.add(menuBar);

		JMenu mnNewMenu = new JMenu("Agregar");
		mnNewMenu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		mnNewMenu.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-hospital-48.png"));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Paciente");
		mntmNewMenuItem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				RegistroPaciente patient = new RegistroPaciente();
				patient.setVisible(true);
				patient.setLocationRelativeTo(null);
				patient.setTitle("REGISTRO DE PACIENTES");

			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-reparto-80.png"));
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Medico");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroMedico medic = new RegistroMedico();
				medic.setVisible(true);
				medic.setLocationRelativeTo(null);
				medic.setTitle("REGISTRO DE MEDICOS");
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		mntmNewMenuItem_4.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-doctora-100.png"));
		mnNewMenu.add(mntmNewMenuItem_4);

		JMenu mnNewMenu_2 = new JMenu("Consulta");
		mnNewMenu_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		mnNewMenu_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-consulta-64 (1).png"));
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consulta");
		mntmNewMenuItem_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultMedicine consult = new ConsultMedicine();
				consult.setVisible(true);
				consult.setLocationRelativeTo(null);
				consult.setTitle("ANALISIS DE MEDICAMENTOS");
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-consulta-64.png"));
		mnNewMenu_2.add(mntmNewMenuItem_2);

		JMenu mnNewMenu_1 = new JMenu("Habitaciones");
		mnNewMenu_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-llamar-en-la-cama-64.png"));
		mnNewMenu_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Calculo");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cal_Habitaciones Calulo = new Cal_Habitaciones();
				Calulo.setVisible(true);
				Calulo.setLocationRelativeTo(null);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-gpa-calculator-64.png"));
		mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		mnNewMenu_1.add(mntmNewMenuItem_1);

		JMenu mnNewMenu_5 = new JMenu("Reporte");
		mnNewMenu_5.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-quejas-64.png"));
		mnNewMenu_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		menuBar.add(mnNewMenu_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Reportes");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Report R = new Report();
				R.setVisible(true);
				R.setLocationRelativeTo(null);
			}
		});
		mntmNewMenuItem_6.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-annual-report-64.png"));
		mntmNewMenuItem_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		mnNewMenu_5.add(mntmNewMenuItem_6);

		JMenu mnNewMenu_3 = new JMenu("Salir");
		mnNewMenu_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		mnNewMenu_3.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-cerrar-ventana-96.png"));
		menuBar.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Salir");
		mntmNewMenuItem_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_3.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-cerrar-ventana-100.png"));
		mnNewMenu_3.add(mntmNewMenuItem_3);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\dedo-eligiendo-el-simbolo-del-hospital-desde-el-menu-ehj555.jpg"));
		lblFondo.setBounds(-18, 102, 1138, 670);
		contentPane.add(lblFondo);
	}

}
