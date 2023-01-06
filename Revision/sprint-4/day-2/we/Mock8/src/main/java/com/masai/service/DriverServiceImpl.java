package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.DriverException;
import com.masai.bean.Driver;
import com.masai.repository.DriverRepo;
@Service
public class DriverServiceImpl implements DriverService{
	
	@Autowired
	private DriverRepo dr;

	@Override
	public Driver addDriver(Driver driver) throws DriverException {
		// TODO Auto-generated method stub
		Driver savedDriver=dr.save(driver);
		if(savedDriver!=null) {
			return savedDriver;
		}else {
			throw new DriverException("Driver can't be added");
		}
	}

}
