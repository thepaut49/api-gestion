package com.thepolo49.apigestion.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thepolo49.apigestion.dto.CompanyDTO;
import com.thepolo49.apigestion.model.Company;
import com.thepolo49.apigestion.service.CompanyService;

@RestController
public class CompanyController {
  
  @Autowired
  private CompanyService companyService;

  @Autowired
  private ModelMapper modelMapper;

  @PostMapping("/companies")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public CompanyDTO createCompany( @RequestBody CompanyDTO company) {
    return modelMapper.map(companyService.createCompany(modelMapper.map(company, Company.class)), CompanyDTO.class);
  }
  
  @PutMapping("/companies/{id}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public CompanyDTO updateCompany( @RequestBody CompanyDTO company, @PathVariable Integer id) {
    return modelMapper.map(companyService.updateCompany(modelMapper.map(company, Company.class)), CompanyDTO.class);
  }


  @DeleteMapping(value = "/companies/{id}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public String delete(@PathVariable Integer id) {
    companyService.delete(id);
    return "Entreprise supprimée !";
  }

  @GetMapping(value = "/companies/{id}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public CompanyDTO search( @PathVariable Integer id) {
    return modelMapper.map(companyService.search(id), CompanyDTO.class);
  }


}
