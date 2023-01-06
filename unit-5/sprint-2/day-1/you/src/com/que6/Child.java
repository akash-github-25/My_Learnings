package com.que6;

public class Child extends Parent{

	Child() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			Child c=new Child();
			c.fun1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		

	}

}
