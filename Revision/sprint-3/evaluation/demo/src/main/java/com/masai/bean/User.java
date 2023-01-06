package com.masai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // to autogenerate ID.
	private Integer userId;
    @Size(min = 2, max= 20, message = "	Type must contain more than 2 characters")
	private String userType;
	@NotNull (message= "Field Name cannot be empty")
	private String Name;
	@javax.validation.constraints.Email (message= "Field Email cannot be empty")
	private String Email;
	private String userPassword;
	
	@JsonIgnore
	@OneToOne(mappedBy="user")
	private Post post;

	public User(Integer userId, String userType, String name, String email, String userPassword, Post post) {
		super();
		this.userId = userId;
		this.userType = userType;
		Name = name;
		Email = email;
		this.userPassword = userPassword;
		this.post = post;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userType=" + userType + ", Name=" + Name + ", Email=" + Email
				+ ", userPassword=" + userPassword + ", post=" + post + "]";
	}
	
	
	
	
	
	
}
