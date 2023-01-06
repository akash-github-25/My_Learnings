package com.day8;

public class Person {
private int Id;
private String name;
private int age;
public Person(int id, String name, int age) {
	super();
	Id = id;
	this.name = name;
	this.age = age;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [Id=" + Id + ", name=" + name + ", age=" + age + "]";
}

}
