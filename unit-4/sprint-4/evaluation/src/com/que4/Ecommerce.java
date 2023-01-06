package com.que4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	List<Product> productList=new ArrayList<>();
	 void addProductToList(Product product) {
		for(Product p:productList) {
			if(p.name.equals(product.name) && p.company.equals(product.company)) {
				p.count=p.count+product.count;
				System.out.println("Count updated Product already exists");
				return;
			}
		}
		productList.add(product);
		System.out.println("Product added successfully");
	}
	List<Product> showAllProduct(){
		return productList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
