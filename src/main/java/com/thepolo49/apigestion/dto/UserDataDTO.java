package com.thepolo49.apigestion.dto;

import java.util.List;

import com.thepolo49.apigestion.model.Company;
import com.thepolo49.apigestion.model.Role;

public class UserDataDTO {
 
	private Integer id;

	private String username;

	private String email;

	private String password;

	List<Role> roles;
	
    List<Company> companies;
	
	private int version;
	
	/*** getter/setter ***/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

		
}
