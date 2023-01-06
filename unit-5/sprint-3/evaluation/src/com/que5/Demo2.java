package com.que5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		ObjectInputStream v=new ObjectInputStream(new FileInputStream("studentdata.txt"));
		List<Student> s1=(List)v.readObject();
		System.out.println("First Serialization********************");
		for(Student v1:s1) {
			System.out.println(v1);
		}
		s1.add(new Student(6,"akash78",100,"abc@125","ak61",new Address("WB4","kol17","700079")));
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
		o.writeObject(s1);
		
		ObjectInputStream v1=new ObjectInputStream(new FileInputStream("studentdata.txt"));
		List<Student> s11=(List)v1.readObject();
		System.out.println("Second Serialization**********************");
		for(Student v12:s11) {
			System.out.println(v12);
		}
		
		

	}

}
