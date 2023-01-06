package com.que2.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roll;
	private String name;
	private String email;
	private int mobile;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Course> co=new ArrayList<Course>();
	
	
//	@Override
//	public String toString() {
//		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", co=" + co
//				+ "]";
//	}


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


	public List<Course> getCo() {
		return co;
	}


	public void setCo(List<Course> co) {
		this.co = co;
	}


	public Student() {
		super();
	}


	public Student(int roll, String name, String email, int mobile, List<Course> co) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.co = co;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
