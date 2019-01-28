package com.indus.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.indus.training.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<User> getUsers() {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<User> theQuery = currentSession.createQuery("SELECT U FROM User U WHERE U.institution_id=1", User.class);

		List<User> users = theQuery.getResultList();
		System.out.println(users.size());

		return users;
	}

	public User getUser(String username) {

		Session currentSession = sessionFactory.getCurrentSession();

		User userObj = currentSession.get(User.class, username);
		
		return userObj;
	}

}
