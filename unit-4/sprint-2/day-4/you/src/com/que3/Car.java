package com.que3;

public class Car {
	String model;
	String companyName;
	String Color;
	Engine engine=new Engine();
	
	public Car(String model,String companyName,String Color,Engine engine) {
		this.model=model;
		this.companyName=companyName;
		this.Color=Color;
		this.engine=engine;
	}
	
	
	public Car() {
		super();
	}


	public void details() {
//		engine.rmp=1000;
//		engine.Power=110;
//		engine.manufacturer="tata";
//		engine.turbo();
		
		System.out.println("Car model:"+model);
		System.out.println("Car companyName:"+companyName);
		System.out.println("Car color:"+Color);
//		System.out.println("Car ENGINE:"+model);
		System.out.println("Car RPM:"+engine.rmp);
		System.out.println("Car Power:"+engine.Power);
		System.out.println("Car Engine Manufacturer:"+engine.manufacturer);
		System.out.println("Car has Turbo:"+engine.hasTurbo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
