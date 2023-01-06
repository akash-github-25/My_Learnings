package com.que4;

public class Parent{
	public void method1() {
		
	System.out.println("number is"+number);	
	System.out.println("method1..class Parent");
	Parent p=new Parent(10);
	p.method2();
	}
	private void method2() {
		System.out.println("method2..class Parent");
	}
	protected void method3() {
		System.out.println("method3..class Parent");
		Son s=new Son(10);
		s.method4();
	}
	
	final int number;
	

	
	public Parent(int number) {

		this.number = number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Son s=new Son();
//		method1();
		
		
		

	}

}
