package com.example.testPj.data.handler;

import com.example.testPj.data.entity.ProductEntity;

public interface ProductDataHandler {

	ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);
	
	ProductEntity getProductEntity(String productId);
}
