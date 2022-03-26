package com.simplilearn.util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.simplilearn.entity.Product;

public class Hibernate
{
	static SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {

		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Product.class);
			

			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

	public static Session getSession() {
		// TODO Auto-generated method stub
		return null;
	}
}
