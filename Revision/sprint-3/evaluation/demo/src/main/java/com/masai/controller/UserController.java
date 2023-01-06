package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.UserException;
import com.masai.bean.User;
import com.masai.service.UserService;



@RestController
public class UserController {
	@Autowired
	private UserService us;
	@PostMapping("/user")
	public ResponseEntity<User> saveCustomer(@Valid @RequestBody User user) throws  UserException {
		us.addUser(user);
		return new ResponseEntity<>(user,HttpStatus.CREATED);
	}
}
