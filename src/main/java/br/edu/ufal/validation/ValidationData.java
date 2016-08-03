package br.edu.ufal.validation;

public class ValidationData {

	public static boolean validateNome(String name) {
		return name != "";
	}

	public static boolean validatePassword(String password) {
		return password.length() >= 4;
	}

	public static boolean validateSex(String sex) {
		return sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("F");
	}
}
