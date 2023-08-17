package com.knowit.gb.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knowit.gb.example.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
