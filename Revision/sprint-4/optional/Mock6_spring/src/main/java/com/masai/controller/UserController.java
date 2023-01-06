package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Mail;
import com.masai.bean.User;
import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.service.UserService;

@RestController
@RequestMapping("/masaimail")
public class UserController {
	@Autowired
	private UserService us;
	
	@PostMapping("/register")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) throws UserException {
		User user1=us.addUser(user);
		return new ResponseEntity<>(user1,HttpStatus.CREATED);
	}
	@GetMapping("/mail/{userId}")
	public ResponseEntity<List<Mail>> getAllMails(@PathVariable("userId") Integer userId) throws MailException{
		List<Mail> mails=us.getAllMails(userId);
		return new ResponseEntity<>(mails,HttpStatus.OK);
	}
	@GetMapping("/starred/{userId}")
	public ResponseEntity<List<Mail>> getAllStarredMails(@PathVariable("userId") Integer userId) throws MailException{
		List<Mail> mails=us.getStarredMails(userId);
		return new ResponseEntity<>(mails,HttpStatus.OK);
	}
	@PutMapping("/user")
	public ResponseEntity<User> upadateUser(@Valid @RequestBody User user) throws UserException{
		User user1=us.updateUser(user);
		return new ResponseEntity<>(user1,HttpStatus.OK);
	}
	
	

}
