package com.DS;

public class LinkedListDDemo {


	public static void main(String[] args) {
		
		LinkedListD<String> newList = new LinkedListD<String>();
		
		newList.addNode("A");
		newList.addNode("B");
		newList.addNode("C");
		newList.addNode("D");
		
		System.out.println("Before delete");
		newList.display();
		System.out.println("After delete");
		newList.deleteNode();
		newList.display();
		
	}
}
