package com.example.testPj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testPj.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
	
}
