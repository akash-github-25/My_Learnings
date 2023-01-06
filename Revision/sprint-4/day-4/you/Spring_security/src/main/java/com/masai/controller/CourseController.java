package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.CourseException;
import com.masai.bean.Course;
import com.masai.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService cs;
	
	@PostMapping("/Course")
	public Course addCourse(@RequestBody Course course) throws CourseException {
		Course course1=cs.addCourse(course);
		return course1;
	}
	@GetMapping("/Course/{courseId}")
	public Course findCourse(@PathVariable("courseId") Integer courseId) throws CourseException {
		Course cou=cs.findById(courseId);
		return cou;
	} 
	@GetMapping("/Courses")
	public List<Course> findAllCourses() throws CourseException{
		List<Course> x=cs.findAllCourse();
		return x;
	}
	@DeleteMapping("/course/{courseId}")
	public Course deleteCourse(@PathVariable("courseId") Integer courseId) throws CourseException {
		Course course1=cs.deleteCourse(courseId);
		return course1;
	}
	@PutMapping("/Course")
	public Course updateCourse(@RequestBody Course course) throws CourseException {
		Course course1=cs.updateCourse(course);
		return course1;
	}
	

}
