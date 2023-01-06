package com.masai.controller;

import java.util.List;
import java.util.Optional;

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

import com.masai.Exception.CommentException;
import com.masai.Exception.PostException;
import com.masai.Exception.UserException;
import com.masai.Repository.CommentRepo;
import com.masai.Repository.PostRepo;
import com.masai.bean.Comment;
import com.masai.bean.Post;
import com.masai.service.CommentService;
import com.masai.service.PostService;

@RestController
public class CommentController {

	@Autowired
	public CommentService cs;
	@Autowired
	 public CommentRepo cr;
	
	@Autowired
	public PostRepo pr;

	@PostMapping("/comments/{postId}")
	public ResponseEntity<Comment> saveComment(@RequestBody Comment comment,@RequestParam("key") String key,@PathVariable("postId") Integer postId) throws  Exception {
		
		cs.bookComment(comment, key);
		return new ResponseEntity<>(comment,HttpStatus.CREATED);
	}
	
	@PutMapping("/comments/{postId}/{id}")
	public ResponseEntity<Comment> updateComment(@RequestBody Post post,@PathVariable("id") Integer postId,@RequestParam("key") String key,@PathVariable("postId") Integer post1Id) throws PostException, CommentException{
		Optional<Post> p=pr.findById(post1Id);
		Post p1=p.get();
		if(p1==null) {
			throw new PostException("No post prsent with this postId");
		}
		Comment c1=cs.updateComment(key, postId);
		return new ResponseEntity<Comment>(c1,HttpStatus.OK);	
	}
	
	@DeleteMapping("/comments/{postId}/{Id}")
	public ResponseEntity<Comment> deleteComment(@PathVariable("Id") Integer postId,@RequestParam("key") String key,@PathVariable("postId") Integer post1Id) throws PostException, CommentException{

		
		Optional<Comment> p=cr.findById(postId);
		Comment p1=p.get();
		cs.cancelComment(p1, key);
		return new ResponseEntity<Comment>(p1,HttpStatus.OK);
	}
	
	@GetMapping("/comments/{postId}/{id}")
	public ResponseEntity<Comment> viewComment(@PathVariable("id") Integer postId,@RequestParam("key") String key,@PathVariable("postId") Integer post1Id) throws PostException, CommentException{
		Optional<Post> p=pr.findById(post1Id);
		Post p1=p.get();
		if(p1==null) {
			throw new PostException("No post prsent with this postId");
		}
		Comment c=cs.viewComment(postId, key);
		return new ResponseEntity<Comment>(c,HttpStatus.OK);
	}
	@GetMapping("/comments")
	public ResponseEntity<List<Comment>> viewAllComment(@RequestParam("key") String key) throws PostException, UserException, CommentException{
		List<Comment> p=cs.viewAllComment(key);
		return new ResponseEntity<List<Comment>>(p,HttpStatus.OK);
	}
}
