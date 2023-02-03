package com.pluralcamp.presentation.annotation;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("helloWorld")
public class HelloWorld {

	@Autowired
	@Value("Hello World from properties")
	private String hello;
	private UUID uuid;
	
	public HelloWorld(String hello) {
		this();
		this.hello = hello;
	}

	public HelloWorld() {
		this.uuid = UUID.randomUUID();
	}

	// Getter & Setters
	
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	
}
