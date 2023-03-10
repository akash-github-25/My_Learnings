package com.masai.Models;




public class Address {
	
	private String state;
	private String city;
	private String pincode;
	private String type;
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + ", type=" + type + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address() {
		super();
	}

	public Address(String state, String city, String pincode, String type) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.type = type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
