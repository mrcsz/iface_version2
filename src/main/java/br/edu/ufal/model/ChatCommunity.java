package br.edu.ufal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChatCommunity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	int idSender;
	int sender;
	String content;
}
