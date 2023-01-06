package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bean.Mail;
import com.masai.exception.MailException;
import com.masai.repo.MailRepo;
import com.masai.service.MailService;

@RestController
@RequestMapping("/masaimail")
public class MailController {
	
@Autowired	
private MailService mr;

@PostMapping("/mail")
public ResponseEntity<Mail> addMail(@RequestBody Mail mail) throws MailException {
	Mail mail1=mr.addEmail(mail);
	return new ResponseEntity<>(mail1,HttpStatus.CREATED);
}

@PostMapping("/starred/{id}")
public ResponseEntity<Mail> addStarred(@RequestBody Mail mail,@PathVariable("id") Integer id) throws MailException{
	Mail mail1=mr.updateMailaddStarred(mail);
	return new ResponseEntity<>(mail1,HttpStatus.OK);
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<Mail> deleteMail(@PathVariable("id") Integer id) throws MailException{
	Mail mail1=mr.deleteMail(id);
	return new ResponseEntity<>(mail1,HttpStatus.OK);
}
}
