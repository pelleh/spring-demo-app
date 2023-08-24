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
	public ResponseEntity<List<Customer>> getCustomersByFirstNameEquals(@PathVariable String firstname) {
		return ResponseEntity.ok(customerRepository.findByFirstNameEquals(firstname));
	}

	@GetMapping("/lastnameeq/{lastname}")
	public ResponseEntity<List<Customer>> getCustomersByLastNameEquals(@PathVariable String lastname) {
		return ResponseEntity.ok(customerRepository.findByLastNameEquals(lastname));
	}

	@GetMapping("/firstname/{firstname}")
	public ResponseEntity<List<Customer>> getCustomersByFirstNameIgnoreCase(@PathVariable String firstname) {
		return ResponseEntity.ok(customerRepository.findByFirstNameIgnoreCase(firstname));
	}

	@GetMapping("/lastname/{lastname}")
	public ResponseEntity<List<Customer>> getCustomersByLastNameIgnoreCase(@PathVariable String lastname) {
		return ResponseEntity.ok(customerRepository.findByLastNameIgnoreCase(lastname));
	}

	@GetMapping("/zipcode/{zipcode}")
	public ResponseEntity<List<Customer>> getCustomerByZipCodeContains(@PathVariable int zipcode) {
		return ResponseEntity.ok(customerRepository.findByZipCodeBeginsWith(zipcode));
	}

	@GetMapping("/adress/{adress}")
	public ResponseEntity<List<Customer>> findCustomerByAdressLike(@PathVariable String adress) {
		return ResponseEntity.ok(customerRepository.findByAdressLike("%" + adress + "%"));
	}
}
