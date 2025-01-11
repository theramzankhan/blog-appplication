package com.project.blog_app_apis.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min=4, message="Username must be minimum 4 characters !!")
	private String name;
	
	@Email(message="Emaild address is invalid !!")
	private String email;
	
	@NotEmpty
	@Size(min=3, max=10, message="Password must be minimum of 3 chars and maximum of 10 chars !!")
//	@Pattern(regexp="" )
	private String password;
	
	@NotEmpty
	private String about;

}
