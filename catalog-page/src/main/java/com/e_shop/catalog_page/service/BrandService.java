package com.e_shop.catalog_page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_shop.catalog_page.model.Brand;
import com.e_shop.catalog_page.repository.BrandRepository;

@Service
public class BrandService {

	@Autowired
	private BrandRepository brandRepository;
	
	public List<Brand> getAllBrands() {
		return brandRepository.findAll();
	}
	
	public Brand getBrand(Long id) {
		return brandRepository.findById(id).orElse(null);
	}
	
	public Brand saveBrand(Brand brand) {
		return brandRepository.save(brand);
	}
	
	public void deleteBrand(Long id) {
		brandRepository.deleteById(id);
	}
}
