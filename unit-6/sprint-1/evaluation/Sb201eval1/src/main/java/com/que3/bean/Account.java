package com.que3.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Account {
	@Id
	private int id;
	private String email;
	String address;
	Double balance;
	
	public Account() {
		super();
	}

	public Account(int id, String email, String address, Double balance) {
		super();
		this.id = id;
		this.email = email;
		this.address = address;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
