package com.que3;

import java.util.Scanner;

public class Course {
    
	int courseId;
	String courseName;
	int courseFee;
    
	 void displayCourseDetails(){
		System.out.println(courseName.trim());
		System.out.println(courseId);
		System.out.println(courseFee);
	}
	 String username;
     String password;
     
     
	 static void authenticate(String username,String password) {
		 
         if(username.equals("Admin") && password.equals("1234")) {
        	Course c1=new Course();
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter Name: ");
        	c1.courseName=sc.nextLine();
        	System.out.println("Enter courseId: ");
        	c1.courseId=sc.nextInt();
        	System.out.println("Enter courseFee: ");
        	c1.courseFee=sc.nextInt();
        	c1.displayCourseDetails();
         }else {
        	 System.out.println("Invalid Username or password");
         }

	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
         authenticate("Admin","1234");
         authenticate("akash","1234");
	}

}
