package br.edu.ufal.model;

import java.util.ArrayList;

public class Chat {
	private int userAtual;
	private int userAmigo;
	protected ArrayList<String> conversa;
	
	public Chat(int userAtual, int userAmigo, String msg){
		
		this.userAtual = userAtual;
		this.userAmigo = userAmigo;
		this.conversa = new ArrayList<String>();
		conversa.add(msg);
	}
	

	public int getUserAtual() {
		return userAtual;
	}

	public void setUserAtual(int userAtual) {
		this.userAtual = userAtual;
	}



	public int getUserAmigo() {
		return userAmigo;
	}



	public void setUserAmigo(int userAmigo) {
		this.userAmigo = userAmigo;
	}


	public void addMsg(String msg){
		conversa.add(msg);
	}
}
