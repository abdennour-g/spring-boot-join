package com.example.demo.servlet;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.PersonRepository;

@Controller
public class controller {
	@Autowired
	private PersonRepository persdao;
	@GetMapping("/")
public String home(Model m) {
		m.addAttribute("sinc", LocalTime.now());
		m.addAttribute("pers", persdao.findAll());
	return "home";
}
}
