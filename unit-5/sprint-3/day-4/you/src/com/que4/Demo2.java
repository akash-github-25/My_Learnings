package com.que4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		ObjectInputStream i=new ObjectInputStream(new FileInputStream("studentdata.txt"));
		List<Student> s=(List<Student>)i.readObject();
		s.forEach(a-> System.out.println(a));
		

	}

}
