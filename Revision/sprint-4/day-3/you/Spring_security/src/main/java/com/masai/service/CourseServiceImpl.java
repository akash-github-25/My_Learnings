package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.CourseException;
import com.masai.bean.Course;
import com.masai.repo.CourseRepo;
@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepo cs;

	@Override
	public Course addCourse(Course course) throws CourseException {
		// TODO Auto-generated method stub
		Course course1=cs.save(course);
		if(course1!=null) {
		return course1;
		}else {
			throw new CourseException("Course cannot be added");
		}
	}

	@Override
	public List<Course> findAllCourse() throws CourseException {
		// TODO Auto-generated method stub
		List<Course> courses=cs.findAll();
		if(courses.size()!=0) {
		return courses;
		}else {
			throw new CourseException("Course cannot be added");
		}
	}

	@Override
	public Course findById(Integer courseId) throws CourseException {
		// TODO Auto-generated method stub
		Optional<Course> course=cs.findById(courseId);
		if(!course.isEmpty()) {
		Course c=course.get();
		return c;
		}else {
			throw new CourseException("Course not prsent");
		}
	}

	@Override
	public Course deleteCourse(Integer courseId) throws CourseException {
		// TODO Auto-generated method stub
		Optional<Course> course=cs.findById(courseId);
		if(!course.isEmpty()) {
		Course c=course.get();
		cs.delete(c);
		return c;
		}else {
			throw new CourseException("Course can't be added");
		}
		
	}

	@Override
	public Course updateCourse(Course course) throws CourseException {
		// TODO Auto-generated method stub
		Course cou=cs.save(course);
		return cou;
	}

}
