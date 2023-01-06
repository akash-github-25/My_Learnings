package com.masai.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.PostException;
import com.masai.Exception.UserException;
import com.masai.Repository.PostRepo;
import com.masai.bean.Post;
import com.masai.service.PostService;

@RestController
public class PostController {
	
	
	@Autowired
	public PostService ps;
	@Autowired
	 public PostRepo pr;

	@PostMapping("/posts")
	public ResponseEntity<Post> savePost(@Valid @RequestBody Post post,@RequestParam("key") String key) throws  Exception {
		ps.bookPost(post, key);
		return new ResponseEntity<>(post,HttpStatus.CREATED);
	}
	
	@PutMapping("/posts/{id}")
	public ResponseEntity<Post> updatePost(@RequestBody Post post,@PathVariable("id") Integer postId,@RequestParam("key") String key) throws PostException{
		
		Post p=ps.updatePost(key,postId);
		return new ResponseEntity<Post>(p,HttpStatus.OK);	
	}
	
	@DeleteMapping("/posts/{id}")
	public ResponseEntity<Post> deletePost(@PathVariable("id") Integer postId,@RequestParam("key") String key) throws PostException{
		Optional<Post> p=pr.findById(postId);
		Post p1=p.get();
		ps.cancelPost(p1, key);
		return new ResponseEntity<Post>(p1,HttpStatus.OK);
	}
	
	@GetMapping("/posts/{id}")
	public ResponseEntity<Post> viewPost(@PathVariable("id") Integer postId,@RequestParam("key") String key) throws PostException{
		Post c=ps.viewPost(postId, key);
		return new ResponseEntity<Post>(c,HttpStatus.OK);
	}
	@GetMapping("/posts")
	public ResponseEntity<List<Post>> viewAllPost(@RequestParam("key") String key) throws PostException, UserException{
		List<Post> p=ps.viewAllPost(key);
		return new ResponseEntity<List<Post>>(p,HttpStatus.OK);
	}
	
	
}
