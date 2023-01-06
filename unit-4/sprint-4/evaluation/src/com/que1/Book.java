package com.que1;

import java.util.Objects;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}
    
	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book {bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "}";
	}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
//	return super.equals(obj);
	if(this==obj) {
		return true;
	}
	Book b=this;
	Book b1=(Book)obj;
	
	return b.bookId==b1.getBookId();
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return Objects.hash(bookId);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
