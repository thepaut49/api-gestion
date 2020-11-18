package com.thepolo49.apigestion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity
public class InvoiceLine implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private InvoiceLineId invoiceLineId;
		
	@Column(length = 255)
	private String description;
	
	@Column
	private Double taxPercentage;
	
	@Column
	private Double amountExcludingTax;
	
	@Column
	private Double amountWithTax;
	
	@Column(length = 10)
	private String accountingAccount;
	
	@Version
	private int version;
	
	/*** getter / setter ***/

	public InvoiceLineId getInvoiceLineId() {
		return invoiceLineId;
	}

	public void setInvoiceLineId(InvoiceLineId invoiceLineId) {
		this.invoiceLineId = invoiceLineId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(Double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public Double getAmountExcludingTax() {
		return amountExcludingTax;
	}

	public void setAmountExcludingTax(Double amountExcludingTax) {
		this.amountExcludingTax = amountExcludingTax;
	}

	public Double getAmountWithTax() {
		return amountWithTax;
	}

	public void setAmountWithTax(Double amountWithTax) {
		this.amountWithTax = amountWithTax;
	}

	public String getAccountingAccount() {
		return accountingAccount;
	}

	public void setAccountingAccount(String accountingAccount) {
		this.accountingAccount = accountingAccount;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	/*** getter / setter ***/
	
	
	
	
	
	
	

}
