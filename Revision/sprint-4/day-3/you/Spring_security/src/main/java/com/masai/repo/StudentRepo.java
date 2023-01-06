package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
