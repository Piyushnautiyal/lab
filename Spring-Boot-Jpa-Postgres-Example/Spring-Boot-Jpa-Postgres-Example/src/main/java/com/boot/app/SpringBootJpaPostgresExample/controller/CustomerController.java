package com.boot.app.SpringBootJpaPostgresExample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.app.SpringBootJpaPostgresExample.service.Customer;
import com.boot.app.SpringBootJpaPostgresExample.service.CustomerService;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {
	
	
	CustomerService customerService;
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers() {
		return  new ResponseEntity<List<Customer>>(customerService.getAllCustomer(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> addCustomers(@RequestBody Customer customer) {
		long Id = customerService.addCustomerToList(customer);
		return new ResponseEntity<>(Id,HttpStatus.CREATED);
	}
	
	@RequestMapping("/customers/{id}")
	public Optional<Customer> getCustomer(@PathVariable String id) {
		return customerService.getCustomerDetails(id);
	}
	
	@RequestMapping("/customers/{lastName}")
	public List<Customer> getCustomerByLastName(@PathVariable String lastName) {
		return customerService.getCustomerByLastName(lastName);
	}
}
