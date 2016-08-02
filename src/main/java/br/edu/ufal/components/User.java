package br.edu.ufal.components;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	private String sobrenome;
	private String email;
	private String nasc;
	private String senha;
	private String sexo;
	
	Profile perfil;
	ArrayList<Integer> solicitacoes;	
	ArrayList<User> amigos;
	ArrayList<Chat> conversas;
	
	public User(int id, String nome, String sobrenome, String email, String nasc, String senha, String sexo,
			Profile perfil, ArrayList<Integer> solicitacoes, ArrayList<User> amigos, ArrayList<Chat> conversas) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.nasc = nasc;
		this.senha = senha;
		this.sexo = sexo;
		this.perfil = perfil;
		this.solicitacoes = solicitacoes;
		this.amigos = amigos;
		this.conversas = conversas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Profile getPerfil() {
		return perfil;
	}

	public void setPerfil(Profile perfil) {
		this.perfil = perfil;
	}

	public ArrayList<Integer> getSolicitacoes() {
		return solicitacoes;
	}

	public void setSolicitacoes(ArrayList<Integer> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}

	public ArrayList<User> getAmigos() {
		return amigos;
	}

	public void setAmigos(ArrayList<User> amigos) {
		this.amigos = amigos;
	}

	public ArrayList<Chat> getConversas() {
		return conversas;
	}

	public void setConversas(ArrayList<Chat> conversas) {
		this.conversas = conversas;
	}
	
	
	
	
}
