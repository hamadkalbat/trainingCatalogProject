package com.e_shop.catalog_page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_shop.catalog_page.model.Plans;
import com.e_shop.catalog_page.repository.PlansRepository;

@Service
public class PlansService {

	@Autowired
	private PlansRepository plansRepository;
	
	public List<Plans> getAllPlans() {
		return plansRepository.findAll();
	}
	
	public Plans getPlans(Long id) {
		return plansRepository.findById(id).orElse(null);
	}
	
	public Plans savePlans(Plans plans) {
		return plansRepository.save(plans);
	}
	
	public void deletePlans(Long id) {
		plansRepository.deleteById(id);
	}
}
