package com.que1;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
	
@Autowired
private List<String> cities;
@Autowired
List<Student> students;
@PostConstruct
public void setUp() {
System.out.println("inside set up method");
}
@PreDestroy
public void tearDown(){
System.out.println("inside destroy  method");
}
public void funA() {
System.out.println("inside funA of A");
System.out.println(cities);
}
public void funB() {
	System.out.println("inside funB");
	System.out.println(students);
}
}
