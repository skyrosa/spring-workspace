package com.pluralcamp.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {

	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		// Introspección
		Class<?> helloWorldClass =
				Class.forName("com.pluralcamp.reflection.HelloWorld");
		System.out.println(helloWorldClass);
		
		// Array de constructores
		Constructor[] constructors = helloWorldClass.getConstructors();
		System.out.printf("La clase %s tiene %d constructor(es) %n",
				helloWorldClass, constructors.length);
		
		// Apply newInstance methods
		Object helloWorld = constructors[0].newInstance();
		System.out.println(helloWorld);
		
		Class[] noparams = {};
		Method method1 =
				helloWorldClass.getDeclaredMethod("sayHello", noparams);
		method1.invoke(helloWorld, null);
		
		Method method2 =
				helloWorldClass.getDeclaredMethod("sayHello", String.class);
		method2.invoke(helloWorld, "Scarlet"); // o sino new String("nombre"), dá igual
		
		
	}

}
