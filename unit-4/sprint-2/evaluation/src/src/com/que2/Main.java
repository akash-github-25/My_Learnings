package com.que2;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter Number of Students you want to enter ");
  t=sc.nextInt();
  Student s=new Student();
  for(int i=0;i<t;i++) {
  System.out.println("Enter the Roll Number :");
  int a=sc.nextInt();
  s.setRollNumber(a);
  System.out.println("Enter the Name :");
  String b=sc.next();
  s.setStudentName(b);
  System.out.println("Enter the marks :");
  int c=sc.nextInt();
  s.setMarks(c);
  
  s.details(i+1,a,b,c);
	}
	}

}
