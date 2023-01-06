package com.masai.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mail_id;
	private String email;
	private Date created_date;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	public Email(Integer mail_id, String email, Date created_date, User user) {
		super();
		this.mail_id = mail_id;
		this.email = email;
		this.created_date = created_date;
		this.user = user;
	}

	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getMail_id() {
		return mail_id;
	}

	public void setMail_id(Integer mail_id) {
		this.mail_id = mail_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
