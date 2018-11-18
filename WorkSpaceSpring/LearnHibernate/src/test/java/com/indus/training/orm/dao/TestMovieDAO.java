package com.indus.training.orm.dao;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.orm.domain.Movie;
import com.indus.training.orm.exception.IndusPersistException;

public class TestMovieDAO {

	private IMovieDAO movieDao = null;

	@Before
	public void setUp() throws Exception {
		ApplicationContext appContextObj = new ClassPathXmlApplicationContext("beans.xml");
		movieDao = (IMovieDAO) appContextObj.getBean("movieDaoObj");
		appContextObj = null;
	}

	@After
	public void tearDown() throws Exception {
		movieDao = null;
	}

	@Test
	public void testReadMovieByPK() {
		try {
			Movie movExpObj = new Movie();
			movExpObj.setMovieId(new Integer(1));
			movExpObj.setMovieName("Toy Story (1995)");
//			movExpObj.setReleaseDate(new Date());
			Movie movieActualObj = movieDao.readMovieByPK(new Integer(1));

			assertEquals(movExpObj.getMovieName(), movieActualObj.getMovieName());

		} catch (IndusPersistException e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testCreateMovie() {

		try {
			Movie movExpObj = new Movie();
			movExpObj.setMovieId(new Integer(2002));
			movExpObj.setMovieName("Robo 4.0");
			movExpObj.setReleaseDate(new Date(2018-10-10));
			movieDao.createMovie(movExpObj);
			
			Movie movieActualObj = movieDao.readMovieByPK(new Integer(1686));
			assertEquals(movExpObj, movieActualObj);
		} catch (IndusPersistException e) {
			fail(e.getMessage());
		}

		fail("Not yet implemented");
	}

	// @Test
	public void testUpdateMovie() {
		fail("Not yet implemented");
	}

	// @Test
	public void testDeleteMovie() {
		fail("Not yet implemented");
	}

}
