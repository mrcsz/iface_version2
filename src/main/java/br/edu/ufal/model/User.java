package br.edu.ufal.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String lastName;
	private String email;
	private String dateBirth;
	private String password;
	private String sex;
	public Profile profile = new Profile();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Solicitation> solicitation = new ArrayList<Solicitation>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Friend> friend = new ArrayList<Friend>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Chat> conversation = new ArrayList<Chat>();

	public void setSolicitation(Solicitation solic) {
		this.solicitation.add(solic);
	}

	public void setFriend(Friend fr) {
		this.friend.add(fr);
	}

	public void setConversation(Chat conv) {
		this.conversation.add(conv);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<Solicitation> getSolicitation() {
		return solicitation;
	}

	public void setSolicitation(ArrayList<Solicitation> solicitation) {
		this.solicitation = solicitation;
	}

	public List<Friend> getFriend() {
		return friend;
	}

	public void setFriend(ArrayList<Friend> friend) {
		this.friend = friend;
	}

	public List<Chat> getConversation() {
		return conversation;
	}

	public void setConversation(ArrayList<Chat> conversation) {
		this.conversation = conversation;
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

}
