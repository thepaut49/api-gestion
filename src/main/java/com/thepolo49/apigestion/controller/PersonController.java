package com.thepolo49.apigestion.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thepolo49.apigestion.dto.PersonDataDTO;
import com.thepolo49.apigestion.model.Person;
import com.thepolo49.apigestion.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
  
  @Autowired
  private PersonService personService;

  @Autowired
  private ModelMapper modelMapper;

  @PostMapping("/create")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public PersonDataDTO createPerson( @RequestBody PersonDataDTO person) {
    return modelMapper.map(personService.createPerson(modelMapper.map(person, Person.class)), PersonDataDTO.class);
  }
  
  @PutMapping("/{id}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public PersonDataDTO updatePerson( @RequestBody PersonDataDTO person, @PathVariable Integer personId) {
    return modelMapper.map(personService.updatePerson(modelMapper.map(person, Person.class)), PersonDataDTO.class);
  }


  @DeleteMapping(value = "/{id}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public String delete(@PathVariable Integer id) {
    personService.delete(id);
    return "Entreprise supprimée !";
  }

  @GetMapping(value = "/{id}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public PersonDataDTO search( @PathVariable Integer id) {
    return modelMapper.map(personService.search(id), PersonDataDTO.class);
  }
  
  @GetMapping("/all")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public List<Person> getAllPersons() {
	  List<Person> persons = personService.findAll();
	  return persons
			  .stream()
			  .map(person -> modelMapper.map(person, Person.class))
			  .collect(Collectors.toList());
  }


}
