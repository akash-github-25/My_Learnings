package com.que4;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	

	public Student() {
		super();
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
//		this.grade = grade;
	}
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
//		 syso
		 return "Roll is "+roll+" Name is "+name+" Marks is "+marks;
//		 System.out.println("Roll is "+roll);
//		 System.out.println("Name is "+name);
//		 System.out.println("Marks is "+marks);
		 
	}

	public void displayDetails() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Roll is");
		 int roll =sc.nextInt();
		 System.out.println("Name is");
			String name = sc.next();
			System.out.println("Marks is");
			int marks = sc.nextInt();
//			char grade = grade;
		Student s=new Student(roll,name,marks);
		System.out.println(s);
		char f=s.calculateGrade(marks);
		System.out.println("grade is "+f);
	}
	private char calculateGrade(int marks) {
		if(marks >= 500) {
			return 'A';
		}else if(marks<500 && marks>=400) {
			return 'B';
		}else if(marks<400){
			return 'C';
		}else{
			return 'C';
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println(s);
		

	}

}
