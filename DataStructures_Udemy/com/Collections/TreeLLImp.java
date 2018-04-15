package com.Collections;

public class TreeLLImp {

	public static void main(String[] args) {
		
		TreeLLElement<String> nodeD = new TreeLLElement<String>("D",null,null);
		TreeLLElement<String> nodeE = new TreeLLElement<String>("E",null,null);
		TreeLLElement<String> nodeF = new TreeLLElement<String>("F",null,null);
		TreeLLElement<String> nodeG = new TreeLLElement<String>("G",null,null);
		
		TreeLLElement<String> nodeB = new TreeLLElement<String>("B",nodeD,nodeE);
		TreeLLElement<String> nodeC = new TreeLLElement<String>("C",nodeF,nodeG);
		
		TreeLLElement<String> nodeA = new TreeLLElement<String>("A",nodeB,nodeC);

		exploreNode(nodeA);
		
	}
	
	
	public static void exploreNode(TreeLLElement node) {
		
		if(node==null) return;
		
		System.out.println(node.value);
		
		//recursion to go through all the nodes
		exploreNode(node.right);
		exploreNode(node.left);
		
	}

}
