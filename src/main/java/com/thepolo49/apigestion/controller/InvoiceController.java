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

import com.thepolo49.apigestion.dto.CompanyDTO;
import com.thepolo49.apigestion.model.Company;
import com.thepolo49.apigestion.service.CompanyService;

@RestController
@RequestMapping("/companies/{companyId}/invoice")
public class InvoiceController {
  
  @Autowired
  private CompanyService companyService;

  @Autowired
  private ModelMapper modelMapper;

  @PostMapping("/create")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public CompanyDTO createCompany( @RequestBody CompanyDTO company) {
    return modelMapper.map(companyService.createCompany(modelMapper.map(company, Company.class)), CompanyDTO.class);
  }
  
  @PutMapping("/{id}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public CompanyDTO updateCompany( @RequestBody CompanyDTO company, @PathVariable Integer id) {
    return modelMapper.map(companyService.updateCompany(modelMapper.map(company, Company.class)), CompanyDTO.class);
  }


  @DeleteMapping(value = "/{id}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public String delete(@PathVariable Integer id) {
    companyService.delete(id);
    return "Entreprise supprimée !";
  }

  @GetMapping(value = "/{id}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public CompanyDTO search( @PathVariable Integer id) {
    return modelMapper.map(companyService.search(id), CompanyDTO.class);
  }

  @GetMapping("/all")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public List<Company> getAllCompanies() {
	  List<Company> companies = companyService.findAll();
	  return companies
			  .stream()
			  .map(company -> modelMapper.map(company, Company.class))
			  .collect(Collectors.toList());
  }

}
