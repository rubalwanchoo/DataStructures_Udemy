package com.Collections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class myHashTreeSet {

	public static void main(String[] args) {
		
		//Unordered set , cannot accept duplicates
		HashSet<String> myHashSet = new HashSet<String>();
		
		myHashSet.add("Rubal");
		myHashSet.add("Tanya");
		myHashSet.add("JOhn");
		myHashSet.add("Rhea");
		myHashSet.add("D");
		
		Iterator<String> it = myHashSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//Ordered set below , useful in search engines
		TreeSet<String> myTreeSet = new TreeSet<String>();
		
		myTreeSet.add("Rubal");
		myTreeSet.add("Tanya");
		myTreeSet.add("JOhn");
		myTreeSet.add("Rhea");
		myTreeSet.add("D");
		
		Iterator<String> it2 = myTreeSet.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}
