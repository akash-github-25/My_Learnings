package com.que5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		List<Student> l=new ArrayList<>();
		l.add(new Student(1,"akash1",100,"abc@12","ak1",new Address("WB1","kol1","700071")));
		l.add(new Student(2,"akash2",150,"abc@123","ak2",new Address("WB2","kol2","700072")));
		l.add(new Student(3,"akash3",100,"abc@124","ak3",new Address("WB3","kol3","700072")));
		l.add(new Student(4,"akash4",140,"abc@125","ak4",new Address("WB4","kol4","700072")));
		l.add(new Student(5,"akash5",160,"abc@127","ak5",new Address("WB5","kol5","700075")));
		
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
//		for(Student s:l) {
			o.writeObject(l);
//		}
		System.out.println("done");
		o.close();
		

	}

}
