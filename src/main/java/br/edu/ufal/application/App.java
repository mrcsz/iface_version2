package br.edu.ufal.application;

import br.edu.ufal.controller.Controller;
import br.edu.ufal.model.User;
import br.edu.ufal.view.Capture;
import br.edu.ufal.view.Screen;

public class App {

	public static void main(String[] args) {

		boolean loopGeneral = true;
		boolean loop;

		while (loopGeneral) {

			loop = true;
			Screen.menuDisplayLogin();// MENU INICIAL
			switch (Capture.getOptionInt()) {
			// OPCOES INICIAIS

			case 1:// LOGIN

				User user = Controller.authenticationLogin();
				if (user != null) {
					// USER AUTORIZADO

					while (loop) {
						// LOOP DE NAVEGACAO

						Screen.displayInitialMenu();
						// MENU INICIAL

						switch (Capture.getOptionInt()) {
						// NAVEGACAO

						case 1:// PERFIL
							Controller.printProfile(user);

							Screen.profileOption();

							switch (Capture.getOptionInt()) { // OPCOES
																// EDITAR/VOLTAR

							case 1:// EDITAR PERFIL

								Screen.profileEditionOption();

								switch (Capture.getOptionInt()) { // O QUE SE
																	// DESEJA
																	// EDITAR

								case 1: // NOME
									Controller.Edition(user, "name");
									break;

								case 2: // SOBRENOME
									Controller.Edition(user, "lastName");
									break;
								case 3: // SEXO
									Controller.Edition(user, "gender");
									break;
								case 4: // DT NASC
									Controller.Edition(user, "dateBirth");
									break;
								case 5: // CONTATO
									Controller.Edition(user, "contact");
									break;
								case 6: // STATUS
									Controller.Edition(user, "status");
									break;
								case 7: // INFORMACOES PROFISSIONAIS
									Controller.EditionInformationProfessional(user);
									break;
								case 8: // INFORMACOES EDUCACIONAIS
									Controller.EditionInformationEducational(user);
									break;
								default: // VOLTAR
									// QUALQUER OPCAO FORA DO INTERVALO VOLTA
								}

								break;
							default: // VOLTAR
								// VOLTA COM QUALQUER VALOR DIFERENTE DO 1

							}

							break;
						case 2: // AMIGOS

							Screen.menuFriends();

							switch (Capture.getOptionInt()) {
							case 1: // SOLICITACOES DE AMIZADE

								if (Controller.listRequest(user)) {
									Screen.aceptFriend();

									switch (Capture.getOptionInt()) {

									case 1: // ACEITAR CONVITE

										Controller.aceptRequest(user);

										break;
									case 2: // REJEITAR CONVITE

										Controller.removeRequest(user);

										break;
									default:
										// VOLTAR
									}
								} else {
									Screen.noRequest();
								}
								break;
							case 2: // BUSCAR AMIGOS

								if (Controller.searchUser()) {
									Screen.menuAddFriend();

									switch (Capture.getOptionInt()) {
									case 1: // ENVIAR SOLICITACAO

										Controller.sendRequest(user);

										break;
									default:
										// VOLTAR
									}
								} else {
									Screen.UserNotFound();
								}

								break;
							case 3: // LISTAR AMIGOS

								Controller.listFriends(user);
								break;
							default:
								// VOLTAR
							}

							break;
						case 3: // COMUNIDADES

							Screen.menuCommunity();

							switch (Capture.getOptionInt()) {
							case 1: // CRIAR COMUNIDADE

								Controller.createCommunity(user);
								break;
							case 2: // EXCLUIR COMUNIDADE

								break;
							case 3: // LISTAR COMUNIDADE
								
								Screen.menuListCommunities();
								switch (Capture.getOptionInt()) {
								case 1: // TODAS

									Controller.listCommunities();
									break;
								case 2: // SO AS DO USER
									
									Controller.listCommunities(user);
									break;
								default:
									// VOLTAR
								}
								
								Controller.communitySelect();
									
								}

								break;
							default:
								// VOLTAR

						case 4: // CHAT(private)

							Screen.menuMsgs();

							switch (Capture.getOptionInt()) {
							case 1: // ENVIAR MENSAGEM
								boolean bool = true;
								while (bool) {

									if (Controller.sendMsg(user) != -1) {
										Screen.otherMsg();

										if (Capture.getOptionInt() != 1) {
											bool = false;
										}
									} else {
										bool = false;
									}
								}

								break;
							case 2:// CAIXA DE MENSAGENS

								boolean haveMsg = Controller.msgBox();

								if (haveMsg) {
									Screen.menuEntryBox();

									switch (Capture.getOptionInt()) {
									case 1: // SELECIONAR CONVERSA

										// Controller.()
										// MostraConversa
										break;
									default:

										// VOLTAR

									}
								} else {
									// Screen.boxText();
									// vazia
								}

								break;
							case 3:// LIMPAR HISTORICO

								// Controller.
								// limpa historico

								break;
							default:
								// VOLTAR
							}

							break;
						case 5: // BUSCAR USUARIO

							break;

						case 6: // CONFIGURACOES

							Screen.menuSettings();
							// configuracao
							switch (Capture.getOptionInt()) {
							case 1:// ALTERAR SENHA

								// control.gerUsers.alterarSenha(codUserAtual);

								break;
							case 2:
								// ALTERAR EMAIL

								// control.gerUsers.alterarEmail(codUserAtual);

								break;
							case 3:
								// EXCLUIR CONTA

								// control.gerUsers.exluirConta(codUserAtual);

								break;
							default:
								// VOLTAR
							}
						case 7: // LOGOUT
							loop = false;

							break;
						case 8: // ENCERRA APLICATIVO
							loop = false;
							loopGeneral = false;
							Screen.appFinalised();
							break;

						} // END SWITCH NAVEGACAO
					} // END LOOP NAVEGACAO
				} else { // END IF AUTORIZACAO USER
					// ACESSO NEGADO
				}
				break;

			case 2:// CADASTRO
				boolean bool = true;
				while (bool) {
					if (Controller.addUser() == -1) {

						Screen.displayMenuTryAgain();

						if (Capture.getOptionInt() != 1) {
							bool = false;
						}
					} else {
						bool = false;
					}
				}

				break;

			case 3: // ENCERRAR APLICACAO
				loopGeneral = false;
				// FIM DA APLICACAO

			} // END SWITCH OPCOES INICIAIS
		} // END LOOP GERAL
	} // END METODO MAIN
} // END CLASS MAIN