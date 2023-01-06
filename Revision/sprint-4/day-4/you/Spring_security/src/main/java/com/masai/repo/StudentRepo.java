package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.bean.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
   @Query("select s from Student s where s.Email=?1")
	public Student findByUsername(String name);
}
