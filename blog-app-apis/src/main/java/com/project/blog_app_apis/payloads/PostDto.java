package com.project.blog_app_apis.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.project.blog_app_apis.entities.Category;
import com.project.blog_app_apis.entities.Comment;
import com.project.blog_app_apis.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class PostDto {
	
	private Integer postId;
	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	private  CategoryDto category;
	private UserDto user;
	private Set<CommentDto> comments = new HashSet<>();

}


//is class me hum validations laga sakte hai