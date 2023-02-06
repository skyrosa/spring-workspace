package com.pluralcamp.aspects.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext(
						"spring-config-xml");
		
		Shopping purchase = (Shopping)ctx.getBean("purchase");
		System.out.println(purchase);
		try {
			purchase.buy(true);
		} catch (Exception e) {
			System.err.println("Purchase error. Try again later...");
		}
		
	}

}
