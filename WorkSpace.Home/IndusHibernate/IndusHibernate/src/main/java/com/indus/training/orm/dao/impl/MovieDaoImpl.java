package com.indus.training.orm.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.training.orm.dao.IMovieDAO;
import com.indus.training.orm.domain.Movie;
import com.indus.training.orm.exception.IndusPresitException;

public class MovieDaoImpl implements IMovieDAO {

	private static SessionFactory worldDBSessionfactory;

	/**
	 * @param worldDBSessionfactory
	 *            the worldDBSessionfactory to set
	 */
	public static void setWorldDBSessionfactory(SessionFactory worldDBSessionfactory) {
		MovieDaoImpl.worldDBSessionfactory = worldDBSessionfactory;
	}

	public Movie readMovieByPK(Integer movieId) throws IndusPresitException {
		Movie movieObj = null;

		Session movieSessionObj = worldDBSessionfactory.openSession();
		Transaction transObj = null;
		try {
			transObj = movieSessionObj.beginTransaction();
			movieObj = movieSessionObj.find(Movie.class, movieId);
			transObj.commit();
		} catch (Exception e) {
			transObj.rollback();
			throw new IndusPresitException("Exception Selecting Record from data base", e);
		} finally {
			movieSessionObj.close();
			transObj = null;
		}

		return movieObj;
	}

	public Boolean createMovie(Movie movieObj) throws IndusPresitException {
		return null;
	}

	public Boolean updateMovie(Movie movieObj) throws IndusPresitException {
		return null;
	}

	public Boolean deleteMovie(Integer movieId) throws IndusPresitException {
		return null;
	}

}
