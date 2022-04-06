package com.phong.javaexam.controllers.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "name is needed!")
	@Size(min = 4, max = 32, message = "Username must be between 4 and 32 characters")
	private String name;

	@NotEmpty(message = "Email is needed!")
	@Email(message = "Please enter a valid email!")
	private String email;

	@NotEmpty(message = "Password is needed!")
	@Size(min = 8, max = 64, message = "Password must be between 8 and 64 characters")
	private String password;

	@Transient
	@NotEmpty(message = "Confirm Password is needed!")
	@Size(min = 8, max = 64, message = "Confirm Password must be between 8 and 64 characters")
	private String confirm;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<Idea> ideas;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "likes", 
	joinColumns = @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "idea_id"))

	private List<Idea> ideaLiked;

	public List<Idea> getIdeaLiked() {
		return ideaLiked;
	}

	public void setIdeaLiked(List<Idea> ideaLiked) {
		this.ideaLiked = ideaLiked;
	}

	public List<Idea> getIdeas() {
		return ideas;
	}

	public void setIdeas(List<Idea> ideas) {
		this.ideas = ideas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	// Add relationship

}
