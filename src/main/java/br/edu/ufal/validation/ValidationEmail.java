package br.edu.ufal.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.edu.ufal.view.Screen;


public class ValidationEmail {

	public static boolean validate(String email){

		// EXPRESSAO REGULAR PATA VALIDAR EMAIL
		Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
		Matcher m = p.matcher(email);
		
		if (!m.find()){
			//EMAIL INVALIDO
			Screen.invalidEmailError();
			return false;
		}
			
		else{
			return true;
		}		
	}
}