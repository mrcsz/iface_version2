package br.edu.ufal.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.ufal.validation.ValidationDate;

public class Capture {

	static Scanner input = new Scanner(System.in);

	public static int getOptionInt() {

		try {
			
			int option = input.nextInt();
			input.nextLine();//limpando o buffer
			return option;
		} catch (InputMismatchException e) {
			PrintError.inputError();
			input.nextLine();//limpando o buffer
		}

		return 0;
	}

	public static String nameUser() {
		Screen.getNameUser();
		return input.nextLine();
	}

	public static String lastNameUser() {
		Screen.getLastNameUser();
		return input.nextLine();
	}

	public static String emailUser() {
		Screen.getEmailUser();
		return input.nextLine();
	}

	public static String passwordUser() {
		Screen.getPasswordUser();
		return input.nextLine();
	}

	public static String genderUser() {
		Screen.getGenderUser();
		return input.nextLine();
	}

	public static String dateBirthUser() {
		Screen.getDateBirthUser();
		return input.nextLine();
	}

	public static String contactUser() {
		Screen.getContactUser();
		return input.nextLine();
	}
	
	public static String statusUser() {
		Screen.getStatusUser();
		return input.nextLine();
	}

	public static String companyName() {
		Screen.getCompanyName();
		return input.nextLine();
	}

	public static String function() {
		Screen.getFunction();
		return input.nextLine();
	}

	public static String dateInitial() {
		Screen.getInitialDate();
		String date = input.nextLine();
		if(ValidationDate.validateSimpleDate(date)){
			return date;
		} else
			PrintError.invalidDateError();
			return "-";
	}

	public static String dateFinal() {
		Screen.getFinalDate();
		return input.nextLine();
	}

	public static String courseName() {
		Screen.getCourseName();
		return input.nextLine();
	}

	public static String yearConclusion() {
		Screen.getYearConclusion();
		return input.nextLine();
	}

	public static String institutionalName() {
		Screen.getInstitutionalName();
		return input.nextLine();
	}

	public static int getIdSolicitation() {
		Screen.getIdSolicilitation();
		return Capture.getOptionInt();
	}

	public static String searchUser() {
		Screen.getNameUser();
		return input.nextLine();
	}
}
