package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

//import javax.persistence.EntityManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.masai.bean.Book;
import com.masai.exception.BooknotfoundException;
import com.masai.exception.NullValueErrorException;

@RestController
@RequestMapping("/author")
public class MyController1 {
	List<Book> d=new ArrayList<>();
	public void MyContoller1() {
		d.add(new Book(101,"c++","Nitesh","Rajput Publication","Computer Programming",1500,240,"G452"));
	}
	
	
	
	@PostMapping(value="/books")
	public ResponseEntity<String> saveBookHandler(@RequestBody Book book) {
           d.add(book);
		return new ResponseEntity<>("saved sucessfully",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getbookbyid")
	public ResponseEntity<Book> getBookById(@RequestParam("bookId") Integer bookId) throws BooknotfoundException  {
//		throw new BooknotfoundException("Book is not present");
//		int d1=10/0;
		Boolean f1=true;
		for(Book f:d) {
			if(f.getBookId()==bookId) {
				f1=false;
				return new ResponseEntity<Book>(f,HttpStatus.OK);
			}
		}
		if(f1) {
			throw new BooknotfoundException("Book is not present");
		}
		return null;
//		
	
	}
	
	@GetMapping("/getbook")
	public List<Book> getBook() throws NullValueErrorException {
  if(d==null) {
	   throw new NullValueErrorException("null value is there");
  }
		return d;
	}
	
	@PutMapping("/updatebook/{bookId}")
	public ResponseEntity<Book> updatedBook(@RequestBody Book book,@PathVariable Integer bookId) throws BooknotfoundException {
		Boolean f=true;
		for(Book x:d) {
			if(x.getBookId()==bookId) {
				f=false;
				x.setName("jamesbook");
				x.setPrice(100);
				return new ResponseEntity<>(x,HttpStatus.ACCEPTED);
			}
		}
		if(f==true) {
			throw new BooknotfoundException("Book is not present");
		}
		return null;
	}
	
	@DeleteMapping("/students/{bookId}")
	public ResponseEntity<Book> deleteBook(@PathVariable Integer bookId) throws BooknotfoundException {
		Boolean d1=true;
		for(int i=0;i<d.size();i++) {
			if(d.get(i).getBookId()==bookId) {
				d1=false;
			    d.remove(i);
				return new ResponseEntity<>(d.get(i),HttpStatus.ACCEPTED);
			}
		}
		if(d1==true) {
			throw new BooknotfoundException("Book is not present");
		}
		return null;
	}
	
	

}
