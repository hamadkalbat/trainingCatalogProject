package com.e_shop.catalog_page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_shop.catalog_page.model.Stock;
import com.e_shop.catalog_page.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	private StockRepository stockRepository;
	
	public List<Stock> getAllStocks() {
		return stockRepository.findAll();
	}
	
	public Stock getStock(Long id) {
		return stockRepository.findById(id).orElse(null);
	}
	
	public Stock saveStock(Stock stock) {
		return stockRepository.save(stock);
	}
	
	public void deleteStock(Long id) {
		stockRepository.deleteById(id);
	}
}
