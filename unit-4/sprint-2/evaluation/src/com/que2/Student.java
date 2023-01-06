package com.que2;

public class Student {
	
     
	private int rollNumber;
	private String studentName;
	private int marks;
	
	
	public Student() {
		super();
	}


	public Student(int rollNumber, String studentName, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
    
	

	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
  
	static void details(int t,int a,String b,int c) {
		System.out.println("Student Detail "+t);
		System.out.println("Student Roll Number:"+a);
		System.out.println("Student Name:"+b);
		System.out.println("Enter the marks :"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
