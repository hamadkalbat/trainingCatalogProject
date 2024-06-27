package com.e_shop.catalog_page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_shop.catalog_page.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
