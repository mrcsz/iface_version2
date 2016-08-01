package br.edu.ufal.controller;

import java.util.ArrayList;
import java.util.Scanner;

import banco.Chat;
import banco.Entrada;
import banco.Saida;
import banco.ValidarEmail;
import br.edu.ufal.components.Usuarios;

public class BancoUsers{

	static public Scanner input = new Scanner(System.in);
	validateSwitchOption in = new validateSwitchOption();
	Screen out = new Screen();
	private ArrayList<Usuarios> users = new ArrayList<Usuarios>();
	ValidateEmail validarEmail = new ValidateEmail();
	Datas datas = new Datas();
	ArrayList<Chat> chats = new ArrayList<Chat>();

	public void addUserBanco(Usuarios user){
		users.add(user);
	}

	public int busca(String email, String senha) {

		for(int i = 0; i < users.size(); i++){
			Usuarios user = users.get(i);

			if(email.equals(user.getEmail()) && senha.equals(user.getSenha())){
				return user.getId();
			}
		}

		return -1;
	}

	public int iSusuarioCadastrado(int id){
		for(int i = 0; i < users.size(); i++){
			Usuarios user = users.get(i);

			if(id == user.getId()){
				return user.getId();
			}
		}
		return -1;
	}

	public void ImprimePerfil(int codUserAtual){
		Usuarios user = users.get(codUserAtual);	

		System.out.println(     " ---------------- PERFIL ------------------\n"
				+ "\n    Nome: " + user.getNome()
				+ "\n    Sobrenome: " + user.getSobrenome() 
				+ "\n    Email: " + user.getEmail() 
				+ "\n    Senha: " + user.getSenha()
				+ "\n    Sexo: " + user.getSexo()
				+ "\n    Dt Nasc: " + user.getNasc()  
				+ "\n    Contato: " + user.perfil.getTelefone()   
				+ "\n    Status: " + user.perfil.getStatus()
				+ "\n\n  ------- Informacoes Profissionais -------\n"
				+ "\n    Nome da Empresa: " + user.perfil.trabalho.getNomeEmpresa()
				+ "\n    Funcao exercida: " + user.perfil.trabalho.getFuncao()
				+ "\n    Dt Inicio: " + user.perfil.trabalho.getInicio()
				+ "\n    Dt Fim: " + user.perfil.trabalho.getFim()
				+ "\n\n -------- Informacoes Educacionais ---------\n"
				+ "\n    Curso: " + user.perfil.unidadeEducacional.getCurso()
				+ "\n    Nome da Instituicao: " + user.perfil.unidadeEducacional.getNomeInstituicao()
				+ "\n    Ano de Conclusao: " + user.perfil.unidadeEducacional.getAnoConclusao()
				+ "\n ------------------------------------------- \n");




	}

	public void editarNome(int codUserAtual) {
		Usuarios user = users.get(codUserAtual);

		String nome;
		String sobrenome;
		System.out.println("   nome atual: " + user.getNome());
		System.out.println("   sobrenome atual: " + user.getSobrenome());

		System.out.print("   Novo nome: ");
		nome = input.nextLine();
		System.out.print("   Novo sobrenome: ");
		sobrenome = input.nextLine();

		if(!nome.equals("")) {
			user.setNome(nome);
			out.atualizadoComSucesso();
		} else {
			System.out.println("   O nome nao pode ser nulo\n");
		}
		user.setSobrenome(sobrenome);
	}

	public void editarSexo(int codUserAtual) {
		Usuarios user = users.get(codUserAtual);
		System.out.println("sexo: " + user.getSexo());

		out.opcaoSexo();

		int op = in.obterOpcao();

		if(op == 1)
		{
			user.setSexo("M");
			out.atualizadoComSucesso();
		} else if(op == 2) {
			user.setSexo("F");
			out.atualizadoComSucesso();
		} else {
			System.out.println("Escolha invalida.\n");
		}
	}

	public void editarDataNasc(int codUserAtual) {
		Usuarios user = users.get(codUserAtual);
		System.out.println("Data atual: " + user.getNasc());

		System.out.print("Nova Data: ");
		String nasc = input.nextLine();

		if(datas.validarDataNasc(nasc)) {
			user.setNasc(nasc);
			out.atualizadoComSucesso();
		}
		else {
			System.out.println("Data valida.\n");
		}
	}

