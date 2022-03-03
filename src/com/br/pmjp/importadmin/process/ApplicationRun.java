package com.br.pmjp.importadmin.process;

public class ApplicationRun {

	public static void main(String[] args) {
		validarArguments(args);
		
		System.out.println("---------- RUN IMPORT ----------");
		
		RunFileInput.runImport(args[0]);
	}

	private static void validarArguments(String[] args) {
		if (args.length < 1) {
			System.out.println("Help: terminal/cmd : importadmin.jar <arquivo-input>");
			System.exit(0);
		} else if (args.length > 1) {
			System.out.println("Help: terminal/cmd : importadmin.jar <arquivo-input>");
			System.exit(0);
		}
	}

}
