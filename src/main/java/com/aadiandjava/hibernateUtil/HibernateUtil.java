package com.aadiandjava.hibernateUtil;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory SESSION_FACTORY= buildSessionFactory();
	
//	public static SessionFactory buildSessionFactory() {
//		
//	Configuration cfg=new Configuration();
//	
//	cfg.configure("aadi.cfg.xml");
//	
//	SessionFactory sessionFactory =cfg.buildSessionFactory();
//	
//	return sessionFactory;
//	}
	
	public static SessionFactory buildSessionFactory() {
		try{
	
			
			return new Configuration()
					.configure("hibernate.cfg.xml")
					.buildSessionFactory();
			
			
		}catch(Exception e) {
			
			throw new RuntimeException(e.getMessage( ));
			
			
		}
	}
	
	public static SessionFactory getSessionaFactory() {
		
		return SESSION_FACTORY;
	}
	
	
	

}
