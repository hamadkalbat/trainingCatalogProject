package com.e_shop.catalog_page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_shop.catalog_page.model.Customer;

public interface UserRepository extends JpaRepository<Customer, Long> {

}
