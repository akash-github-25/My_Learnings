package com.que4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
  Student s1=new Student(1,"akash1",101,new Address("kolkata1","howrah1",711206));
  Student s2=new Student(2,"akash2",102,new Address("kolkata2","howrah2",711206));
  Student s3=new Student(3,"akash3",103,new Address("kolkata3","howrah3",711206));
  Student s4=new Student(4,"akash4",104,new Address("kolkata4","howrah4",711206));
  Student s5=new Student(5,"akash5",105,new Address("kolkata5","howrah5",711206));
  List<Student> l=new ArrayList<>();
  l.add(s1);
  l.add(s2);
  l.add(s3);
  l.add(s4);
  l.add(s5);
  
  ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
  o.writeObject(l);
  o.flush();
  o.close();
  System.out.println("Work done");
	}

}
