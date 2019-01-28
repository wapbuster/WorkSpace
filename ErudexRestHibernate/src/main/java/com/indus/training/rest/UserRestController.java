package com.indus.training.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indus.training.entity.User;
import com.indus.training.service.UserService;

@RestController
@RequestMapping("/erudex")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getCustomers() {

		return userService.getUsers();

	}

	
	@GetMapping("users/{username}")
	public User getUser(@PathVariable String username) {
		
		User userObj = userService.getUser(username);
		
		return userObj;
		
	}
	
}
