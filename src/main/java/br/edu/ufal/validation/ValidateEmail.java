package br.edu.ufal.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateEmail {

	public static boolean validar(String email){

		// Express�o Regular para validar E-mail
		Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
		Matcher m = p.matcher(email);
		if (!m.find()){
			//Email inv�lido
			return false;
		}
			
		else{
			//email valido
			return true;
		}		
	}
}