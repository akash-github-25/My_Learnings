package com.masai.service;

import java.util.List;

import com.masai.bean.Book;

public interface BookService {
	public Book addBook(Book book);
	public Book updateBook(Integer bookId);
	public Book deleteBook(Book book);
	public Book viewBook(Integer bookId);
	public List<Book> viewAllBooking();
}
