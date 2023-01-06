package com.que2;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		list1.add("ak47");
		list1.add("f19");
		list1.add("shoot56");
		list1.add("redant");
		list1.forEach(s -> System.out.println(s));
	}

}
