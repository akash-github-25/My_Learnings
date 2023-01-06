package com.que3;

public class ThreadA implements Runnable{
	  String name;
	  Student s;

		public ThreadA(String name, Student s) {
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
//			Student s=new Student();
			s.fun1(name);

		}

	}
