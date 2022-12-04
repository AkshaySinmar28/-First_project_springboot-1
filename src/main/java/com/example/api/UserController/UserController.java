package com.example.api.UserController;

import com.example.api.UserService.UserService;
import com.example.api.model.User;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // = @Controller + @ResponseBody

public class UserController {

	private UserService userservices;

	@Autowired
	public UserController(UserService userservices) {
		this.userservices = userservices;
	}

	@RequestMapping("/getUser")
	public List<User> getAllUser() {
		return userservices.getAllUser();
	}

	@RequestMapping("/getUser/{Name}")
	public User getUser(@PathVariable String Name) {
		return userservices.getUser(Name);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addUser")
	public String addUser(@RequestBody User user) {
		userservices.addUser(user);
		return "Row inserted";
	}

}
