package br.edu.ufal.view;

public class Screen {
	
	public static void inputError(){
		System.err.println("   entrada invalida, digite um inteiro");
	}
	
	
	
	
	public void exibirMenu1(){
		
			System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("|   1 - Login                |");
			System.out.println("|   2 - Cadastro             |");
			System.out.println("|   3 - Encerar aplicativo   |");
			System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.print("   >>  ");
	}

	public void exibirEncerrando() {
		System.out.println(" -------------------------------");
		System.out.println("|   Encerrando aplicativo       |");
		System.out.println(" -------------------------------");
	}
	
	public void msgVoltando() {
		
		System.out.println("|***       Voltando ao menu anterior        ***|");
		System.out.println(" ----------------------------------------------");
	}

	public void menuInicial() {
		System.out.println(" #################################");
		System.out.println("|      BEM VINDO AO IFACE         |");
		System.out.println("|                                 |");
		System.out.println("|   1 -  Perfil                   |");
		System.out.println("|   2 -  Amigos                   |");
		System.out.println("|   3 -  Comunidades              |");
		System.out.println("|   4 -  Chat                     |");
		System.out.println("|   5 -  Busca por usuario        |");
		System.out.println("|   6 -  Configuracoes            |");
		System.out.println("|   7 -  Logout                   |");
		System.out.println("|   8 -  Encerrar aplicativo      |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.print("   >>  ");
	}

	public void cadastroRealizadoComSucesso() {
		
		System.out.println(" -----------------------------------");
		System.out.println("|  Cadastro realizado com sucesso   |");
		System.out.println(" -----------------------------------");
		
	}

	public void msgAcessoNegado() {
		System.out.println(" -----------------");
		System.out.println("|  Acesso Negado! |");
		System.out.println(" -----------------");
		
	}

	public String msgErroNomeNull() {
		
		String msg =  " ----------------------------------------------\n"
					+ "|    Erro (O campo nome nao pode estar vazio)  |\n"
					+ " ----------------------------------------------";
		
		
		return msg;
	}

	public String msgErroEmailInvalido() {
		String msg = " ----------------------------------------------\n"
					+"|      Erro (Formato de email invalido)        |\n"
					+" ----------------------------------------------";
				
		return msg;
	}

	public String msgSexoInvalido() {
		
		String msg = " ----------------------------------------------\n"
				    +"|     Erro (opcao de sexo invalida)           |\n"
				    +" ----------------------------------------------";
		
		return msg;
	}

	public String msgErroDataIvalida() {
		
		String msg = " ----------------------------------------------\n"
			        +"|     Erro (Data de nascimento invalida)       |\n"
			        +" ----------------------------------------------";
	
	return msg;
	}

	public String msgErroSenhaNula() {
		
		String msg = " ----------------------------------------------\n"
					+"|      Erro (A senha nao pode ser nula)        |\n"
					+" ----------------------------------------------";

return msg;
	}

	public void exibeOpcoesPerfil() {
			
			System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxx ");
			System.out.println("|  1 - Editar perfil      |");
			System.out.println("|  2 - Voltar             |");
			System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxx ");
			  System.out.print("   >>  ");
				
	}

	public void opcoesDeEdicaoPerfil() {
		
		System.out.println(" ------------------ EDITAR -------------------");
		System.out.println("|      ** O que voce deseja editar? **        |");
		System.out.println("|   1 - nome/sobrenome                        |");
		System.out.println("|   2 - sexo                                  |");
		System.out.println("|   3 - Dt Nascimento                         |");
		System.out.println("|   4 - contato                               |");
		System.out.println("|   5 - status                                |");
		System.out.println("|   6 - Informacoes Profisionais              |");
		System.out.println("|   7 - Informacoes Educacionais              |");
		System.out.println("|   8 - voltar                                |");
		System.out.println("|                                             |");
		System.out.println("|  obs.: para editar login(email)/senha va    |");
		System.out.println("| para \"6 - configuracoes\" na tela inicial  |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		  System.out.print("   >>  ");
		
	}
	
	public void atualizadoComSucesso(){
		System.out.println(" -----------------------------------");
		System.out.println("|      Atualizado com sucesso       |");
		System.out.println(" -----------------------------------");
		System.out.println("");
	}

	public void opcaoSexo(){
		System.out.println(" -------------------");
		System.out.println("|   1 - Masculino   |");
		System.out.println("|   2 - Feminino    |");
		System.out.println(" -------------------");
		 System.out.print("   >>  ");
	}

	public void menuAmigos() {
		System.out.println(" ------------- AMIGOS --------------");
		System.out.println("|   1 - Solicitacoes de amizade     |");
		System.out.println("|   2 - Buscar Amigos               |");
		System.out.println("|   3 - Listar Meus amigos          |");
		System.out.println("|   4 - Voltar                      |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		  System.out.print("   >>  ");
		
	}

	public void menuAdcAmigo() {
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("|   1 - enviar solicitacao       |");
		System.out.println("|   2 - Voltar                   |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		  System.out.print("   >>  ");
		
	}

	public void solicitacaoDeAmizadeEnviada() {
		System.out.println(" -------------------------------------------------------");
		System.out.println("|      Solicitacao de amizade enviada com sucesso       |");
		System.out.println(" -------------------------------------------------------");
		System.out.println("");
		
	}

	public void menuResponderSolicitacao() {
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("|   1 - Aceitar solicitacao      |");
		System.out.println("|   2 - Rejeitar solicitacao     |");
		System.out.println("|   3 - Voltar                   |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		  System.out.print("   >>  ");
	}

	public void msgAmigoAdc() {
		System.out.println(" ------- ---------------------------");
		System.out.println("|      Voces agora sao amigos       |");
		System.out.println(" -----------------------------------");
		System.out.println("");
	}

	public void SolicitacaoJaFoiEnviada() {
		System.out.println(" -------------------------------------");
		System.out.println("|      esse convite esta pendente     |");
		System.out.println(" -------------------------------------");
		System.out.println("");
	}

	public void menuConfig() {
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("|   1 - Alterar email               |");
		System.out.println("|   2 - Alterar senha               |");
		System.out.println("|   3 - Excluir conta               |");
		System.out.println("|   4 - Voltar                      |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		  System.out.print("   >>  ");
	}

	public void menuMsgs() {
		System.out.println(" ----------- MENSAGENS -------------");
		System.out.println("|   1 - Enviar mensagem             |");
		System.out.println("|   2 - caixa de mensagens          |");
		System.out.println("|   3 - Limpar historico de msgs    |");
		System.out.println("|   4 - Voltar                      |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		  System.out.print("   >>  ");
	}

	public void menuCxEntrada() {
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("|   1 - abrir conversa              |");
		System.out.println("|   2 - voltar                      |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		  System.out.print("   >>  ");
	}

	public void outraMsg() {
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("|   1 - enviar outra msg            |");
		System.out.println("|   2 - voltar                      |");
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		  System.out.print("   >>  ");
	}

	public void historicoMsgLimpo() {
		System.out.println(" ------------------------------------------------------");
		System.out.println("|      Historico de msgs limpo com sucesso             |");
		System.out.println(" ------------------------------------------------------");
		System.out.println("");
	}

	public void CaixaDeMsgsVazia() {
		System.out.println(" -------------------------------------");
		System.out.println("|      Caixa de mensagens vazia       |");
		System.out.println(" -------------------------------------");
		System.out.println("");
	}

	public void msgNaoSaoAmigos() {
		System.out.println(" -----------------------------------------------");
		System.out.println("|          Voce nao pode enviar mensagens       |");
		System.out.println("|      pra esse usuario voces nao sao amigos    |");
		System.out.println(" -----------------------------------------------");
		System.out.println("");
	}

	public void JaSaoAmigos() {
		System.out.println(" -----------------------------------");
		System.out.println("|          Voce ja sao amigos       |");
		System.out.println(" -----------------------------------");
		System.out.println("");
	}
}














