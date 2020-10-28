package com.thepolo49.apigestion.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	@Column(length = 50)
	private String addressLine1;
	
	@Column(length = 50)
	private String addressLine2;
	
	@Column(length = 50)
	private String addressLine3;
	
	@Column(length = 50)
	private String addressLine4;
	
	@Column(length = 50)
	private String email;
	
	@Column(length = 10)
	private String phone;
	
	@OneToMany(mappedBy = "associateId.company")
	private List<Associate> associates;
	
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

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/*** Constructeurs ***/
	public Company(String siren, String siret, String companyname, String legalForm, String addressLine1, String addressLine2, String addressLine3, String addressLine4, String email, String phone,
			List<Associate> associates) {
		super();
		this.siren = siren;
		this.siret = siret;
		this.companyname = companyname;
		this.legalForm = legalForm;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.addressLine4 = addressLine4;
		this.email = email;
		this.phone = phone; 
		this.associates = associates;
	}
	
	

}
