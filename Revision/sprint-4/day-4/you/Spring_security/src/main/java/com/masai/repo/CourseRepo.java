package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.bean.Course;
@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{

}
