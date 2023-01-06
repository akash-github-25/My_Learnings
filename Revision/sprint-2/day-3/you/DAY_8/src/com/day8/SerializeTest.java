package com.day8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Student> stud=new ArrayList<>();
		stud.add(new Student(1,"akash",22,10,100));
		stud.add(new Student(2,"ayush",17,1,200));
		
		 FileOutputStream fos = new FileOutputStream("myObjects");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(stud);
       
         
         List<Employee> emp=new ArrayList<>();
         emp.add(new Employee(1,"krishna",22,200000,"eng","mumbai"));
         emp.add(new Employee(2,"Abhinav",27,200000,"eng-cs","delhi"));
         
         FileOutputStream fos1 = new FileOutputStream("myObjects1");
         
         ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
  
         oos1.writeObject(emp);
         
         oos.close();
         fos.close();
//         oos1.close();
//         oos1.flush();
		

	}

}
