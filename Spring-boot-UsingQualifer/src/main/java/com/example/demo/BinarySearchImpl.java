package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	// sorting an array
	//search the element
	// return the element

	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgo;
	
	
	/*public BinarySearchImpl(SortAlgorithm sa) {
		super();
		this.sortAlgo = sa;
	}*/


/*	public void setSortAlgo(SortAlgorithm sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
*/

	public int binarySearch(int [] intArr, int number){
		
		int [] sortedNumber = sortAlgo.sort(intArr);
		System.out.println(sortAlgo);
		return 1;
	}

}
