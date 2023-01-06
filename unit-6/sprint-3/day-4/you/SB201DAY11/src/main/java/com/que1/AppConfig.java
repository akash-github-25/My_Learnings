package com.que1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;



@Configuration
@ComponentScan(basePackages = "com.que1")
@PropertySource("a1.properties")
public class AppConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public List<String> getCities(){
	List<String> cities = new ArrayList<String>();
	cities.add(env.getProperty("city1"));
	cities.add(env.getProperty("city2"));
	cities.add(env.getProperty("city3"));
	cities.add(env.getProperty("city4"));
	cities.add(env.getProperty("city5"));
	return cities;
	}
	
	@Bean
	public List<Student> getStudents(){
	List<Student> students = new ArrayList<Student>();
	students.add(new Student("akash",22));
	students.add(new Student("ayush",17));
	students.add(new Student("anku",13));
	students.add(new Student("ashu",9));
	students.add(new Student("shadgi",15));
	return students;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
