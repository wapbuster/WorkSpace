package com.indus.training.orm.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.training.orm.dao.ICountryDAO;
import com.indus.training.orm.domain.Country;
import com.indus.training.orm.exception.IndusPersistException;

public class CountryDAOImpl implements ICountryDAO {

	private static SessionFactory countrySessionfactory;

	public static void setCountrySessionfactory(SessionFactory countrySessionfactory) {
		CountryDAOImpl.countrySessionfactory = countrySessionfactory;
	}

	public Country readCountryByPk(String country_id) throws IndusPersistException {

		Country countryObj = null;

		Session countrySessionObj = countrySessionfactory.openSession();
		Transaction transObj = null;
		try {
			transObj = countrySessionObj.beginTransaction();
			countryObj = countrySessionObj.find(Country.class, country_id);
			transObj.commit();
		} catch (Exception e) {
			transObj.rollback();
			throw new IndusPersistException("Exception Selecting Record from data base", e);
		} finally {
			countrySessionObj.close();
			transObj = null;
		}

		return countryObj;
	}

	public boolean createCountry(Country countryObj) throws IndusPersistException {
		Session countrySessionObj = countrySessionfactory.openSession();
		Transaction transObj = null;
		try {
			transObj = countrySessionObj.beginTransaction();
			countrySessionObj.save(countryObj);
			transObj.commit();
		} catch (Exception e) {
			transObj.rollback();
			throw new IndusPersistException("Exception creating Record to data base", e);
		} finally {
			countrySessionObj.close();
			transObj = null;
		}

		return true;
	}

	public boolean updateCountry(Country countryObj) throws IndusPersistException {
		Session countrySessionObj = countrySessionfactory.openSession();
		Transaction transObj = null;
		Country conUpObj = null;
		try {
			transObj = countrySessionObj.beginTransaction();
			conUpObj = countrySessionObj.get(Country.class, countryObj.getCountry_id());
			conUpObj.setCountry_name("PakistanNew");
			conUpObj.setRegion_id(5);

			countrySessionObj.save(conUpObj);
			transObj.commit();
		} catch (Exception e) {
			transObj.rollback();
			throw new IndusPersistException("Exception updating Record to data base", e);
		} finally {
			countrySessionObj.close();
			transObj = null;
		}
		return false;
	}

	public boolean deleteCountry(String country_id) throws IndusPersistException {
		Session countrySessionObj = countrySessionfactory.openSession();
		Transaction transObj = null;
		Country countryObj = null;
		try {
			transObj = countrySessionObj.beginTransaction();
			countryObj = countrySessionObj.find(Country.class, country_id);
			countrySessionObj.delete(countryObj);
			transObj.commit();
		} catch (Exception e) {
			transObj.rollback();
			throw new IndusPersistException("Exception deleting Record in data base", e);
		} finally {
			countrySessionObj.close();
			transObj = null;
		}
		return false;
	}

}
