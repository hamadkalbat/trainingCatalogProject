package com.e_shop.catalog_page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_shop.catalog_page.model.Customer;
import com.e_shop.catalog_page.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<Customer> getAllUsers() {
		return userRepository.findAll();
	}
	
	public Customer getUser(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public Customer saveUser(Customer customer) {
		return userRepository.save(customer);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
