package com.e_shop.catalog_page.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.e_shop.catalog_page.model.Category;

@Repository

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
