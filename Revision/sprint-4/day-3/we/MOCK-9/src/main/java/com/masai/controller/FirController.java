package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.FirException;
import com.masai.bean.Fir;
import com.masai.service.FirService;

@RestController
@RequestMapping("/masaifir/user")
public class FirController {
	@Autowired
	private FirService fs;
	
	@PostMapping("/fir")
	public ResponseEntity<Fir> addFir(@RequestBody Fir fir) throws FirException{
	   Fir fir1=fs.registerFir(fir);
	   return new ResponseEntity<>(fir1,HttpStatus.OK);
	   
	}

}
