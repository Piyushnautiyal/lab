package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	// sorting an array
	//search the element
	// return the element

	@Autowired
	private SortAlgorithm sortAlgo;
	
	public BinarySearchImpl(SortAlgorithm sa) {
		super();
		this.sortAlgo = sa;
	}

	public int binarySearch(int [] intArr, int number){
		
		int [] sortedNumber = sortAlgo.sort(intArr);
		System.out.println(sortAlgo);
		return 5;
	}

}
