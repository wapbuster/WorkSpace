package com.indus.training.orm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

public class CountryDetails implements Serializable {

	private static final long serialVersionUID = 7976972233774991541L;

	private Integer country_population;

	private String country_sport;

	private String country_religion;

	
	
	public CountryDetails() {
		super();
	}

	public Integer getCountry_population() {
		return country_population;
	}

	public void setCountry_population(Integer country_population) {
		this.country_population = country_population;
	}

	public String getCountry_sport() {
		return country_sport;
	}

	public void setCountry_sport(String country_sport) {
		this.country_sport = country_sport;
	}

	public String getCountry_religion() {
		return country_religion;
	}

	public void setCountry_religion(String country_religion) {
		this.country_religion = country_religion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country_population == null) ? 0 : country_population.hashCode());
		result = prime * result + ((country_religion == null) ? 0 : country_religion.hashCode());
		result = prime * result + ((country_sport == null) ? 0 : country_sport.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDetails other = (CountryDetails) obj;
		if (country_population == null) {
			if (other.country_population != null)
				return false;
		} else if (!country_population.equals(other.country_population))
			return false;
		if (country_religion == null) {
			if (other.country_religion != null)
				return false;
		} else if (!country_religion.equals(other.country_religion))
			return false;
		if (country_sport == null) {
			if (other.country_sport != null)
				return false;
		} else if (!country_sport.equals(other.country_sport))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CountryDetails [country_population=" + country_population + ", country_sport=" + country_sport
				+ ", country_religion=" + country_religion + "]";
	}

	
}
