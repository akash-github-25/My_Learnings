package com.masai.work;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class InsuranceServiceImpl implements InsuranceService{
	
	@Autowired
	private InsuranceRepo ir;

	@Override
	public InsurancePolicy saveInsurance(InsurancePolicy Insurance) {
		// TODO Auto-generated method stub
		ir.save(Insurance);
		return Insurance;
		
	}

	@Override
	public InsurancePolicy deleteInsurance(InsurancePolicy Insurance) {
		// TODO Auto-generated method stub
		ir.delete(Insurance);
		return null;
	}

	@Override
	public InsurancePolicy getInsurance(Long id) {
		// TODO Auto-generated method stub
		Optional<InsurancePolicy> Ip=ir.findById(id);
		InsurancePolicy Ips=Ip.get();
		return null;
	}

	@Override
	public InsurancePolicy uodateInsurance(InsurancePolicy Insurance) {
		// TODO Auto-generated method stub
		ir.save(Insurance);
		return null;
	}

	@Override
	public List<InsurancePolicy> getAllInsurance() {
		// TODO Auto-generated method stub
		return ir.findAll();
		
	}

}
