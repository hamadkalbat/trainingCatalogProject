package com.e_shop.catalog_page.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stockId;
	private Long inStock;
		
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long id) {
		this.stockId = id;
	}
	public Long getInStock() {
		return inStock;
	}
	public void setInStock(Long inStock) {
		this.inStock = inStock;
	}	
}
