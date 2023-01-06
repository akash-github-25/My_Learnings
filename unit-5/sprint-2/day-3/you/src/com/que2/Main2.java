package com.que2;

import java.util.function.Supplier;



public class Main2 {
	
//Supplier<Student> s=()->new Student("akash",100);
//Supplier<Student> s2 = () -> new Student("Ram",850)
//(s2.get().getName())
	public static void main(String[] args) {
		Supplier<Student> s2 = () -> new Student("Ram",850);
		System.out.println(s2.get().getName());
	}

}
