package com.masai.service;

import java.util.List;

import com.masai.Exception.CommentException;
import com.masai.Exception.PostException;
import com.masai.Exception.UserException;
import com.masai.bean.Comment;
import com.masai.bean.Post;

public interface CommentService {
	public Comment bookComment(Comment comment,String key) throws CommentException,Exception;
	public Comment cancelComment(Comment comment,String key)throws CommentException;
	public Comment viewComment(Integer commentId,String key)throws CommentException;
	public List<Comment> viewAllComment(String key)throws CommentException,UserException;
	public Comment updateComment(String key,Integer postId) throws CommentException;
}
