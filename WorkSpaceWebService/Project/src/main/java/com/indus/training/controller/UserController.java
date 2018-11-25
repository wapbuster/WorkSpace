package com.indus.training.controller;

import java.util.Optional;

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

	@Autowired
	private UserRepository repository;

	@GetMapping
	public Iterable<Country> findAll() throws IndusException {
		return repository.findAll();
	}

	@GetMapping(path = "/{country_id}")
	public Optional<Country> find(@PathVariable("country_id") String country_id) throws IndusException {
		return repository.findById(country_id);
	}

	@PostMapping(consumes = "application/json")
	public Country create(@RequestBody Country country) throws IndusException {
		return repository.save(country);
	}

	@DeleteMapping(path = "/{country_id}")
	public void delete(@PathVariable("country_id") String country_id) throws IndusException {
		repository.deleteById(country_id);
	}

	@PutMapping(path = "/{country_id}")
	public Country update(@PathVariable("country_id") String country_id, @RequestBody Country country)
			throws BadHttpRequest, IndusException {
		if (repository.existsById(country_id)) {
			country.setCountry_id(country_id);
			return repository.save(country);
		} else {
			throw new BadHttpRequest();
		}
	}

}