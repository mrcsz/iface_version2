package br.edu.ufal.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


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
	private String gender;
	public Profile profile = new Profile();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "friendship", joinColumns = @JoinColumn(name = "user1"), inverseJoinColumns = @JoinColumn(name = "user2"))
	protected List<User> friend = new ArrayList<User>();
	
	@ManyToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	protected List<User> friendRequest = new ArrayList<User>();
		
	@ManyToMany	
	@LazyCollection(LazyCollectionOption.FALSE)
	protected List<Community> community = new ArrayList<Community>();

	@OneToMany(cascade = CascadeType.PERSIST)
	@LazyCollection(LazyCollectionOption.FALSE)
	protected List<Chat> chat = new ArrayList<Chat>();
	
	public List<Community> getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community.add(community);
	}

	public List<Chat> getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat.add(chat);
	}

	public void setFriendRequest(User friendRequest) {
		this.friendRequest.add(friendRequest);
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

	public List<User> getFriend() {
		return friend;
	}

	public void setFriend(User friend) {
		this.friend.add(friend);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getFriendRequest() {
		return friendRequest;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
