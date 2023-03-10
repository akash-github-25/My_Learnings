package com.que3;

public class Student {
	private int roll;
	private String name;
	private String email;
	private int marks;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}

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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student() {
		super();
	}

	public Student(int roll, String name, String email, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
