package com.DS.tree;

public class BinaryTreeImp {
	TreeNode root;
	
	
	public BinaryTreeImp(TreeNode root) {
		this.root = root;
	}
	
	public void addNode(TreeNode node, TreeNode newNode) {
		
		if(root == null) {
			root = newNode;
		}
		
		if(newNode.value < node.value) {
			if(node.left == null) {
				node.left = newNode;
			}
			addNode(node.left, newNode);
			
		}
		
		if(newNode.value > node.value) {
			if(node.right == null) {
				node.right = newNode;
			}			
			addNode(node.right, newNode);
		}
	}
	
	
	public void deleteNodeItemWithValue(int deleteValue) {
		
		
		TreeNode myNode = search(root,deleteValue);
		deleteNode(myNode);
	}
	
	public void deleteNode(TreeNode myNode) {
		
		TreeNode parentNode = findParentNode(myNode);
		System.out.println("ParentNode value- "+parentNode.value);
		
		//when no child nodes present
		if(myNode.left == null && myNode.right == null) {
			System.out.println("No Child node case");
				
			if(myNode.value<parentNode.value) {
				parentNode.left = null;
			}
			if(myNode.value>parentNode.value) {
				parentNode.right = null;
			}
			

		}

		
		//when one child node is present
		if((myNode.left != null && myNode.right == null) || (myNode.left == null && myNode.right != null)) {
			System.out.println("One Child node case");
			
			
			if(myNode.left != null) {
				//reassigning left child to grandparent
				System.out.println("Reassigning left child to grandparent");
				parentNode.right = myNode.left;
				myNode.left = null;
			}
			
			if(myNode.right!=null) {
				//reassigning right child to grandparent
				System.out.println("Reassigning right child to grandparent");
				parentNode.right = myNode.right;
				myNode.right = null;
			}
		}
		
		
		//when there are multiple children nodes
		if(myNode.left != null && myNode.right != null) {
			System.out.println("Two Children nodes case");
			
			TreeNode smallestNode = findSmallestElement(myNode.right);
			System.out.println("Smallest node-"+smallestNode.value);
			
			myNode.value = smallestNode.value;
			
			if(smallestNode.right!=null) {
				deleteNode(smallestNode);
			}
			
			
			
			
		}
		
		
	
	}
	
	
	
	public TreeNode findSmallestElement(TreeNode node) {
		System.out.println("In findSmallestElement - "+node.value);
		
		if(node.left == null) {
			return node;
		}
		else {
			return findSmallestElement(node.left);
		}
	}
	
	
	public TreeNode findParentNode(TreeNode node) {
		
		return parentNodeHelper(root, node);
		
	}
	
	
	public TreeNode parentNodeHelper(TreeNode currentRoot, TreeNode node) {
		//System.out.println("RootNode value-"+currentRoot.value);
		//System.out.println("Node value - "+node.value);
		
		
		if(node == root) {
			//System.out.println("1");
			return null;
		}		
		else if(currentRoot.left == node || currentRoot.right == node) {
			//System.out.println("2");
			return currentRoot;
		}
		else if(node.value<currentRoot.value) {
			//System.out.println("3");
			return parentNodeHelper(currentRoot.left,node);
		}
		else if(node.value>currentRoot.value) {
			//System.out.println("4");
			return parentNodeHelper(currentRoot.right,node);
		}else {
			//System.out.println("5");
			return null;
		}

	}
	
	
	public TreeNode search(TreeNode node, int searchValue) {

		
		if(node == null) {
			System.out.println("Value not found");
			return null;
		}
		else if(node.value == searchValue) {
			System.out.println("Found node - "+node.value);
			return node;
		}
		
		else if(searchValue<node.value) {
			return search(node.left,searchValue);
		}
		else if(searchValue>node.value) {
			return search(node.right,searchValue);
		}
		else {
			return null;
		}

		
	}
	
	
	
	
	public void displayTree(TreeNode node) {
		
		if(node == null) {
			return;
		}else {
			System.out.println("Node -"+node.value);
			
			displayTree(node.left);
			displayTree(node.right);
		}
		

	}

}
