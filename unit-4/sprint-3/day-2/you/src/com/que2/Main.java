package com.que2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] an=new Animal[3];
		an[0]=new Dog();
		an[1]=new Cat();
		an[2]=new Tiger();
		for(int i=0;i<an.length;i++) {
			an[i].eat();
			an[i].walk();
			an[i].makeNoise();
		}
		

	}

}
