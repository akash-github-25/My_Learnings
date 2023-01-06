package com.assign1;

public class Cat extends Animal{
	private String nickname;

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("mweon");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("cat eating");
		
	}

	public Cat(String name, String nickname) {
		super(name);
		this.nickname = nickname;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String nickname) {
		this.nickname=nickname;
		// TODO Auto-generated constructor stub
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public void jump() {
		System.out.println("Cat is jumping");
	}

}
