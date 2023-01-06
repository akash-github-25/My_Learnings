package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.UserException;
import com.masai.Repository.UserRepo;
import com.masai.bean.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
public UserRepo ur;
	@Override
	public User addUser(User user) throws UserException {
		// TODO Auto-generated method stub
		User user1=ur.save(user);
		if(user1!=null) {
			return user1;
		}else {
			 throw new UserException("User Error");
		}
		
	}

}
