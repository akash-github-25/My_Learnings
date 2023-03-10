package com.que1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String name;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		super();
	}

	public Person(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
