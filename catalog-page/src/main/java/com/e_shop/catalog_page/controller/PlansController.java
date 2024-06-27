package com.e_shop.catalog_page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.e_shop.catalog_page.model.Plans;
import com.e_shop.catalog_page.service.PlansService;


@RestController
@RequestMapping("/plans")
public class PlansController {

	@Autowired
	private PlansService plansService;
	
	@GetMapping
	public List<Plans> getAllPlans() {
		return plansService.getAllPlans();
	}

	@GetMapping("/{id}")
	public Plans getPlans(@PathVariable Long id) {
		return plansService.getPlans(id);
	}

	@PostMapping
	public Plans createPlans(@RequestBody Plans plans) {
		return plansService.savePlans(plans);
	}

	@PutMapping("/{id}")
	public Plans updatePlans(@PathVariable Long id, @RequestBody Plans plans) {
		plans.setPlansId(id);
		return plansService.savePlans(plans);
	}

	@DeleteMapping("/plans/{id}")
	public void deletePlans(@PathVariable Long id) {
		plansService.deletePlans(id);
	}
	
}
