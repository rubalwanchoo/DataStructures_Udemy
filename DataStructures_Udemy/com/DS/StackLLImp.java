package com.DS;

public class StackLLImp <T>{

	StackLLNode top;
	
	public StackLLImp() {
		
		this.top = null;
		
	}
	
	public void push(Object value) {

		StackLLNode newNode = new StackLLNode(value,null);
		
		if(top == null) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
		
		
	}
	
	public T pop() {
		
		T itemPopped = null;
		
		if(top == null) {
			System.out.println("stack is empty");
		}else {
			
			itemPopped = (T)top.value;
			System.out.println("Popping-"+itemPopped);
			top = top.next;
		}
		
		return itemPopped;
	}
	
	public int getNodeCount() {
		int count = 0;
		
		while(top!=null) {
			count++;
			top= top.next;
		}
		
		return count;
	}
	
	public void display() {
		StackLLNode node = top;
		
		while(node!=null) {
			System.out.println((T)node.value);
			node= node.next;
		}
		
	}
	
	

}
