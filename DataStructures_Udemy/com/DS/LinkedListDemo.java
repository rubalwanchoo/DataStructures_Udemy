package com.DS;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedListU<String> newList = new LinkedListU<String>();
		
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
