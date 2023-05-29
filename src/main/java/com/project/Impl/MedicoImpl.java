package com.project.Impl;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.project.interfaces.IMedico;

public class MedicoImpl implements IMedico {

	public void insertar(JTextField dni) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Insertando medico.... " + dni.getText());

	}

	public void eliminando(int dni) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Eliminando medico.... " + dni);

	}

	public void buscar(int dni) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Buscando medico.... " + dni);

	}

	public void modificando(Object dni, Object determinado) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Modificando medico.... " + determinado + " " + dni);

	}

}
