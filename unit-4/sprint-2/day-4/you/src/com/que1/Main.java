package com.que1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1=new Student(23,"akash",22,57);
       Student s2=new Student();
       s2.setRoll(23);
       s2.setName("akash");
       s2.setAge(45);
       s2.setMarks(57);
       
       s1.details();
       s2.details();
	}

}
