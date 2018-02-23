package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTightCouplingApplication {

	public static void main(String[] args) {
		System.out.println("Hey this is spring boot tight coupling");
		
		BubblieSortAlgo bsa = new BubblieSortAlgo();
		QuickSortAlgo   qsa = new QuickSortAlgo();
		/*BinarySearchImpl bsi = new BinarySearchImpl(bsa);*/
		BinarySearchImpl bsi   = new BinarySearchImpl(qsa);
		int searchNumber = bsi.binarySearch(new int [] {1,2,10,5} , 3);
		System.out.println("Find Number ["+searchNumber+"] ");
		SpringApplication.run(SpringBootTightCouplingApplication.class, args);
	}
}