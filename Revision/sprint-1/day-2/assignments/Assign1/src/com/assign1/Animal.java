package com.assign1;

public abstract class Animal {

	private String name;
	public abstract void makeNoise();
	public static void sleep() {
		System.out.println("Animal is sleeping");
	}
	public abstract void eat();
	public Animal(String name) {
		super();
		this.name = name;
	}
	public Animal() {
		super();
		
	}
	
	

}
