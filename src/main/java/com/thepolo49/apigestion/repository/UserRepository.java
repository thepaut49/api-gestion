package com.thepolo49.apigestion.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thepolo49.apigestion.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

  boolean existsByUsername(String username);

  User findByUsername(String username);
  
  User findByEmail(String email);

  @Transactional
  void deleteByUsername(String username);

}
