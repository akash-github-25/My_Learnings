package com.que1;

public class Tiger extends Animal {

	public Tiger() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Animal a=new Tiger();
			a.eat();
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

	}

	@Override
	void eat() throws AnimalException {
		// TODO Auto-generated method stub
//		AnimalException e=new AnimalException("\"Tiger\r\n"
//				+ "is eating !!");
//		throw e;
		System.out.println("Tiger is eating");
		
	}

}
