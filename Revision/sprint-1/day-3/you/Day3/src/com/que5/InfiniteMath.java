package com.que5;

public class InfiniteMath extends Math{
	public final double secret = 8;
	
	public static void main(String[] numbers) {
	Math math = new InfiniteMath();
	
	System.out.print(math.secret);
	}
// Ans is 2 because the refrence here is of Math class and its variable will be executed
//	others methods are not in the scope of math class we can achieve this by downcasting
//	here we cannot update its value.
}
