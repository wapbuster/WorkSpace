package com.indus.training.controller;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indus.training.domain.Country;
import com.indus.training.exception.IndusException;
import com.indus.training.support.UserRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/country")
public class UserController implements IUserController {

	static Logger logger = Logger.getLogger(UserController.class);
	{
		DOMConfigurator.configure("log4j.xml");
	}
	@Autowired
	private UserRepository repository;

	@GetMapping
	public Iterable<Country> findAll() throws IndusException {
		List<Country> list = null;
		try {
			list = repository.findAll();
		} catch (Exception ex) {
			logger.error("Oops I did it again..!", ex);
			throw new IndusException("Exception", ex);

		}
		return list;

	}

	@GetMapping(path = "/{country_id}")
	public Optional<Country> find(@PathVariable("country_id") String country_id) throws IndusException {
		Optional<Country> list = null;
		try {
			list = repository.findById(country_id);
		} catch (Exception ex) {
			logger.error("Oops I did it again..!", ex);
			throw new IndusException("Exception ", ex);

		}
		return list;
	}

	@PostMapping(consumes = "application/json")
	public Country create(@RequestBody Country country) throws IndusException {
		Country con = null;
		try {
			con = repository.save(country);
		} catch (Exception ex) {
			logger.error("Oops I did it again..!", ex);
			throw new IndusException("Exception ", ex);

		}
		return con;
	}

	@DeleteMapping(path = "/{country_id}")
	public void delete(@PathVariable("country_id") String country_id) throws IndusException {
		try {
			repository.deleteById(country_id);
		} catch (Exception ex) {
			logger.error("Oops I did it again..!", ex);
			throw new IndusException("Exception ", ex);
		}
	}

	@PutMapping(path = "/{country_id}")
	public Country update(@PathVariable("country_id") String country_id, @RequestBody Country country)
			throws IndusException {
		try {
			if (repository.existsById(country_id)) {
				country.setCountry_id(country_id);
				return repository.save(country);
			} else {
				throw new BadHttpRequest();
			}
		} catch (Exception ex) {
			logger.error("Oops I did it again..!", ex);

			throw new IndusException("Exception ", ex);
		}
	}

}