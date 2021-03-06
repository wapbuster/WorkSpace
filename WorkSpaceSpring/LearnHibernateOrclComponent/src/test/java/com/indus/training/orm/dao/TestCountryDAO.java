package com.indus.training.orm.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.orm.domain.Country;
import com.indus.training.orm.domain.CountryDetails;
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
			CountryDetails conObj = new CountryDetails();
			conObj.setCountry_population(90);
			conObj.setCountry_religion("Hindu");
			conObj.setCountry_sport("Cricket");
			conExpObj.setCountryDetails(conObj);

			Country conActObj = countryDao.readCountryByPk("IN");

			assertEquals(conObj.getCountry_sport(), conActObj.getCountryDetails().getCountry_sport());
		} catch (IndusPersistException e) {
			fail(e.getMessage());
		}
	}
	
	//@Test
	public void testCreateCountry() {

		try {
			Country conExpObj = new Country();
			conExpObj.setCountry_id("PK");
			conExpObj.setCountry_name("Pakistan");
			conExpObj.setRegion_id(5);
			CountryDetails conObj = new CountryDetails();
			conObj.setCountry_population(70);
			conObj.setCountry_religion("Muslim");
			conObj.setCountry_sport("Cricket");
			conExpObj.setCountryDetails(conObj);
			countryDao.createCountry(conExpObj);

			Country conActObj = countryDao.readCountryByPk("PK");

			assertEquals(conExpObj, conActObj);
		} catch (IndusPersistException e) {
			fail(e.getMessage());
		}
	}
	
	//@Test
	public void testUpdateCountry() {

		try {
			Country conExpObj = new Country();
			conExpObj.setCountry_id("PK");
			conExpObj.setCountry_name("PakistanNew");
			conExpObj.setRegion_id(5);
			countryDao.updateCountry(conExpObj);

			Country conActObj = countryDao.readCountryByPk("PK");

			assertEquals(conExpObj, conActObj);
		} catch (IndusPersistException e) {
			fail(e.getMessage());
		}
	}
	
	//@Test
	public void testDeleteCountry() {

		try {
			String country = "PK";
			countryDao.deleteCountry(country);
			Country conExpObj = new Country();
			conExpObj= countryDao.readCountryByPk(country);
			
			
			Country conActObj = countryDao.readCountryByPk(country);

			assertEquals(conExpObj, conActObj);
		} catch (IndusPersistException e) {
			fail(e.getMessage());
		}
	}


}
