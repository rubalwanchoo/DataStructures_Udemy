package com.DS;

public class StackDemo {

	public static void main(String[] args) {
		
		StackArray<String> myStack = new StackArray<String>(5);
		
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");
		myStack.push("D");
		myStack.push("E");
		//myStack.push("F");
		//myStack.push("G");
		
		myStack.pop();
		myStack.pop();
		myStack.pop();

	}

}
