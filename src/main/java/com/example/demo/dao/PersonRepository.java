package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.ent.Person;
@RepositoryRestResource
@CrossOrigin("*")
public interface PersonRepository extends JpaRepository<Person, Long>{
	}
//http://localhost:1500/persons