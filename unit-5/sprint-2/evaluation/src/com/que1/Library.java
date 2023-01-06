package com.que1;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> bookList=new ArrayList();
	
	void addBook(Book book)throws BookException{
		
		if(!bookList.contains(book) ) {
			bookList.add(book);
		}else {
			BookException b=new BookException("Book is already exist");
			throw b;
		}
	
	}
	List viewAllBooks()throws BookException{
		if(bookList.size()!=0) {
			bookList.sort((s1,s2)->s1.getBookName().compareTo(s2.getBookName()));
		}else {
			BookException b=new BookException("No book is present in the bookList ");
			throw b;
		}
		return bookList;
	}
	List viewBooksByAuthor(String author)throws BookException{
//		int take=0;
	  List<Book> c=new ArrayList<>();
		for(Book n:bookList) {
			if(n.getAuthor().equals(author)) {
				c.add(n);
//				take=1;
			}
		}
		if(c.size()==0) {
			BookException v=new BookException("None of the book published by the author "+author);
			throw v;
		}else {
		return c;
		}
	}
	Book getBookByISBN(int isbn)throws BookException{
		int take=0;
		Book book=null;
		  List<Book> c=new ArrayList<>();
		  String s;
			for(Book n:bookList) {
				if(n.getIsbn()==isbn) {
//					c.add(n);
//					return n;
					book=n;
					
				}
			}
			if(book==null) {
				BookException v=new BookException("None of the book published by this isbn "+isbn);
				throw v;
			}
			else {
					return book;	
				}
				
//				return new Book();
			}
//			if(take==0) {
//				BookException v=new BookException("None of the book published by the author ");
//			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
