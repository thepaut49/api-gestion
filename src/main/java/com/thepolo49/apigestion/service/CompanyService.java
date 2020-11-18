package com.thepolo49.apigestion.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.thepolo49.apigestion.exception.CustomException;
import com.thepolo49.apigestion.model.Company;
import com.thepolo49.apigestion.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;


	public Company createCompany(Company company) {
		if (!companyRepository.existsBySiretAndSiren(company.getSiret(), company.getSiren()) ) {
			company = companyRepository.save(company);
			return company;
		}
		else {
			throw new CustomException("Couple Siret/Siren déjà utilisé !", HttpStatus.UNPROCESSABLE_ENTITY);
		}
	}
	
	public Company updateCompany(Company company) {
		if (company != null) {
			company = companyRepository.save(company);
			return company;
		}
		else {
			throw new CustomException("Entreprise Invalide !", HttpStatus.UNPROCESSABLE_ENTITY);
		}
	}

	public void delete(Integer id) {
		companyRepository.deleteById(id);
	}

	public Company search(Integer id) {
		Optional<Company> company = companyRepository.findById(id);
		if (!company.isPresent()) {
			throw new CustomException("L'entreprise n'existe pas", HttpStatus.NOT_FOUND);
		}
		return company.get();
	}
	
	public List<Company> findAll() {
		return companyRepository.findAll();
	}
}
