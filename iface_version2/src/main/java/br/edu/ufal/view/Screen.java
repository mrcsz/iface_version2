package br.edu.ufal.view;

import br.edu.ufal.model.Community;
import br.edu.ufal.model.Msg;
import br.edu.ufal.model.MsgCommunity;
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

	public static void displayInitialMenu() {
		System.out.println(" #################################");
		System.out.println("|       BEM VINDO AO IFACE        |");
		System.out.println("|                                 |");
		System.out.println("| 1 - Perfil                      |");
		System.out.println("| 2 - Amigos                      |");
		System.out.println("| 3 - Comunidades                 |");
		System.out.println("| 4 - Chat                        |");
		System.out.println("| 5 - Configuracoes               |");
		System.out.println("| 6 - Logout                      |");
		System.out.println("| 7 - Encerrar aplicativo         |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.print(" >> ");
	}

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
		System.out.println("| 3 - Voltar                        |");
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

	public static void menuListCommunities() {
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("| 1 - Todas as comunidades        |");
		System.out.println("| 2 - Minhas comunidades          |");
		System.out.println("| 3 - voltar	                  |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.print(" >> ");
	}

	public static void newCommunity() {

		System.out.println(" ------------------");
		System.out.println("| Nova comunidade  |");
		System.out.println(" ------------------");
	}

	public static void getCommunityName() {
		System.out.print("\nNome: ");
	}

	public static void getDescribeCommunity() {
		System.out.print("Descricao: ");
	}

	public static void noRequest() {
		System.out.println(" -----------------------------");
		System.out.println("| Sem solicitacoes de amizade |");
		System.out.println(" -----------------------------");
	}

	public static void UserNotFound() {
		System.out.println(" -----------------------------");
		System.out.println("|   Usuario nao encontrado    |");
		System.out.println(" -----------------------------");
	}

	public static void pendingFriendRequest() {
		System.out.println(" --------------------------------------");
		System.out.println("|   Solicitacao de amizade pendente    |");
		System.out.println(" --------------------------------------");
	}

	public static void areFriends() {
		System.out.println(" ---------------------------");
		System.out.println("|   Voces ja sao amigos     |");
		System.out.println(" ---------------------------");
	}

	public static void requestRemoved() {
		System.out.println(" ----------------------------");
		System.out.println("|   Solicitacao removida     |");
		System.out.println(" ----------------------------");
	}

	public static void requestSend() {
		System.out.println(" ---------------------------------------");
		System.out.println("|   Solicitacao enviada com sucesso     |");
		System.out.println(" ---------------------------------------");
	}

	public static void youAreNowFriends() {
		System.out.println(" ------------------------------");
		System.out.println("|   Voces agora sao amigos     |");
		System.out.println(" ------------------------------");
	}

	public static void printDataCommunities(Community element) {

		System.out.println(element.getId());
		System.out.println(element.getDados());
	}

	public static void menuMsgCommunity() {
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("| 1 - Ver msgs chat da comunidade |");
		System.out.println("| 2 - Enviar msg para comunidade  |");
		System.out.println("| 3 - voltar	                  |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.print(" >> ");
	}

	public static void selectCommunity() {
		System.out.print("Selecionar comunidade (id): ");
	}

	public static void msgChatCommunity(MsgCommunity element2) {
		System.out.println(element2.getContent());
	}

	public static void MenuSelectCommunity() {
		System.out.println(" xxxxxxxxxxxxxxxx");
		System.out.println("| 1 - selecionar |");
		System.out.println("| 2 - voltar     |");
		System.out.println(" xxxxxxxxxxxxxxxx");
		System.out.print(" >> ");
	}

	public static void printMsg(Msg element2) {
		System.out.println(element2.getSender() + " " + element2.getContent());
	}

	public static void boxMsgEmpty() {
		System.out.println(" ------------------------------");
		System.out.println("|   Caixa de entrada vazia     |");
		System.out.println(" ------------------------------");
	}

	public static void idChat() {
		System.out.print("Selecionar a conversa(id): ");
	}

	public static void newPassword() {
		System.out.print("nova senha: ");
	}

	public static void newEmail() {
		System.out.print("novo email: ");
	}
}