	public void editarContato(int codUserAtual) {
		Usuarios user = users.get(codUserAtual);
		System.out.println("Contato atual: " + user.perfil.getTelefone());

		System.out.print("Novo Contato: ");
		String contato = input.nextLine();

		user.perfil.setTelefone(contato);
		out.atualizadoComSucesso();
	}

	public void editarStatus(int codUserAtual) {
		Usuarios user = users.get(codUserAtual);
		System.out.println("Status atual: " + user.perfil.getStatus());

		System.out.print("Novo Status: ");
		String status = input.nextLine();

		user.perfil.setStatus(status);
		out.atualizadoComSucesso();
	}

	public void editarInfProf(int codUserAtual) {
		Usuarios user = users.get(codUserAtual);

		System.out.print("   Empresa: ");
		String empresa = input.nextLine();
		System.out.print("   Funcao: ");
		String funcao = input.nextLine();
		System.out.print("   Dt Inicio: ");
		String inicio = input.nextLine();
		System.out.print("   Dt Fim: ");
		String fim = input.nextLine();


		if(datas.validarDataInicioFim(inicio, fim)){

			user.perfil.trabalho.setNomeEmpresa(empresa);
			user.perfil.trabalho.setFuncao(funcao);
			user.perfil.trabalho.setInicio(inicio);
			user.perfil.trabalho.setFim(fim);
			out.atualizadoComSucesso();
		} else if(fim.equals("") && datas.validarData(inicio)){
			user.perfil.trabalho.setNomeEmpresa(empresa);
			user.perfil.trabalho.setFuncao(funcao);
			user.perfil.trabalho.setInicio(inicio);
			out.atualizadoComSucesso();
		} else {
			System.out.println("Datas invalidas, edicao cancelada\n");
		}
	}

	public void editarInfEduc(int codUserAtual) {
		Usuarios user = users.get(codUserAtual);

		System.out.print("   Curso: ");
		String curso = input.nextLine();
		System.out.print("   Instituicao: ");
		String instituicao = input.nextLine();
		System.out.print("   Ano de Conclusao: ");
		String anoConclusao = input.nextLine();

		user.perfil.unidadeEducacional.setCurso(curso);
		user.perfil.unidadeEducacional.setNomeInstituicao(instituicao);
		user.perfil.unidadeEducacional.setAnoConclusao(anoConclusao);
		out.atualizadoComSucesso();

	}

	public void listaUsuarioCadastrados(int CodUserAtual) {

		System.out.println(" ----------------------------------------");
		for(int i = 0; i < users.size(); i++){
			Usuarios user = users.get(i);

			if(user.getId() != CodUserAtual){


				System.out.println("   " + user.getNome() + " " + user.getSobrenome());

				if(user.amigos[CodUserAtual] == 1){

					System.out.println("   Amigos");
				} else if(user.amigos[CodUserAtual] == 2) {

					System.out.println("   " + user.getId() + " Aguardando confirmacao");
				} else {

					System.out.println("   " + user.getId() + " Para Adicionar");
				}

				System.out.println("");
			}
		}

		System.out.println(" ----------------------------------------");

	}


	public void ennviarSolicitacao(int codUserAtual) {

		System.out.print("Digite o id do usuario a enviar solicitacao: ");


		try{

			int codSolicitacao = in.obterOpcao();
			Usuarios amigo = users.get(codSolicitacao);
			Usuarios atual = users.get(codUserAtual);

			if(codSolicitacao == -1 || codSolicitacao == codUserAtual) {

				System.out.println("Erro ao tentar ao enviar");
				return;
			} else if(amigo.amigos[codUserAtual] == 2 || atual.amigos[codSolicitacao] == 2){
				out.SolicitacaoJaFoiEnviada();
			}else if(amigo.amigos[codUserAtual] == 1 || atual.amigos[codSolicitacao] == 1){
				out.JaSaoAmigos();
			} else {


				amigo.solicitacoes.add(codUserAtual);

				amigo.amigos[codUserAtual] = 2;
				atual.amigos[codSolicitacao] = 2;


				out.solicitacaoDeAmizadeEnviada();
			}
		} catch (Exception e){
			System.out.println("Erro ao enviar solicitacao");
		}
	}

