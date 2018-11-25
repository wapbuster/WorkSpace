package com.indus.training.orm.dao.impl;

import javax.persistence.EntityManager;

import com.indus.training.orm.dao.ICountryDAO;
import com.indus.training.orm.domain.Country;
import com.indus.training.orm.exception.IndusException;

public class CountryDAO implements ICountryDAO {

	private EntityManager entityMgr;

	public void setEntityMgr(EntityManager entityMgr) {
		this.entityMgr = entityMgr;
	}

	public Country readCountryByPk(String country_id) throws IndusException {

		Country countryObj = null;

		try {
			entityMgr.getTransaction().begin();
			countryObj = entityMgr.find(Country.class, country_id);
			entityMgr.getTransaction().commit();
		} catch (Exception e) {
			throw new IndusException("Exception Selecting Record from data base", e);
		} finally {
			entityMgr.clear();
		}
		return countryObj;
	}

	public boolean createCountry(Country countryObj) throws IndusException {

		try {
			entityMgr.getTransaction().begin();
			entityMgr.persist(countryObj);
			entityMgr.getTransaction().commit();
		} catch (Exception e) {
			throw new IndusException("Exception creating Record to data base", e);
		} finally {
			entityMgr.clear();
		}

		return true;
	}

	public boolean updateCountry(Country countryObj) throws IndusException {

		Country conUpObj = null;
		try {
			entityMgr.getTransaction().begin();
			conUpObj = entityMgr.find(Country.class, countryObj.getCountry_id());
			conUpObj.setCountry_name("PakistanNew");
			conUpObj.setRegion_id(5);

			entityMgr.persist(conUpObj);
			entityMgr.getTransaction().commit();
		} catch (Exception e) {
			throw new IndusException("Exception updating Record to data base", e);
		} finally {
			entityMgr.clear();
		}
		return false;
	}

	public boolean deleteCountry(String country_id) throws IndusException {

		Country countryObj = null;
		try {
			entityMgr.getTransaction().begin();
			countryObj = entityMgr.find(Country.class, country_id);
			entityMgr.remove(countryObj);
			entityMgr.getTransaction().commit();
		} catch (Exception e) {
			throw new IndusException("Exception deleting Record in data base", e);
		} finally {
			entityMgr.clear();
		}
		return false;
	}

}
