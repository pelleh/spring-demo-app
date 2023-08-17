package com.knowit.gb.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knowit.gb.example.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByFirstName(String firstname);
	List<Customer> findByLastName(String lastname);
	List<Customer> findByFirstNameLike(String firstname);
	List<Customer> findByLastNameLike(String lastname);
}
