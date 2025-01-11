package com.project.blog_app_apis.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@NoArgsConstructor
@Setter
@Getter
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="user_name", nullable=false, length=100)
	private String name;
	
	private String email;
	
	private String password;
	
	private String about;
}



//User entity ko hum sirf database me data entry ke liye rakhenge, expose nai karenge
// Based on our req, hum UserDto banayenge and jitne bhi fields chahiye, hum iske throu allow karenge
// Ho sakta hai hume entity se password nai laana ho, isliye UserDto banaye hai