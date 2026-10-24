package com.aadiandjava.service;

import java.util.List;

import com.aadiandjava.dao.UserDao;
import com.aadiandjava.entity.User;
import com.aadiandjava.exception.UserNotFoundException;

public class UserService {
	
	UserDao dao=new UserDao();
	
	
	public String saveUser(User user) {
		
		return dao.SaveUser(user);
		
	} 
	
	public User getUser(int id) {
		
		User user = dao.getUserById(id);
		if(user == null) {
			throw new UserNotFoundException("user not found with id ="+id);
		}
		return user;
	}
	public List<User> getAll() {
		
		return dao.getAllUsers();
	}
	
	public String updateUser(int id, User user) {
		
		return dao.update(id, user);
	}
	
	public String delete(int id) {
		return dao.deleteUser(id);
	}

}
