package com.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Consulta {

	protected Integer id_Consulta;

	public Consulta(Integer id_Consulta) {
		super();
		this.id_Consulta = id_Consulta;
	}

}
