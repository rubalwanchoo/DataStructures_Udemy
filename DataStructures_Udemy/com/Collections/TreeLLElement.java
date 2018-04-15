package com.Collections;

public class TreeLLElement <T> {
	
	Object value;
	TreeLLElement left;
	TreeLLElement right;

	public TreeLLElement(Object value, TreeLLElement left, TreeLLElement right) {
		
		this.value=value;
		this.left=left;
		this.right=right;
	}

}
