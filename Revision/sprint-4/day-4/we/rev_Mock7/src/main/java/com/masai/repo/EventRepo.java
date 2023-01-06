package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.Event;

public interface EventRepo extends JpaRepository<Event, Integer>{

}
