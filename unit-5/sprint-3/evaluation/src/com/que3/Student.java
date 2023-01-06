package com.que3;

import java.util.concurrent.Callable;

public class Student implements Callable {
 int N;
 
	public Student(int n) {
	super();
	N = n;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int mul=1;
		for(int i=1;i<=N;i++) {
			mul=mul*i;
		}
		return mul;
	}

}
