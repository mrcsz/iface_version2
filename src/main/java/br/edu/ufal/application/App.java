package br.edu.ufal.application;



public class App {

	public static void main(String[] args){

		Entrada in = new Entrada();
		Saida out = new Saida();
		Controle control = new Controle();
		//set user default
		control.init();



		boolean loopGERAL = true;
		boolean loop;


		while(loopGERAL){

			loop = true;
			out.exibirMenu1();//MENU INICIAL
			switch (in.obterOpcao()){
			//OPCOES INICIAIS


			case 1://LOGIN

				int codUserAtual = control.autenticacao();
				if(codUserAtual != -1){
					//USER AUTORIZADO

					while(loop){
						//LOOP DE NAVEGACAO


						out.menuInicial();
						//MENU INICIAL

						switch(in.obterOpcao()){
						//NAVEGACAO	


						case 1://PERFIL
							control.gerUsers.ImprimePerfil(codUserAtual);

							out.exibeOpcoesPerfil();

							switch(in.obterOpcao()){ //OPCOES EDITAR/VOLTAR

							case 1://EDITAR PERFIL

								control.gerUsers.ImprimePerfil(codUserAtual);
								out.opcoesDeEdicaoPerfil();

								switch(in.obterOpcao()){ //O QUE SE DESEJA EDITAR

								case 1: //NOME / SOBRENOME
									control.gerUsers.editarNome(codUserAtual);
									break;
								case 2: //SEXO
									control.gerUsers.editarSexo(codUserAtual);
									break;
								case 3: //DT NASC
									control.gerUsers.editarDataNasc(codUserAtual);
									break;
								case 4: //CONTATO
									control.gerUsers.editarContato(codUserAtual);
									break;
								case 5: //STATUS
									control.gerUsers.editarStatus(codUserAtual);
									break;
								case 6: //INFORMACOES PROFISSIONAIS

									control.gerUsers.editarInfProf(codUserAtual);

									break;
								case 7: //INFORMACOES EDUCACIONAIS

									control.gerUsers.editarInfEduc(codUserAtual);

									break;
								default: // VOLTAR
									//QUALQUER OPCAO FORA DO INTERVALO VOLTA
								}

								break;
							default: //VOLTAR
								//VOLTA COM QUALQUER VALOR DIFERENTE DO 1

							}

							break;
						case 2: //AMIGOS

							out.menuAmigos();

							switch(in.obterOpcao()){
							case 1: //SOLICITACOES DE AMIZADE
								control.gerUsers.listaSolicitacoesAmizade(codUserAtual);

								out.menuResponderSolicitacao();

								switch(in.obterOpcao()){

								case 1: //ACEITAR CONVITE

									control.gerUsers.aceitarConviteAmizade(codUserAtual);

									break;
								case 2: //REJEITAR CONVITE

									control.gerUsers.rejeitarConviteAmizade(codUserAtual);

									break;
								default:	
									//VOLTAR
								}

								break;
							case 2: //BUSCAR AMIGOS
								control.gerUsers.listaUsuarioCadastrados(codUserAtual);

								out.menuAdcAmigo();



								switch(in.obterOpcao()){
								case 1: //ENVIAR SOLICITACAO

									control.gerUsers.ennviarSolicitacao(codUserAtual);

									break;
								default:
									//VOLTAR
								}

								break;
							case 3: //LISTAR AMIGOS

								control.gerUsers.listarAmigos(codUserAtual);

								break;
							default:		
								//VOLTAR
							}


							break;
						case 3: //COMUNIDADES





							break;
						case 4: //CHAT(private)

							out.menuMsgs();
							
							switch(in.obterOpcao()){
							case 1: //ENVIAR MENSAGEM
								boolean bool = true;
								while(bool){
									
									control.gerUsers.listarAmigos(codUserAtual);
									
									if(control.gerUsers.enviarMsg(codUserAtual)  != -1){
										out.outraMsg();
										
										if(in.obterOpcao() != 1){
											bool = false;
										}
									} else {
										bool = false;
									}
								}
								
								break;
							case 2://CAIXA DE MENSAGENS
								
								boolean temMsg = control.gerUsers.exibirCaixaEntrada(codUserAtual);
								
								
								if(temMsg){
									out.menuCxEntrada(); 
								
									switch(in.obterOpcao()){
									case 1: //SELECIONAR CONVERSA
											
										control.gerUsers.exibirConversa(codUserAtual);
										
										break;
									default:
										
										//VOLTAR
								
									} 
								} else {
									out.CaixaDeMsgsVazia();
								}
								
								break;
							case 3://LIMPAR HISTORICO
								
								control.gerUsers.limparHistorico(codUserAtual);
								
								break;
							default:
								//VOLTAR
							}
							
							break;
						case 5: //BUSCAR USUARIO

							

							break;

						case 6: //CONFIGURACOES

							out.menuConfig();
							switch(in.obterOpcao()){
							case 1://ALTERAR SENHA

								//control.gerUsers.alterarSenha(codUserAtual);
							
								break;		
							case 2:
								//ALTERAR EMAIL
								
								//control.gerUsers.alterarEmail(codUserAtual);
								
								break;
							case 3:
								//EXCLUIR CONTA
								
								//control.gerUsers.exluirConta(codUserAtual);

								break;
							default:
								//VOLTAR
							}
						case 7: //LOGOUT
							loop = false;

							break;
						case 8: //ENCERRA APLICATIVO
							loop = false;
							loopGERAL = false;
							out.exibirEncerrando();
							break;

						} //END SWITCH NAVEGACAO
					} //END LOOP NAVEGACAO
				} 	else { //END IF AUTORIZACAO USER
					//ACESSO NEGADO
				}
				break;

			case 2://CADASTRO

				if(control.addUser()) {
					//CADASTRO RELALIZADO COM SUCESSO
				} else {

					out.msgVoltando();
				}
				break;

			case 3: //ENCERRAR APLICACAO
				loopGERAL = false;
				out.exibirEncerrando();

			} //END SWITCH OPCOES INICIAIS
		} //END LOOP GERAL
	} //END METODO MAIN
} //END CLASS MAIN