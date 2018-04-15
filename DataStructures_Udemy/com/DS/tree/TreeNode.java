package com.DS.tree;

public class TreeNode {

	int value;
	TreeNode left;
	TreeNode right;
	
	public TreeNode() {
		this.right = null;
		this.left = null;
	}
	
	public TreeNode(int value) {
		this.value = value;
		this.right = null;
		this.left = null;
	}
	
	public TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

}
