package com.project.blog_app_apis.payloads;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CategoryDto {
	
	private Integer categoryId;
	
	@NotBlank
	@Size(min=4, message="Min size of category title should be 4")
	private String categoryTitle;
	
	@NotBlank
	@Size(min=10, message="Min size of category title should be 10")
	private String categoryDescription;

}
