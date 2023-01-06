package com.que5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Main> s=new ArrayList<>();
		s.add(new Main(1,"hp1",100,140));
		s.add(new Main(2,"hp2",110,149));
		s.add(new Main(3,"hp3",105,147));
		s.add(new Main(4,"hp4",125,143));
		
		Collections.sort(s, (s1,s2) -> s1.getPrice()> s2.getPrice() ? -1 : +1 );
		System.out.println(s);
		

	}

}
