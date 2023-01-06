package com.masai;

public class Lion {
	String name;
	boolean isHungry;
	int age;
	static int totalDeaths;
	static void printKillings() {
		System.out.println("Total killings by lions in jungle is "+ totalDeaths); 
	 }
	void thinking() {
		if(isHungry==false) {
			System.out.println(name+" is Sleeping");
		}
		if(isHungry==true && age>12) {
			totalDeaths=totalDeaths+2;
			System.out.println(name+ " has eaten two animals");
		}
		if(isHungry==true && (age>=2 && age<=12)) {
			totalDeaths=totalDeaths+1;
			System.out.println(name+ " has eaten one animals");
		}
		if(isHungry==true && age<2) {
			System.out.println(name+ "is calling Mom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion1=new Lion();
		lion1.name="akash";
		lion1.isHungry=true;
		lion1.age=10;
		lion1.thinking();
		
		Lion lion2=new Lion();
		lion2.name="abhinav";
		lion2.isHungry=false;
		lion2.age=15;
		lion2.thinking();
		
		Lion lion3=new Lion();
		lion3.name="krishna";
		lion3.isHungry=true;
		lion3.age=14;
		lion3.thinking();		
		
        printKillings();
	}

}
