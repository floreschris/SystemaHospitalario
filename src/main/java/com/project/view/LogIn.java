package com.project.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class LogIn extends JFrame {

	private JPanel panel_control;
	private JTextField txtUsuario;
	private JPasswordField passwordField;

	public void icono() {
		Icon icon = new ImageIcon(getClass().getResource(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\Welcome.png"));
		JOptionPane.showMessageDialog(rootPane, "Bienvenido al sistema", "Mensaje", JOptionPane.PLAIN_MESSAGE, icon);
	}

	public void Limpiar() {

		txtUsuario.setText("");
		passwordField.setText("");

	}

	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 612);
		panel_control = new JPanel();
		panel_control.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel_control);
		panel_control.setLayout(null);

		JLabel lblUsu = new JLabel("");
		lblUsu.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-usuario-64.png"));
		lblUsu.setBounds(585, 177, 98, 80);
		panel_control.add(lblUsu);

		JLabel lblhuella = new JLabel("");
		lblhuella.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\fingerprint-regular-24.png"));
		lblhuella.setBounds(705, 353, 24, 65);
		panel_control.add(lblhuella);

		JLabel lbladorno = new JLabel("");
		lbladorno.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\git-merge-regular-24.png"));
		lbladorno.setBounds(25, 94, 80, 94);
		panel_control.add(lbladorno);

		JLabel lblLogin = new JLabel("Log In");
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(510, 148, 219, 44);
		panel_control.add(lblLogin);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblUsuario.setBounds(481, 264, 80, 26);
		panel_control.add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(555, 268, 142, 20);
		panel_control.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblPasword = new JLabel("Password");
		lblPasword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblPasword.setBounds(478, 300, 80, 26);
		panel_control.add(lblPasword);

		passwordField = new JPasswordField();
		passwordField.setBounds(555, 301, 142, 20);
		panel_control.add(passwordField);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\hand-right-solid-24.png"));
		btnIngresar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnIngresar.setBackground(new Color(30, 144, 255));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Principal pri = new Principal();

				String usuario = txtUsuario.getText();
				String password = passwordField.getText();

				try {
					if (usuario.isEmpty() || password.isEmpty()) {

						JOptionPane.showMessageDialog(null, "Complete la informacion...");

					} else {
						if (usuario.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")) {
							
							icono();
							pri.setVisible(true);
							pri.setLocationRelativeTo(null);
							pri.setTitle("Menu");

						} else if (usuario.equalsIgnoreCase("flores@test.com") && password.equalsIgnoreCase("12345")) {

							JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
							pri.setVisible(true);
							pri.setLocationRelativeTo(null);
							pri.setTitle("Menu");
						}
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Informacion Incorrecta...");
				}

				Limpiar();
			}
		});
		btnIngresar.setBounds(534, 337, 161, 32);
		panel_control.add(btnIngresar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\window-close-regular-24.png"));
		btnSalir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnSalir.setBackground(new Color(0, 153, 204));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnSalir.setBounds(534, 415, 161, 34);
		panel_control.add(btnSalir);

		JLabel lblFondo = new JLabel("");
		lblFondo.setBackground(new Color(0, 204, 255));
		lblFondo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\pngtree-flat-business-login-box-login-page-picture-image_1319176.jpg"));
		lblFondo.setBounds(0, 0, 1120, 587);
		panel_control.add(lblFondo);
	}
}
