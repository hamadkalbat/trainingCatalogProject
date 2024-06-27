package com.e_shop.catalog_page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.e_shop.catalog_page.model.Brand;
import com.e_shop.catalog_page.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	private BrandService brandService;

	@GetMapping
	public List<Brand> getAllBrands() {
		return brandService.getAllBrands();
	}

	@GetMapping("/{id}")
	public Brand getBrand(@PathVariable Long id) {
		return brandService.getBrand(id);
	}

	@PostMapping
	public Brand createBrand(@RequestBody Brand brand) {
		return brandService.saveBrand(brand);
	}

	@PutMapping("/{id}")
	public Brand updateBrand(@PathVariable Long id, @RequestBody Brand brand) {
		brand.setBrandId(id);
		return brandService.saveBrand(brand);
	}

	@DeleteMapping("/{id}")
	public void deleteBrand(@PathVariable Long id) {
		brandService.deleteBrand(id);
	}
}
