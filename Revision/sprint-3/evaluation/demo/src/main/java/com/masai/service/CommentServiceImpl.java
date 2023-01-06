package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.CommentException;
import com.masai.Exception.PostException;
import com.masai.Exception.UserException;
import com.masai.Repository.CommentRepo;
import com.masai.Repository.PostRepo;
import com.masai.Repository.SessionRepo;
import com.masai.bean.Comment;
import com.masai.bean.CurrentUserSession;
import com.masai.bean.Post;

@Service 
public class CommentServiceImpl implements CommentService{
	@Autowired
	private CommentRepo cr;
	
	@Autowired
	private SessionRepo sr;

	@Override
	public Comment bookComment(Comment comment, String key) throws CommentException, Exception {
		// TODO Auto-generated method stub
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		if(loggedInUser!=null) {
		Comment p=cr.save(comment);
		return p;
		}else {
			throw new Exception("Provide valid Key");
		}
	}

	@Override
	public Comment cancelComment(Comment comment, String key) throws CommentException {
		// TODO Auto-generated method stub
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		if(loggedInUser!=null) {
		cr.delete(comment);
		return comment;
		}else {
			throw new CommentException("Provide valid Key!");
		}
	}

	@Override
	public Comment viewComment(Integer commentId, String key) throws CommentException {
		// TODO Auto-generated method stub
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		if(loggedInUser!=null) {
		Optional<Comment> p1=cr.findById(commentId);
		Comment p2=p1.get();
		return p2;
		}else {
			throw new CommentException("Provide valid key!");
		}
	}

	@Override
	public List<Comment> viewAllComment(String key) throws CommentException, UserException {
		// TODO Auto-generated method stub
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		if(loggedInUser!=null) {
		List<Comment> p=cr.findAll();
		return p;
		}else {
			throw new CommentException("Provide Valod Key");
		}
	}

	@Override
	public Comment updateComment(String key, Integer postId) throws CommentException {
		// TODO Auto-generated method stub
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		if(loggedInUser!=null) {
		Optional<Comment> p=cr.findById(postId);
		Comment p1=p.get();
		cr.save(p1);
		return p1;
		}else {
			throw new CommentException("Provide Valid Key");
		}
		
	}
	}


