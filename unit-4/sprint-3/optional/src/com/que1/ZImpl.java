package com.que1;

public class ZImpl implements Z {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z c=new ZImpl();
		X.funb();
		c.func();
		Y.fun2();
		c.fun3();
//		c.funz();
     
	}

	@Override
	public void funa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void funz() {
		// TODO Auto-generated method stub
		
	}
  @Override
public void func() {
	// TODO Auto-generated method stub
	  System.out.println("func default overrided in child class");
	
}
	

}
