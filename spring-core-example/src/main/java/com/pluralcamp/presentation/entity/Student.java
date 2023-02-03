package com.pluralcamp.presentation.entity;

public class Student {

	private int id;
	private String name;
	private String surname;
	private String adress;
	
	public Student() {}
	
	public Student(int id, String name, String surname, String adress) {
		this.setId(id);
		this.setName(name);
		this.setSurname(surname);
		this.setAdress(adress);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	@Override
	
	public String toString() {
		String separator = " ";
		return new StringBuilder().append(Integer.toString(id))
				.append(separator)
				.append(name)
				.append(separator)
				.append(surname)
				.append(separator)
				.append(adress)
				.toString();
	}
	
	
}
