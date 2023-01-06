package com.que2;

import java.util.function.Function;

public class Main3 {
public static void main(String[] args) {
	Function<String,Integer> f2 = s -> Integer.parseInt(s);
	System.out.println(f2.apply("60")+500);

}
}
