package com.e_shop.catalog_page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.e_shop.catalog_page.model.Stock;
import com.e_shop.catalog_page.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	private StockService stockService;
	
	@GetMapping
	public List<Stock> getStock() {
		return stockService.getAllStocks();
	}

	@GetMapping("/{id}")
	public Stock getStock(@PathVariable Long id) {
		return stockService.getStock(id);
	}

	@PostMapping
	public Stock createStock(@RequestBody Stock stock) {
		return stockService.saveStock(stock);
	}

	@PutMapping("/{id}")
	public Stock updateStock(@PathVariable Long id, @RequestBody Stock stock) {
		stock.setStockId(id);
		return stockService.saveStock(stock);
	}

	@DeleteMapping("/{id}")
	public void deleteStock(@PathVariable Long id) {
		stockService.deleteStock(id);
	}
	
}
