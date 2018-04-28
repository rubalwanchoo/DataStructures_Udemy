package com.DS.Graphs;

public class GraphDemo {

	public static void main(String[] args) {
		
		
		Graph myGraph = new Graph(6);
		
		myGraph.addNode(0, 2);
		myGraph.addNode(0, 1);
		myGraph.addNode(1, 4);
		myGraph.addNode(1, 3);
		myGraph.addNode(1, 0);
		myGraph.addNode(2, 5);
		myGraph.addNode(2, 0);
		myGraph.addNode(3, 1);
		myGraph.addNode(4, 1);
		myGraph.addNode(5, 2);
		
		//myGraph.DFSExplore(1);
		myGraph.BFSExplore(0);

	}

}
