package com.que3;

public class Student implements Runnable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	

	}

	@Override
	public void run() {
		Student1 s1=new Student1();
		Thread t2=new Thread(s1);
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println("Even"+i);
			}
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	    	
	    }
	
		
	}


