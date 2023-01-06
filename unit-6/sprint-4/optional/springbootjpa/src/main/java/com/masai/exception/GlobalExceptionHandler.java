package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class GlobalExceptionHandler {
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails> handleStudentException(ProductException exp,WebRequest req){
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), exp.getMessage(), req.getDescription(false));
	return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
