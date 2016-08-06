package br.edu.ufal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ChatCommunity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@ManyToMany
	List<MsgCommunity> msgsCommunity = new ArrayList<MsgCommunity>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<MsgCommunity> getMsgsCommunity() {
		return msgsCommunity;
	}

	public void setMsgsCommunity(MsgCommunity msgCommunity) {
		this.msgsCommunity.add(msgCommunity);
	}
	
	
	
}
