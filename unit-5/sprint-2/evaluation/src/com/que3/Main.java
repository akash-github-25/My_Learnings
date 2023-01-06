package com.que3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> l=new ArrayList<>();
		l.add(new Student(1,"akash",100,"abc1 apartment"));
		l.add(new Student(1,"akasha",520,"abc2 apartment"));
		l.add(new Student(1,"akashb",110,"abc3 apartment"));
		l.add(new Student(1,"akashc",590,"abc4 apartment"));
		l.add(new Student(1,"akashd",80,"abc5 apartment"));
		
		List<Employee> emp=
		l.stream().filter((s)->s.getMarks()>500)
		.map(s2->new Employee(s2.getRoll(),s2.getName(),s2.getMarks()*10000,s2.getAddress())).collect(Collectors.toList());
		emp.forEach((s2)->System.out.println(s2));
		


	}

}
