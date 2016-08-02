package br.edu.ufal.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Capture {

	Scanner input = new Scanner(System.in);
	
	public int captureSwitchOption(){
		
		try {
			return input.nextInt();
		} catch (InputMismatchException e){
			Screen.inputError();
		}
		
		return 0;
	}
}
