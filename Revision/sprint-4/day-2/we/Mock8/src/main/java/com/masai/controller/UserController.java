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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.DriverException;
import com.masai.Exception.LoginException;
import com.masai.Exception.UserException;
import com.masai.bean.Driver;
import com.masai.bean.User;
import com.masai.service.UserService;

@RestController
@RequestMapping("/masaicab")
public class UserController {
	@Autowired
	 private UserService us;
	
	@PostMapping("/user/register")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) throws UserException {
		User user1=us.addUser(user);
		return new ResponseEntity<>(user1,HttpStatus.CREATED);
	}
	@GetMapping("/user/findride/{userId}")
	public ResponseEntity<List<Driver>> findCab(@PathVariable("userId") Integer userId) throws DriverException{
		List<Driver> drivers=us.findRide(userId);
		return new ResponseEntity<>(drivers,HttpStatus.OK);
	}
	
	@PutMapping("/user/book/{driverid}/{x}/{y}")
	public ResponseEntity<Driver> bookCab(@RequestBody User user ,@PathVariable("driverid") Integer driverid,@PathVariable("x") Integer x,@PathVariable("y") Integer y,@RequestParam(required = false) String key) throws DriverException, LoginException{
		Driver drivers=us.bookDriver(user,driverid, x, y,key);
		return new ResponseEntity<>(drivers,HttpStatus.OK);
	}

}
