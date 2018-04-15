package com.Collections;

import java.util.HashMap;
import java.util.Map;


public class myHashMap{
	
	//HashMap in java.util is done using dynamic Array list so the buckets are basically indexes in the array and 
	//of type int.
	
	public static void main(String args[]) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer,String>();
		
		hmap.put(1, "A");
		hmap.put(2, "B");
		hmap.put(3, "C");
		hmap.put(4, "D");
		hmap.put(5, "E");
		hmap.put(6, "F");
		hmap.put(null, "G");
		hmap.put(7, null);
		
		for(Map.Entry entry:hmap.entrySet()) {
			
			System.out.println(entry.getValue());
		}
		
		
		
	}

}
