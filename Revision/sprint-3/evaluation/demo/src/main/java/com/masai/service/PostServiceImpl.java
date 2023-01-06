package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.PostException;
import com.masai.Exception.UserException;
import com.masai.Repository.PostRepo;
import com.masai.Repository.SessionRepo;
import com.masai.bean.CurrentUserSession;
import com.masai.bean.Post;

@Service
public class PostServiceImpl implements PostService{
	@Autowired
	private PostRepo pr;
	
	@Autowired
	private SessionRepo sr;

	@Override
	public Post bookPost(Post post, String key) throws Exception {
		// TODO Auto-generated method stub
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		if(loggedInUser!=null) {
		Post p=pr.save(post);
		return p;
		}else {
			throw new Exception("Provide valid Key");
		}
		
	}

	@Override
	public Post cancelPost(Post post, String key) throws PostException {
		// TODO Auto-generated method stub
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		if(loggedInUser!=null) {
		pr.delete(post);
		return post;
		}else {
			throw new PostException("Provide valid Key!");
		}
	}

	@Override
	public Post viewPost(Integer postId, String key) throws PostException {
		// TODO Auto-generated method stub
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		if(loggedInUser!=null) {
		Optional<Post> p1=pr.findById(postId);
		Post p2=p1.get();
		return p2;
		}else {
			throw new PostException("Provide valid key!");
		}
		
	}

	@Override
	public List<Post> viewAllPost(String key) throws PostException, UserException {
		// TODO Auto-generated method stub
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		if(loggedInUser!=null) {
		List<Post> p=pr.findAll();
		return p;
		}else {
			throw new PostException("Provide Valod Key");
		}
		
	}

	@Override
	public Post updatePost(String key, Integer postId) throws PostException {
		// TODO Auto-generated method stub
		CurrentUserSession loggedInUser= sr.findByUuid(key);
		if(loggedInUser!=null) {
		Optional<Post> p=pr.findById(postId);
		Post p1=p.get();
		Post x=pr.save(p1);
		return x;
		}else {
			throw new PostException("Provide Valid Key");
		}
		
	}

}
