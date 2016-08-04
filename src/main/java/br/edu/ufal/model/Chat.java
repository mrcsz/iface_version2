package br.edu.ufal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Chat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	public void setMsgs(List<Msg> msgs) {
		this.msgs = msgs;
	}

	int idUser;
	int idFriend;

	@OneToMany
	List<Msg> msgs = new ArrayList<Msg>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdFriend() {
		return idFriend;
	}

	public void setIdFriend(int idFriend) {
		this.idFriend = idFriend;
	}

	public List<Msg> getMsgs() {
		return msgs;
	}

	public void setMsgs(Msg msg) {
		this.msgs.add(msg);
	}
}
