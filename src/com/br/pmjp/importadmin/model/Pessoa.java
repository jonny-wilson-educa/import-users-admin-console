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

}
