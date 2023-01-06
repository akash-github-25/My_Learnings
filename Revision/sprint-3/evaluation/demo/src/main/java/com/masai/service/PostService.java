package com.masai.service;

import java.util.List;

import com.masai.Exception.PostException;
import com.masai.Exception.UserException;
import com.masai.bean.Post;

public interface PostService {
	
	public Post bookPost(Post post,String key) throws PostException,Exception;
	public Post cancelPost(Post post,String key)throws PostException;
	public Post viewPost(Integer postId,String key)throws PostException;
	public List<Post> viewAllPost(String key)throws PostException,UserException;
	public Post updatePost(String key,Integer postId) throws PostException;
}
