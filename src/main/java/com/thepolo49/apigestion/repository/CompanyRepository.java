package com.thepolo49.apigestion.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thepolo49.apigestion.model.Company;
import com.thepolo49.apigestion.model.User;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

  boolean existsBySiretAndSiren(String siret, String siren);

  User findBySiretAndSiren(String siret, String siren);

  @Transactional
  void deleteBySiretAndSiren(String siret, String siren);

}
