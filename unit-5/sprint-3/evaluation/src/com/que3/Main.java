package com.que3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main{

	public static void main(String[] args) throws Exception, Exception {
		Student[] std= {
				new Student(1),
				new Student(2),
				new Student(3),
				new Student(4),
				new Student(5),
				new Student(6)
		};
		
		ExecutorService s=Executors.newFixedThreadPool(6);
		for(Student c:std) {
			Future f=s.submit(c);
			System.out.println(f.get());
			
		}
		s.shutdown();
		
		
		// TODO Auto-generated method stub

	}

	
	

}
