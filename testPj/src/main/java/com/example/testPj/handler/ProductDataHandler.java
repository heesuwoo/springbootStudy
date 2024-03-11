package com.example.testPj.handler;

import com.example.testPj.entity.ProductEntity;

public interface ProductDataHandler {

	ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);
	
	ProductEntity getProductEntity(String productId);
}