	public void listaSolicitacoesAmizade(int codUserAtual) {
		System.out.println(" -------------------------------");
		Usuarios user = users.get(codUserAtual);

		for(int i = 0; i < user.solicitacoes.size(); i++){
			Integer solic = user.solicitacoes.get(i);

			System.out.println("   " + users.get(solic).getNome() + " " + users.get(solic).getSobrenome());
			System.out.println("   id: " + solic + " ->  deseja ser seu amigo" );

		}

		System.out.println(" -------------------------------");
	}

	public void aceitarConviteAmizade(int codUserAtual) {

		Usuarios usuarioAtual = users.get(codUserAtual);

		System.out.print("Digite o id do usuario a aceitar solicitacao: ");

		try{

			int codSolicitacao = in.obterOpcao();

			if(codSolicitacao == -1 || codSolicitacao == codUserAtual) {

				System.out.println("Erro ao tentar ao responder amizade");
				return;
			} else {

				for(int i = 0; i < usuarioAtual.solicitacoes.size(); i++){
					Integer solic = usuarioAtual.solicitacoes.get(i);

					if(solic.equals(codSolicitacao)){
						Usuarios usuarioAmigo = users.get(solic);

						usuarioAmigo.amigos[codUserAtual] = 1;
						usuarioAtual.amigos[solic] = 1;
						usuarioAtual.solicitacoes.remove(i);

						out.msgAmigoAdc();
					} else {
						System.out.println("Codigo digitado invalido");
					}
				}	
			}
		} catch (Exception e){
			System.out.println("Erro ao tentar responder solicitacao");
		}
	}

	public void listarAmigos(int codUserAtual) {

		System.out.println(" ---------------------------------");

		for(int i = 0; i < users.size(); i++){
			Usuarios user = users.get(i);

			if((user.getId() != codUserAtual) && user.amigos[codUserAtual] == 1){

				System.out.println("   " + user.getId() + " " + user.getNome() + " " + user.getSobrenome());
			}
		}

		System.out.println(" ---------------------------------");
	}

	public void rejeitarConviteAmizade(int codUserAtual) {

		Usuarios usuarioAtual = users.get(codUserAtual);
		try{

			System.out.print("Digite o id do usuario para rejeitar solicitacao: ");

			int codSolicitacao = in.obterOpcao();

			if(codSolicitacao == -1 || codSolicitacao == codUserAtual) {

				System.out.println("Erro ao tentar ao responder amizade");
				return;
			} else {

				for(int i = 0; i < usuarioAtual.solicitacoes.size(); i++){

					Integer solic = usuarioAtual.solicitacoes.get(i);

					if(solic.equals(codSolicitacao)){
						Usuarios usuarioAmigo = users.get(solic);

						usuarioAmigo.amigos[codUserAtual] = 3;
						usuarioAtual.amigos[solic] = 3;
						usuarioAtual.solicitacoes.remove(i);

						out.msgAmigoAdc();
					} else {
						System.out.println("Codigo digitado invalido");
					}
				}	
			}
		} catch (Exception e){
			System.out.println("Erro ao tentar responder solicitacao");
		}
	}

