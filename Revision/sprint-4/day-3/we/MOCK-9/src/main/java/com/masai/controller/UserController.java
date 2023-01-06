package com.masai.controller;

import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.FirException;
import com.masai.Exception.LoginException;
import com.masai.Exception.UserException;
import com.masai.bean.Fir;
import com.masai.bean.User;
import com.masai.service.UserService;

@RestController
@RequestMapping("/masaifir/user")
public class UserController {
	
	@Autowired
	private UserService us;
	
	@PostMapping("/register")
	public ResponseEntity<User>  addUser(@Valid @RequestBody User user) throws UserException {
		User user1=us.registerUser(user);
		return new ResponseEntity<>(user1,HttpStatus.CREATED);
	}
	
	@GetMapping("/fir/{userId}")
	public ResponseEntity<List<Fir>>  getallFirs(@PathVariable("userId") Integer userId,@RequestParam(required = false) String key) throws UserException, LoginException{
		List<Fir> firs=us.getAllFirs(userId,key);
		return new ResponseEntity<>(firs,HttpStatus.OK);
	}
	
	@DeleteMapping("/fir/{userId}/{firId}")
	public ResponseEntity<Fir> deleteFir(@PathVariable("userId") Integer userId,@PathVariable("firId") Integer firId) throws UserException, FirException{
    Fir fir1=us.deleteFir(userId, firId);
    return new ResponseEntity<>(fir1,HttpStatus.OK);
}
}
