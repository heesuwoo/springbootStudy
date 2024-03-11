package com.example.testPj.dao;

import com.example.testPj.entity.ProductEntity;

public interface ProductDAO {
	
	ProductEntity saveProduct(ProductEntity productEntity);
	ProductEntity getProduct(String productId);
	
}
