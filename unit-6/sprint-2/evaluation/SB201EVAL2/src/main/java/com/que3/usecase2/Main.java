package com.que3.usecase2;

import com.que3.Dao.TrainingDao;
import com.que3.Dao.TrainingDaoImpl;
import com.que3.Entity.Student;
import com.que3.Exception.CourseException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setName("akash");
		s1.setMobile(7982);
		s1.setEmail("al@25");
		
		TrainingDao e=new TrainingDaoImpl();
		try {
			e.registerStudent(s1, 11);
		} catch (CourseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
