package br.edu.ufal.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Capture {

	static Scanner input = new Scanner(System.in);
	
	public static int switchOption(){
		
		try {
			return input.nextInt();
		} catch (InputMismatchException e){
			Screen.inputError();
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

	public static String sexUser() {
		Screen.getSexUser();
		return input.nextLine();
	}

	public static String dateBirthUser() {
		Screen.getDateBirthUser();
		return input.nextLine();
	}
}
