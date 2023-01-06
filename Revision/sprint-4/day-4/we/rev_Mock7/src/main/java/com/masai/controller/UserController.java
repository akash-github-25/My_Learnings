package com.masai.controller;

import java.util.Set;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.EventException;
import com.masai.Exception.UserException;
import com.masai.bean.Event;
import com.masai.bean.User;
import com.masai.repo.EventRepo;
import com.masai.repo.UserRepo;
import com.masai.service.UserService;

@RestController
@RequestMapping("/masaicalender")
public class UserController {
	
    @Autowired
	private UserService us;
    @Autowired
    private UserRepo ur;
    
    @Autowired
    private EventRepo er;
    
    @PostMapping("/register")
    private ResponseEntity<User> addUser(@Valid @RequestBody User user) throws UserException{
    	User user1=us.addUser(user);
    	return new ResponseEntity<>(user1,HttpStatus.CREATED);
    }
    @PostMapping("/event")
    private ResponseEntity<Event> addEvent(@RequestBody Event event,@RequestParam(required = false)  String key) throws EventException, UserException{
    	Event event1=us.addEvent(event,key);
    	return new ResponseEntity<>(event1,HttpStatus.CREATED);
    }
     @PutMapping("/user/{id}")
    private ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable("id") Integer userId) throws UserException{
    	User user1=us.updateUser(userId);
    	ur.save(user);
    	return new ResponseEntity<>(user1,HttpStatus.OK);
    }
     @PutMapping("/event/{id}")
     private ResponseEntity<Event> updateEvent(@RequestBody Event event,@PathVariable("id") Integer eventId) throws  EventException{
     	Event event1=us.updateEvent(eventId);
     	er.save(event);
     	return new ResponseEntity<>(event1,HttpStatus.OK);
     }
     @DeleteMapping("/event/{id}")
     private ResponseEntity<Event> deleteEvent(@PathVariable("id") Integer eventId) throws EventException{
    	 Event event1=us.deleteEvent(eventId);
    	 
    	 return new ResponseEntity<>(event1,HttpStatus.OK);
     }
      @GetMapping("/event/{type}")
     private ResponseEntity<Set<Event>> getEvents(@PathVariable("type") String Type) throws EventException{
    	 Set<Event> events= us.getEventFromType(Type);
    	 return new ResponseEntity<>(events,HttpStatus.OK);
      }
    		 
     
     
    
    
	
	
	
}
