package com.masai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Post {
	
@javax.persistence.Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer postId;
@NotNull (message= "Field Name cannot be empty")
private String Name;
@javax.validation.constraints.Email (message= "Field Email cannot be empty")
private String email;
@Size(min = 10, max= 300, message = "Description must contain atleast 10 characters and atmost 300 characters")
private String postDescription;

@JsonIgnore
@OneToMany(cascade = CascadeType.ALL,mappedBy = "post")
private List<Comment> comments=new ArrayList<>();

@OneToOne
private User user;

public Post(Integer postId, String name, String email, String postDescription, List<Comment> comments) {
	super();
	this.postId = postId;
	Name = name;
	this.email = email;
	this.postDescription = postDescription;
	this.comments = comments;
}

public Post() {
	super();
	// TODO Auto-generated constructor stub
}

public Integer getPostId() {
	return postId;
}

public void setPostId(Integer postId) {
	this.postId = postId;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPostDescription() {
	return postDescription;
}

public void setPostDescription(String postDescription) {
	this.postDescription = postDescription;
}

public List<Comment> getComments() {
	return comments;
}

public void setComments(List<Comment> comments) {
	this.comments = comments;
}

@Override
public String toString() {
	return "Post [postId=" + postId + ", Name=" + Name + ", email=" + email + ", postDescription=" + postDescription
			+ ", comments=" + comments + "]";
}



}
