package com.thepolo49.apigestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thepolo49.apigestion.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

  boolean existsByFirstNameAndFamilyNameAndEmail(String firstName, String familyName, String email);

}
