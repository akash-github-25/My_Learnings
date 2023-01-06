package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.DriverException;
import com.masai.bean.Driver;
import com.masai.service.DriverService;

@RestController
@RequestMapping("/masaicab")
public class DriverController {
	
	@Autowired
	private DriverService ds;
	
@PostMapping("/driver/register")	
public ResponseEntity<Driver> addDriver(@Valid @RequestBody Driver driver) throws DriverException {
	Driver drivers=ds.addDriver(driver);
	return new ResponseEntity<>(drivers,HttpStatus.CREATED);
}

}
