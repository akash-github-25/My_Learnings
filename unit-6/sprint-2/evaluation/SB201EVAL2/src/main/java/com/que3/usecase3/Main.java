package com.que3.usecase3;

import com.que3.Dao.TrainingDao;
import com.que3.Dao.TrainingDaoImpl;
import com.que3.Entity.Teacher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher();
		t1.setTeacherName("ap");
		t1.setNoYearOfExperince(2);
		t1.setEmail("ap@08");
		TrainingDao e=new TrainingDaoImpl();
		e.registerTeacher(t1);

	}

}
