package com.que1;

import java.util.HashSet;
import java.util.Set;

public class Libraray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Book> booksCollection=new HashSet<>();
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));
		
//		System.out.println(booksCollection);
		for(Book b:booksCollection) {
			System.out.println(b);
		}

	}

}
