package com.assign1;

public class Dog extends Animal{
	private String breed;

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks");
		
	}

	

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eating");
		
	}

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String breed) {
		this.breed=breed;
		
	}

//	public Dog(String name) {
//		super(name);
//		// TODO Auto-generated constructor stub
//	}
	
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void play() {
		System.out.println("Dog is playing");
	}

}
