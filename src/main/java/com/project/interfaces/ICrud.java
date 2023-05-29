package com.project.interfaces;

import javax.swing.JTextField;

public interface ICrud {

	public void insertar(JTextField dni);

	public void eliminando(int dni);

	public void buscar(int dni);

	public void modificando(Object dni, Object determinado);

}
