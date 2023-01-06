package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Book;
import com.masai.exception.BooknotfoundException;
@RestController
public class MyController {
	
List<Book> d=new ArrayList<>();

@PostMapping(value="/books")
public ResponseEntity<String> saveBookHandler(@Valid @RequestBody Book book) {
       d.add(book);
	return new ResponseEntity<>("saved sucessfully",HttpStatus.ACCEPTED);
}

@GetMapping("/getbookbyid")
public ResponseEntity<Book> getBookById(@RequestParam("bookId") Integer bookId) throws BooknotfoundException  {
	
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


}

@GetMapping("/getbook")
public List<Book> getBook(){

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

@DeleteMapping("/book/{bookId}")
public ResponseEntity<String> deleteBook(@PathVariable Integer bookId) throws BooknotfoundException {
//	Boolean d1=true;
//	for(int i=0;i<d.size();i++) {
//		if(d.get(i).getBookId()==bookId) {
//			d1=false;
//		    d.remove(i);
//			return new ResponseEntity<>(d.get(i),HttpStatus.ACCEPTED);
//		}
//	}
	Boolean d1=d.removeIf(s->s.getBookId()==bookId);
	if(d1==false) {
		throw new BooknotfoundException("Book is not present");
	}
	return new ResponseEntity<>("data deleted",HttpStatus.ACCEPTED);
//	return null;
}

}
