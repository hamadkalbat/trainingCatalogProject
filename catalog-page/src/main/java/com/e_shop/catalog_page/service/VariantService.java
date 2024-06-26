package com.e_shop.catalog_page.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_shop.catalog_page.model.Variant;
import com.e_shop.catalog_page.repository.VariantRepository;

import java.util.List;

@Service
public class VariantService {
	@Autowired
	private VariantRepository variantRepository;
	
	public List<Variant> getAllVariant() {
        return variantRepository.findAll();
    }

    public Variant getVariantById(Long id) {
        return variantRepository.findById(id).orElse(null);
    }

    public Variant saveVariant(Variant variant) {
        return variantRepository.save(variant);
    }

    public void deleteVariant(Long id) {
        variantRepository.deleteById(id);
    }
}
