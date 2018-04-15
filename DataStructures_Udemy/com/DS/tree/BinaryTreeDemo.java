package com.DS.tree;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		
		
		BinaryTreeImp myTree = new BinaryTreeImp(new TreeNode(4,null,null));
		
		myTree.addNode(myTree.root, new TreeNode(3));
		myTree.addNode(myTree.root, new TreeNode(5));
		myTree.addNode(myTree.root, new TreeNode(6));
		myTree.addNode(myTree.root, new TreeNode(100));
		myTree.addNode(myTree.root, new TreeNode(190));
		myTree.addNode(myTree.root, new TreeNode(84));
		myTree.addNode(myTree.root, new TreeNode(75));
		myTree.addNode(myTree.root, new TreeNode(91));
		//myTree.addNode(myTree.root, new TreeNode(89));
		myTree.addNode(myTree.root, new TreeNode(96));
		myTree.addNode(myTree.root, new TreeNode(94));
		myTree.addNode(myTree.root, new TreeNode(99));
		myTree.addNode(myTree.root, new TreeNode(63));
		myTree.addNode(myTree.root, new TreeNode(78));
		
		myTree.displayTree(myTree.root);
		
		myTree.deleteNodeItemWithValue(91);
		myTree.displayTree(myTree.root);

	}

}
