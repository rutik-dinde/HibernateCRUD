package com.aadiandjava.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.aadiandjava.entity.User;
import com.aadiandjava.hibernateUtil.HibernateUtil;

public class UserDao {
	
	
	private Session sesson;

	//save update delete = transaction
	public String SaveUser(User user) {
		try {
//			
//			SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
//			 
//			Session session = sessionFactory.openSession();
//			
//		Transaction tr =	session.beginTransaction();
		
			Session session=HibernateUtil.getSessionaFactory().openSession();
			
		 Transaction tr =session.beginTransaction();
		//session.save(user); // save user in db old
		
		session.persist(user); /// save user in db new
		
		tr.commit();//saved changes in databas
		
	  return "User Saved Successful";
	
		
		}catch(Exception e) {
			
			throw new RuntimeException(e.getMessage());
			
		}
	}
	
	
	public   User getUserById(int id) {
		try {
			Session session=HibernateUtil.getSessionaFactory().openSession();

			User user= session.get(User.class, id);	
			return user;
		}
        catch(Exception e) {
			
			throw new RuntimeException(e.getMessage());
			
		}
	}
	
	//HQL - Hibernate query language
	public List<User> getAllUsers() {
		
		try {
			Session session = HibernateUtil.getSessionaFactory().openSession();
			
			List<User> users = session.createQuery("from User",User.class).getResultList();
		
			return users;
		
		}
		catch(Exception e) {
			
			throw new RuntimeException(e.getMessage());
		}
	}

	//update 
	
	public String update(int id, User user) {
		
		try {
			Session session= HibernateUtil.getSessionaFactory().openSession();
		
			Transaction tr = session.beginTransaction();
			
			User dbUser = session.get(User.class, id);
			
			dbUser.setEmail(user.getEmail());
			dbUser.setGender(user.getGender());
			dbUser.setPassword(user.getPassword());
			dbUser.setUsername(user.getUsername());
			
			
			session.persist(dbUser);
			
			tr.commit();
			
			return "User updated Successfully";
			
		}
		catch(Exception e){
			throw new RuntimeException(e.getMessage());
		}
	}
	
	
	
	//delete
	
	public String deleteUser(int id) {
		try {
			Session session = HibernateUtil.getSessionaFactory().openSession();
			
			Transaction tr = session.beginTransaction();
			
			User user =session.get(User.class, id);
			session.remove(user);
			
			tr.commit();
			return "Delete successully";
			
		}
		catch(Exception e){
			throw new RuntimeException(e.getMessage());
		}
	}

}
