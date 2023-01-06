package com.que4;

public class Product {
	String name;
	double price;
	String company;
	int count;
	
	public Product(String name, double price, String company, int count) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Product {name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "}";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
