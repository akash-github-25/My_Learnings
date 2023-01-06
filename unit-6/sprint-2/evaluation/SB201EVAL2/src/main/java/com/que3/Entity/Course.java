package com.que3.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private String duration;
	private int fee;
	@ManyToMany(cascade = CascadeType.ALL)
	List<Student> stud=new ArrayList<Student>();
	@ManyToOne(cascade = CascadeType.ALL)
	private Teacher tech;
	
	
	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}


	public List<Student> getStud() {
		return stud;
	}


	public void setStud(List<Student> stud) {
		this.stud = stud;
	}


	public Teacher getTech() {
		return tech;
	}


	public void setTech(Teacher tech) {
		this.tech = tech;
	}


	public Course() {
		super();
	}


	public Course(int courseId, String courseName, String duration, int fee, List<Student> stud, Teacher tech) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		this.stud = stud;
		this.tech = tech;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
