package com.project.model;

import java.io.PrintWriter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Paciente extends Persona {

	protected Integer id_Paciente;
	protected String correo;
	protected Integer telefono;
	protected String direccion;
	protected String genero;
	protected Integer edad;

	public Paciente(int id, String nombre, String apellido_paterno, String apellido_materno, Integer id_paciente,
			String correo, Integer telefono, String direccion, String genero, Integer edad) {
		super(id, nombre, apellido_paterno, apellido_materno);
		// TODO Auto-generated constructor stub
		this.id_Paciente = id_paciente;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.genero = genero;
		this.edad = edad;

	}

	public void guardar(PrintWriter escribe) {
		// TODO Auto-generated method stub
		escribe.println(getId());
		escribe.println(getNombre());
		escribe.println(getApellido_paterno());
		escribe.println(getApellido_materno());
		escribe.println(id_Paciente);
		escribe.println(correo);
		escribe.println(telefono);
		escribe.println(direccion);
		escribe.println(genero);
		escribe.println(edad);

	}

	@Override
	public void Persona() {
		// TODO Auto-generated method stub

	}

}
