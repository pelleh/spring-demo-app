package com.knowit.gb.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowit.gb.example.demo.model.Product;
import com.knowit.gb.example.demo.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

	private final ProductRepository productRepository;

	public ProductController(ProductRepository productRepository) {
		this.productRepository =productRepository;
	}

	@GetMapping("/")
	public ResponseEntity<List<Product>> getAllProducts() {
		return ResponseEntity.ok(productRepository.findAll());
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<List<Product>> findProductByName(@PathVariable String name) {
		return ResponseEntity.ok(productRepository.findByNameIgnoreCaseContains(name));
	}

	@GetMapping("/desc/{desc}")
	public ResponseEntity<List<Product>> findProductByDesc(@PathVariable String desc) {
		return ResponseEntity.ok(productRepository.findByDescriptionIgnoreCaseContains(desc));
	}

	@GetMapping("/description/{desc}")
	public ResponseEntity<List<Product>> findProductByDescription(@PathVariable String desc) {
		return ResponseEntity.ok(productRepository.findByDescriptionIgnoreCaseContains(desc));
	}
}
