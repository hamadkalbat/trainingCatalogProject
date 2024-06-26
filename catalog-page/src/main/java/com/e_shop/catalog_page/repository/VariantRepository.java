package com.e_shop.catalog_page.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.e_shop.catalog_page.model.Variant;

@Repository

public interface VariantRepository extends JpaRepository<Variant, Long>{

}
