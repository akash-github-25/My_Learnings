package com.masai.Controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.masai.Repository.UserRepo;
import com.masai.bean.Email;
import com.masai.bean.User;

import com.masai.service.UserService;

@RestController
public class UserController {
	@Autowired
	public UserService cs;
	
	@Autowired
	public UserRepo br;
	

	@PostMapping("/users")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		
		User u=cs.addUser(user);
		return new ResponseEntity<>(u,HttpStatus.CREATED);
	}
	
	
	
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<User> deleteUser(@PathVariable ("userId") Integer userId){
		 User bk=cs.deleteUser(userId);
		return new ResponseEntity<User>(bk,HttpStatus.OK);
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<User> viewUser(@PathVariable ("userId") Integer userId){
		User book=cs.viewUser(userId);
		return new ResponseEntity<User>(book,HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> viewAllUser() {
		List<User> bk=cs.viewAllBooking();
		return new ResponseEntity<List<User>>(bk,HttpStatus.OK);
	}
	@PostMapping("/users/{userId}")
	public ResponseEntity<User> saveEmail(@RequestBody Email email,@PathVariable("userId") Integer userId) {
		
		User u=cs.viewUser(userId);
		cs.addEmail(u, email);
		return new ResponseEntity<>(u,HttpStatus.CREATED);
	}
	
	@GetMapping("/users/{userId}/{emailId}")
	public ResponseEntity<Email> viewEmail(@PathVariable ("userId") Integer userId,@PathVariable("emailId") Integer emailId){
		
		Email book=cs.getEmail(userId,emailId);
		return new ResponseEntity<Email>(book,HttpStatus.OK);
	}
	
}
