package com.indus.training.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.domain.Movie;
import com.indus.training.exception.IndusPresitException;
import com.mysql.cj.exceptions.AssertionFailedException;

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
			movExpObj.setMovieName("");
//			movExpObj.setReleaseDate(new Date());
			Movie movieActualObj = movieDao.readMovieByPK(new Integer(1));

			assertEquals(movExpObj.getMovieId(), movieActualObj.getMovieId());

		} catch (IndusPresitException e) {
			fail(e.getMessage());
		}

	}

	// @Test
	public void testCreateMovie() {
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
