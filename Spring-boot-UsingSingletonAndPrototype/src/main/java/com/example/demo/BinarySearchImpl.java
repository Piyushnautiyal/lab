package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*@Scope("prototype")*/
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
