package com.knowit.gb.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	@Column(name="firstname", columnDefinition="VARCHAR(50) NOT NULL")
	private String firstName;
	@Column(name="lastname", columnDefinition="VARCHAR(75) NOT NULL")
	private String lastName;
	@Column(name="adress", columnDefinition="VARCHAR(100) NOT NULL")
	private String adress;
	@Column(name="zipcode", columnDefinition="VARCHAR(5) NOT NULL")
	private String zipCode;
	@Column(name="country", columnDefinition="VARCHAR(50) NOT NULL default 'Sweden'")
	private String country;

	public Customer() {
		//
	}

	public Customer(Long id, String firstName, String lastName, String adress, String zipCode, String country) {
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
