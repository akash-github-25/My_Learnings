package com.que3;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller(value = "uc1")
public class Presentation {
	@Autowired
	private ProductService pService; // dependency
	public void insertProduct(){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("give productname");
		String s=sc.next();
		System.out.println("give quantity");
		int q=sc.nextInt();
		System.out.println("give price");
		int p=sc.nextInt();
	  Product p1=new Product();
	  p1.setProductName(s);
	  p1.setQuantity(q);
	  p1.setPrice(p);
	  pService.addProduct(p1);
	}
	public void printAllProduct(){
	
		List<Product>j=pService.getAllProducts();
		for(Product k:j) {
			System.out.println(k);
		}
	}
	public void searchProduct(){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Give productid");
		int x=sc.nextInt();
		try {
			Product p1=pService.getProductById(x);
			System.out.println(p1);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void GetProductsWithingPriceRange(){
	// take the price range (fromPrice and toPrice) from the user and call
	//the appropriate method on //pService object and print the Product
	//within the price range,
		Scanner sc=new Scanner(System.in);
		System.out.println("Give fromPrice");
		int fromPrice=sc.nextInt();
		System.out.println("Give toPrice");
		int toPrice=sc.nextInt();
		
		try {
			List<Product> c=pService.getProductsBetweenPrice(fromPrice, toPrice);
			for(Product n:c) {
				System.out.println(c);
			}
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
