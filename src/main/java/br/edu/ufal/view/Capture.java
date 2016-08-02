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
}
