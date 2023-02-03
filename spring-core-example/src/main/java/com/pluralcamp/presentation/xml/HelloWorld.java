package com.pluralcamp.presentation.xml;

public class HelloWorld {

	private String message;
	
	public HelloWorld() {}
	
	private HelloWorld(String message) {
		this.message = message;
	}

//	Getter & Setters
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
