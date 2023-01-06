package com.que3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
//Student1 s1=new Student1();
		
		Thread t1=new Thread(s);
//		Thread t2=new Thread(s1);
		t1.start();
		
	}

}
