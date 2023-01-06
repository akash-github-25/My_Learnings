package com.que6;

import java.util.Scanner;

public class Main {
	int m;
	int n;
	int l;
	public static double getStudent(int choice) {
		if(choice==1) {
//			Student s=new ArtStudent();
//			ArtStudent a=(ArtStudent)s;
			ArtStudent a=new ArtStudent();
//			System.out.println(a.getHindiMarks());
			double d=a.findPercentage();
			return d;
		}else if(choice==2) {
			ScienceStudent s=new ScienceStudent();
			double p=s.findPercentage();
			return p;
		}else if(choice==3) {
			CommerceStudent c=new CommerceStudent();
			double q=c.findPercentage();
			return q;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
  System.out.println("Which Student percentage do you want to find:\r\n"
  		+ "1. ArtStudent\r\n"
  		+ "2. ScienceStudent\r\n"
  		+ "3. CommerceStudent");
  int i=sc.nextInt();
  if(i==1) {
ArtStudent a=new ArtStudent();
//	  Student s=new ArtStudent();
//		ArtStudent a=(ArtStudent)s;
	  System.out.println("Enter the Marks of hindi");
	  int m=sc.nextInt();
	  a.setHindiMarks(m);
	  System.out.println("Enter the Marks of English");
	  int n=sc.nextInt();
	  a.setEnglishMarks(n);
	  System.out.println("Enter the Marks of History");
	  int l=sc.nextInt();
	  a.setHistoryMarks(l);
	  ArtStudent x=new ArtStudent(m,n,l);
//	 double z=Main.getStudent(1);
	 double sum=a.getEnglishMarks()+a.getHindiMarks()+a.getHistoryMarks();
	 double z=sum/3;
	 System.out.println("Percentage is: "+z);
  }else if(i==2) {
	  ScienceStudent s=new ScienceStudent();
	  System.out.println("Enter the Marks of Physics");
	  s.setPhysicsMarks(sc.nextInt());
	  System.out.println("Enter the Marks of Chemistry");
	  s.setChemistryMarks(sc.nextInt());
	  System.out.println("Enter the Marks of Maths");
	  s.setMathsMarks(sc.nextInt());
	  System.out.println("Enter the Marks of Bio");
	  s.setBiologyMarks(sc.nextInt());
//	  double z=Main.getStudent(2);
	  double sum=s.getBiologyMarks()+s.getChemistryMarks()+s.getMathsMarks()+s.getPhysicsMarks();
	  double z=sum/4;
		 System.out.println("Percentage is: "+z);
  }else {
	  CommerceStudent c=new CommerceStudent();
	  System.out.println("Enter the Marks of Accounts");
	  c.setAccountMarks(sc.nextInt());
	  System.out.println("Enter the Marks of Economics");
	  c.setEconomicsMarks(sc.nextInt());
	  System.out.println("Enter the Marks of Business Studies");
	  c.setBusinessStudiesMarks(sc.nextInt());
//	  double z=Main.getStudent(3);
	  double sum=c.getAccountMarks()+c.getBusinessStudiesMarks()+c.getEconomicsMarks();
	  double z=sum/3;
		 System.out.println("Percentage is: "+z);
  }
	}

}
