package br.edu.ufal.view;

import br.edu.ufal.model.User;

public class Screen {

	public static void menuDisplayLogin() {

		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("|   1 - Login                |");
		System.out.println("|   2 - Cadastro             |");
		System.out.println("|   3 - Encerar aplicativo   |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.print("   >>  ");
	}

	public static void appFinalised() {
		System.out.println(" -------------------------------");
		System.out.println("|     Encerrando aplicativo     |");
		System.out.println(" -------------------------------");
	}

	public static void profile(User user) {
		System.out.println(" ---------------- PERFIL ------------------\n");
		System.out.println(" Nome: " + user.getName());
		System.out.println(" Sobrenome: " + user.getLastName());
		System.out.println(" Email: " + user.getEmail());
		System.out.println(" Senha: " + user.getPassword());
		System.out.println(" Sexo: " + user.getGender());
		System.out.println(" Dt Nasc: " + user.getDateBirth());
		System.out.println(" Contato: " + user.profile.getContact());
		System.out.println(" Status: " + user.profile.getStatus());
		System.out.println("\n ------- Informacoes Profissionais -------\n");
		System.out.println(" Nome da Empresa: " + user.profile.professionalInformation.getCompanyName());
		System.out.println(" Funcao exercida: " + user.profile.professionalInformation.getFunction());
		System.out.println(" Dt Inicio: " + user.profile.professionalInformation.getInitialDate());
		System.out.println(" Dt Fim: " + user.profile.professionalInformation.getFinalDate());
		System.out.println("\n -------- Informacoes Educacionais ---------\n");
		System.out.println(" Curso: " + user.profile.educationalInformation.getCourse());
		System.out.println(" Nome da Instituicao: " + user.profile.educationalInformation.getInstitutionalName());
		System.out.println(" Ano de Conclusao: " + user.profile.educationalInformation.getYearConclusion());
		System.out.println(" ------------------------------------------- \n");
	}

	// public void msgVoltando() {
	//
	// System.out.println("|*** Voltando ao menu anterior ***|");
	// System.out.println(" ----------------------------------------------");
	// }
	//
	public static void displayInitialMenu() {
		System.out.println(" #################################");
		System.out.println("|       BEM VINDO AO IFACE        |");
		System.out.println("|                                 |");
		System.out.println("| 1 - Perfil                      |");
		System.out.println("| 2 - Amigos                      |");
		System.out.println("| 3 - Comunidades                 |");
		System.out.println("| 4 - Chat                        |");
		System.out.println("| 5 - Busca por usuario           |");
		System.out.println("| 6 - Configuracoes               |");
		System.out.println("| 7 - Logout                      |");
		System.out.println("| 8 - Encerrar aplicativo         |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.print(" >> ");
	}

	// public void msgAcessoNegado() {
	// System.out.println(" -----------------");
	// System.out.println("| Acesso Negado! |");
	// System.out.println(" -----------------");
	//
	// }
	//
	// public String msgErroNomeNull() {
	//
	// String msg = " ----------------------------------------------\n"
	// + "| Erro (O campo nome nao pode estar vazio) |\n"
	// + " ----------------------------------------------";
	//
	//
	// return msg;
	// }
	//
	// public String msgErroEmailInvalido() {
	// String msg = " ----------------------------------------------\n"
	// +"| Erro (Formato de email invalido) |\n"
	// +" ----------------------------------------------";
	//
	// return msg;
	// }
	//
	// public String msgSexoInvalido() {
	//
	// String msg = " ----------------------------------------------\n"
	// +"| Erro (opcao de sexo invalida) |\n"
	// +" ----------------------------------------------";
	//
	// return msg;
	// }
	//
	// public String msgErroDataIvalida() {
	//
	// String msg = " ----------------------------------------------\n"
	// +"| Erro (Data de nascimento invalida) |\n"
	// +" ----------------------------------------------";
	//
	// return msg;
	// }
	//
	// public String msgErroSenhaNula() {
	//
	// String msg = " ----------------------------------------------\n"
	// +"| Erro (A senha nao pode ser nula) |\n"
	// +" ----------------------------------------------";
	//
	// return msg;
	// }
	//

	public static void profileEditionOption() {

		System.out.println(" ------------------ EDITAR -------------------");
		System.out.println("|      ** O que voce deseja editar? **        |");
		System.out.println("| 1 - nome                                    |");
		System.out.println("| 2 - sobrenome                               |");
		System.out.println("| 3 - sexo                                    |");
		System.out.println("| 4 - Dt Nascimento                           |");
		System.out.println("| 5 - contato                                 |");
		System.out.println("| 6 - status                                  |");
		System.out.println("| 7 - Informacoes Profisionais                |");
		System.out.println("| 8 - Informacoes Educacionais                |");
		System.out.println("| 9 - voltar                                  |");
		System.out.println("|                                             |");
		System.out.println("| obs.: para editar login(email)/senha va     |");
		System.out.println("| para \"6 - configuracoes\" na tela inicial  |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.print(" >> ");

	}

	//
	// public void atualizadoComSucesso(){
	// System.out.println(" -----------------------------------");
	// System.out.println("| Atualizado com sucesso |");
	// System.out.println(" -----------------------------------");
	// System.out.println("");
	// }
	//
	// public void opcaoSexo(){
	// System.out.println(" -------------------");
	// System.out.println("| 1 - Masculino |");
	// System.out.println("| 2 - Feminino |");
	// System.out.println(" -------------------");
	// System.out.print(" >> ");
	// }
	//
	//
	
	//
	// }
	//
	// public void solicitacaoDeAmizadeEnviada() {
	// System.out.println("
	// -------------------------------------------------------");
	// System.out.println("| Solicitacao de amizade enviada com sucesso |");
	// System.out.println("
	// -------------------------------------------------------");
	// System.out.println("");
	//
	// }
	//

	//
	// public void msgAmigoAdc() {
	// System.out.println(" ------- ---------------------------");
	// System.out.println("| Voces agora sao amigos |");
	// System.out.println(" -----------------------------------");
	// System.out.println("");
	// }
	//
	// public void SolicitacaoJaFoiEnviada() {
	// System.out.println(" -------------------------------------");
	// System.out.println("| esse convite esta pendente |");
	// System.out.println(" -------------------------------------");
	// System.out.println("");
	// }
	//
	
	public static void menuSettings() {
	 System.out.println(" xxxxxxxxxxxxxxxxxxxxxx");
	 System.out.println("| 1 - Alterar email    |");
	 System.out.println("| 2 - Alterar senha    |");
	 System.out.println("| 3 - Excluir conta    |");
	 System.out.println("| 4 - Voltar           |");
	 System.out.println(" xxxxxxxxxxxxxxxxxxxxxx");
	 System.out.print(" >> ");
	 }
	
	 public static void menuMsgs() {
	 System.out.println(" ----------- MENSAGENS -------------");
	 System.out.println("| 1 - Enviar mensagem               |");
	 System.out.println("| 2 - caixa de mensagens            |");
	 System.out.println("| 3 - Limpar historico de msgs      |");
	 System.out.println("| 4 - Voltar                        |");
	 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	 System.out.print(" >> ");
	 }
	
	 public static void menuEntryBox() {
	 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxx");
	 System.out.println("| 1 - abrir conversa      |");
	 System.out.println("| 2 - voltar              |");
	 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxx");
	 System.out.print(" >> ");
	 }
	
	 public static void otherMsg() {
	 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxx");
	 System.out.println("| 1 - enviar outra msg     |");
	 System.out.println("| 2 - voltar               |");
	 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxx");
	 System.out.print(" >> ");
	 }
	//
	// public void historicoMsgLimpo() {
	// System.out.println("
	// ------------------------------------------------------");
	// System.out.println("| Historico de msgs limpo com sucesso |");
	// System.out.println("
	// ------------------------------------------------------");
	// System.out.println("");
	// }
	//
	// public void CaixaDeMsgsVazia() {
	// System.out.println(" -------------------------------------");
	// System.out.println("| Caixa de mensagens vazia |");
	// System.out.println(" -------------------------------------");
	// System.out.println("");
	// }
	//
	// public void msgNaoSaoAmigos() {
	// System.out.println(" -----------------------------------------------");
	// System.out.println("| Voce nao pode enviar mensagens |");
	// System.out.println("| pra esse usuario voces nao sao amigos |");
	// System.out.println(" -----------------------------------------------");
	// System.out.println("");
	// }
	//
	// public void JaSaoAmigos() {
	// System.out.println(" -----------------------------------");
	// System.out.println("| Voce ja sao amigos |");
	// System.out.println(" -----------------------------------");
	// System.out.println("");
	// }
	//
	//
	//

	public static void getNameUser() {
		System.out.print("   Nome: ");
	}

	public static void getLastNameUser() {
		System.out.print("   Sobrenome: ");
	}

	public static void getEmailUser() {
		System.out.print("   Email: ");
	}

	public static void getPasswordUser() {
		System.out.print("   Senha(minimo 4 digitos): ");
	}

	public static void getGenderUser() {
		System.out.print("   Sexo(M/F): ");
	}

	public static void getDateBirthUser() {
		System.out.print("Data de Nascimento(dd/MM/yyyy): ");
	}

	public static void displayMenuTryAgain() {
		System.out.println(" -------------------------");
		System.out.println("| 1 - Tentar novamente    |");
		System.out.println("| 2 - Voltar              |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.print(" >> ");

	}

	public static void registrationSucessfully() {
		System.out.println(" -----------------------------------");
		System.out.println("|  Cadastro realizado com sucesso   |");
		System.out.println(" -----------------------------------");

	}

	public static void profileOption() {

		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxx ");
		System.out.println("| 1 - Editar perfil       |");
		System.out.println("| 2 - Voltar              |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxx ");
		System.out.print(" >> ");

	}

	public static void getContactUser() {
		System.out.print("   Contato: ");
	}

	public static void getStatusUser() {
		System.out.print("   status: ");
	}

	public static void getCompanyName() {
		System.out.print("   Empresa: ");
	}

	public static void getFunction() {
		System.out.print("   Funcao: ");
	}

	public static void getInitialDate() {
		System.out.print("   Data de inicio: ");
	}

	public static void getFinalDate() {
		System.out.print("   Data de fim(opcional): ");
	}

	public static void getCourseName() {
		System.out.print("   Curso: ");
	}

	public static void getYearConclusion() {
		System.out.print("   Ano de conclusao: ");
	}

	public static void getInstitutionalName() {
		System.out.print("   Nome da Instituicao: ");
	}

	public static void menuFriends() {
		System.out.println(" ------------- AMIGOS --------------");
		System.out.println("| 1 - Solicitacoes de amizade       |");
		System.out.println("| 2 - Buscar Amigos                 |");
		System.out.println("| 3 - Listar Meus amigos            |");
		System.out.println("| 4 - Voltar                        |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.print(" >> ");
	}

//	public static void PrintIdAndNomeUser(int id, User generalUser) {
//		System.out.println(generalUser.getId() + " " + generalUser.getName() + " " + generalUser.getLastName());
//	}
	
	 public static void menuAddFriend() {
		 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		 System.out.println("| 1 - enviar solicitacao |");
		 System.out.println("| 2 - Voltar |");
		 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		 System.out.print(" >> ");
	 }
	 
	public static void aceptFriend() {
		 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		 System.out.println("| 1 - Aceitar solicitacao       |");
		 System.out.println("| 2 - Rejeitar solicitacao      |");
		 System.out.println("| 3 - Voltar                    |");
		 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		 System.out.print(" >> ");
	}

	public static void getIdSolicilitation() {
		System.out.print("Id: ");
	}

	public static void menuCommunity() {
		 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		 System.out.println("| 1 - Criar comunidade            |");
		 System.out.println("| 2 - Excluir comunidade          |");
		 System.out.println("| 3 - Listar comunidades		   |");
		 System.out.println("| 4 - voltar	            	   |");
		 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		 System.out.print(" >> ");
	}
	
	public static void menuInternalCommunity() {
		 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxx");
		 System.out.println("| 1 - Enviar msg        |");
		 System.out.println("| 2 - Excluir msg       |");
		 System.out.println(" xxxxxxxxxxxxxxxxxxxxxxx");
		 System.out.print(" >> ");
	}

	public static void sendMsg() {
		System.out.print("Id do destinario: ");
	}

	public static void getMsg() {
		System.out.print("msg: ");
	}
}
