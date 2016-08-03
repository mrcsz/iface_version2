package br.edu.ufal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Friend {
	
	@Id
	@GeneratedValue
	int id;

	int idFriend;
	String nomeFriend;
	
	public Friend(int idFriend, String nomeFriend) {
		super();
		this.idFriend = idFriend;
		this.nomeFriend = nomeFriend;
	}

	public int getIdFriend() {
		return idFriend;
	}

	public void setIdFriend(int idFriend) {
		this.idFriend = idFriend;
	}

	public String getNomeFriend() {
		return nomeFriend;
	}

	public void setNomeFriend(String nomeFriend) {
		this.nomeFriend = nomeFriend;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
