package com.masai.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String name;
	private int mobileNumber;
	private String email;
	
	@ElementCollection
	@Embedded
	@JoinTable(name="emp_adr",joinColumns=@JoinColumn(name="cid"))
	private List<Address> addresses=new ArrayList<>(); // Has-A relationship
	
	
	public Customer(int cid, String name, int mobileNumber, String email, List<Address> addresses) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.addresses = addresses;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", addresses=" + addresses + "]";
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


	public Customer() {
		super();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
