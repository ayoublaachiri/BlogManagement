package com.hellokoding.jpa.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role implements Serializable{
	private int id;
	private String name;
	private String description;
	private Collection<User> authors; 
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	public Collection<User> getAuthors() {
		return authors;
	}

	public void setAuthors(Collection<User> authors) {
		this.authors = authors;
	}

	public Role(String name, String description, Collection<User> authors) {
		super();
		this.name = name;
		this.description = description;
		this.authors = authors;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
