package com.que1;

import java.util.Comparator;

public class Productpricesort implements Comparator<Product>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getProductPrice()>o2.getProductPrice()) {
			return 1;
		}else if(o1.getProductPrice()<o2.getProductPrice()) {
			return -1;
		}else {
			return 0;
		}
	}

}
