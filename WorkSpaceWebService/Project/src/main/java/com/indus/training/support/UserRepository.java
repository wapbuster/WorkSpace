package com.indus.training.support;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.indus.training.domain.Country;;

@RestResource(exported = false)
public interface UserRepository extends JpaRepository<Country, String> {

}