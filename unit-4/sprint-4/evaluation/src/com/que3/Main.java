package com.que3;

import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  List<Student> stud=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		TreeSet<Student> stud=new TreeSet<Student>(new Markssort());
		
  Student s=new Student();
  s.setRollNo(1);
  s.setName("chasman");
  s.setMathsMarks(100);
  s.setScienceMarks(100);
  s.setEngMarks(100);
  stud.add(s);
  Student s1=new Student();
  s1.setRollNo(2);
  s1.setName("chasman");
  s1.setMathsMarks(100);
  s1.setScienceMarks(100);
  s1.setEngMarks(100);
  stud.add(s1);
  Student s2=new Student();
  s2.setRollNo(3);
  s2.setName("chasman");
  s2.setMathsMarks(100);
  s2.setScienceMarks(100);
  s2.setEngMarks(100);
  stud.add(s2);
  Student s3=new Student();
  s3.setRollNo(4);
  s3.setName("chasman");
  s3.setMathsMarks(100);
  s3.setScienceMarks(100);
  s3.setEngMarks(100);
  stud.add(s3);
  
  
  
  
//  stud.toString();
//  int count=0;
//  for(Student sr:stud) {
//	  if(s.getName()==sr.getName()) {
//		  count++;
//	  }
//  }
  
  for(Student st:stud) {
	  System.out.println("Roll "+st.getRollNo());
	  System.out.println("Name "+st.getName());
	  System.out.println("mATHS "+st.getMathsMarks());
	  System.out.println("Science "+st.getScienceMarks());
	  System.out.println("Eng "+st.getEngMarks());
	  
  }
  
 
  
  
//  }else {
//	  TreeSet<Student> stud1=new TreeSet<Student>(new Rollsort());
//	  for(Student st:stud1){
//		  System.out.println("Roll"+st.getRollNo());
//		  System.out.println("Name "+st.getName());
//		  System.out.println("mATHS "+st.getMathsMarks());
//		  System.out.println("Science "+st.getScienceMarks());
//		  System.out.println("Eng "+st.getScienceMarks());
//	  }
  }
  

  
  
  
	}


