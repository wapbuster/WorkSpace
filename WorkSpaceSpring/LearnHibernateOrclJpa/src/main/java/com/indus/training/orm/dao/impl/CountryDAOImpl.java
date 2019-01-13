package com.indus.training.orm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.indus.training.orm.dao.ICountryDAO;
import com.indus.training.orm.domain.Country;
import com.indus.training.orm.exception.IndusException;

public class CountryDAOImpl implements ICountryDAO {

	private static EntityManager em;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CountryPU");

	{
		em = emf.createEntityManager();
	}

	public Country readCountryByPk(String country_id) throws IndusException {

		Country countryObj = null;
		EntityTransaction tranx = em.getTransaction();

		try {
			tranx.begin();
			countryObj = em.find(Country.class, country_id);
			tranx.commit();
		} catch (Exception e) {
			throw new IndusException("Exception Selecting Record from data base", e);
		} finally {
			//tranx.rollback();
			em.clear();
		}
		return countryObj;
	}

	public boolean createCountry(Country countryObj) throws IndusException {

		try {
			em.getTransaction().begin();
			em.persist(countryObj);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new IndusException("Exception creating Record to data base", e);
		} finally {
			em.clear();
		}

		return true;
	}

	public boolean updateCountry(Country countryObj) throws IndusException {

		Country conUpObj = null;
		try {
			em.getTransaction().begin();
			conUpObj = em.find(Country.class, countryObj.getCountry_id());
			conUpObj.setCountry_name("PakistanNew");
			conUpObj.setRegion_id(5);

			em.persist(conUpObj);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new IndusException("Exception updating Record to data base", e);
		} finally {
			em.clear();
		}
		return false;
	}

	public boolean deleteCountry(String country_id) throws IndusException {

		Country countryObj = null;
		try {
			em.getTransaction().begin();
			countryObj = em.find(Country.class, country_id);
			em.remove(countryObj);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new IndusException("Exception deleting Record in data base", e);
		} finally {
			em.clear();
		}
		return false;
	}

}
