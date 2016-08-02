package br.edu.ufal.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String lastName;
	private String email;
	private String dateBirth;
	private String password;
	private String sex;

	Profile perfil;
	ArrayList<Integer> solicitacoes;
	ArrayList<User> amigos;
	ArrayList<Chat> conversas;
	
	public User(String name, String lastName, String email, String dateBirth, String password, String sex) {
	
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.dateBirth = dateBirth;
		this.password = password;
		this.sex = sex;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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
