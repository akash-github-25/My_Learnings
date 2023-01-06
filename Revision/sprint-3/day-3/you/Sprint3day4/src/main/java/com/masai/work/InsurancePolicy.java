package com.masai.work;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
@Entity
public class InsurancePolicy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	private Long PolicyNo;
	@Future(message = "ExpiryDate should be in future")
	private LocalDate ExpiryDate;
	private Double MonthlyPremium;
	private String CustomerName;
	private String CustomerAddress;
	
	private Long MobileNumber;
	@Min(value = 18 , message = "Age should be greater then then equal to 18")
    @Max(value = 64 , message = "Age should be less then then equal to 64")
	private Integer CustomerAge;
	@Email
	private String EmailAddress;
	
	
	public InsurancePolicy() {
		super();
		
	}
	
	public InsurancePolicy(Long iD, Long policyNo, LocalDate expiryDate, Double monthlyPremium, String customerName,
			String customerAddress, Long mobileNumber, Integer customerAge, String emailAddress) {
		super();
		ID = iD;
		PolicyNo = policyNo;
		ExpiryDate = expiryDate;
		MonthlyPremium = monthlyPremium;
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		MobileNumber = mobileNumber;
		CustomerAge = customerAge;
		EmailAddress = emailAddress;
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public Long getPolicyNo() {
		return PolicyNo;
	}
	public void setPolicyNo(Long policyNo) {
		PolicyNo = policyNo;
	}
	public LocalDate getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		ExpiryDate = expiryDate;
	}
	public Double getMonthlyPremium() {
		return MonthlyPremium;
	}
	public void setMonthlyPremium(Double monthlyPremium) {
		MonthlyPremium = monthlyPremium;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public Long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public Integer getCustomerAge() {
		return CustomerAge;
	}
	public void setCustomerAge(Integer customerAge) {
		CustomerAge = customerAge;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "InsurancePolicy [ID=" + ID + ", PolicyNo=" + PolicyNo + ", ExpiryDate=" + ExpiryDate
				+ ", MonthlyPremium=" + MonthlyPremium + ", CustomerName=" + CustomerName + ", CustomerAddress="
				+ CustomerAddress + ", MobileNumber=" + MobileNumber + ", CustomerAge=" + CustomerAge
				+ ", EmailAddress=" + EmailAddress + "]";
	}
	
}
