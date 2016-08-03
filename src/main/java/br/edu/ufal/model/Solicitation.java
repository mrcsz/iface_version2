package br.edu.ufal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Solicitation {
	
	@Id
	@GeneratedValue
	int idUser;
	
	String nome;
	
	public Solicitation(int idUser, String nome) {
		this.idUser = idUser;
		this.nome = nome;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setId(int idUser) {
		this.idUser = idUser;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
