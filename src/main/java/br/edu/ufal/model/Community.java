package br.edu.ufal.model;

import java.util.ArrayList;
import java.util.List;

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
	
	
	String nome;
	String descricao;
	
	@ManyToMany
	List<User> user = new ArrayList<User>();
	
	
}
