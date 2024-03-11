package com.example.testPj.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testPj.dao.ProductDAO;
import com.example.testPj.entity.ProductEntity;
import com.example.testPj.repository.ProductRepository;


@Service
public class ProductDAOImpl implements ProductDAO {
	
	ProductRepository productRepository;
	
	@Autowired
	public ProductDAOImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) {
		productRepository.save(productEntity);
		return productEntity;
	}
	
	@Override
	public ProductEntity getProduct(String productId) {
		ProductEntity productEntity = productRepository.getById(productId);
		return productEntity;
	}
	
}
