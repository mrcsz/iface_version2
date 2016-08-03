package br.edu.ufal.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Capture {

	static Scanner input = new Scanner(System.in);

	public static int getOptionInt() {

		try {
			return input.nextInt();
		} catch (InputMismatchException e) {
			PrintError.inputError();
		}

		return 0;
	}

	public static String nameUser() {
		Screen.getNameUser();
		return input.next();
	}

	public static String lastNameUser() {
		Screen.getLastNameUser();
		return input.next();
	}

	public static String emailUser() {
		Screen.getEmailUser();
		return input.next();
	}

	public static String passwordUser() {
		Screen.getPasswordUser();
		return input.next();
	}

	public static String sexUser() {
		Screen.getSexUser();
		return input.next();
	}

	public static String dateBirthUser() {
		Screen.getDateBirthUser();
		return input.next();
	}

	public static String contactUser() {
		Screen.getContactUser();
		return input.next();
	}
	
	public static String statusUser() {
		Screen.getStatusUser();
		return input.next();
	}

	public static String companyName() {
		Screen.getCompanyName();
		return input.next();
	}

	public static String function() {
		Screen.getFunction();
		return input.next();
	}

	public static String dateInitial() {
		Screen.getInitialDate();
		return input.next();
	}

	public static String dateFinal() {
		Screen.getFinalDate();
		return input.next();
	}

	public static String courseName() {
	//	Screen.getCourseName();
		return input.next();
	}
}
