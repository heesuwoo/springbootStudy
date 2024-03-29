package com.example.testPj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// @RequestMapping(value="/hello", method = RequestMethod.GET)
	@GetMapping("getHello")
	public String getHello() {
		return "Hello getHello!";
	}
	
	@PostMapping("postHello")
	public String postHello() {
		return "Hello postHello!";
	}
	
	
	
}
