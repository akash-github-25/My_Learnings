package com.que3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Travel {
	
@Autowired	
private Car c;
@Autowired
private Bike b;
@PostConstruct
public void setUp() {
System.out.println("inside set up method");
}
@PreDestroy
public void tearDown(){
System.out.println("inside destroy  method");
}
public void funk() {
	c.funA();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
