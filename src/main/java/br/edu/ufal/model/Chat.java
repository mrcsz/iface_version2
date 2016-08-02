package br.edu.ufal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Chat {
	
	@Id
	@GeneratedValue
	int id;
	


	private int userAtual;
	private int userAmigo;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	protected List<Msg> msg;
	
	public Chat(int userAtual, int userAmigo, Msg msg){
		
		this.userAtual = userAtual;
		this.userAmigo = userAmigo;
		this.msg = new ArrayList<Msg>();
		this.msg.add(msg);
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Msg> getMsg() {
		return msg;
	}


	public void setMsg(ArrayList<Msg> msg) {
		this.msg = msg;
	}

	public int getUserAtual() {
		return userAtual;
	}

	public void setUserAtual(int userAtual) {
		this.userAtual = userAtual;
	}



	public int getUserAmigo() {
		return userAmigo;
	}



	public void setUserAmigo(int userAmigo) {
		this.userAmigo = userAmigo;
	}


	public void addMsg(Msg msg){
		this.msg.add(msg);
	}
}
