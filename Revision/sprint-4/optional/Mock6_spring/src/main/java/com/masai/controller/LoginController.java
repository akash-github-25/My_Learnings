package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.LoginDTO;
import com.masai.exception.LoginException;
import com.masai.service.LoginService;
//import com.masai.service.login.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService userLogin;
	
	@PostMapping("/login")
	public ResponseEntity<String> logInCustomer(@RequestBody LoginDTO dto) throws LoginException {
		
		String result = userLogin.logIntoAccount(dto);
		

		
		return new ResponseEntity<String>(result,HttpStatus.OK );
		
		
	}
	
	@PostMapping("/logout")
	public String logoutCustomer(@RequestParam(required = false) String key) throws LoginException {
		return userLogin.logOutFromAccount(key);
		
	}
}
