package com.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Persona {

	private int id;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;

	public Persona(int id, String nombre, String apellido_paterno, String apellido_materno) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
	}

	public abstract void Persona();

}
