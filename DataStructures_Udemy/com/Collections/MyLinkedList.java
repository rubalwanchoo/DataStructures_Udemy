package com.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

	
	public static void main(String args[]) {
		
		
		LinkedList<String> myLL = new LinkedList<String>();
		
		myLL.add("A");
		myLL.add("B");
		myLL.add("C");
		myLL.add("D");
		
		Iterator<String> it = myLL.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
}
