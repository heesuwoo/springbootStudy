package com.example.testPj.data.entity;

import com.example.testPj.data.dto.ProductDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="product")

// Entity = DB 테이블과 직접적으로 맵핑되는 클래스
public class ProductEntity {
	
	@Id	// primary key 값
	String productId;
	String productName;
	Integer productPrice;
	Integer productStock;
	
	public ProductDto toDto() {
		return ProductDto.builder()
				.productId(productId)
				.productName(productName)
				.productPrice(productPrice)
				.productStock(productStock)
				.build();
	}
}
