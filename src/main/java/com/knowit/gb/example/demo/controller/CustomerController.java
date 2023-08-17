package com.knowit.gb.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowit.gb.example.demo.model.Customer;
import com.knowit.gb.example.demo.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	private final CustomerRepository customerRepository;

	public CustomerController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@GetMapping("/")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		return ResponseEntity.ok(customerRepository.findAll());
	}

	@GetMapping("/firstnameeq/{firstname}")
	public ResponseEntity<List<Customer>> getCustomersByFirstName(@PathVariable String firstname) {
		return ResponseEntity.ok(customerRepository.findByFirstName(firstname));
	}

	@GetMapping("/lastnameeq/{lastname}")
	public ResponseEntity<List<Customer>> getCustomersByLastName(@PathVariable String lastname) {
		return ResponseEntity.ok(customerRepository.findByLastName(lastname));
	}

	@GetMapping("/firstname/{firstname}")
	public ResponseEntity<List<Customer>> getCustomersByFirstNameLike(@PathVariable String firstname) {
		return ResponseEntity.ok(customerRepository.findByFirstNameIgnoreCase(firstname));
	}

	@GetMapping("/lastname/{lastname}")
	public ResponseEntity<List<Customer>> getCustomersByLastNameLike(@PathVariable String lastname) {
		return ResponseEntity.ok(customerRepository.findByLastNameIgnoreCase(lastname));
	}
}
