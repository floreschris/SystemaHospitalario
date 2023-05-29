package com.project.Impl;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.project.interfaces.IPaciente;

public class PacienteImpl implements IPaciente {

	public void insertar(JTextField dni) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Insertando paciente.... " + dni.getText());

	}

	public void eliminando(int dni) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Eliminando paciente.... " + dni);

	}

	public void buscar(int dni) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Buscando paciente.... " + dni);

	}

	public void modificando(Object dni, Object determinado) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Modificando paciente.... " + determinado + " " + dni);

	}

}
