package com.que3.usecase4;

import com.que3.Dao.TrainingDao;
import com.que3.Dao.TrainingDaoImpl;
import com.que3.Exception.CourseException;
import com.que3.Exception.TeacherException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingDao e=new TrainingDaoImpl();
		try {
			e.assignTeacherWithCourse(13, 11);
		} catch (TeacherException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CourseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
