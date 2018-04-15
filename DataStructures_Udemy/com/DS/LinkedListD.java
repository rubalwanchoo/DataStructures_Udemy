package com.DS;

public class LinkedListD<T> {

	LinkedListNodeD head;
	
	public LinkedListD() {
		head= null;
		
	}
	
	
	public void addNode(Object value){
		
		LinkedListNodeD newNode = new LinkedListNodeD(value, null,null);
		
		if(head== null){
			head = newNode;
		}else{
			newNode.next = head;
			head.previous = newNode;
			newNode.previous = null;
			head = newNode;
		}
	}

	
	public void deleteNode(){
		
		head = head.next;
		head.previous = null;
	}
	
	public void display(){
		LinkedListNodeD n = head;
		
		while(n!=null){
			System.out.println((T)n.value);
			n=n.next;
		}
	}
	
}
