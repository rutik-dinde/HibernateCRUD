package com.aadiandjava.main;

import java.util.List;

import com.aadiandjava.controller.UserController;
import com.aadiandjava.entity.User;

public class UserMain {
	
public static void main(String[] args) {
	
	UserController controller = new UserController();
   
	System.out.println(controller.delete(1));
//	
//	User user=new User(101,"Rajuandpython","5656","raju007@gmail.com","Male");
//	
//	System.out.println(controller.updated(101, user));
	
//	List<User> users = controller.getAll();
//	
//	for(User user:users) {
//		user.dispaly();
//		System.out.println("===========================");
//	}
//	
	
	
	
	
	
	//	try {
//	User user = controller.getUser(103);
//	user.dispaly();	
//	}catch(Exception e) {
//		System.out.println(e.getMessage());
//	}
	
//	UserController controller = new UserController();
//	
//	User user= new User(101,"jamesandjava","1224","james007@gmail.com","male");
//	
//	
//	
//	
//	System.out.println(controller.saveUser(user));

	}
}
