package com.project.blog_app_apis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.blog_app_apis.repositories.UserRepo;
import com.project.blog_app_apis.services.UserService;
import com.project.blog_app_apis.services.impl.UserServiceImpl;

@SpringBootTest
class BlogAppApisApplicationTests {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void repoTest() {
		String className = this.userRepo.getClass().getName();
		String packageName = this.userRepo.getClass().getPackageName();
		System.out.println(className);
		System.out.println(packageName);
	}
	
	@Test
	public void serviceImplTest() {
		String className = this.userServiceImpl.getClass().getName();
		String packageName = this.userServiceImpl.getClass().getPackageName();
		System.out.println("userServiceImpl: " +className);
		System.out.println("userServiceImpl: " +packageName);
	}

	@Test
	public void serviceTest() {
		String className = this.userService.getClass().getName();
		String packageName = this.userService.getClass().getPackageName();
		System.out.println("userService className: " +className);
		System.out.println("userService packageName: " +packageName);
	}
}
