package com.indus.training.orm.dao.infra;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class HibernateUtil {
	private static final EntityManagerFactory entityManagerFactory;

	static {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("CountryPU");
			 
			 
		} catch (Throwable ex) {
			System.err.println("Initial mgrFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
}