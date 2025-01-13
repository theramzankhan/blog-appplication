package com.project.blog_app_apis.services;

import java.util.List;

import com.project.blog_app_apis.entities.Post;
import com.project.blog_app_apis.payloads.PostDto;
import com.project.blog_app_apis.payloads.PostResponse;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get all posts
	PostResponse getAllPost(Integer pageNumber, Integer pageSize);
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get all post by category  //can apply pagination here
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by user      //can apply pagination here
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<Post> searchPosts(String keyword);
	
}
