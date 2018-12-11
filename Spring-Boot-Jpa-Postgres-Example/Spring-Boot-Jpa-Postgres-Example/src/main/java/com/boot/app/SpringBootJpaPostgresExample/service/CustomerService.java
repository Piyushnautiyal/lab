package com.boot.app.SpringBootJpaPostgresExample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.boot.app.SpringBootJpaPostgresExample.repository.CustomerRepository;

import ch.qos.logback.core.net.SyslogOutputStream;


@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public long addCustomerToList(Customer customer) {
		//topic.add(topic1);
		return customerRepository.save(customer).getId();
	}

	public List<Customer> getAllCustomer() {
		List<Customer> customer = new ArrayList<>();
		customerRepository.findAll()
		.forEach(customer::add);
		return customer;

	}

	public Optional<Customer> getCustomerDetails(Long Id) {

		return customerRepository.findById(Id);

	}

	public List<Customer> getCustomerByLastName(String lastname) {
		List<Customer> customer = new ArrayList<>();
		customerRepository.findByLastName(lastname).forEach(customer :: add);

		return customer;
	}
}
