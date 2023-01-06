package com.que5;

import java.util.Scanner;

public class Demo {
   void details(Student stud[]) {
	   if(stud != null) {
		   int sum=0;
		   int count=0;
		   double avg=0;
				for(int i=0;i<stud.length;i++) {
					sum=sum+stud[i].getMarks();
					count++;
					
					System.out.println("Roll is :"+stud[i].getRoll());
					System.out.println("Name is :"+stud[i].getName());
					System.out.println("Address id : "+stud[i].getAddress());
					System.out.println("Marks is :"+stud[i].getMarks());
					
					System.out.println("================================");
				}
				avg =sum/count ;
				System.out.println("Avg is : "+avg);
				
			}else
				System.out.println("null is not allowed");
			
		}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Students objects to be created");
		int t=sc.nextInt();
		Student[] stud=new Student[t];
		for(int i=0;i<stud.length;i++) {

			System.out.println("Enter roll:");
			int roll= sc.nextInt();
			
			System.out.println("Enter Name");
            String name= sc.next();
            
            System.out.println("Enter Address");
            String address= sc.next();
			
			System.out.println("Enter Marks");
			int marks= sc.nextInt();
			
			stud[i] = new Student();
			stud[i].setRoll(roll);
			stud[i].setName(name);
			stud[i].setAddress(address);
			stud[i].setMarks(marks);
		}
		
		d1.details(stud);

	}

}
