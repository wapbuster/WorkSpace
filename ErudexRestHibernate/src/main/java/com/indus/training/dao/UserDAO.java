package com.indus.training.dao;

import java.util.List;

import com.indus.training.entity.User;

public interface UserDAO {

	public List<User> getUsers();

	public User getUser(String username);
}
