package com.e_shop.catalog_page.model;

import jakarta.persistence.*;

@Entity
public class Plans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long plansId;
	private String name;
	private String description;
	private double price;
	private String dataLimit;
	
	public Long getPlansId() {
		return plansId;
	}
	public void setPlansId(Long id) {
		this.plansId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDataLimit() {
		return dataLimit;
	}
	public void setDataLimit(String dataLimit) {
		this.dataLimit = dataLimit;
	}
	
}
