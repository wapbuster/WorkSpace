package com.indus.training.orm.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.training.orm.dao.IMovieDAO;
import com.indus.training.orm.domain.Movie;
import com.indus.training.orm.exception.IndusPersistException;

public class MovieDAOImpl implements IMovieDAO {

	private static SessionFactory movieSessionfactory;

	/**
	 * @param movieSessionfactory the movieSessionfactory to set
	 */
	public static void setMovieSessionfactory(SessionFactory movieSessionfactory) {
		MovieDAOImpl.movieSessionfactory = movieSessionfactory;
	}

	public Movie readMovieByPK(Integer movieId) throws IndusPersistException {
		Movie movieObj = null;

		Session movieSessionObj = movieSessionfactory.openSession();
		Transaction transObj = null;
		try {
			transObj = movieSessionObj.beginTransaction();
			movieObj = movieSessionObj.find(Movie.class, movieId);
			transObj.commit();
		} catch (Exception e) {
			transObj.rollback();
			throw new IndusPersistException("Exception Selecting Record from data base", e);
		} finally {
			movieSessionObj.close();
			transObj = null;
		}

		return movieObj;
	}

	public Boolean createMovie(Movie movieObj) throws IndusPersistException {
		Session movieSessionObj = movieSessionfactory.openSession();
		Transaction transObj = null;
		try {
			transObj = movieSessionObj.beginTransaction();
			movieSessionObj.save(movieObj);
			transObj.commit();
		} catch (Exception e) {
			transObj.rollback();
			throw new IndusPersistException("Exception creating Record to data base", e);
		} finally {
			movieSessionObj.close();
			transObj = null;
		}
		return null;
	}

	public Boolean updateMovie(Movie movieObj) throws IndusPersistException {
		Session movieSessionObj = movieSessionfactory.openSession();
		Transaction transObj = null;
		try {
			transObj = movieSessionObj.beginTransaction();
			movieSessionObj.save(movieObj);
			transObj.commit();
		} catch (Exception e) {
			transObj.rollback();
			throw new IndusPersistException("Exception updating Record to data base", e);
		} finally {
			movieSessionObj.close();
			transObj = null;
		}
		return null;
	}

	public Boolean deleteMovie(Integer movieId) throws IndusPersistException {
		Session movieSessionObj = movieSessionfactory.openSession();
		Transaction transObj = null;
		Movie movieObj = null;
		try {
			transObj = movieSessionObj.beginTransaction();
			movieObj = movieSessionObj.find(Movie.class, movieId);
			movieSessionObj.delete(movieObj);
			transObj.commit();
		} catch (Exception e) {
			transObj.rollback();
			throw new IndusPersistException("Exception deleting Record in data base", e);
		} finally {
			movieSessionObj.close();
			transObj = null;
		}
		return null;
	}

}
