package br.edu.ufal.view;

public class PrintError {

	public static void inputError() {
		System.err.println("   Entrada invalida, digite um inteiro");
	}

	public static void invalidDateError() {
		System.err.println("   Data Invalida");
	}

	public static void invalidEmailError() {
		System.err.println("   Email Invalida");
	}

	public static void invalidNameError() {
		System.err.println("   Nome invalido");
	}

	public static void invalidPaswordError() {
		System.err.println("   Senha muito curta");
	}

	public static void invalidSex() {
		System.err.println("   Sexo invalido");
		
	}

	public static void msgEmailIsAlreadyRegistered() {
		System.err.println("Este email ja esta cadastrado no sistema");
	}
}
