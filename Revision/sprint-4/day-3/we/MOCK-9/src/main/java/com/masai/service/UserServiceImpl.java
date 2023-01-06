package com.masai.service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.FirException;
import com.masai.Exception.LoginException;
import com.masai.Exception.UserException;
import com.masai.bean.CurrentUserSession;
import com.masai.bean.Fir;
import com.masai.bean.User;
import com.masai.repository.FirRepo;
import com.masai.repository.SessionRepo;
import com.masai.repository.UserRepo;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo ur;
	@Autowired
	private FirRepo fr;
	@Autowired
	private SessionRepo sr;

	@Override
	public User registerUser(User user) throws UserException {
		
		User user1=ur.save(user);
		if(user1!=null) {
			return user1;
		}else {
			throw new UserException("User cannot be added");
		}
		
	}

	@Override
	public List<Fir> getAllFirs(Integer userId,String key) throws UserException, LoginException {
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		
		if(loggedInUser != null) {
		User user=ur.findById(userId).get();
		if(user!=null) {
			List<Fir> firs=user.getFirs();
			return firs;
		}else {
			throw new UserException("User can't found");
		}
		}else {
			throw new LoginException("User not logged in!");
		}
	}

	@Override
	public Fir deleteFir(Integer userId, Integer firId) throws UserException, FirException {
		Optional<User> user1=ur.findById(userId);
		User newUser=user1.get();
		List<Fir> firs=newUser.getFirs();
		int i=0;
		for(Fir x:firs) {
			if(x.getFirId()==firId) {
				int Hours = (int)Duration.between(x.getTimeStamp(),LocalDateTime.now()).toHours();
				if(Hours<=24) {
					System.out.println("akash");
//					fr.delete(x);
					newUser.getFirs().remove(i);
					ur.save(newUser);
					fr.deleteById(firId);
					return x;
				}else {
					throw new FirException("Fir will only be withdrawn within 24 hrs");
				}
			}
			i++;
		}
		return null;
	}

}
