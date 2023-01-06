package com.masai;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masai.bean.EmployeeRepo;
import com.masai.bean.EmployeeService;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	private EmployeeService es;
	
	 private EmployeeRepo er;
	 
	 

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
