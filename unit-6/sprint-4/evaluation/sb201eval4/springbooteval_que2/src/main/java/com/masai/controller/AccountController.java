package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Account;
//import com.masai.bean.Employee;
//import com.masai.bean.Employee;
import com.masai.exception.AccountException;
//import com.masai.exception.EmployeeException;
import com.masai.exception.InsufficientFundException;
//import com.masai.exception.EmployeeException;
import com.masai.model.AccountService;

@RestController
public class AccountController {
	@Autowired
public AccountService as;
	
	 @PostMapping("/account")
	  public ResponseEntity<Account> saveAccount(@RequestBody Account acc) throws AccountException {
		 
		 return new ResponseEntity<>(as.openAccount(acc),HttpStatus.CREATED);
	  };
	  @DeleteMapping("/deleteAccount/{accno}")
	  public Account deleteStudentByRoll(@PathVariable Integer accno) throws AccountException {
	 return as.closeAccount(accno);
	  }
	  @PutMapping("/updateadd/{accno}/{amount}")
	  public Account updateAdd(@PathVariable Integer accno,@PathVariable Integer amount) throws AccountException {
		  Account x=as.depositAmount(accno, amount);
		  return x;
	  }
	  
	  @PutMapping("/updateminus/{accno}/{amount}")
	  public Account updateMinus(@PathVariable Integer accno,@PathVariable Integer amount) throws AccountException, InsufficientFundException {
		  Account x=as.withdrawAmount(accno, amount);
		  return x;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
