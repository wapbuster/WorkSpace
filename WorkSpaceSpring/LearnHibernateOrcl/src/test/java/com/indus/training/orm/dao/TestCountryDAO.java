package com.indus.training.orm.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.orm.domain.Country;
import com.indus.training.orm.exception.IndusPersistException;

public class TestCountryDAO {

	private ICountryDAO countryDao = null;

	@Before
	public void setUp() throws Exception {
		ApplicationContext appContextObj = new ClassPathXmlApplicationContext("beans.xml");
		countryDao = (ICountryDAO) appContextObj.getBean("countryDaoObj");
		appContextObj = null;
	}

	@After
	public void tearDown() throws Exception {
		countryDao = null;
	}

	@Test
	public void testReadCountryByPk() {

		try {
			Country conExpObj = new Country();
			conExpObj.setCountry_id("IN");
			conExpObj.setCountry_name("India");
			conExpObj.setRegion_id(3);

			Country conActObj = countryDao.readCountryByPk("IN");

			assertEquals(conExpObj, conActObj);
		} catch (IndusPersistException e) {
			fail(e.getMessage());
		}
	}

}
