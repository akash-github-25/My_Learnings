package com.assign1;

public class Main {
	
public static void main(String[] args) {
	Animal a1=new Dog();
	Animal a2=new Cat();
	System.out.println("************************************");
	System.out.println("for dog");
	a1.eat();
	a1.makeNoise();
	a1.sleep();
	
	Dog c1=(Dog)a1;
	c1.play();
	
//	Dog d1=new Dog();
//	d1.play();
	System.out.println("************************************");
	
	System.out.println("************************************");
	System.out.println("For cat");
	a2.eat();
	a2.makeNoise();
	a2.sleep();
	
	Cat x=(Cat)a2;
	x.jump();
	
//	Cat c1=new Cat();
//	c1.jump();
	System.out.println("*************************************");
	
	
	
	
}
}
