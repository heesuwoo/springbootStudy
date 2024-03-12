package com.example.testPj.service;

import com.example.testPj.data.dto.ProductDto;

// 호출하는 객체를 잡음
public interface ProductService {
	
	ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);

	ProductDto getProduct(String productId);
	
}
