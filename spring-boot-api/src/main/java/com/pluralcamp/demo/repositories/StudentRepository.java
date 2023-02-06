package com.pluralcamp.demo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pluralcamp.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student>findByName(String name);

	public List<Student> findByNameAndSurname (String name, String surname);
	
	@Query("SELECT s FROM Student WHERE s age = :age")
	public List<Student> findByAge(int age);
	
}
