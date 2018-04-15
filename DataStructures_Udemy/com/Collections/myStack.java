package com.Collections;

import java.util.Stack;

public class myStack {

	public static void main(String[] args) {
		
		Stack<String> myStack = new Stack<String>();
		
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");
		myStack.push("D");
		
		System.out.println(myStack.pop());
		

	}

}
