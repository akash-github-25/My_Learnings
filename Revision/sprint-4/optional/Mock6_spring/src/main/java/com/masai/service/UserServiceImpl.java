package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.bean.Mail;
import com.masai.bean.User;
import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.repo.UserRepo;
@Service 
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo ur;

	@Override
	public User addUser(User user) throws UserException {
		// TODO Auto-generated method stub
		User user1=ur.save(user);
		if(user1!=null) {
			return user1;
		}else {
			throw new UserException("User don't exist");
		}
		
	}

	@Override
	public List<Mail> getAllMails(Integer userId) throws MailException {
		// TODO Auto-generated method stub
		List<User> allUsers=ur.findAll();
		for(User c:allUsers) {
			if(c.getUserId()==userId) {
				List<Mail> mail=c.getMails();
				if(mail.size()!=0) {
					return mail;
				}else {
					throw new MailException("Mail not present");
				}
			}
		}
		return null;
	}

	@Override
	public User updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		User user1=ur.save(user);
		if(user1!=null) {
			return user1;
		}else {
			throw new UserException("User can't be updated");
		}
		
	}

	@Override
	public List<Mail> getStarredMails(Integer userId) throws MailException {
		// TODO Auto-generated method stub
		List<Mail> mailNew=new ArrayList<>();
		List<User> allUsers=ur.findAll();
		for(User c:allUsers) {
			if(c.getUserId()==userId) {
				List<Mail> x=c.getMails();
				for(Mail v:x) {
					if(v.isStarred()) {
						mailNew.add(v);
					}
				}
			}
		}
		if(mailNew.size()!=0) {
		return mailNew;
		}else {
			throw new MailException("No mail starred");
		}
	}

}
