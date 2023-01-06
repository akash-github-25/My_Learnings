package com.que3;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Harrier","Tata","red",new Engine());
	    Car c2=new Car();
	    c2.model="Harrier";
	    c2.companyName="Tata";
	    c2.Color="red";
	    Engine c=new Engine();
	    c.rmp=1000;
		c.Power=110;
		c.manufacturer="tata";
		c.turbo();
	    
	    c2.engine=c;
	    
	    c1.details();
	    c2.details();
	}

}
