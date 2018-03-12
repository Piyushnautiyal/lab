package HashMapTest;

import java.util.HashMap;

public class MainClass {
	public static void main(String args[]) {
		KeyClass k1	= new KeyClass();
		KeyClass k2	= new KeyClass();
		KeyClass k3	= new KeyClass();
		
		HashMap hm	= new HashMap();
		
		hm.put(k1, "value 1");
		hm.put(k2,"value 2");
		hm.put(null,"value 3");
		/*
		 * null ki hashcode always give 0 Value thats no effect on first two Objects 
		 */
		
		System.out.println(hm.get(k1));
		System.out.println(hm.get(k2));
		System.out.println(hm.get(null));
	}
}
