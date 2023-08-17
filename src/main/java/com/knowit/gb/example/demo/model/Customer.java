package com.knowit.gb.example.demo.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	@Column(nullable = false)
	private Long id;
	@Basic(optional = false)
	@Column(nullable = false)
	private String firstName;
	@Basic(optional = false)
	@Column(nullable = false)
	private String lastName;
	@Basic(optional = false)
	@Column(nullable = false)
	private String adress;
	@Basic(optional = false)
	@Column(nullable = false)
	private int zipCode;
	@Basic(optional = false)
	@Column(nullable = false)
	private String country;

	public Customer() {
		//
	}

	public Customer(Long id, String firstName, String lastName, String adress, int zipCode, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.zipCode = zipCode;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
