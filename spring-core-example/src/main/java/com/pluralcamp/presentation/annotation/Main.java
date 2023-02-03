package com.pluralcamp.presentation.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext();
		
		AnnotationConfigApplicationContext annotationContext = (AnnotationConfigApplicationContext)context;
		annotationContext.scan("com.pluralcamp.presentation.annotation");
		annotationContext.refresh();
		
		// Constructors DI with annotations
		
		HelloWorld helloWorld = (HelloWorld) annotationContext.getBean("helloWorld");
		System.out.println(helloWorld.getUuid());
		System.out.println(helloWorld.getHello());
		
		HelloWorld helloWorld2 = (HelloWorld) annotationContext.getBean("helloWorld");
		System.out.println(helloWorld2.getUuid());
		System.out.println(helloWorld2.getHello());
		
	}

}
