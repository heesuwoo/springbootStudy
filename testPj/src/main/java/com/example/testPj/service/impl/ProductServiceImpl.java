package com.example.testPj.service.impl;

import org.springframework.stereotype.Service;

import com.example.testPj.dto.ProductDto;
import com.example.testPj.entity.ProductEntity;
import com.example.testPj.handler.ProductDataHandler;
import com.example.testPj.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	ProductDataHandler productDataHandler;
	
	public ProductServiceImpl(ProductDataHandler productDataHandler) {
		this.productDataHandler = productDataHandler;
	}
	
	@Override
	public ProductDto saveProduct(String productId, String productName, int productPrice, int productStock) {
		
		ProductEntity productEntity = productDataHandler.saveProductEntity(productId, productName, productPrice, productStock);
		
		ProductDto productDto = new ProductDto(productEntity.getProductId(), productEntity.getProductName(), productEntity.getProductPrice(), productEntity.getProductStock());
		
		return productDto;
	}

	@Override
	public ProductDto getProduct(String productId) {
		
		ProductEntity productEntity = productDataHandler.getProductEntity(productId);
		
		ProductDto productDto = new ProductDto(productEntity.getProductId(), productEntity.getProductName(), productEntity.getProductPrice(), productEntity.getProductStock());
		
		return productDto;
	}
	
};