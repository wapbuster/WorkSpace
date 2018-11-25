package com.indus.training.orm.dao;

import com.indus.training.orm.domain.Country;
import com.indus.training.orm.exception.IndusPersistException;

public interface ICountryDAO {

	public Country readCountryByPk(String country_id) throws IndusPersistException;

	public boolean createCountry(Country countryObj) throws IndusPersistException;

	public boolean updateCountry(Country countryObj) throws IndusPersistException;

	public boolean deleteCountry(String country_id) throws IndusPersistException;
}
