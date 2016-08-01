package br.edu.ufal.components;

import java.util.ArrayList;


public class User {
	private int id;
	private String nome;
	private String sobrenome;
	private String email;
	private String nasc;
	private String senha;
	private String sexo;
	Profile perfil;
	protected ArrayList<Integer> solicitacoes;
	protected int [] amigos;
	
	protected ArrayList<Chat> conversas;
	

	public User(int id, String nome, String sobrenome, String email, String nasc, String senha, String sexo) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.nasc = nasc;
		this.senha = senha;
		this.sexo = sexo;
		this.perfil = new Profile();
		this.solicitacoes = new ArrayList<Integer>();
		this.amigos = new int[1000];
		this.conversas = new ArrayList<Chat>();
		amigos[id] = 1; //ELE � AMIGO DELE MESMO
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSexo() {
		if(sexo.equalsIgnoreCase("M")) return "Masculino";
		else return "Feminino";
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;	
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
