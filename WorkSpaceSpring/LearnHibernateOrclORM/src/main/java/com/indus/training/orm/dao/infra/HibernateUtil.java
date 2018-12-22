package com.indus.training.orm.dao.infra;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure("countries.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	
	
}