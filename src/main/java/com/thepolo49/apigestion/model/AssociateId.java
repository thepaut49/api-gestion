package com.thepolo49.apigestion.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class AssociateId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
    @ManyToOne
    @JoinColumn(name = "company_id")
	private Company company;
	
	
	/*** Getter / setter ***/
    public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}
    


	/*** Constructeur ***/	
	public AssociateId() {
		super();
	}	

}
