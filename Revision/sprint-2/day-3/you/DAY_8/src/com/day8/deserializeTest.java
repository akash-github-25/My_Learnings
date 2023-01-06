package com.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class deserializeTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
        FileInputStream fis
            = new FileInputStream("myObjects");
        ObjectInputStream ois = new ObjectInputStream(fis);
 
       
        List<Student> t2
            = (List<Student>)ois.readObject();
 
        
        System.out.println("Object has been deserialized ");
 
        
      for(Student c:t2) {
    	  System.out.println(c);
      }
      
      FileInputStream fis1 = new FileInputStream("myObjects1");
      
      ObjectInputStream ois1 = new ObjectInputStream(fis1);

      List<Employee> t21 = (List<Employee>)ois1.readObject();
      
      for(Employee x:t21) {
    	  System.out.println(x);
      }

	}

}
