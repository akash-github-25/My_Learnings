package com.masai.service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.EventException;
import com.masai.Exception.UserException;
import com.masai.bean.CurrentUserSession;
import com.masai.bean.Event;
import com.masai.bean.User;
import com.masai.repo.EventRepo;
import com.masai.repo.SessionRepo;
import com.masai.repo.UserRepo;

@Service
public class UserSeviceImpl implements UserService{
	@Autowired
	private UserRepo ur;
	 @Autowired
	private EventRepo er;
	 @Autowired
	 private SessionRepo sr;

	@Override
	public User addUser(User user) throws UserException {
		// TODO Auto-generated method stub
		User user1=ur.save(user);
		if(user1!=null) {
			return user1;
		}else {
			throw new UserException("User can't be added");
		}
		
	}

	@Override
	public User updateUser(Integer userId) throws UserException {
		// TODO Auto-generated method stub
		User user1=ur.findById(userId).get();
		User user2=ur.save(user1);
		if(user2!=null) {
			return user2;
		}else {
			throw new UserException("User can't be updated");
		}
		
	}

	@Override
	public Event addEvent(Event event,String key) throws EventException, UserException {
		// TODO Auto-generated method stub
		 CurrentUserSession loggedInUser= sr.findByUuid(key);
			
			if(loggedInUser != null) {
				
		Event event1=er.save(event);
		if(event1!=null) {
			return event1;
		}else {
			throw new EventException("Event can't be added");
		}
			}else {
				throw new UserException("User is not authorized to perform this action");
			}
		
	}

	@Override
	public Event updateEvent(Integer eventId) throws EventException {
		// TODO Auto-generated method stub
		Event event1=er.findById(eventId).get();
		Event event2=er.save(event1);
		if(event2!=null) {
			return event2;
		}else {
			throw new EventException("Event can't be updated");
		}
	}

	@Override
	public Event deleteEvent(Integer eventId) throws EventException {
		// TODO Auto-generated method stub
		Event event1=er.findById(eventId).get();
		er.delete(event1);
		if(event1!=null) {
			return event1;
		}else {
			throw new EventException("Event is not there to be deleted");
		}
	}

	@Override
	public Set<Event> getEventFromType(String type) throws EventException {
		// TODO Auto-generated method stub
		Set<Event> c=new HashSet<>();
		List<Event> s=er.findAll();
		if(type.equals("month")) {
//			System.out.println("Yes");
		for(Event x:s) {
		System.out.println(x.getStartDate().getMonth().compareTo(LocalDate.now().getMonth()));
//			System.out.println(LocalDate.now().getMonth()+"nonono");
			if(x.getStartDate().getMonth().compareTo(LocalDate.now().getMonth())==0) {
			
				c.add(x);
			}
		}
		}else if(type.equals("day")) {
			for(Event x:s) {
				if(x.getStartDate().getDayOfWeek().compareTo(LocalDate.now().getDayOfWeek())==0) {
					c.add(x);
				}
			}
		}else if(type.equals("week")) {
			for(Event b:s) {
				if(b.getStartDate().compareTo(LocalDate.now().minusDays(7))==0) {
					c.add(b);
				}
			}
		}
		return c;
	}

}
