package br.edu.ufal.view;

public class PrintError {

	public static void inputError() {
		System.err.println("   Entrada invalida, digite um inteiro");
	}

	public static void invalidDateError() {
		System.err.println("   Data Invalida\n");
	}

	public static void invalidEmailError() {
		System.err.println("   Email Invalido\n");
	}

	public static void invalidNameError() {
		System.err.println("   Nome invalido\n");
	}

	public static void invalidPaswordError() {
		System.err.println("   Senha muito curta\n");
	}

	public static void invalidGender() {
		System.err.println("   Sexo invalido\n");
		
	}

	public static void msgEmailIsAlreadyRegistered() {
		System.err.println("Este email ja esta cadastrado no sistema\n");
	}
}
