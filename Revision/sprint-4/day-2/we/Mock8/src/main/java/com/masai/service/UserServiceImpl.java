package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.DriverException;
import com.masai.Exception.LoginException;
import com.masai.Exception.UserException;
import com.masai.bean.CurrentUserSession;
import com.masai.bean.Driver;
import com.masai.bean.User;
import com.masai.repository.DriverRepo;
import com.masai.repository.SessionRepo;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo ur;
	@Autowired
	private DriverRepo dr;
	@Autowired
	private SessionRepo sr;

	@Override
	public User addUser(User user) throws UserException {
		
		User user1=ur.save(user);
		if(user1!=null) {
			return user1;
		}else {
			throw new UserException("User can't be added");
		}
	}

	@Override
	public List<Driver> findRide(Integer userId) throws DriverException {
		User user=ur.findById(userId).get();
		List<Driver> drivers=dr.findAll();
		List<Driver> drivers1=new ArrayList<>();
		Integer[] array=user.getCurrentPosition();
		Integer x1=array[0];
		Integer x2=array[1];
		
		for(Driver c:drivers) {
			Integer[] arr1=c.getCurrentPosition();
			Integer a1=arr1[0];
			Integer a2=arr1[1];
			Integer x=(int)(Math.sqrt((x1-a1)*(x1-a1)+(x2-a2)*(x2-a2)));
			if(x<=5) {
				drivers1.add(c);
			}
		}
		if(drivers1.size()!=0) {
			return drivers1;
		}else {
			throw new DriverException("No driver is present within the specified range");
		}
		
	}

	@Override
	public Driver bookDriver(User user,Integer driverId, Integer x, Integer y,String key) throws DriverException, LoginException {
		// TODO Auto-generated method stub
		 CurrentUserSession loggedInUser= sr.findByUuid(key);
			
			if(loggedInUser != null) {
		Driver d1=dr.findById(driverId).get();
		Integer[] arr1=d1.getCurrentPosition();
		Integer x1=arr1[0];
		Integer x2=arr1[1];
		Integer z=(int)(Math.sqrt((x1-x)*(x1-x)+(x2-y)*(x2-y)));
		if(z<=5) {
			Integer[] d3=new Integer[2];
			d3[0]=x;
			d3[1]=y;
			d1.setCurrentPosition(d3);
			d1.setUser(user);
			Driver newDriver =dr.save(d1);
			
			return newDriver;
		}else {
			throw new DriverException("Driver is out of your range");
		}
		
	}else {
		throw new LoginException("User not logged in!");
	}
	}
}
