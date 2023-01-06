package com.masai.service;

import java.util.List;
import java.util.Set;

import com.masai.Exception.EventException;
import com.masai.Exception.UserException;
import com.masai.bean.Event;
import com.masai.bean.User;

public interface UserService {
	
public User addUser(User user)throws UserException;
public User updateUser(Integer userId)throws UserException;
public Event addEvent(Event event,String key)throws EventException,UserException;
public Event updateEvent(Integer eventId)throws EventException;
public Event deleteEvent(Integer eventId)throws EventException;
public Set<Event> getEventFromType(String type)throws EventException;

}
