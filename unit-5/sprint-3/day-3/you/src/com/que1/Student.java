package com.que1;

public class Student implements Runnable{
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student s=new Student();
		Thread t=new Thread(s);
		
		t.start();
		synchronized (t) {
		
				t.wait();
			
			    
		
		}
		
		
		
		
		
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			int mul=1;
			for(int i=10;i>=1;i--) {
				mul=mul*i;
			}
			System.out.println("Multiplication is "+mul);
			this.notify();
			
		}
		
		
	}

}