	public int enviarMsg(int codUserAtual) {

		System.out.print("Digite o cod do amigo que deseja enviar msg: ");
		int idAmigo = in.obterOpcao();

		try{

			if( users.get(codUserAtual).amigos[idAmigo] != 1){
				out.msgNaoSaoAmigos();
				return -1;
			}

			for(int i = 0; i < users.get(codUserAtual).conversas.size(); i++){

				Chat chat = users.get(codUserAtual).conversas.get(i);

				if(chat.getUserAmigo() == idAmigo){ //se o id for igual ao id do meu amigo ja existe mensagem

					for(int j = 0; j < users.get(idAmigo).conversas.size(); j++){

						Chat chatAmg = users.get(idAmigo).conversas.get(j);

						if(chatAmg.getUserAmigo() == codUserAtual){

							if(chat.conversa.size() > 5){

								System.out.println("///////////////////////");
								for(int k = chat.conversa.size() - 5; k < chat.conversa.size(); k++){
									String conversa = chat.conversa.get(k);

									System.out.println(" " + conversa);
								}
								System.out.println("///////////////////////");

							} else if(chat.conversa.size() >= 5){

								System.out.println("///////////////////////");
								for(int k = chat.conversa.size() - 5; k < chat.conversa.size(); k++){
									String conversa = chat.conversa.get(k);

									System.out.println(" " + conversa);
								}
								System.out.println("///////////////////////");


							} else if(chat.conversa.size() == 4){

								System.out.println("///////////////////////");
								for(int k = chat.conversa.size() - 4; k < chat.conversa.size(); k++){
									String conversa = chat.conversa.get(k);

									System.out.println(" " + conversa);
								}
								System.out.println("///////////////////////");


							} else if(chat.conversa.size() == 3){

								System.out.println("///////////////////////");
								for(int k = chat.conversa.size() - 3; k < chat.conversa.size(); k++){
									String conversa = chat.conversa.get(k);

									System.out.println(" " + conversa);
								}
								System.out.println("///////////////////////");


							} else if(chat.conversa.size() == 2){

								System.out.println("///////////////////////");
								for(int k = chat.conversa.size() - 2; k < chat.conversa.size(); k++){
									String conversa = chat.conversa.get(k);

									System.out.println(" " + conversa);
								}
								System.out.println("///////////////////////");

							} else if(chat.conversa.size() > 0) {

								System.out.println("///////////////////////");
								System.out.println(" " + chat.conversa.get(0));
								System.out.println("///////////////////////");
							}
							
							System.out.print("   msg: ");
							String msg = input.nextLine();

							chat.addMsg(users.get(codUserAtual).getNome() + ": " + msg);
							if(idAmigo != codUserAtual) chatAmg.addMsg(users.get(codUserAtual).getNome() + ": " + msg);
							
							System.out.println("\n    mensagem enviada\n");
							return 1;
						}
					}
				}
			}



			//CASO NAO TENHA CONVERSA ADCIONE UM NOVO CHAT AO SISTEMA
			Usuarios userAmigo = users.get(idAmigo);
			Usuarios userAtual = users.get(codUserAtual);

			System.out.print("msg: ");
			String msg = input.nextLine();

			userAtual.conversas.add(new Chat(codUserAtual, idAmigo, users.get(codUserAtual).getNome() + ": " + msg));
			if(idAmigo != codUserAtual)userAmigo.conversas.add(new Chat(idAmigo, codUserAtual, users.get(codUserAtual).getNome() + ": " + msg));
			System.out.println("\n    mensagem enviada\n");


		} catch(Exception e){
			System.out.println("Erro ao enviar msg!");
		}
		return 1;
	}

	public boolean exibirCaixaEntrada(int codUserAtual) {
		boolean bool = false;

		System.out.println("-------------------------------");

		for(int i = 0; i < users.get(codUserAtual).conversas.size(); i++){

			Chat chat = users.get(codUserAtual).conversas.get(i);
			System.out.println(i + " " 
					+ users.get(chat.getUserAmigo()).getNome() + " " 
					+ users.get(chat.getUserAmigo()).getSobrenome());
			bool = true;
		}
		System.out.println("-------------------------------");

		return bool;
	}

	public void limparHistorico(int codUserAtual) {
		users.get(codUserAtual).conversas.clear();

		out.historicoMsgLimpo();
	}

	public void exibirConversa(int codUserAtual) {

		System.out.print("digite o cod da conversa a exibir: ");
		int idConversa = in.obterOpcao();

		try {

			System.out.println("///////////////////////");

			for(int i = 0; i < users.get(codUserAtual).conversas.get(idConversa).conversa.size(); i++){
				String conversa = users.get(codUserAtual).conversas.get(idConversa).conversa.get(i);

				System.out.println(" " + conversa);
			}

			System.out.println("///////////////////////");

		}catch(Exception e){

			System.out.println("Erro ao exibir msg");
		}

	}
}






















