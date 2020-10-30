package com.thepolo49.apigestion.dto;

import java.util.List;

import com.thepolo49.apigestion.model.Associate;

public class CompanyDTO {

	private Integer id;
	
	private String siret;
	
	private String siren;

	private String companyname;
	
	private String legalForm;

	private ContactInformationDataDTO contactInformation;
	
	private List<Associate> associates;
	
	private int version;
	
	/*** Getter / Setter ***/

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getLegalForm() {
		return legalForm;
	}

	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}	

	public ContactInformationDataDTO getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformationDataDTO contactInformation) {
		this.contactInformation = contactInformation;
	}

	public List<Associate> getAssociates() {
		return associates;
	}

	public void setAssociates(List<Associate> associate) {
		this.associates = associate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


}
