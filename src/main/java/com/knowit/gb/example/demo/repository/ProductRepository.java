package com.knowit.gb.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knowit.gb.example.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByNameIgnoreCaseContains(String name);
	List<Product> findByDescriptionIgnoreCaseContains(String description);

}
