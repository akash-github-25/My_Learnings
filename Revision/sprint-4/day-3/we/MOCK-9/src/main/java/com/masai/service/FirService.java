package com.masai.service;

import com.masai.Exception.FirException;
import com.masai.bean.Fir;

public interface FirService {
	
public Fir registerFir(Fir fir)throws FirException;
}
