package com.masai.service;

import java.util.List;
import java.util.Optional;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.bean.Mail;
import com.masai.bean.User;
import com.masai.exception.MailException;
import com.masai.repo.MailRepo;
import com.masai.repo.UserRepo;

@Service
public class MailServiceImpl implements MailService{
	
	@Autowired
	public MailRepo mr;
	@Autowired
	public UserRepo ur;

	@Override
	public Mail addEmail(Mail mail) throws MailException {
		// TODO Auto-generated method stub
		Mail m=mr.save(mail);
		User user1=mail.getUser();
		List<Mail> mail1=user1.getMails();
		mail1.add(m);
		ur.save(user1);
		if(m!=null) {
			return m;
		}else {
			throw new MailException("Mail not added");
		}
		
	}

	@Override
	public Mail deleteMail(Integer mailId) throws MailException {
		// TODO Auto-generated method stub
		Optional<Mail> mail=mr.findById(mailId);
		if(!mail.isEmpty()) {
		Mail m=mail.get();
		mr.delete(m);
		}else {
			throw new MailException("Mail cannot be deleted");
		}
		
		return null;
	}

	@Override
	public Mail updateMailaddStarred(Mail mail) throws MailException {
		// TODO Auto-generated method stub
		mail.setStarred(true);
		Mail mail1=mr.save(mail);
		if(mail1!=null) {
			return mail1;
		}else {
			throw new MailException("Mail canot be updated to starred");
		}
		
	}

}
