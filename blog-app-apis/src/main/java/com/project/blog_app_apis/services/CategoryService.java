package com.project.blog_app_apis.services;

import java.util.List;

import com.project.blog_app_apis.payloads.CategoryDto;

public interface CategoryService {
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete
	void deleteCategory(Integer categoryId); // public likhne ki jaroorat nai hai kyuki interface me methods bydefault public & abstract ho jate h
	
	//get
	CategoryDto getCategory(Integer categoryId); 
	
	//get all
	List<CategoryDto> getCategories();

}
