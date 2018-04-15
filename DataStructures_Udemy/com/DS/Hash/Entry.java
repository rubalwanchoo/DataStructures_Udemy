package com.DS.Hash;

public class Entry {
	
	int key;
	Object value;
	Entry next;
	
	public Entry(int key, Object value) {
			this.key = key;
			this.value = value;
			this.next = null;
	}
	
	
	public Entry(){
		this.next = null;
	}
	

}
