package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
