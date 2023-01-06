package com.que3.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;
	private String teacherName;
	private int noYearOfExperince;
	private String email;
	@OneToMany(cascade = CascadeType.ALL)
	List<Course> tech=new ArrayList<Course>();
	
	
	public int getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	public int getNoYearOfExperince() {
		return noYearOfExperince;
	}


	public void setNoYearOfExperince(int noYearOfExperince) {
		this.noYearOfExperince = noYearOfExperince;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Course> getTech() {
		return tech;
	}


	public void setTech(List<Course> tech) {
		this.tech = tech;
	}


	public Teacher() {
		super();
	}


	public Teacher(int teacherId, String teacherName, int noYearOfExperince, String email, List<Course> tech) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.noYearOfExperince = noYearOfExperince;
		this.email = email;
		this.tech = tech;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
