package com.que2;

public interface Book2 {
	default void buyBook() {
		System.out.println("Buy book from book2");
	 }
}
