package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Book;
import com.masai.repository.BookRepo;
import com.masai.service.BookService;

@RestController()
@RequestMapping("/bookservice")
public class BookController {
	
	@Autowired
	public BookService cs;
	
	@Autowired
	public BookRepo br;
	

	@PostMapping("/Books")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		
		cs.addBook(book);
		return new ResponseEntity<>(book,HttpStatus.CREATED);
	}
	
	@PutMapping("/Books/{id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable("id") Integer id){
		Book bk=cs.updateBook(id);
		return new ResponseEntity<Book>(bk,HttpStatus.ACCEPTED);	
	}
	
	@DeleteMapping("/Books/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable ("id") Integer id){
		 Book bk=cs.deleteBook(br.findById(id).get());
		return new ResponseEntity<Book>(bk,HttpStatus.OK);
	}
	
	@GetMapping("/Books/{id}")
	public ResponseEntity<Book> viewCustomer(@PathVariable ("id") Integer id){
		Book book=cs.viewBook(id);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	@GetMapping("/Books")
	public ResponseEntity<List<Book>> viewAllBook() {
		List<Book> bk=cs.viewAllBooking();
		return new ResponseEntity<List<Book>>(bk,HttpStatus.OK);
	}
	

}
