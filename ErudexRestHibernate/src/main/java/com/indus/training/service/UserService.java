package com.indus.training.service;

import java.util.List;

import com.indus.training.entity.User;

public interface UserService {

	public List<User> getUsers();
	
	public User getUser(String username);
}
