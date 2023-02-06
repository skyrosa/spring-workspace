package com.pluralcamp.aspects.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.pluralcamp.aspects.annotations");
		context.refresh();
	
		Purchase purchase = (Purchase) context.getBean(Shopping.class);
		
		System.out.println(purchase);
		
		try {
		purchase.buy(true);
		} catch(Exception e) {
			System.out.println("Error en la compra...");
		}
	}

}
