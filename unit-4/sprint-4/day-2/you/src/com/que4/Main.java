package com.que4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);

  Library l=new Library();
  Book s3=new Book();
  int i=0;
  while(i!=5) {
	  System.out.println("Enter your choice: ");
	   i=sc.nextInt();
  if(i==1) {
	  System.out.println("Enter the isbn no:");
	  int isbn=sc.nextInt();
	  System.out.println("Enter the book name:");
	  String book=sc.next();
	  System.out.println("Enter the author name:");
	  String authorname=sc.next();
	  s3.setIsbn(isbn);
	  s3.setBookName(book);
	  s3.setAuthor(authorname);
	  Book book1=new Book(isbn,book,authorname);

	  
	  l.addBook(book1);
	  System.out.println("Book added successfully");
  }else if(i==2) {
	  List<Book> book=l.viewAllBooks();
	  for(Book student: book) {
			
			System.out.println("Author is :"+student.getAuthor());
			System.out.println("Name is :"+student.getBookName());
			System.out.println("isbn is :"+student.getIsbn());
			
			System.out.println("================================");
	  }
  }else if(i==3) {
	  System.out.println("Enter the author Name");
	  String s=sc.next();
	  List<Book> book=l.viewBooksByAuthor(s);
//	  System.out.println(book.size());
	  if(book.size()==0) {
		  System.out.println("The list is empty");
	  }else {
	  for(Book student: book) {
			
			System.out.println("Author is :"+student.getAuthor());
			System.out.println("Name is :"+student.getBookName());
			System.out.println("isbn is :"+student.getIsbn());
			
			System.out.println("================================");
	  }
	  }
	
	}else if(i==4) {
		System.out.println("Book Name");
		String k=sc.next();
		System.out.println(l.countNoOfBook(k));
		
	}else if(i==5) {
		System.out.println("Thank You!!");
		break;
	}
	  
	  
	  
  }
//	  if()
  }
	}


