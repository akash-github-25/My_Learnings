package com.masai.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Book {
	
	//@Min(100)
	@NotNull
	@Min(value = 100,message = "{bookdId.invalid}")
	private  Integer bookId;
	@Size(min=2,max=10,message="{name.invalid}")
    private String name;
	@NonNull
	private String author;
	@NonNull
	@Max(value=800,message="price max is 800")
	private Integer price;
	public Book(@Min(value = 100, message = "Minimum bookid should be 100") Integer bookId, String name,
			String author, Integer price) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
