package com.example.testPj.data.dao;

import com.example.testPj.data.entity.ProductEntity;

public interface ProductDAO {
	
	ProductEntity saveProduct(ProductEntity productEntity);
	ProductEntity getProduct(String productId);
	
}
