package com.example.demo;

public class BinarySearchImpl {
	// sorting an array
	//search the element
	// return the element
	
	private SortAlgorithm sortAlgo;
	
	public BinarySearchImpl(SortAlgorithm sa) {
		super();
		this.sortAlgo = sa;
	}

	public int binarySearch(int [] intArr, int number){
		
		int [] sortedNumber = sortAlgo.sort(intArr);
		System.out.println(sortAlgo);
		return 3;
	}

}
