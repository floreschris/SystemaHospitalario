package com.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Medico extends Persona {

	protected Integer id_Medico;
	protected String cmp;
	protected Integer id_Especialidad;
	protected String nombre_Especialidad;

	public Medico(int id, String nombre, String apellido_paterno, String apellido_materno, Integer id_Medico,
			String cmp, Integer id_Especialidad, String nombre_Epecialidad) {
		super(id, nombre, apellido_paterno, apellido_materno);
		this.id_Medico = id_Medico;
		this.id_Especialidad = id_Especialidad;
		this.cmp = cmp;
		this.nombre_Especialidad = nombre_Epecialidad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Persona() {
		// TODO Auto-generated method stub

	}

}
