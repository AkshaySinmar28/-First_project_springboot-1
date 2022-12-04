package com.example.api.UserService;

import java.util.List;

import com.example.api.model.User;

public interface UserService {

	public List<User> getAllUser();

	public User getUser(String name);

	public void addUser(User user);

}
