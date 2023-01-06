package com.masai.work;

import java.util.List;

public interface InsuranceService {
public InsurancePolicy saveInsurance(InsurancePolicy Insurance);
public InsurancePolicy deleteInsurance(InsurancePolicy Insurance);
public InsurancePolicy getInsurance(Long id);
public InsurancePolicy uodateInsurance(InsurancePolicy Insurance);
public List<InsurancePolicy> getAllInsurance();
}
