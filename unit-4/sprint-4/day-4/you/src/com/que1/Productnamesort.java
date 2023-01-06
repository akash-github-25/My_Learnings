package com.que1;

import java.util.Comparator;

public class Productnamesort implements Comparator<Product> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
//	   String s1=o1.getProductName();
//	   String s2=o1.getProductName();
//	  return s1.compareTo(s2);
		return o1.getProductName().compareTo(o2.getProductName());

}
}
