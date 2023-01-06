package com.masai.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Jwutil.JwtUtil;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService us;
	@Autowired
	private JwtUtil util;
	
	private AuthenticationManager authenticationManager;
	@PostMapping("/save")
	public ResponseEntity<String> saveUserInDatabase(@RequestBody User user) {
		Integer user1=us.saveUser(user);
		String body="string saved";
		return new ResponseEntity<>(body,HttpStatus.OK);
	}
	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest request){
		
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		
		
		String token=util.generateToken(request.getUsername());
		return ResponseEntity.ok(new UserResponse(token,"success!"));
	}

}
