package com.que4;

public class ThreadB implements Runnable{
String name;
Student s;

	public ThreadB(String name, Student s) {
	super();
	this.name = name;
	this.s = s;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		s.fun1(name);
		
	}

}
