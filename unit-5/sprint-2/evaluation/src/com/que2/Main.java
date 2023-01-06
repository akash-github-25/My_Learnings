package com.que2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		predicate**********************
		Student s1=new Student();
		s1.setRoll(1);
		s1.setName("akash");
		s1.setMarks(520);
		Predicate<Student> s=(s2)->s2.getMarks()<500;
		System.out.println("Predicate "+s.test(s1));
//		******************************************
		
//		consumer******************************
		Consumer<Student> a1=(x)->{
			System.out.println("roll-"+x.getRoll());
			System.out.println("name-"+x.getName());
			System.out.println("marks "+x.getMarks());
		};
		System.out.println("CONSUMER");
		a1.accept(new Student(1,"ayush",100));
//		***************************************
		
//		Supplier*********************************
		Supplier<Student> e=()->new Student(1,"akash",99);
		System.out.println("SUPPLIER");
		System.out.println("roll-"+e.get().getRoll());
		System.out.println("name-"+e.get().getName());
		System.out.println("marks- "+e.get().getMarks());
//		*********************************************************
		
//		Function************************************************
		Function<String, Integer> f=c3->Integer.parseInt(c3);
		System.out.println("Function");
		System.out.println(f.apply("100"));
//		********************************************************

	}

}
