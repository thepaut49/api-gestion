package com.thepolo49.apigestion.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true, length = 14)
	private String siret;
	
	@Column(length = 9)
	private String siren;

	@Column(nullable = false, length = 50)
	private String companyname;
	
	@Column(nullable = false)
	private String legalForm;
	
	@OneToMany(mappedBy = "associateId.company")
	private List<Associate> associates;
	
	@OneToOne
	@JoinColumn(name = "contact_information_id")
	private ContactInformation contactInformation;
	
	@Version
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
	
	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	/*** Constructeurs ***/
	public Company(String siren, String siret, String companyname, String legalForm, ContactInformation contactInformation,
			List<Associate> associates) {
		super();
		this.siren = siren;
		this.siret = siret;
		this.companyname = companyname;
		this.legalForm = legalForm;
		this.contactInformation = contactInformation;
		this.associates = associates;
	}
	
	

}
