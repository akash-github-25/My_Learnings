package com.que1.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Collage {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int collageId;
	private String collageName;
	private String collageAddress;
	
	@OneToMany(mappedBy="clg" ,cascade=CascadeType.ALL)
	private List<Student> emps=new ArrayList<Student>();
	
	
	
	public Collage() {
		super();
	}



	public Collage(int collageId, String collageName, String collageAddress, List<Student> emps) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.emps = emps;
	}



	public int getCollageId() {
		return collageId;
	}



	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}



	public String getCollageName() {
		return collageName;
	}



	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}



	public String getCollageAddress() {
		return collageAddress;
	}



	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}



	public List<Student> getEmps() {
		return emps;
	}



	public void setEmps(List<Student> emps) {
		this.emps = emps;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
