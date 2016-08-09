package br.edu.ufal.validation;

public class ValidationData {

	public static boolean validateNome(String name) {
		return name != "";
	}

	public static boolean validatePassword(String password) {
		return password.length() >= 4;
	}

	public static boolean validateGender(String gender) {
		return gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F");
	}
}
