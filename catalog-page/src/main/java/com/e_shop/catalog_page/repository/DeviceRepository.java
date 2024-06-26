package com.e_shop.catalog_page.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.e_shop.catalog_page.model.Device;

@Repository

public interface DeviceRepository extends JpaRepository<Device, Long> {
	

}
