package com.DS.Hash;

public class HashTableDemo {

	public static void main(String[] args) {
		
		HashTableArray<String> myHashTable = new HashTableArray<String>(10);
		
		myHashTable.addNode(5, "A");
		myHashTable.addNode(7, "B");
		myHashTable.addNode(13, "C");
		myHashTable.addNode(3, "D");
		myHashTable.addNode(1, "E");
		myHashTable.addNode(23, "F");
		
		System.out.println(myHashTable.getValue(13));

	}

}
