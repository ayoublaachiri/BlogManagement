package com.hellokoding.jpa.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Article implements Serializable{
	@Id
	private String title;
	private String content;
	private Collection<User> authors;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(String title, String content, Collection<User> authors) {
		super();
		this.title = title;
		this.content = content;
		this.authors = authors;
	}
	
	@Id
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
	public Collection<User> getAuthors() {
		return authors;
	}
	public void setAuthors(Collection<User> authors) {
		this.authors = authors;
	} 
	
	
	



	


}