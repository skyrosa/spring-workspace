package com.pluralcamp.springbootdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("HelloWorld")
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/morning")
	public String goodMorning() {
		return "<h1>Good Morning!</h1>";
	}
	
	@GetMapping("/name")
	public String name(
			@RequestParam(value = "name", defaultValue = "World") String name,
			@RequestParam (value = "surname", defaultValue = "!!!") String surname) {
		return "Hello " + name + " " + surname;
	}
	
}
