package br.edu.ufal.controller;

import br.edu.ufal.dao.CRUDImpl;
import br.edu.ufal.model.User;
import br.edu.ufal.validation.ValidationData;
import br.edu.ufal.validation.ValidationDate;
import br.edu.ufal.validation.ValidationEmail;
import br.edu.ufal.view.Capture;
import br.edu.ufal.view.PrintError;

public class Controller {

	public static int addUser() {

		String name = Capture.nameUser();
		if (!ValidationData.validateNome(name)) {
			PrintError.invalidNameError();
			return -1;
		}
		String lastName = Capture.lastNameUser();

		String email = Capture.emailUser();
		if (!ValidationEmail.validate(email)) {
			PrintError.invalidEmailError();
			return -1;
		}

		String password = Capture.passwordUser();
		if (!ValidationData.validatePassword(password)) {
			PrintError.invalidPaswordError();
			return -1;
		}

		String sex = Capture.sexUser();
		if (!ValidationData.validateSex(sex)) {
			PrintError.invalidSex();
			return -1;
		}

		String dateBirth = Capture.dateBirthUser();
		if (!ValidationDate.validateDateOfBirth(dateBirth)) {
			PrintError.invalidDateError();
			return -1;
		}

		CRUDImpl crudImpl = new CRUDImpl();
		User user = new User();
		user.setName(name);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setDateBirth(dateBirth);
		user.setSex(sex);
		
		crudImpl.addInstance(user);
		return 1;
	}

	public static int authenticationLogin() {
		
		String email = Capture.emailUser();
		
		String password = Capture.passwordUser();

		CRUDImpl crudImpl = new CRUDImpl();
		return crudImpl.autheticationUser(email, password);
		
	}
	//
	//
	// private String validaDados(String nome, String email, String sexo, String
	// nasc, String senha) {
	//
	// if(nome.equals("")) return out.msgErroNomeNull();
	// else if(!ValidarEmail.validar(email)) return out.msgErroEmailInvalido();
	// else if(!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")))
	// return out.msgSexoInvalido();
	// else if(!validarData.validarDataNasc(nasc)) return
	// out.msgErroDataIvalida();
	// else if(senha.equals("")) return out.msgErroSenhaNula();
	//
	// return "OK";
	// }
	//
	// public void init() {
	//
	// gerUsers.addUserBanco(new Usuarios(this.id_gerator++, "Marcos", "Souza",
	// "mrc@ic.br", "20/12/1990", "123", "M"));
	// gerUsers.addUserBanco(new Usuarios(this.id_gerator++, "Elly", "Souza",
	// "eli@ic.br", "16/06/1991", "123", "F"));
	// gerUsers.addUserBanco(new Usuarios(this.id_gerator++, "Jose", "Monteiro",
	// "jm@ic.br", "20/07/1970", "123", "M"));
	// gerUsers.addUserBanco(new Usuarios(this.id_gerator++, "Diogo", "Paes",
	// "dp@ic.br", "24/11/1982", "123", "M"));
	// }
}
