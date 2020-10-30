package com.thepolo49.apigestion.dto;

import java.io.Serializable;

public class PersonDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String familyName;
	
	private String firstName;
	
	private ContactInformationDataDTO contactInformation;
	
	private int version;
	
	/*** getter / setter ***/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public ContactInformationDataDTO getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformationDataDTO contactInformation) {
		this.contactInformation = contactInformation;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	/*** override methods ***/
	
	
	

}
