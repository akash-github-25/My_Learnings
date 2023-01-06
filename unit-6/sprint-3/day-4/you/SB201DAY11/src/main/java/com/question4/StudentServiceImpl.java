package com.question4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao sDao;

	@Override
	public void saveStudent() {
		// TODO Auto-generated method stub
		sDao.insertStudentDetails();
	}


	
	
	
	

	
	

}
