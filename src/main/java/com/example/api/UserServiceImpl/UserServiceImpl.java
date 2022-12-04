package com.example.api.UserServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.api.UserService.UserService;
import com.example.api.model.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> users = new ArrayList<>(Arrays.asList(new User("Akshay", "aaa"),
			new User("Manish", "mmm"), new User("Nayab", "nnn")));

	public List<User> getAllUser() {
		return users;
	}

	public User getUser(String Name) {
		for (User t : users) {
			if (t.getName().equals(Name))
				return t;
		}
		return null;
	}
	public void addUser(User user) {
		users.add(user);
	}

}
