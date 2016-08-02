package br.edu.ufal.controller;

import br.edu.ufal.view.Capture;

public class Controller{
		
	
	public static void addUser(){
		
		String name = Capture.nameUser();
		
		
		String lastName = Capture.lastNameUser();
		String email = Capture.emailUser();
		String password = Capture.passwordUser();
		String sex = Capture.sexUser();
		String dateBirth = Capture.dateBirthUser();

		
		
		
//		String cadastramento = validaDados(nome, email, sexo, nasc, senha);
//		
//		if(cadastramento == "OK") {
//			
//			int id = this.id_gerator++;
//			if(id >= 1000){
//				System.out.println("cadastramento impossivel no momento, estamos trabalhando para aumentar\n"
//						+ " a capacidade dos nossos servidores. No momento so permitimos 1000 pessoas cadastradas, obg");
//			}
//			gerUsers.addUserBanco(new Usuarios(id, nome, sobrenome, email, nasc, senha, sexo));
//			
//			out.cadastroRealizadoComSucesso();
//			return true;
//		}else {
//			System.out.println(cadastramento);
//			return false;
//		}
	}
	
	
	

	
	
	
	
	
//	public static int emailAuthentication(){
//		String email;
//		String senha;
//		
//		System.out.print("   email: ");
//		email = input.nextLine();
//		System.out.print("   senha: ");
//		senha = input.nextLine();
//		
//		int codUserAtual = gerUsers.busca(email, senha);
//		
//		if(codUserAtual != -1){
//			
//			return codUserAtual;
//			
//		} else {
//			
//			out.msgAcessoNegado();
//			
//			return -1;
//		}
//	}
//	
//
//	private String validaDados(String nome, String email, String sexo, String nasc, String senha) {
//		
//		if(nome.equals("")) return out.msgErroNomeNull();
//		else if(!ValidarEmail.validar(email)) return out.msgErroEmailInvalido();
//		else if(!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) return out.msgSexoInvalido();
//		else if(!validarData.validarDataNasc(nasc)) return out.msgErroDataIvalida();
//		else if(senha.equals("")) return out.msgErroSenhaNula();
//		
//		return "OK";
//	}
//
//	public void init() {
//		
//		gerUsers.addUserBanco(new Usuarios(this.id_gerator++, "Marcos", "Souza", "mrc@ic.br", "20/12/1990", "123", "M"));
//		gerUsers.addUserBanco(new Usuarios(this.id_gerator++, "Elly", "Souza", "eli@ic.br", "16/06/1991", "123", "F"));
//		gerUsers.addUserBanco(new Usuarios(this.id_gerator++, "Jose", "Monteiro", "jm@ic.br", "20/07/1970", "123", "M"));
//		gerUsers.addUserBanco(new Usuarios(this.id_gerator++, "Diogo", "Paes", "dp@ic.br", "24/11/1982", "123", "M"));
//	}
}
