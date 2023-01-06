package com.Question;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Testing {
	EmployeeService es=new EmployeeServiceImpl();
	
	
	@Test
	public void addEmployeeTest() {
		Employee e=new Employee(6,"dhoni","ranchi");
		
		assertEquals(e, es.addEmployee(e));
	}
	
	@Test
	public void addEmployeeFailTest() {
		
		assertEquals(null, es.addEmployee(null));
	}
	
	@Test
	public void deleteEmployeeTest() throws EmployeeNotExist {
		es.addEmployee(new Employee(9,"bholu","india"));
		assertTrue(es.deleteEmployee(9));
	}
	@Test
	public void deleteEmployeeWithExceptionTest() {
		Exception exception=assertThrows(EmployeeNotExist.class, ()->{es.deleteEmployee(0);});
		String expected="Employeee not present";
		String output=exception.getMessage();
		assertEquals(expected, output);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
