package com.e_shop.catalog_page.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_shop.catalog_page.model.Variant;
import com.e_shop.catalog_page.service.VariantService;

@RestController
@RequestMapping("/variants")
public class VariantController {
    @Autowired
    private VariantService variantService;

    @GetMapping
    public List<Variant> getAllVariants() {
        return variantService.getAllVariant();
    }

    @GetMapping("/{id}")
    public Variant getVariantById(@PathVariable Long id) {
        return variantService.getVariantById(id);
    }

    @PostMapping
    public Variant createVariant(@RequestBody Variant variant) {
        return variantService.saveVariant(variant);
    }

    @PutMapping("/{id}")
    public Variant updateVariant(@PathVariable Long id, @RequestBody Variant variant) {
        Variant existingVariant = variantService.getVariantById(id);
        if (existingVariant != null) {
            existingVariant.setDevice(variant.getDevice());
            existingVariant.setStorage(variant.getStorage());
            existingVariant.setPrice(variant.getPrice());
            existingVariant.setColor(variant.getColor());
            existingVariant.setMonthlyInstallment(variant.getMonthlyInstallment());
            return variantService.saveVariant(existingVariant);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteVariant(@PathVariable Long id) {
        variantService.deleteVariant(id);
    }
}