package com.repetitive.element;

import java.util.HashSet;
import java.util.Stack;

public class RepetitiveElement {
	
	public static void main(String[] args) {
		
	    Integer arr[] = new Integer[]{ 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
	    HashSet<Integer> obj = new HashSet<Integer>();
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(obj.contains(arr[i]))
	    	{
	    		System.out.println("Element which is repetitive is "+arr[i]);
	    		return;
	    	}
	    	obj.add(arr[i]);
	    }
	}

}
