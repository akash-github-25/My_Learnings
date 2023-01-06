package com.masai.model;

public class LoginEmp {
private String email;
private String password;

	public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

	public LoginEmp() {
	super();
	// TODO Auto-generated constructor stub
}

	public LoginEmp(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
