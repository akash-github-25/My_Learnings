package com.que3.usecase1;

import com.que1.Dao.EmployeeDao;
import com.que1.Dao.EmployeeDaoImpl;
import com.que1.Entity.Department;
import com.que3.Dao.TrainingDao;
import com.que3.Dao.TrainingDaoImpl;
import com.que3.Entity.Course;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course d1=new Course();
		d1.setCourseName("maths");
		d1.setDuration("1 yrs");
		d1.setFee(1000);
		TrainingDao e=new TrainingDaoImpl();
		e.addCourse(d1);
	}

}
