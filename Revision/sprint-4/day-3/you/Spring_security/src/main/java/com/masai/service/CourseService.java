package com.masai.service;

import java.util.List;

import com.masai.Exception.CourseException;
import com.masai.bean.Course;

public interface CourseService {
public Course addCourse(Course course)throws CourseException;
public List<Course> findAllCourse()throws CourseException;
public Course findById(Integer courseId)throws CourseException;
public Course deleteCourse(Integer courseId)throws CourseException;
public Course updateCourse(Course course)throws CourseException;
}
