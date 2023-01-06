package com.que2;

public class Demo {
	 Demo(){
		 this("akash");
		System.out.println("inside demo()"); 
	 }
	  Demo(String s){
		  this(14);
		  System.out.println("inside string");
	  }
	 Demo(int i){
		 this(10.33f);
		 System.out.println("inside int");
	 }
	 Demo(float f){
		 System.out.println("inside float");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();

	}

}
