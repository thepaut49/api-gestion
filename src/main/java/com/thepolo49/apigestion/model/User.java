package com.thepolo49.apigestion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  
  @Column(nullable = false, unique = true, length = 50)
  private String publicId;

  @Column(nullable = false, length = 50)
  private String name;

  @Column(nullable = false, unique = true, length = 50)
  private String email;
  
  @Column(nullable = false)
  private Boolean admin;
  
  @Column(nullable = false, length = 100)
  private String password;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

public String getPublicId() {
	return publicId;
}

public void setPublicId(String publicId) {
	this.publicId = publicId;
}

public Boolean getAdmin() {
	return admin;
}

public void setAdmin(Boolean admin) {
	this.admin = admin;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
  
  
}