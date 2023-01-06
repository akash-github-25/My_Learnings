package com.masai.service;

import com.masai.Exception.DriverException;
import com.masai.bean.Driver;

public interface DriverService {
public Driver addDriver(Driver driver)throws DriverException;
}
