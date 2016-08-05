package br.edu.ufal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Community {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	int admin;

	String name;
	String describe;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<User> member = new ArrayList<User>();
	
	@OneToMany(cascade = CascadeType.PERSIST)
	List<ChatCommunity> chatCommunity = new ArrayList<ChatCommunity>();

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
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

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public List<User> getUser() {
		return member;
	}

	public void setUser(User member) {
		this.member.add(member);
	}

	public List<ChatCommunity> getChatCommunity() {
		return chatCommunity;
	}

	public void setChatCommunity(List<ChatCommunity> chatCommunity) {
		this.chatCommunity = chatCommunity;
	}
	
}
