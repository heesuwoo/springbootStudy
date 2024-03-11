package com.example.testPj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testPj.dto.ProductDto;
import com.example.testPj.service.ProductService;

@RestController
@RequestMapping(value = "/api/v1/product-api")
public class ProductController {
	
	private ProductService productService;
	
	@Autowired	// 자동으로 new 객체를 생성하지 않아도 연결해주는 어노테이션
	public ProductController (ProductService productService) { this.productService = productService; }
	
	@GetMapping(value = "/product/{productId}")
	public ProductDto getProduct(@PathVariable String productId) {
		return productService.getProduct(productId);
	}
	
	@PostMapping(value = "/product")
	public ProductDto createProduct(@RequestBody ProductDto productDto) {
		
		String productId = productDto.getProductId();
		String productName = productDto.getProductName();
		int productPrice= productDto.getProductPrice();
		int productStock= productDto.getProductStock();
		
		return productService.saveProduct(productId, productName, productPrice, productStock);
	}
	
	@DeleteMapping(value = "/product/{productId}")
	public ProductDto deleteProduct(@PathVariable String productId) {
		return null;
	}
	
}
