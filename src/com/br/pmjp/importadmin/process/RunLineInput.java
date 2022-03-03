package com.br.pmjp.importadmin.process;

import java.util.regex.Pattern;

import com.br.pmjp.importadmin.model.Pessoa;

public class RunLineInput {

	public Pessoa processLine(String line){
		String [] lineSplited = line.split(Pattern.quote(","));
		Pessoa pessoa = new Pessoa(lineSplited[0], lineSplited[1], lineSplited[2], lineSplited[3], lineSplited[4], lineSplited[5]);
		return pessoa;
	}
}
