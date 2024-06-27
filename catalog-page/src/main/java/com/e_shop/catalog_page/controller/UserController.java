package com.e_shop.catalog_page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.e_shop.catalog_page.model.Customer;
import com.e_shop.catalog_page.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<Customer> getUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public Customer getUser(@PathVariable Long id) {
		return userService.getUser(id);
	}

	@PostMapping
	public Customer createUser(@RequestBody Customer customer) {
		return userService.saveUser(customer);
	}

	@PutMapping("/{id}")
	public Customer updateUser(@PathVariable Long id, @RequestBody Customer customer) {
		customer.setUserId(id);
		return userService.saveUser(customer);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
	
}
