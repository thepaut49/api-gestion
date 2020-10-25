package com.thepolo49.apigestion.dto;


public class AssociateIdDTO {
	
	private PersonDataDTO person;
	
	private CompanyDTO company;
	
	
	/*** Getter / setter ***/
    public PersonDataDTO getPerson() {
		return person;
	}


	public void setPerson(PersonDataDTO person) {
		this.person = person;
	}


	public CompanyDTO getCompany() {
		return company;
	}


	public void setCompany(CompanyDTO company) {
		this.company = company;
	}
    


	/*** Constructeur ***/	
	public AssociateIdDTO() {
		super();
	}	

}
