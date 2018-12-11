package com.boot.app.SpringBootJpaPostgresExample.service;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Customer {
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	public Customer(Long id,String firstname,String lastname) {
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
	}
}
