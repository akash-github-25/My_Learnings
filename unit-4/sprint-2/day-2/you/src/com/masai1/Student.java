package com.masai1;

public class Student {
       
	int roll;
	String name;
	int marks; 
	
	void displayStudentDetails() {
		System.out.println("Roll is "+ roll);
		System.out.println("Name is "+ name);
		System.out.println("Marks is "+ marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ak=new Student();
		ak.roll=32;
		ak.name="akash";
		ak.marks=90;
		
		Student ay=new Student();
		ay.roll=37;
		ay.name="ayush";
		ay.marks=99;
		
		ak.displayStudentDetails();
		ay.displayStudentDetails();
		
		ak=null;
		ay=null;
		 
	


	}

}
