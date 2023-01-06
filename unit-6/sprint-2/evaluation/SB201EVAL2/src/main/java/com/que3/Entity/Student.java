package com.que3.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roll;
	private String name;
	private String email;
	private int mobile;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Course> cou=new ArrayList<Course>();
	
	
	

	public int getRoll() {
		return roll;
	}




	public void setRoll(int roll) {
		this.roll = roll;
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




	public int getMobile() {
		return mobile;
	}




	public void setMobile(int mobile) {
		this.mobile = mobile;
	}




	public List<Course> getCou() {
		return cou;
	}




	public void setCou(List<Course> cou) {
		this.cou = cou;
	}




	public Student() {
		super();
	}




	public Student(int roll, String name, String email, int mobile, List<Course> cou) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.cou = cou;
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
