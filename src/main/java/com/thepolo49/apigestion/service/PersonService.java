package com.thepolo49.apigestion.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.thepolo49.apigestion.exception.CustomException;
import com.thepolo49.apigestion.model.Person;
import com.thepolo49.apigestion.dao.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;


	public Person createPerson(Person person) {
		if (!personRepository.existsByFirstNameAndFamilyNameAndEmail(person.getFirstName(), person.getFamilyName(), person.getEmail()) ) {
			person = personRepository.save(person);
			return person;
		}
		else {
			throw new CustomException("Cette personne existe déjà !", HttpStatus.UNPROCESSABLE_ENTITY);
		}
	}
	
	public Person updatePerson(Person person) {
		if (person != null) {
			person = personRepository.save(person);
			return person;
		}
		else {
			throw new CustomException("Personne Invalide !", HttpStatus.UNPROCESSABLE_ENTITY);
		}
	}

	public void delete(Integer id) {
		personRepository.deleteById(id);
	}

	public Person search(Integer id) {
		Optional<Person> person = personRepository.findById(id);
		if (!person.isPresent()) {
			throw new CustomException("Cette personne n'existe pas !", HttpStatus.NOT_FOUND);
		}
		return person.get();
	}
}
