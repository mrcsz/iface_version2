package br.edu.ufal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Chat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@OneToMany(cascade = CascadeType.PERSIST)
	@LazyCollection(LazyCollectionOption.FALSE)
	List<Msg> msgs = new ArrayList<Msg>();
	
	public void setMsgs(List<Msg> msgs) {
		this.msgs = msgs;
	}

	int idUser;
	int idFriend;

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
