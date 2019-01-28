package com.indus.training.orm.dao;

import com.indus.training.orm.domain.Country;
import com.indus.training.orm.exception.IndusException;

public interface ICountryDAO {

	public Country readCountryByPk(String country_id) throws IndusException;

	public boolean createCountry(Country countryObj) throws IndusException;

	public boolean updateCountry(Country countryObj) throws IndusException;

	public boolean deleteCountry(String country_id) throws IndusException;
}
