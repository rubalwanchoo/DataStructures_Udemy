package com.DS;

import javafx.scene.Node;

public class LinkedListU <T> {

	LinkedListNode head; //Head is not a node but a reference to the first node 
	
	public LinkedListU() {
		head = null;
	}
	
	
	public void addNode(Object value){
		
		LinkedListNode newNode = new LinkedListNode(value,null);
		
		if(head == null){
			head= newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void addNodeAtEnd(Object value) {
		LinkedListNode newNode = new LinkedListNode(value,null);
		LinkedListNode node = head;
		
		if(head == null) {
			head = newNode;
		}else {
			
			
			while(node!=null) {
				//System.out.println("Node value "+(T)node.value);
				
				if(node.next == null) {
					node.next =newNode;
					break;
				}
				
				node = node.next;
			}
		}
	}
	
	public int getNodeCount() {
		int count = 0;
		
		
		while(head!=null) {
			count++;
			head = head.next;
			
		}
		
		return count;
	}
	
	
	public T deleteNode(){
		T deletedNode = (T)head.value;
		head = head.next;
		
		return deletedNode;
		
	}
	
	public void display(){
		LinkedListNode n = head; //Cannot disturb head of linked list once set as it would re jigger the linked list,
		//have to use another node to point to head and print from there on 
		
		while(n!=null){
			System.out.println((T)n.value);
			n= n.next;
			
			
		}
	}
	
}
