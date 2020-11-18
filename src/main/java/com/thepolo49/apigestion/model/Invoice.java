package com.thepolo49.apigestion.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@Entity
public class Invoice implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/*@Temporal(TemporalType.DATE)
	private LocalDate creationDate;
	
	@Temporal(TemporalType.DATE)
	private LocalDate dueDate;
	
	@Temporal(TemporalType.DATE)
	private LocalDate paymentDate;*/
	
	@ManyToOne
    @JoinColumn(name = "company_id")
	private Company company;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@OneToMany(mappedBy = "invoiceLineId.invoice")
	private List<InvoiceLine> invoiceLines;
	
	@Column
	private Double amountExcludingTax;
	
	@Column
	private Double amountWithTax;
	
	@Column(length = 10, nullable = false)
	// Expense or Revenue or Tax
	private String invoiceType;
	
	@Column
	private Boolean payed;
	
	@Column
	// devis
	private Boolean quote;
	
	@Column(length = 20)
	private String paymentMethod;
	
	@Version
	private int version;
	
	/*** getter / setter ***/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	/*public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}*/

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}	

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<InvoiceLine> getInvoiceLines() {
		return invoiceLines;
	}

	public void setInvoiceLines(List<InvoiceLine> invoiceLines) {
		this.invoiceLines = invoiceLines;
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

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Boolean getPayed() {
		return payed;
	}

	public void setPayed(Boolean payed) {
		this.payed = payed;
	}
		
	public Boolean getQuote() {
		return quote;
	}

	public void setQuote(Boolean quote) {
		this.quote = quote;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	/*** getter / setter ***/
		

}
