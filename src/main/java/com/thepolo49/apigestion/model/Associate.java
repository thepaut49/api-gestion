package com.thepolo49.apigestion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity
public class Associate implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId 
	private AssociateId associateId;
	
	@Column(length = 20)
	private String associateType;
	
	@Column
	private Double shares;
	
	@Version
	private int version;
	
	/*** Getter / setter ***/
	public String getAssociateType() {
		return associateType;
	}

	public AssociateId getAssociateId() {
		return associateId;
	}

	public void setAssociateId(AssociateId associateId) {
		this.associateId = associateId;
	}

	public void setAssociateType(String associateType) {
		this.associateType = associateType;
	}

	public Double getShares() {
		return shares;
	}

	public void setShares(Double shares) {
		this.shares = shares;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


	/*** Constructeur ***/	
	public Associate() {
		super();
	}
	
	public Associate(AssociateId associateId, String associateType, Double shares) {
		super();
		this.associateId = associateId;
		this.associateType = associateType;
		this.shares = shares;
	}
	
	@Override
	public String toString() {
		return "Associé [ name=" + associateId.getPerson().getFamilyName() + ", entreprise = " + associateId.getCompany().getCompanyname() + ", version=" + version + "]";
	}
	
	

}
