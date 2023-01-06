package com.que4;

public class Demo {
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student n1= Student.getStudent(true);
		Student n2= Student.getStudent(false);
		
		System.out.println("Roll no: "+n1.getRoll());
		System.out.println("Name: "+n1.getName());
		System.out.println("Address: "+n1.getAddress());
		System.out.println("CollegeName: "+n1.getCollageName());
		
		System.out.println("Roll no: "+n2.getRoll());
		System.out.println("Name: "+n2.getName());
		System.out.println("Address: "+n2.getAddress());
		System.out.println("CollegeName: "+n2.getCollageName());
		
	}

}
