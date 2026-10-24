package com.aadiandjava.controller;

import java.util.List;

import com.aadiandjava.entity.User;
import com.aadiandjava.service.UserService;

public class UserController {
	
	UserService service=new UserService();
	
	public String saveUser(User user) {
	
	return service.saveUser(user);
	
	}
	
	public User getUser(int id) {
		
		return service.getUser(id);
	}

	public List<User> getAll() {
		
		return service.getAll();
		
	}
//	public String updated(int id, User user) {
//		return service.update(id, user);
//	}
	
	public String delete(int id) {
		return service.delete(id);
	}
	
}
