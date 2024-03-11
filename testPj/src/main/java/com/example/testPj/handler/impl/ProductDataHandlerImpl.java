package com.example.testPj.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.testPj.dao.ProductDAO;
import com.example.testPj.entity.ProductEntity;
import com.example.testPj.handler.ProductDataHandler;

@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler{
	
	ProductDAO productDAO;
	
	@Autowired
	public ProductDataHandlerImpl(ProductDAO productDAO) { this.productDAO = productDAO; }
	
	@Override
	public ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock) {
		
//		ProductEntity productEntity = new ProductEntity(productId, productName, productPrice, productStock);
		ProductEntity productEntity = new ProductEntity();
		
		return productDAO.saveProduct(productEntity);
	}
	
	@Override
	public ProductEntity getProductEntity(String productId) {
		return productDAO.getProduct(productId);
	}
}
