package com.thepolo49.apigestion.dto;



public class AssociateDTO {
	
	private AssociateIdDTO associateId;
	
	private String associateType;
	
	private Double shares;
	
	private int version;
	
	/*** Getter / setter ***/
	public String getAssociateType() {
		return associateType;
	}

	public AssociateIdDTO getAssociateId() {
		return associateId;
	}

	public void setAssociateId(AssociateIdDTO associateId) {
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

}
