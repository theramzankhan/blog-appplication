package com.project.blog_app_apis.payloads;

import java.util.Date;

import com.project.blog_app_apis.entities.Category;
import com.project.blog_app_apis.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class PostDto {
	
	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	private  CategoryDto category;
	private UserDto user;

}


//is class me hum validations laga sakte hai