package com.masai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.masai.bean.Employee;
import com.masai.bean.EmployeeException;
import com.masai.bean.EmployeeRepo;
import com.masai.bean.EmployeeService;
@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private EmployeeService es;
	@MockBean
	private EmployeeRepo er;
	
	@Test
	public void addEmployeeTest() {
		Employee emp=new Employee(1,"akash");
		when(er.save(emp)).thenReturn(emp);
		try {
			assertEquals(emp, es.addEmployee(emp));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void deleteEmployeeTest() {
		Employee emp=new Employee(1,"akash");
		try {
			es.deleteEmployee(1);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verify(er,times(1)).delete(emp);
	}
	@Test
	public void findAll() {
		Integer id=1;
		when(er.findAll()).thenReturn(Stream.of(new Employee(1,"akash")).collect(Collectors.toList()));
		try {
			assertEquals(1, es.getAllEmployee().size());
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void FindById() {
		Employee emp=new Employee(1,"akash");
		when(er.findById(1).get()).thenReturn(emp);
		try {
			assertEquals(emp, es.getEmployee(1));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Test
	void contextLoads() {
	}

}
