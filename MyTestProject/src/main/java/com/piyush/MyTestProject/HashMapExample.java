package com.piyush.MyTestProject;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "CSE");
		hm.put("2", "ECE");
		hm.put("3", "IT");
		hm.put("4", "ME");
		System.out.println("Val from Map "+hm.get(1));
	}

}
