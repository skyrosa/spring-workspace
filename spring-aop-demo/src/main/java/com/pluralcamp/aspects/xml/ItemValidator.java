package com.pluralcamp.aspects.xml;

public class ItemValidator {

	//Before
	public void checkAmount() {
		System.out.println("Comprobando que la cantidad de " + "producto sea correcta..."); 
	}
	
	//After
	public void pack() {
		System.out.println("Se empaquetan los productos");
	}
	
	//When Exception is thrown
	public void fileComplain() {
		System.out.println("Queja presentada por productos " + "defectuosos");
	}
	
}
