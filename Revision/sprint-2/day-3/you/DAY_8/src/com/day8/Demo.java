package com.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		PartTimeEmployee b=new PartTimeEmployee(1, "akaka", 10, 20, 30, 40, 50);
		
		FileOutputStream fos1 = new FileOutputStream("myObjects2");
        
        ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
 
        oos1.writeObject(b);
        
        oos1.close();

        
        FileInputStream fis1 = new FileInputStream("myObjects2");
        
        ObjectInputStream ois1 = new ObjectInputStream(fis1);

        PartTimeEmployee t21 = (PartTimeEmployee)ois1.readObject();
        
        System.out.println(t21);
        
        

	}

}
