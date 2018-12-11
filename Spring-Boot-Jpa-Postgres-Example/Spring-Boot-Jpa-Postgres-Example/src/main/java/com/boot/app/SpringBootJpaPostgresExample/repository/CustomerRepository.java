package com.boot.app.SpringBootJpaPostgresExample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.app.SpringBootJpaPostgresExample.service.Customer;


public interface CustomerRepository extends CrudRepository<Customer,String> {
	
	
    List<Customer> findByLastName(String lastName);


}
