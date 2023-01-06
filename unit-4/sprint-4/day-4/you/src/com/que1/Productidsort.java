package com.que1;

import java.util.Comparator;

public class Productidsort implements Comparator<Product> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getProductId()>o2.getProductId()) {
			return 1;
		}else if(o1.getProductId()<o2.getProductId()) {
			return -1;
		}else {
			return 0;
		}
		
	}

}
