package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.bean.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
