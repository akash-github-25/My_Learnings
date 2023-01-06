package com.que1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Library s=new Library();
		
		int i=0;
		while(i!=5) {
			System.out.println("1.Add Book\r\n"
					+ "2.Display all book details\r\n"
					+ "3.Search Book by author\r\n"
					+ "4.Search book by ISBN\r\n"
					+ "5.Exit");
		System.out.println("Enter your choice");
		 i=sc.nextInt();
		
		if(i==1) {
			System.out.println("Enter the isbn no:");
			int is=sc.nextInt();
			System.out.println("Enter the book name:");
			String str=sc.next();
			System.out.println("Enter the author name:");
			String srt2=sc.next();
			
//			Library s=new Library();
			try {
				s.addBook(new Book(is,str,srt2));
			} catch (BookException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
			
		
		}else if(i==2) {
			try {
				s.viewAllBooks().stream().forEach((sd)->System.out.println(sd));
			} catch (BookException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
			
		}else if(i==3) {
			System.out.println("Enter the author name: ");
			String Str =sc.next();
			try {
				List<Book> l2=
				s.viewBooksByAuthor(Str);
//				System.out.println(l2);
				l2.stream().forEach((sd)->System.out.println(sd));
			} catch (BookException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
			
		}else if(i==4) {
			System.out.println("Enter the isbn no.");
			int x=sc.nextInt();
			try {
				Book b1=
				s.getBookByISBN(x);
				System.out.println(b1);
			} catch (BookException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
			
		}else if(i==5) {
			System.out.println("Thank you..!");
		}

	}

}
}
