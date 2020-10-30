package com.thepolo49.apigestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.thepolo49.apigestion.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

  @Query("SELECT CASE WHEN COUNT(p)> 0 THEN true ELSE false END FROM Person p WHERE lower(p.firstName) like lower(:firstName) AND lower(p.familyName) like lower(:familyName) AND p.contactInformation.email = :email")
  boolean existsByFirstNameAndFamilyNameAndEmail(@Param("firstName") String firstName,@Param("familyName") String familyName,@Param("email") String email);

}
