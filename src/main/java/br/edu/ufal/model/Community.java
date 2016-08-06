package br.edu.ufal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Community {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	private String dados;

	@ManyToMany(cascade = CascadeType.ALL)
	List<User> users = new ArrayList<User>(); //User do indice zero eh adm
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<ChatCommunity> communities = new ArrayList<ChatCommunity>();

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(User user) {
		this.users.add(user);
	}

	public int getId() {
		return id;
	}

	public List<ChatCommunity> getChatCommunity() {
		return communities;
	}

	public void setCommunity(ChatCommunity community) {
		this.communities.add(community);
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
