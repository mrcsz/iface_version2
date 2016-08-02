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
		
		CRUDImpl crudImpl = new CRUDImpl();
		String name = Capture.nameUser();
		if (!ValidationData.validateNome(name)) {
			PrintError.invalidNameError();
			return -1;
		}
		String lastName = Capture.lastNameUser();
		
		String email = Capture.emailUser();
		if(!ValidationEmail.validate(email)){
			PrintError.invalidEmailError();
			return -1;
		}

		String password = Capture.passwordUser();
		if(!ValidationData.validatePassword(password)){
			PrintError.invalidPaswordError();
			return -1;
		}
		
		String sex = Capture.sexUser();
		if(!ValidationData.validateSex(sex)){
			PrintError.invalidSex();
			return -1;
		}
		
		String dateBirth = Capture.dateBirthUser();
		if(!ValidationDate.validateDateOfBirth(dateBirth)){
			PrintError.invalidDateError();
			return -1;
		}
		
		
		crudImpl.addInstance(new User(name, lastName, email, dateBirth, password, sex));
		
		return 1;
		
		// gerUsers.addUserBanco(new Usuarios(id, nome, sobrenome, email, nasc,
		// senha, sexo));
		//
		// out.cadastroRealizadoComSucesso();
		// return true;
		// }else {
		// System.out.println(cadastramento);
		// return false;
		// }
	}

	// public static int emailAuthentication(){
	// String email;
	// String senha;
	//
	// System.out.print(" email: ");
	// email = input.nextLine();
	// System.out.print(" senha: ");
	// senha = input.nextLine();
	//
	// int codUserAtual = gerUsers.busca(email, senha);
	//
	// if(codUserAtual != -1){
	//
	// return codUserAtual;
	//
	// } else {
	//
	// out.msgAcessoNegado();
	//
	// return -1;
	// }
	// }
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
