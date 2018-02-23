package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootUsingDependcies {

	public static void main(String[] args) {
		System.out.println("Hey this is spring boot tight coupling");
		//SpringApplication.run(SpringBootTightCouplingApplication.class, args);
		
		ApplicationContext appContext  = SpringApplication.run(SpringBootUsingDependcies.class, args);
		BinarySearchImpl bsi 			= appContext.getBean(BinarySearchImpl.class);
		
		int searchNumber = bsi.binarySearch(new int [] {1,2,10,5} , 3);
		System.out.println("Find Number ["+searchNumber+"] ");
		
	}
}