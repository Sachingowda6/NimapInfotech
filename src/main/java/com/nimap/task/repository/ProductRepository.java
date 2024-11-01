package com.nimap.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.task.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}