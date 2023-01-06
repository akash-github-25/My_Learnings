package com.que2;

public class Book_buy implements Book1,Book2{

	@Override
	public void buyBook() {
		// TODO Auto-generated method stub
		Book1.super.buyBook();
	}


	//If  a class is implementing two interfaces having same  default method with same
	//signature then we have to override one of those two method in that particular class.

	

}
