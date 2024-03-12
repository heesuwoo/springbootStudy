package com.example.testPj.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testPj.data.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
	
}
