package com.masai.bean;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // to autogenerate ID.
	private Integer id; 
	private String name;
	private Integer phoneNo;
	private LocalDate dateOfBirth;
	
	@JsonIgnore
	@OneToOne
	private Email email;

	

	
	public User(Integer id, String name, Integer phoneNo, LocalDate dateOfBirth, Email email) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}

	public User() {
		super();
		dateOfBirth=LocalDate.now();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	
	
	
	
	
	
}
