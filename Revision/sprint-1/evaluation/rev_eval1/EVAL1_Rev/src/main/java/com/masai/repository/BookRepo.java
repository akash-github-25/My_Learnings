package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
