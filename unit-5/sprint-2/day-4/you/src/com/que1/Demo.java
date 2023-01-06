package com.que1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Product> l=new ArrayList<>();
  l.add(new Product(1,"book",100,2));
  l.add(new Product(2,"copy",210,13));
  l.add(new Product(3,"pen",110,9));
  l.add(new Product(4,"jam",199,17));
  l.add(new Product(5,"water",99,5));
  l.stream().forEach((v)->System.out.println(v));
  List<Product> l1=l.stream().filter((p)->p.getQuantity()>10).collect(Collectors.toList());
  System.out.println("***********************************");
 l1.stream().sorted((p1,p2)->p1.getPrice()>p2.getPrice()? 1:-1).forEach((x)->System.out.println(x));
  
//  System.out.println(l1);
  
  
	}

}
