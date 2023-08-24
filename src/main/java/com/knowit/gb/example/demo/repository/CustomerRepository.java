package com.knowit.gb.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knowit.gb.example.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByFirstNameEquals(String firstname);
	List<Customer> findByLastNameEquals(String lastname);
	List<Customer> findByFirstNameIgnoreCase(String firstname);
	List<Customer> findByLastNameIgnoreCase(String lastname);
	List<Customer> findByZipcode(int zipcode);
	List<Customer> findByAdressIgnoreCase(String adress);
}
