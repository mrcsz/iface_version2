package br.edu.ufal.validation;

import java.util.Scanner;

public class validateSwitchOption {
	
	static Scanner in = new Scanner(System.in);
	
	public int validateOption() {
		try {
			
			return in.nextInt();
		} catch (Exception e) {
			
			System.out.println("  Entrada invalida");
			in.nextLine();
			return -1;
		}
	}

}
