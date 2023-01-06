package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Book;
import com.masai.bean.Reader;
import com.masai.exception.BooknotfoundException;
import com.masai.exception.NullValueErrorException;
//private List<Student> students= new ArrayList<>();
@RestController
@RequestMapping("/reader")
public class MyController2 {
//	public MyController1 c=new MyController1();
	List<Book> d= new ArrayList<>();
	public void MyContoller2() {
		d.add(new Book(101,"c++","Nitesh","Rajput Publication","Computer Programming",1500,240,"G452"));
	}
	@PostMapping(value="/books")
	public ResponseEntity<String> saveBookHandler(@RequestBody Book book) {
           d.add(book);
		return new ResponseEntity<>("saved sucessfully",HttpStatus.ACCEPTED);
	}
	@GetMapping("/getbookbyid")
	public ResponseEntity<Book> getBookById(@RequestParam("bookId") Integer bookId) throws BooknotfoundException {
		Boolean g=true;
		for(Book f:d) {
			if(f.getBookId()==bookId) {
				g=false;
				return new ResponseEntity<>(f,HttpStatus.OK);
			}
		}
		if(g==true) {
			throw new BooknotfoundException("Book is not present");
		}else {
		return null;
		}
	}
	
	@GetMapping("/getbook")
	public List<Book> getBook() {
  if(d==null) {
	  new NullValueErrorException("its a null exception");
  }
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
