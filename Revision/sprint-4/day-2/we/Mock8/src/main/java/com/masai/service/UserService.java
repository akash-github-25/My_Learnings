package com.masai.service;

import java.util.List;

import com.masai.Exception.DriverException;
import com.masai.Exception.LoginException;
import com.masai.Exception.UserException;
import com.masai.bean.Driver;
import com.masai.bean.User;

public interface UserService {
	
public User addUser(User user)throws UserException;
public List<Driver> findRide(Integer userId)throws DriverException;
public Driver bookDriver(User user,Integer driverId,Integer x,Integer y,String key)throws DriverException,LoginException;
}
