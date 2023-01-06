package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.FirException;
import com.masai.bean.Fir;
import com.masai.bean.User;
import com.masai.repository.FirRepo;
import com.masai.repository.UserRepo;

@Service
public class FirServiceImpl implements FirService{
	
	@Autowired
	private FirRepo fr;
//	@Autowired
//	private UserRepo ur;

	@Override
	public Fir registerFir(Fir fir) throws FirException {
		// TODO Auto-generated method stub
		
//		List<User> users=fir.getUser();
//		for(User x:users) {
//			x.getFirs().add(fir);
//			ur.save(x);
//		}
		
		Fir firs=fr.save(fir);
	
	
		if(firs!=null) {
			return firs;
		}else {
			throw new FirException("Fir can't be added");
		}
		
	}

}
