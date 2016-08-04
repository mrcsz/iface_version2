package br.edu.ufal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Msg {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	int sender;
	String senderName;
	
	public Msg() {
		super();
	}

	public Msg( int sender, String senderName, String content) {
		super();
		this.sender = sender;
		this.senderName = senderName;
		this.content = content;
	}

	String content;

	public int getSender() {
		return sender;
	}

	public void setSender(int sender) {
		this.sender = sender;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
