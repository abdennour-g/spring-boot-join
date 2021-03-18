package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PersonRepository;
import com.example.demo.ent.Person;

@RestController
public class Join {
	@Autowired
	private PersonRepository perserv;
	@GetMapping("/pers")
	public List<Person> pers(){
		return perserv.findAll();
		//http://localhost:1500/pers
	}
	
}
