package com.e_shop.catalog_page.model;

import jakarta.persistence.*;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String username;
	private String password;
	private String email;
	private String phoneNumber;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long id) {
		this.userId = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phoneNumber;
	}
	public void setPhone(String phone) {
		this.phoneNumber = phone;
	}
}
