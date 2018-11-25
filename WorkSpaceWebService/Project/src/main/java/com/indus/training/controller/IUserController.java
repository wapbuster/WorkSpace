package com.indus.training.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.indus.training.domain.Country;
import com.indus.training.exception.IndusException;

import javassist.tools.web.BadHttpRequest;

public interface IUserController {

	public Iterable<Country> findAll() throws IndusException;

	public Optional<Country> find(@PathVariable("country_id") String country_id) throws IndusException;

	public Country create(@RequestBody Country country) throws IndusException;

	public void delete(@PathVariable("country_id") String country_id) throws IndusException;

	public Country update(@PathVariable("country_id") String country_id, @RequestBody Country country)
			throws BadHttpRequest, IndusException;

}
