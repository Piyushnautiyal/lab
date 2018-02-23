package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubblieSortAlgo implements SortAlgorithm {

	
	@Override
	public int[] sort(int [] arr) {
		// TODO Auto-generated method stub
		return arr;
	}
}
