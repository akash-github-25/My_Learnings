package com.que4;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> bookList=new ArrayList<>();
	public void addBook(Book book) {
//		book=new Book();
		bookList.add(book);
	}
	public boolean isEmpty() {
		if(bookList.size()==0) {
			return true;
		}else {
			return false;
		}
	}
	 List<Book> viewAllBooks(){
		 return bookList;
	 }
	 List<Book> viewBooksByAuthor(String author ) {
		 Book book=new Book();
		 List<Book> bookList1=new ArrayList<>();

		 
			for(Book student: bookList) {

				if(student.getAuthor().equals(author)) {

					bookList1.add(student);

			}

			
		
		
	 }
		return bookList1;
	 }
	 
	 int countNoOfBook(String bookName) {

		 int count=0;
		 for(Book student: bookList) {
			
				if(student.getBookName().equals(bookName)) {				
					count++;
			}
		 }
		 return count;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}

}
