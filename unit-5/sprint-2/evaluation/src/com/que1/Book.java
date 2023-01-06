package com.que1;

public class Book {
	private int isbn;
	private String bookName;
	private String author;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		Book s=(Book)obj;
		Book s1=this;
		if((s.getBookName().equals(s1.bookName) && s.getAuthor().equals(s1.getAuthor()) && s.getIsbn()==s1.getIsbn())){
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + "]";
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

	public Book() {
		super();
	}

	public Book(int isbn, String bookName, String author) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
