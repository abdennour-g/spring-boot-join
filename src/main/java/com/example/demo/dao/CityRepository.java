package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.ent.City;
@RestResource
@CrossOrigin("*")
public interface CityRepository extends JpaRepository<City, Long>{

}
