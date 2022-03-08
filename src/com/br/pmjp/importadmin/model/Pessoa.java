package com.br.pmjp.importadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
	
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String telefone;
	private String escola;

	public Usuario convertToUsuario() {
		// get first name
		// get last name
		// generate email
		// generate password
		// get org unit
		
		return new Usuario(nome, escola, dataNascimento, cpf, rg);
	}

}
