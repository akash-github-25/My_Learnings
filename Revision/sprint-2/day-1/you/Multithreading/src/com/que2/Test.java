package com.que2;

public class Test {

	public static void main(String[] args) {
		
		My t=new My();
		t.start();
		
		synchronized (t) {
			
			System.out.println("before wait method");
			
			try {
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("After wait method");
			
		}

	}

}
