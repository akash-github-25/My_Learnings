package com.que1.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentRoll;
	private String studentName;
	private int mobileNumber;
	private String email;
   
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private Collage clg;
	
	
	public int getStudentRoll() {
		return studentRoll;
	}


	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
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


	public Collage getDept() {
		return clg;
	}


	public void setDept(Collage clg) {
		this.clg = clg;
	}


	public Student() {
		super();
	}


	public Student(int studentRoll, String studentName, int mobileNumber, String email, Collage clg) {
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.clg = clg;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
