package com.masai.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Integer commentId;
  private String commentDescription;
  @ManyToOne
  private Post post;

public Comment(Integer commentId, String commentDescription, Post post) {
	super();
	this.commentId = commentId;
	this.commentDescription = commentDescription;
	this.post = post;
}

public Comment() {
	super();
	// TODO Auto-generated constructor stub
}

public Integer getCommentId() {
	return commentId;
}

public void setCommentId(Integer commentId) {
	this.commentId = commentId;
}

public String getCommentDescription() {
	return commentDescription;
}

public void setCommentDescription(String commentDescription) {
	this.commentDescription = commentDescription;
}

public Post getPost() {
	return post;
}

public void setPost(Post post) {
	this.post = post;
}

@Override
public String toString() {
	return "Comment [commentId=" + commentId + ", commentDescription=" + commentDescription + ", post=" + post + "]";
}
  
  
}
