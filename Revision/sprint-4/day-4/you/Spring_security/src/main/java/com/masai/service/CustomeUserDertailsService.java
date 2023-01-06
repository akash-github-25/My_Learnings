package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.Exception.StudentException;
import com.masai.bean.SecurityUser;
import com.masai.bean.Student;
import com.masai.repo.StudentRepo;

@Service
public class CustomeUserDertailsService implements UserDetailsService {
@Autowired
	StudentRepo sr;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Student  stud=sr.findByUsername(username);
		if(stud!=null) {
		return new SecurityUser(stud);
		}else {
//			throw new StudentException("Not found");
			return null;
		}
	}

}
